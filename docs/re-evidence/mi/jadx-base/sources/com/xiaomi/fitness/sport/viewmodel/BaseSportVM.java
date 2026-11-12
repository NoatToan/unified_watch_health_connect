package com.xiaomi.fitness.sport.viewmodel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.sport.bean.LaunchSportTrackBean;
import com.xiaomi.fitness.sport.bean.SportingData;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.data.UISportState;
import com.xiaomi.fitness.sport.interfaces.ISportDataListener;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.model.SendFocusNotification;
import com.xiaomi.fitness.sport.model.SportModel;
import com.xiaomi.fitness.sport.model.utils.AbilityTrainingTargetViewUtils;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport.model.utils.HabitTrainingTargetViewUtils;
import com.xiaomi.fitness.sport.utils.AppSportTracker;
import com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport.viewmodel.BaseSportVM;
import com.xiaomi.fitness.sport.viewmodel.interfaces.IMusicPlay;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_manager.music.SportMusicManager;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.GoalRemindData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportCourse;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportTarget;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicCallback;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicServiceListener;
import com.xiaomi.fitness.sport_manager_export.listener.IPlayerEventListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISCMRepository;
import com.xiaomi.fitness.sport_manager_export.listener.ISportReportDataListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.MusicData;
import com.xiaomi.fitness.sport_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.sport_manager_export.listener.Result;
import com.xiaomi.fitness.sport_manager_export.listener.SCMDao;
import com.xiaomi.fitness.sport_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.model.TrainingPlanFinishData;
import defpackage.c1j;
import defpackage.i7r;
import defpackage.lcn;
import defpackage.n0d;
import defpackage.ne4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u0000 \u0096\u0002*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0006\u0096\u0002\u0097\u0002\u0098\u0002B\b¢\u0006\u0005\b\u0095\u0002\u0010\rJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH$¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH$¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\rJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b(\u0010&J\r\u0010)\u001a\u00020\u000b¢\u0006\u0004\b)\u0010\rJ\u0015\u0010*\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b*\u0010&J\r\u0010+\u001a\u00020\u000b¢\u0006\u0004\b+\u0010\rJ\r\u0010,\u001a\u00020\u000b¢\u0006\u0004\b,\u0010\rJ\r\u0010-\u001a\u00020\u000e¢\u0006\u0004\b-\u0010\u0016J\r\u0010.\u001a\u00020\u000e¢\u0006\u0004\b.\u0010\u0016J\r\u0010/\u001a\u00020\u001f¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u0010\rJ!\u00105\u001a\u00020\u000b2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000b02¢\u0006\u0004\b5\u00106J!\u00109\u001a\u00020\u000b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000b02¢\u0006\u0004\b9\u00106J\u0017\u0010<\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u000bH\u0014¢\u0006\u0004\b>\u0010\rJ\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u001fH\u0016¢\u0006\u0004\bB\u0010\"J\u0019\u0010D\u001a\u00020\u000b2\b\u0010C\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bG\u0010HJ7\u0010O\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020I2\u0006\u0010L\u001a\u00020I2\u0006\u0010M\u001a\u00020I2\u0006\u0010N\u001a\u00020IH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000bH\u0016¢\u0006\u0004\bQ\u0010\rJ\u000f\u0010R\u001a\u00020\u000bH\u0016¢\u0006\u0004\bR\u0010\rJ+\u0010X\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020\u000e2\b\u0010U\u001a\u0004\u0018\u00010T2\b\u0010W\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020\u000b¢\u0006\u0004\bZ\u0010\rJ\u000f\u0010[\u001a\u00020IH\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010_\u001a\u00020\u000b2\b\u0010]\u001a\u0004\u0018\u00010\u00182\u0006\u0010^\u001a\u00020\u000e¢\u0006\u0004\b_\u0010`J\u0017\u0010c\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u0019\u0010e\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\be\u0010\"J)\u0010h\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010f\u001a\u00020I2\u0006\u0010g\u001a\u00020IH\u0016¢\u0006\u0004\bh\u0010iJ\u0019\u0010j\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bj\u0010\"J\u0019\u0010k\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bk\u0010\"J\r\u0010l\u001a\u00020\u000b¢\u0006\u0004\bl\u0010\rJ\r\u0010m\u001a\u00020\u000b¢\u0006\u0004\bm\u0010\rJ\r\u0010n\u001a\u00020\u000e¢\u0006\u0004\bn\u0010\u0016J\u0017\u0010q\u001a\n\u0012\u0004\u0012\u00020p\u0018\u00010oH\u0016¢\u0006\u0004\bq\u0010rJ\r\u0010s\u001a\u00020\u000b¢\u0006\u0004\bs\u0010\rJ\r\u0010t\u001a\u00020\u000b¢\u0006\u0004\bt\u0010\rJ\u000f\u0010u\u001a\u00020\u000bH\u0016¢\u0006\u0004\bu\u0010\rJ\u0017\u0010x\u001a\u00020\u000b2\u0006\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020\u000bH\u0016¢\u0006\u0004\bz\u0010\rJ\u000f\u0010{\u001a\u00020\u000bH\u0016¢\u0006\u0004\b{\u0010\rJ\u000f\u0010|\u001a\u00020\u000bH\u0016¢\u0006\u0004\b|\u0010\rJ\u000f\u0010}\u001a\u00020\u000bH\u0016¢\u0006\u0004\b}\u0010\rJ\u001a\u0010\u0080\u0001\u001a\u00020\u000b2\b\u0010\u007f\u001a\u0004\u0018\u00010~¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001R%\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b \u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u00100\"\u0005\b\u0084\u0001\u0010\"R2\u0010\u0086\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0085\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R6\u0010\u008c\u0001\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000b\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0005\b\u0090\u0001\u00106R6\u0010\u0091\u0001\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000b\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u008d\u0001\u001a\u0006\b\u0092\u0001\u0010\u008f\u0001\"\u0005\b\u0093\u0001\u00106R*\u0010\u0094\u0001\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0005\b\u0098\u0001\u0010=R(\u0010]\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b]\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0005\b\u009c\u0001\u0010@R(\u0010\u009d\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0005\b\u009d\u0001\u0010\u0016\"\u0006\b\u009f\u0001\u0010 \u0001R(\u0010¡\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¡\u0001\u0010\u009e\u0001\u001a\u0005\b¡\u0001\u0010\u0016\"\u0006\b¢\u0001\u0010 \u0001R,\u0010¤\u0001\u001a\u0005\u0018\u00010£\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R(\u0010ª\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bª\u0001\u0010\u009e\u0001\u001a\u0005\bª\u0001\u0010\u0016\"\u0006\b«\u0001\u0010 \u0001R(\u0010¬\u0001\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0005\b®\u0001\u0010\\\"\u0006\b¯\u0001\u0010°\u0001R(\u0010±\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010\u009e\u0001\u001a\u0005\b±\u0001\u0010\u0016\"\u0006\b²\u0001\u0010 \u0001R(\u0010K\u001a\u00030³\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bK\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R0\u0010º\u0001\u001a\u00020\u001f2\u0007\u0010¹\u0001\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0006\bº\u0001\u0010\u0082\u0001\u001a\u0005\b»\u0001\u00100\"\u0005\b¼\u0001\u0010\"R(\u0010½\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b½\u0001\u0010\u009e\u0001\u001a\u0005\b¾\u0001\u0010\u0016\"\u0006\b¿\u0001\u0010 \u0001R#\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020I0\u0085\u00018\u0006¢\u0006\u0010\n\u0006\bÀ\u0001\u0010\u0087\u0001\u001a\u0006\bÁ\u0001\u0010\u0089\u0001R,\u0010Ã\u0001\u001a\u0005\u0018\u00010Â\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R(\u0010É\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÉ\u0001\u0010\u009e\u0001\u001a\u0005\bÉ\u0001\u0010\u0016\"\u0006\b¯\u0001\u0010 \u0001R#\u0010Ê\u0001\u001a\t\u0012\u0004\u0012\u00020F0\u0085\u00018\u0006¢\u0006\u0010\n\u0006\bÊ\u0001\u0010\u0087\u0001\u001a\u0006\bË\u0001\u0010\u0089\u0001R*\u0010Ì\u0001\u001a\u00030³\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÌ\u0001\u0010´\u0001\u001a\u0006\bÍ\u0001\u0010¶\u0001\"\u0006\bÎ\u0001\u0010¸\u0001R(\u0010Ï\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÏ\u0001\u0010\u009e\u0001\u001a\u0005\bÏ\u0001\u0010\u0016\"\u0006\bÐ\u0001\u0010 \u0001R(\u0010Ñ\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÑ\u0001\u0010\u009e\u0001\u001a\u0005\bÒ\u0001\u0010\u0016\"\u0006\bÓ\u0001\u0010 \u0001R(\u0010Ô\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÔ\u0001\u0010\u009e\u0001\u001a\u0005\bÔ\u0001\u0010\u0016\"\u0006\bÕ\u0001\u0010 \u0001R(\u0010Ö\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÖ\u0001\u0010\u009e\u0001\u001a\u0005\b×\u0001\u0010\u0016\"\u0006\bØ\u0001\u0010 \u0001R1\u0010Ù\u0001\u001a\u00020I2\u0007\u0010¹\u0001\u001a\u00020I8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\bÙ\u0001\u0010\u00ad\u0001\u001a\u0005\bÚ\u0001\u0010\\\"\u0006\bÛ\u0001\u0010°\u0001R\u001e\u0010Ü\u0001\u001a\u00020\u001f8\u0016X\u0096D¢\u0006\u000f\n\u0006\bÜ\u0001\u0010\u0082\u0001\u001a\u0005\bÝ\u0001\u00100R*\u0010ß\u0001\u001a\u00030Þ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R/\u0010M\u001a\u00020I2\u0007\u0010¹\u0001\u001a\u00020I8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\bM\u0010\u00ad\u0001\u001a\u0005\bå\u0001\u0010\\\"\u0006\bæ\u0001\u0010°\u0001R4\u0010è\u0001\u001a\u00030ç\u00012\b\u0010¹\u0001\u001a\u00030ç\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R1\u0010î\u0001\u001a\u00020I2\u0007\u0010¹\u0001\u001a\u00020I8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\bî\u0001\u0010\u00ad\u0001\u001a\u0005\bï\u0001\u0010\\\"\u0006\bð\u0001\u0010°\u0001R1\u0010ñ\u0001\u001a\u00020I2\u0007\u0010¹\u0001\u001a\u00020I8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\bñ\u0001\u0010\u00ad\u0001\u001a\u0005\bò\u0001\u0010\\\"\u0006\bó\u0001\u0010°\u0001R!\u0010ù\u0001\u001a\u00030ô\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bõ\u0001\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001R8\u0010û\u0001\u001a\u0005\u0018\u00010ú\u00012\n\u0010¹\u0001\u001a\u0005\u0018\u00010ú\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002R8\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0081\u00022\n\u0010¹\u0001\u001a\u0005\u0018\u00010\u0081\u00028\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R,\u0010\u0089\u0002\u001a\u0005\u0018\u00010\u0088\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0006\b\u008d\u0002\u0010\u008e\u0002R\u0019\u0010\u008f\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u009e\u0001R\u0019\u0010\u0090\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u009e\u0001R\u001b\u0010\u0091\u0002\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R\u001b\u0010\u0093\u0002\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u0094\u0002¨\u0006\u0099\u0002"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM;", "Lcom/xiaomi/fitness/sport/model/CommonSportModel;", "M", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/sport/interfaces/ISportDataListener;", "Lcom/xiaomi/fitness/sport/bean/SportingData;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportReportDataListener;", "Lcom/xiaomi/fitness/sport_manager_export/listener/IPlayerEventListener;", "Lcom/xiaomi/fitness/sport/viewmodel/interfaces/IMusicPlay;", "", "toggle", "()V", "", "bindMusicService", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "isNeedJumpSportDetailPage", "()Z", "isSupportSportMusic", "Lcom/xiaomi/fitness/sport_manager_export/data/SportData;", "data", "onSportReportData", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportData;)V", "setSportRemind", "startSport", "accidentFinishSport", "", "did", "restartSport", "(Ljava/lang/String;)V", "Ln0d;", "callback", "onViewRestart", "(Ln0d;)V", "onViewPaused", "pauseSport", "abnormalChangeSportStateToPause", "resumeSport", "resumeMusic", "finishSport", "isValidAbilityTrainingPlan", "isValidHabitTrainingPlan", "getDeviceDid", "()Ljava/lang/String;", "restartActivity", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/sport/data/UISportState;", "state", "setUISportStateChange", "(Lkotlin/jvm/functions/Function1;)V", "Lne4;", "stateCallback", "setConnectStateCallback", "Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM$IReportDataCallback;", "reportDataCallback", "setReportDataCallback", "(Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM$IReportDataCallback;)V", "onCleared", "onSuccess", "(Lcom/xiaomi/fitness/sport/bean/SportingData;)V", "message", "onFail", "isPlaying", "onPlayState", "(Ljava/lang/Boolean;)V", "Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;", "onUpdateSongInfo", "(Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;)V", "", "code", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportStarted", "(IIIII)V", "onSportRestarted", "onSportPaused", "validSport", "", "ids", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "finishSportData", "onSportFinished", "(Z[BLcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;)V", "startTrack", "getGpsAccuracyStatus", "()I", "sportData", "disconnect", "finishTrack", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportData;Z)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "onConnectStart", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "disconnectOperate", "getReportData", "isValidSport", "", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "getRouteLists", "()Ljava/util/List;", "reEnableJumpToReport", "enableJumpToReportIfNeeded", "playSportPlaylist", "Landroid/content/Context;", "context", "toMusicZone", "(Landroid/content/Context;)V", "preSong", "nextSong", "toggleMusic", "getAndPlaySportPlaylist", "Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM$IMusicPlaylintChanged;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnMusicPlayingChangeListener", "(Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM$IMusicPlaylintChanged;)V", "Ljava/lang/String;", "getDid", "setDid", "Landroidx/lifecycle/MutableLiveData;", "mData", "Landroidx/lifecycle/MutableLiveData;", "getMData", "()Landroidx/lifecycle/MutableLiveData;", "setMData", "(Landroidx/lifecycle/MutableLiveData;)V", "uiSportState", "Lkotlin/jvm/functions/Function1;", "getUiSportState", "()Lkotlin/jvm/functions/Function1;", "setUiSportState", "connectState", "getConnectState", "setConnectState", "reportCallback", "Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM$IReportDataCallback;", "getReportCallback", "()Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM$IReportDataCallback;", "setReportCallback", "Lcom/xiaomi/fitness/sport/bean/SportingData;", "getSportData", "()Lcom/xiaomi/fitness/sport/bean/SportingData;", "setSportData", "isActivityFirstInit", "Z", "setActivityFirstInit", "(Z)V", "isCurWearDeviceSupportLaunchSport", "setCurWearDeviceSupportLaunchSport", "Lcom/xiaomi/fitness/sport_manager_export/data/GoalRemindData;", "goalRemind", "Lcom/xiaomi/fitness/sport_manager_export/data/GoalRemindData;", "getGoalRemind", "()Lcom/xiaomi/fitness/sport_manager_export/data/GoalRemindData;", "setGoalRemind", "(Lcom/xiaomi/fitness/sport_manager_export/data/GoalRemindData;)V", "isFinishRegular", "setFinishRegular", "pause", "I", "getPause", "setPause", "(I)V", "isLocalLaunch", "setLocalLaunch", "", "J", "getStartTime", "()J", "setStartTime", "(J)V", "value", "curDeviceDid", "getCurDeviceDid", "setCurDeviceDid", "disconnectFinishSport", "getDisconnectFinishSport", "setDisconnectFinishSport", "wearModeStatusChangeLiveData", "getWearModeStatusChangeLiveData", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "routeInfo", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "getRouteInfo", "()Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "setRouteInfo", "(Lcom/xiaomi/fitness/sport_export/data/RouteInfo;)V", "isPause", "sportMusicData", "getSportMusicData", "musicID", "getMusicID", "setMusicID", "isNeedChangePlaylist", "setNeedChangePlaylist", "hasPreRoute", "getHasPreRoute", "setHasPreRoute", "isBind", "setBind", "resumeSportNeedPlayNewPlaylist", "getResumeSportNeedPlayNewPlaylist", "setResumeSportNeedPlayNewPlaylist", "deviceType", "getDeviceType", "setDeviceType", "TAG", "getTAG", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "sportStateCaller", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "getSportStateCaller", "()Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "setSportStateCaller", "(Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;)V", "getSportType", "setSportType", "", "sportGoalValue", "F", "getSportGoalValue", "()F", "setSportGoalValue", "(F)V", "sportGoalType", "getSportGoalType", "setSportGoalType", "sportWearMode", "getSportWearMode", "setSportWearMode", "Lcom/xiaomi/fitness/sport_manager_export/listener/SCMDao;", "scmDao$delegate", "Lkotlin/Lazy;", "getScmDao", "()Lcom/xiaomi/fitness/sport_manager_export/listener/SCMDao;", "scmDao", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "abilityPlanCourse", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "getAbilityPlanCourse", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "setAbilityPlanCourse", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;)V", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "habitDayPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "getHabitDayPlan", "()Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "setHabitDayPlan", "(Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportTarget;", "sportTarget", "Lcom/xiaomi/fitness/sport_manager_export/data/SportTarget;", "getSportTarget", "()Lcom/xiaomi/fitness/sport_manager_export/data/SportTarget;", "setSportTarget", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportTarget;)V", "localPlaying", "playing", "songInfo", "Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;", "iMusicPlayingChangeListener", "Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM$IMusicPlaylintChanged;", "<init>", "Companion", "IReportDataCallback", "IMusicPlaylintChanged", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBaseSportVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSportVM.kt\ncom/xiaomi/fitness/sport/viewmodel/BaseSportVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1060:1\n774#2:1061\n865#2,2:1062\n1863#2,2:1064\n*S KotlinDebug\n*F\n+ 1 BaseSportVM.kt\ncom/xiaomi/fitness/sport/viewmodel/BaseSportVM\n*L\n581#1:1061\n581#1:1062,2\n581#1:1064,2\n*E\n"})
public abstract class BaseSportVM<M extends CommonSportModel> extends BaseViewModel<M> implements ISportDataListener<SportingData>, ISportStateChangedListener, OnDeviceStatusListener, ISportReportDataListener, IPlayerEventListener, IMusicPlay {
    public static final int ACCESSORY_BEAN_TO_PRIMARY_BAND = 4;
    public static final int ACCESSORY_DEVICE_DISCONNECTED = 2;
    public static final int ACCESSORY_MODE_CHANGE = 1;
    public static final int BAND_TO_BEAN = 3;
    public static final int INITIAL_VALUE = 0;

    @Nullable
    private AbilityPlanRunningCourse abilityPlanCourse;

    @Nullable
    private Function1<? super ne4, Unit> connectState;
    private int deviceType;
    private boolean disconnectFinishSport;

    @Nullable
    private GoalRemindData goalRemind;

    @Nullable
    private HabitDayPlan habitDayPlan;
    private boolean hasPreRoute;

    @Nullable
    private IMusicPlaylintChanged iMusicPlayingChangeListener;
    private boolean isBind;
    private boolean isFinishRegular;
    private boolean isLocalLaunch;
    private boolean isNeedChangePlaylist;
    private boolean isPause;
    private boolean localPlaying;
    private int pause;
    private boolean playing;

    @Nullable
    private IReportDataCallback reportCallback;
    private boolean resumeSportNeedPlayNewPlaylist;

    @Nullable
    private RouteInfo routeInfo;

    @Nullable
    private MusicData songInfo;

    @Nullable
    private SportingData sportData;
    private float sportGoalValue;

    @Nullable
    private SportTarget sportTarget;
    private int sportType;
    private int sportWearMode;
    private long startTime;

    @Nullable
    private Function1<? super UISportState, Unit> uiSportState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int curState = 1;

    @NotNull
    private String did = "xiaomiwear_app";

    @Nullable
    private MutableLiveData<SportingData> mData = new MutableLiveData<>();
    private boolean isActivityFirstInit = true;
    private boolean isCurWearDeviceSupportLaunchSport = true;

    @NotNull
    private String curDeviceDid = "xiaomiwear_app";

    @NotNull
    private final MutableLiveData<Integer> wearModeStatusChangeLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<MusicData> sportMusicData = new MutableLiveData<>();
    private long musicID = -1;

    @NotNull
    private final String TAG = "BaseSportVM";

    @NotNull
    private ISportRemoteState sportStateCaller = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
    private int sportGoalType = -1;

    /* JADX INFO: renamed from: scmDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scmDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gd2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseSportVM.scmDao_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM$Companion;", "", "<init>", "()V", "curState", "", "getCurState", "()I", "setCurState", "(I)V", "INITIAL_VALUE", "ACCESSORY_MODE_CHANGE", "ACCESSORY_DEVICE_DISCONNECTED", "BAND_TO_BEAN", "ACCESSORY_BEAN_TO_PRIMARY_BAND", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getCurState() {
            return BaseSportVM.curState;
        }

        public final void setCurState(int i) {
            BaseSportVM.curState = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM$IMusicPlaylintChanged;", "", "onChange", "", "code", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface IMusicPlaylintChanged {
        void onChange(int code);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM$IReportDataCallback;", "", "onReportData", "", "data", "Lcom/xiaomi/fitness/sport_manager_export/data/SportData;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface IReportDataCallback {
        void onReportData(@NotNull SportData data);
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.BaseSportVM$getAndPlaySportPlaylist$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.BaseSportVM$getAndPlaySportPlaylist$1", f = "BaseSportVM.kt", i = {0}, l = {973}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class C30551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ BaseSportVM<M> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30551(BaseSportVM<M> baseSportVM, Continuation<? super C30551> continuation) {
            super(2, continuation);
            this.this$0 = baseSportVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30551 c30551 = new C30551(this.this$0, continuation);
            c30551.L$0 = obj;
            return c30551;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            BaseSportVM<M> baseSportVM;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                BaseSportVM<M> baseSportVM2 = this.this$0;
                this.L$0 = coroutineScope;
                this.L$1 = baseSportVM2;
                this.label = 1;
                Object objBindMusicService = baseSportVM2.bindMusicService(this);
                if (objBindMusicService == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseSportVM = baseSportVM2;
                obj = objBindMusicService;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                baseSportVM = (BaseSportVM) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            baseSportVM.setBind(((Boolean) obj).booleanValue());
            Logger.i(SportMusicManager.TAG, "isBind:" + this.this$0.getIsBind());
            if (!this.this$0.getIsBind()) {
                return Unit.INSTANCE;
            }
            Logger.i(SportMusicManager.TAG, coroutineScope + " , getAndPlaySportPlaylist ");
            IMusicPlayer sportManagerExtKt = SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE);
            final BaseSportVM<M> baseSportVM3 = this.this$0;
            sportManagerExtKt.executeAsync("get_sports_playlist_info", null, false, new IMusicCallback() { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM.getAndPlaySportPlaylist.1.1
                @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicCallback
                @SuppressLint({"SuspiciousIndentation"})
                public void onMusiceCallback(Result result, MusicData musicData) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    Intrinsics.checkNotNullParameter(musicData, "musicData");
                    if (result.getCode() != 0) {
                        boolean z = ((BaseSportVM) baseSportVM3).playing;
                        IMusicPlayer.Companion companion = IMusicPlayer.INSTANCE;
                        Logger.i(SportMusicManager.TAG, "playing:" + z + " , hasSportPlaylist:" + SportManagerExtKt.getInstance(companion).isHasSportPlaylist());
                        if (((BaseSportVM) baseSportVM3).playing && SportManagerExtKt.getInstance(companion).isHasSportPlaylist()) {
                            SportManagerExtKt.getInstance(companion).executeAsync("toggle", null, true, new IMusicCallback() { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM$getAndPlaySportPlaylist$1$1$onMusiceCallback$1
                                @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicCallback
                                public void onMusiceCallback(Result result2, MusicData musicData2) {
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    Intrinsics.checkNotNullParameter(musicData2, "musicData");
                                    result2.getCode();
                                }
                            });
                        }
                        if (!SportManagerExtKt.getInstance(companion).isHasSportPlaylist()) {
                            baseSportVM3.setMusicID(-1L);
                        }
                        IMusicPlaylintChanged iMusicPlaylintChanged = ((BaseSportVM) baseSportVM3).iMusicPlayingChangeListener;
                        if (iMusicPlaylintChanged != null) {
                            iMusicPlaylintChanged.onChange(-1);
                            return;
                        }
                        return;
                    }
                    Logger.i(SportMusicManager.TAG, "curId:" + musicData.getId() + " , musicId:" + baseSportVM3.getMusicID() + " , playing:" + ((BaseSportVM) baseSportVM3).playing + " , isPause:" + baseSportVM3.getIsPause());
                    if (musicData.getId() != baseSportVM3.getMusicID()) {
                        baseSportVM3.setMusicID(musicData.getId());
                        if (baseSportVM3.getIsPause()) {
                            baseSportVM3.setResumeSportNeedPlayNewPlaylist(true);
                        } else {
                            baseSportVM3.playSportPlaylist();
                        }
                    }
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.BaseSportVM$onSportPaused$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.BaseSportVM$onSportPaused$3", f = "BaseSportVM.kt", i = {}, l = {586}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30573 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseSportVM<M> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30573(BaseSportVM<M> baseSportVM, Continuation<? super C30573> continuation) {
            super(2, continuation);
            this.this$0 = baseSportVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30573(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PhoneSportData phoneSportData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MutableLiveData<SportingData> mData = this.this$0.getMData();
            if (mData != null) {
                mData.postValue(this.this$0.getSportData());
            }
            SportingData sportData = this.this$0.getSportData();
            if (sportData != null && (phoneSportData = sportData.getPhoneSportData()) != null) {
                phoneSportData.pace = 0;
            }
            SendFocusNotification.sendFocusNotification$default(SendFocusNotification.INSTANCE, this.this$0.getSportData(), this.this$0.getSportType(), null, 4, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30573) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.BaseSportVM$onSportStarted$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.BaseSportVM$onSportStarted$1", f = "BaseSportVM.kt", i = {}, l = {544}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $sportType;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.BaseSportVM$onSportStarted$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.BaseSportVM$onSportStarted$1$1", f = "BaseSportVM.kt", i = {}, l = {545}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $sportType;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07751(int i, Continuation<? super C07751> continuation) {
                super(2, continuation);
                this.$sportType = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07751(this.$sportType, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.delay(10000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                lcn sportRemindTable = SportManagerExtKt.getInstance(ISCMRepository.INSTANCE).getSportRemindTable(this.$sportType);
                Boolean boolBoxBoolean = sportRemindTable != null ? Boxing.boxBoolean(sportRemindTable.o) : null;
                SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).setAutoPase(boolBoxBoolean != null ? boolBoxBoolean.booleanValue() : false);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30581(int i, Continuation<? super C30581> continuation) {
            super(2, continuation);
            this.$sportType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30581(this.$sportType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07751 c07751 = new C07751(this.$sportType, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07751, this) == coroutine_suspended) {
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
            return ((C30581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bindMusicService(Continuation<? super Boolean> continuation) {
        IMusicPlayer.Companion companion = IMusicPlayer.INSTANCE;
        if (Intrinsics.areEqual(SportManagerExtKt.getInstance(companion).isShowMusicPlyer(), Boxing.boxBoolean(false))) {
            return Boxing.boxBoolean(false);
        }
        if (this.isBind) {
            return Boxing.boxBoolean(true);
        }
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        SportManagerExtKt.getInstance(companion).bindXiaomiPlayerService(AppUtil.getApp(), new IMusicServiceListener() { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM$bindMusicService$2$1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicServiceListener
            public void onServiceConnect(boolean isConnect) {
                Logger.i(SportMusicManager.TAG, "service is connect:" + isConnect);
                safeContinuation.resumeWith(kotlin.Result.m886constructorimpl(Boolean.valueOf(isConnect)));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private final SCMDao getScmDao() {
        return (SCMDao) this.scmDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$3(BaseSportVM this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isCurWearDeviceSupportLaunchSport = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SCMDao scmDao_delegate$lambda$0() {
        return SportManagerExtKt.getInstance(ISCMRepository.INSTANCE).getScmDao();
    }

    private final void toggle() {
        Logger.i(SportMusicManager.TAG, "toggle");
        SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).executeAsync("toggle", null, false, new IMusicCallback() { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM.toggle.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicCallback
            public void onMusiceCallback(Result result, MusicData musicData) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(musicData, "musicData");
                result.getCode();
            }
        });
    }

    public final void abnormalChangeSportStateToPause() {
        this.sportStateCaller.abnormalChangeSportStateToPause();
    }

    public final void accidentFinishSport() {
        FitnessLogUtils.i(getTAG(), "onDestroy , is stop the sporting : " + this.isFinishRegular);
        if (this.isFinishRegular) {
            return;
        }
        this.sportStateCaller.accidentFinishSport(this.curDeviceDid, this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM.accidentFinishSport.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        getMModel().register(this);
        if (isSupportSportMusic()) {
            SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).setOnPlayerListener(this);
        }
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this);
        this.sportStateCaller.addSportStateChangedListener(getClass(), this);
        getMModel().refresh();
    }

    public final void disconnectOperate() {
        this.sportStateCaller.abnormalChangeSportStateToFinish();
    }

    public final void enableJumpToReportIfNeeded() {
        if (isNeedJumpSportDetailPage()) {
            this.sportStateCaller.setSportReportDataListener(this);
        }
    }

    public final void finishSport() {
        int i;
        long planId;
        long j;
        TrainingPlanFinishData trainingPlanFinishData;
        final Ref.LongRef longRef = new Ref.LongRef();
        if (getMModel().isValidHabitTrainingPlan()) {
            HabitDayPlan habitDayPlan = getMModel().getHabitDayPlan();
            Intrinsics.checkNotNull(habitDayPlan);
            planId = habitDayPlan.getPlanId();
            i = 1;
            j = 0;
        } else if (getMModel().isValidAbilityTrainingPlan()) {
            AbilityPlanRunningCourse abilityPlanCourse = getMModel().getAbilityPlanCourse();
            long courseId = abilityPlanCourse != null ? abilityPlanCourse.getCourseId() : 0L;
            AbilityPlanRunningCourse abilityPlanCourse2 = getMModel().getAbilityPlanCourse();
            Intrinsics.checkNotNull(abilityPlanCourse2);
            long planId2 = abilityPlanCourse2.getPlanId();
            i = 2;
            long j2 = courseId;
            planId = planId2;
            j = j2;
        } else {
            i = 0;
            planId = 0;
            j = 0;
        }
        longRef.element = planId;
        Logger.i(getTAG(), "finish-data-info:" + i + " - " + longRef.element + " - " + j);
        if (longRef.element == 0) {
            this.sportStateCaller.finishSport(this.curDeviceDid, this.sportType, new RequestCallback(this) { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM.finishSport.1
                final /* synthetic */ BaseSportVM<M> this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    FitnessLogUtils.i(this.this$0.getTAG(), "onViewFinish-finishSport");
                }
            });
            return;
        }
        ISportRemoteState iSportRemoteState = this.sportStateCaller;
        String str = this.curDeviceDid;
        FinishSportData finishSportData = new FinishSportData();
        finishSportData.setSportType(this.sportType);
        if (i == 2) {
            trainingPlanFinishData = new TrainingPlanFinishData(longRef.element, 255, Long.valueOf(j));
        } else if (i == 1) {
            trainingPlanFinishData = new TrainingPlanFinishData(longRef.element, null, null);
        } else {
            trainingPlanFinishData = new TrainingPlanFinishData(0L, null, null, 7, null);
        }
        finishSportData.setTrainingPlanFinishData(trainingPlanFinishData);
        Unit unit = Unit.INSTANCE;
        iSportRemoteState.finishSport(str, finishSportData, new RequestCallback(this) { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM.finishSport.3
            final /* synthetic */ BaseSportVM<M> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.i(this.this$0.getTAG(), "onViewFinish with plan=" + longRef.element);
                if (responseCode == 0) {
                    FitnessLogUtils.i(this.this$0.getTAG(), "onViewFinish with plan success");
                    return;
                }
                FitnessLogUtils.i(this.this$0.getTAG(), "onViewFinish with plan fail " + responseCode);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00a4  */
    public final void finishTrack(@Nullable SportData sportData, boolean disconnect) {
        String str;
        Integer numValueOf;
        String name;
        String strValueOf;
        String str2;
        LaunchSportTrackBean launchSportTrackBean = new LaunchSportTrackBean();
        launchSportTrackBean.setName("workout_finish");
        launchSportTrackBean.setExerciseResultPage(Boolean.valueOf(sportData != null));
        launchSportTrackBean.setResult(Boolean.valueOf(sportData != null && sportData.distance >= 100));
        String str3 = "";
        if (disconnect) {
            str = "连接断开";
        } else if (sportData == null) {
            str = "其他";
        } else {
            str = sportData.distance >= 100 ? "" : "数据太少";
        }
        launchSportTrackBean.setErrorInfo(str);
        int i = this.sportType;
        if (i == 1) {
            str3 = "outdoor_running";
        } else if (i == 2) {
            str3 = "outdoor_walking";
        } else if (i == 3) {
            str3 = this.deviceType == 1 ? "mijia_treadmill" : "indoor_running";
        } else if (i == 6) {
            str3 = "outdoor_cycling";
        }
        launchSportTrackBean.setExerciseTypeDetail(str3);
        launchSportTrackBean.setDurationMin(Integer.valueOf(sportData != null ? sportData.totalTime / 60 : 0));
        launchSportTrackBean.setDistance(Float.valueOf(sportData != null ? sportData.distance / 1000 : 0.0f));
        int i2 = this.sportGoalType;
        String name2 = null;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    numValueOf = 0;
                } else if (sportData != null) {
                    numValueOf = Integer.valueOf((int) ((sportData.cal / this.sportGoalValue) * 100));
                } else {
                    numValueOf = null;
                }
            } else if (sportData != null) {
                numValueOf = Integer.valueOf((int) ((sportData.totalTime / (this.sportGoalValue * 60)) * 100));
            } else {
                numValueOf = null;
            }
        } else if (sportData != null) {
            numValueOf = Integer.valueOf((int) (((sportData.distance / 1000.0f) / this.sportGoalValue) * 100));
        } else {
            numValueOf = null;
        }
        launchSportTrackBean.setTargetCompleteness(numValueOf);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            name = AbstractJsonLexerKt.NULL;
        } else {
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            name = wearableDeviceModel2 != null ? DeviceModelExtKt.getName(wearableDeviceModel2) : null;
        }
        launchSportTrackBean.setDeviceModel(name);
        GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = gymDeviceModel.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel == null || !wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected()) {
            name2 = AbstractJsonLexerKt.NULL;
        } else {
            WearableDeviceModel wearableDeviceModelCurGymDeviceModel2 = gymDeviceModel.curGymDeviceModel();
            if (wearableDeviceModelCurGymDeviceModel2 != null) {
                name2 = DeviceModelExtKt.getName(wearableDeviceModelCurGymDeviceModel2);
            }
        }
        launchSportTrackBean.setInstrumentModel(name2);
        launchSportTrackBean.setCount(Integer.valueOf(this.pause));
        lcn sportConfigModel = getScmDao().getSportConfigModel(this.sportType);
        if (sportConfigModel == null) {
            sportConfigModel = new lcn();
        }
        launchSportTrackBean.setTempoAvg(Integer.valueOf(sportConfigModel.i ? sportConfigModel.j : 0));
        launchSportTrackBean.setDisplay(Boolean.valueOf(sportConfigModel.f24910k));
        launchSportTrackBean.setLighten(Boolean.valueOf(sportConfigModel.f24909b));
        launchSportTrackBean.setAuto(Boolean.valueOf(sportConfigModel.o));
        launchSportTrackBean.setVoice(Boolean.valueOf(sportConfigModel.m));
        launchSportTrackBean.setRemind(Boolean.valueOf(sportConfigModel.m ? sportConfigModel.h : false));
        if (sportConfigModel.m) {
            strValueOf = sportConfigModel.f24908a == 6 ? String.valueOf(3600 / sportConfigModel.g) : TimeDateUtil.getSportPaceStrWithSecDef(sportConfigModel.f);
        } else {
            strValueOf = "0";
        }
        launchSportTrackBean.setSpeedRemind(strValueOf);
        boolean z = sportConfigModel.m;
        String str4 = Constants.EXTRA_CLOSE_TAI;
        if (z && (str2 = sportConfigModel.l) != null) {
            str4 = str2;
        }
        launchSportTrackBean.setTypeStr(str4);
        AppSportTracker.INSTANCE.getInstance().appFinishSportTrack(launchSportTrackBean);
    }

    @Nullable
    public final AbilityPlanRunningCourse getAbilityPlanCourse() {
        return this.abilityPlanCourse;
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.interfaces.IMusicPlay
    public void getAndPlaySportPlaylist() {
        if (isSupportSportMusic()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C30551(this, null), 3, null);
            return;
        }
        Logger.i(SportMusicManager.TAG, this + " ,not support sport music");
    }

    @Nullable
    public final Function1<ne4, Unit> getConnectState() {
        return this.connectState;
    }

    @NotNull
    public final String getCurDeviceDid() {
        return this.curDeviceDid;
    }

    @NotNull
    public final String getDeviceDid() {
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel;
        String did;
        int i = this.deviceType;
        if (i != 0) {
            return (i != 1 || (wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel()) == null || (did = wearableDeviceModelCurGymDeviceModel.getDid()) == null) ? "xiaomiwear_app" : did;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) ? "xiaomiwear_app" : wearableDeviceModel.getDid();
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final boolean getDisconnectFinishSport() {
        return this.disconnectFinishSport;
    }

    @Nullable
    public final GoalRemindData getGoalRemind() {
        return this.goalRemind;
    }

    public int getGpsAccuracyStatus() {
        return 0;
    }

    @Nullable
    public final HabitDayPlan getHabitDayPlan() {
        return this.habitDayPlan;
    }

    public final boolean getHasPreRoute() {
        return this.hasPreRoute;
    }

    @Nullable
    public final MutableLiveData<SportingData> getMData() {
        return this.mData;
    }

    public final long getMusicID() {
        return this.musicID;
    }

    public final int getPause() {
        return this.pause;
    }

    @Nullable
    public final IReportDataCallback getReportCallback() {
        return this.reportCallback;
    }

    public final void getReportData() {
        this.sportStateCaller.getSportState();
    }

    public final boolean getResumeSportNeedPlayNewPlaylist() {
        return this.resumeSportNeedPlayNewPlaylist;
    }

    @Nullable
    public final RouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    @Nullable
    public List<Location> getRouteLists() {
        return null;
    }

    @Nullable
    public final SportingData getSportData() {
        return this.sportData;
    }

    public final int getSportGoalType() {
        return this.sportGoalType;
    }

    public final float getSportGoalValue() {
        return this.sportGoalValue;
    }

    @NotNull
    public final MutableLiveData<MusicData> getSportMusicData() {
        return this.sportMusicData;
    }

    @NotNull
    public final ISportRemoteState getSportStateCaller() {
        return this.sportStateCaller;
    }

    @Nullable
    public final SportTarget getSportTarget() {
        return this.sportTarget;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final int getSportWearMode() {
        return this.sportWearMode;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    @Nullable
    public final Function1<UISportState, Unit> getUiSportState() {
        return this.uiSportState;
    }

    @NotNull
    public final MutableLiveData<Integer> getWearModeStatusChangeLiveData() {
        return this.wearModeStatusChangeLiveData;
    }

    /* JADX INFO: renamed from: isActivityFirstInit, reason: from getter */
    public final boolean getIsActivityFirstInit() {
        return this.isActivityFirstInit;
    }

    /* JADX INFO: renamed from: isBind, reason: from getter */
    public final boolean getIsBind() {
        return this.isBind;
    }

    /* JADX INFO: renamed from: isCurWearDeviceSupportLaunchSport, reason: from getter */
    public final boolean getIsCurWearDeviceSupportLaunchSport() {
        return this.isCurWearDeviceSupportLaunchSport;
    }

    /* JADX INFO: renamed from: isFinishRegular, reason: from getter */
    public final boolean getIsFinishRegular() {
        return this.isFinishRegular;
    }

    /* JADX INFO: renamed from: isLocalLaunch, reason: from getter */
    public final boolean getIsLocalLaunch() {
        return this.isLocalLaunch;
    }

    /* JADX INFO: renamed from: isNeedChangePlaylist, reason: from getter */
    public final boolean getIsNeedChangePlaylist() {
        return this.isNeedChangePlaylist;
    }

    public abstract boolean isNeedJumpSportDetailPage();

    /* JADX INFO: renamed from: isPause, reason: from getter */
    public final boolean getIsPause() {
        return this.isPause;
    }

    public abstract boolean isSupportSportMusic();

    public final boolean isValidAbilityTrainingPlan() {
        getMModel().getAbilityPlanCourse();
        return false;
    }

    public final boolean isValidHabitTrainingPlan() {
        getMModel().getHabitDayPlan();
        return false;
    }

    public final boolean isValidSport() {
        return getMModel().isValidSport();
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.interfaces.IMusicPlay
    public void nextSong() {
        SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).executeAsync("next", null, false, new IMusicCallback(this) { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM.nextSong.1
            final /* synthetic */ BaseSportVM<M> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicCallback
            public void onMusiceCallback(Result result, MusicData musicData) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(musicData, "musicData");
                if (result.getCode() == 0) {
                    this.this$0.getTAG();
                }
            }
        });
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        Logger.i(getTAG(), "onCleared ");
        this.uiSportState = null;
        this.connectState = null;
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
        FitnessLogUtils.i(getTAG(), "onConnectFailure");
    }

    public void onConnectStart(@Nullable String did) {
        FitnessLogUtils.i(getTAG(), "onConnectStart");
    }

    public void onConnectSuccess(@Nullable String did) {
        FitnessLogUtils.i(getTAG(), "onConnectSuccess");
        ne4 ne4Var = new ne4(did, true);
        Function1<? super ne4, Unit> function1 = this.connectState;
        if (function1 != null) {
            function1.invoke2(ne4Var);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.sportStateCaller.removeSportStateChangedListener(getClass(), this);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this);
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
        getMModel().onDestroy();
        this.connectState = null;
        this.uiSportState = null;
        isNeedJumpSportDetailPage();
        if (isSupportSportMusic()) {
            SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).unBindXiaomiPlayerService(AppUtil.getApp());
        }
        super.onDestroy(owner);
    }

    public void onDisconnect(@Nullable String did) {
        Map<CommonSportModel.SportTitle, String> map;
        WearableDeviceInfo deviceInfo;
        WearableDeviceInfo deviceInfo2;
        WearableDeviceInfo deviceInfo3;
        Map<CommonSportModel.SportTitle, String> map2;
        FitnessLogUtils.i(getTAG(), "onDisconnect , isCurWearDeviceSupportLaunchSport :" + this.isCurWearDeviceSupportLaunchSport);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel localDeviceModel = DeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        if (this.isCurWearDeviceSupportLaunchSport) {
            ne4 ne4Var = new ne4(did, false);
            Function1<? super ne4, Unit> function1 = this.connectState;
            if (function1 != null) {
                function1.invoke2(ne4Var);
            }
            SportingData sportingData = this.sportData;
            if (sportingData != null && (map2 = sportingData.getMap()) != null) {
                map2.put(CommonSportModel.SportTitle.connectDevice, "");
            }
            MutableLiveData<SportingData> mutableLiveData = this.mData;
            if (mutableLiveData != null) {
                mutableLiveData.postValue(this.sportData);
                return;
            }
            return;
        }
        String name = null;
        if (!Intrinsics.areEqual((localDeviceModel == null || (deviceInfo3 = localDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo3.getModel(), "ksmb.treadmill.m1v1")) {
            if (!Intrinsics.areEqual((localDeviceModel == null || (deviceInfo2 = localDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo2.getModel(), "ksmb.treadmill.m2")) {
                return;
            }
        }
        ne4 ne4Var2 = new ne4(did, false);
        Function1<? super ne4, Unit> function2 = this.connectState;
        if (function2 != null) {
            function2.invoke2(ne4Var2);
        }
        SportingData sportingData2 = this.sportData;
        if (sportingData2 != null && (map = sportingData2.getMap()) != null) {
            CommonSportModel.SportTitle sportTitle = CommonSportModel.SportTitle.connectDevice;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = AppUtil.getApp().getResources().getString(c1j.t0);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Object[] objArr = new Object[1];
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel != null && (deviceInfo = wearableDeviceModel.getDeviceInfo()) != null) {
                name = deviceInfo.getName();
            }
            objArr[0] = name;
            String str = String.format(string, Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            map.put(sportTitle, str);
        }
        MutableLiveData<SportingData> mutableLiveData2 = this.mData;
        if (mutableLiveData2 != null) {
            mutableLiveData2.postValue(this.sportData);
        }
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ISportDataListener
    public void onFail(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.IPlayerEventListener
    public void onPlayState(@Nullable Boolean isPlaying) {
        Logger.i(getTAG(), "onPlayState , isPlaying:" + isPlaying);
        if (isPlaying != null) {
            this.playing = isPlaying.booleanValue();
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids, @Nullable FinishSportData finishSportData) {
        this.isPause = false;
        SendFocusNotification.INSTANCE.cancelFocusNotification(this.sportType);
        this.isFinishRegular = true;
        Function1<? super UISportState, Unit> function1 = this.uiSportState;
        if (function1 != null) {
            function1.invoke2(new UISportState.Finish(validSport));
        }
        SportModel.Companion companion = SportModel.INSTANCE;
        companion.setGOAL_VALUE(0.0f);
        companion.setGOAL_TYPE(-1);
        companion.setSPORT_TYPE(0);
        SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).notifySportChanged(SportAccessExportExtKt.getWEAR_SPORT_FINISHED(), this.sportType);
        CommonSportModelUtil.INSTANCE.setTargetViewUtils(null);
        Logger.i(getTAG(), "onSportFinished , isPlaying:" + this.playing);
        if (this.playing) {
            Logger.i(SportMusicManager.TAG, "finish sport");
            toggleMusic();
        }
    }

    public void onSportPaused() {
        List<SportingItemData> list;
        this.isPause = true;
        SendFocusNotification sendFocusNotification = SendFocusNotification.INSTANCE;
        MutableLiveData<SportingData> mutableLiveData = this.mData;
        sendFocusNotification.sendFocusNotification(mutableLiveData != null ? mutableLiveData.getValue() : null, this.sportType, Boolean.TRUE);
        Function1<? super UISportState, Unit> function1 = this.uiSportState;
        if (function1 != null) {
            function1.invoke2(UISportState.Pause.INSTANCE);
        }
        SportingData sportingData = this.sportData;
        if (sportingData != null && (list = sportingData.getList()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((SportingItemData) obj).getOther(), "pace")) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((SportingItemData) it.next()).setData("--");
            }
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C30573(this, null), 2, null);
        this.pause++;
        Logger.i(getTAG(), "onSportPaused , isPlaying:" + this.playing);
        if (this.playing) {
            Logger.i(SportMusicManager.TAG, "pause sport");
            toggleMusic();
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportReportDataListener
    public void onSportReportData(@NotNull SportData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Logger.i(getTAG(), "SportData:" + data);
        IReportDataCallback iReportDataCallback = this.reportCallback;
        if (iReportDataCallback == null) {
            Logger.i(getTAG(), "reportCallback == null");
        } else {
            Intrinsics.checkNotNull(iReportDataCallback);
            iReportDataCallback.onReportData(data);
        }
        this.reportCallback = null;
        this.sportStateCaller.setSportReportDataListener(null);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        this.isPause = false;
        SendFocusNotification sendFocusNotification = SendFocusNotification.INSTANCE;
        MutableLiveData<SportingData> mutableLiveData = this.mData;
        sendFocusNotification.sendFocusNotification(mutableLiveData != null ? mutableLiveData.getValue() : null, this.sportType, Boolean.FALSE);
        Function1<? super UISportState, Unit> function1 = this.uiSportState;
        if (function1 != null) {
            function1.invoke2(UISportState.Restart.INSTANCE);
        }
        Logger.i(getTAG(), "onSportRestarted , isPlaying:" + this.playing);
        resumeMusic();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
        ISportStateChangedListener.DefaultImpls.onSportSegment(this, i, i2);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int code, int startTime, int timeZone, int sportType, int sportLaunchType) {
        this.isPause = false;
        Function1<? super UISportState, Unit> function1 = this.uiSportState;
        if (function1 != null) {
            function1.invoke2(UISportState.Start.INSTANCE);
        }
        FitnessLogUtils.i(getTAG(), "deviceType : " + this.deviceType);
        if (this.deviceType == 0) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C30581(sportType, null), 3, null);
        }
        if (this.abilityPlanCourse != null) {
            CommonSportModelUtil.INSTANCE.setTargetViewUtils(new AbilityTrainingTargetViewUtils(this.abilityPlanCourse));
        } else {
            HabitDayPlan habitDayPlan = this.habitDayPlan;
            if (habitDayPlan != null) {
                CommonSportModelUtil.INSTANCE.setTargetViewUtils(new HabitTrainingTargetViewUtils(habitDayPlan));
            }
        }
        if (isSupportSportMusic()) {
            getAndPlaySportPlaylist();
        }
        SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).notifySportChanged(SportAccessExportExtKt.getWEAR_SPORT_START(), sportType);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.IPlayerEventListener
    public void onUpdateSongInfo(@Nullable MusicData data) {
        if (!SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).isHasSportPlaylist() || data == null) {
            return;
        }
        this.songInfo = data;
        this.sportMusicData.setValue(data);
    }

    public void onViewPaused(@NotNull n0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        pauseSport(callback);
    }

    public void onViewRestart(@NotNull n0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        resumeSport(callback);
    }

    public final void pauseSport(@Nullable final n0d callback) {
        this.sportStateCaller.pauseSport(this.curDeviceDid, this.sportType, new RequestCallback(this) { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM.pauseSport.1
            final /* synthetic */ BaseSportVM<M> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                n0d n0dVar;
                FitnessLogUtils.i(this.this$0.getTAG(), "onViewPaused");
                if (responseCode != 0 || (n0dVar = callback) == null) {
                    return;
                }
                n0dVar.a();
            }
        });
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.interfaces.IMusicPlay
    public void playSportPlaylist() {
        SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).executeAsync("play_sports_playlist", null, false, new IMusicCallback() { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM.playSportPlaylist.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicCallback
            public void onMusiceCallback(Result result, MusicData musicData) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(musicData, "musicData");
                result.getCode();
            }
        });
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.interfaces.IMusicPlay
    public void preSong() {
        SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).executeAsync("previous", null, false, new IMusicCallback(this) { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM.preSong.1
            final /* synthetic */ BaseSportVM<M> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicCallback
            public void onMusiceCallback(Result result, MusicData musicData) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(musicData, "musicData");
                if (result.getCode() != 0) {
                    this.this$0.getTAG();
                }
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        ISportStateChangedListener.DefaultImpls.preSport(this);
    }

    public final void reEnableJumpToReport() {
        this.sportStateCaller.setSportReportDataListener(this);
    }

    public final void restartActivity() {
        setCurDeviceDid(getDeviceDid());
    }

    public final void restartSport(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.sportStateCaller.restartSport(did, this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM.restartSport.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
            }
        });
    }

    public final void resumeMusic() {
        Logger.i(SportMusicManager.TAG, "resumeSport , playing:" + this.playing + " , resumeSportNeedPlayNewPlaylist:" + this.resumeSportNeedPlayNewPlaylist);
        if (this.playing) {
            return;
        }
        if (!this.resumeSportNeedPlayNewPlaylist) {
            toggleMusic();
        } else {
            playSportPlaylist();
            this.resumeSportNeedPlayNewPlaylist = false;
        }
    }

    public final void resumeSport(@NotNull final n0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.sportStateCaller.resumeSport(this.curDeviceDid, this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM.resumeSport.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                if (responseCode == 0) {
                    callback.a();
                }
            }
        });
    }

    public final void setAbilityPlanCourse(@Nullable AbilityPlanRunningCourse abilityPlanRunningCourse) {
        this.abilityPlanCourse = abilityPlanRunningCourse;
        getMModel().setAbilityPlanCourse(abilityPlanRunningCourse);
    }

    public final void setActivityFirstInit(boolean z) {
        this.isActivityFirstInit = z;
    }

    public final void setBind(boolean z) {
        this.isBind = z;
    }

    public final void setConnectState(@Nullable Function1<? super ne4, Unit> function1) {
        this.connectState = function1;
    }

    public final void setConnectStateCallback(@NotNull Function1<? super ne4, Unit> stateCallback) {
        Intrinsics.checkNotNullParameter(stateCallback, "stateCallback");
        this.connectState = stateCallback;
    }

    public final void setCurDeviceDid(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.curDeviceDid = value;
        getMModel().setDeviceDid(value);
    }

    public final void setCurWearDeviceSupportLaunchSport(boolean z) {
        this.isCurWearDeviceSupportLaunchSport = z;
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
        getMModel().setDeviceType(i);
        setCurDeviceDid(getDeviceDid());
    }

    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setDisconnectFinishSport(boolean z) {
        this.disconnectFinishSport = z;
    }

    public final void setFinishRegular(boolean z) {
        this.isFinishRegular = z;
    }

    public final void setGoalRemind(@Nullable GoalRemindData goalRemindData) {
        this.goalRemind = goalRemindData;
    }

    public final void setHabitDayPlan(@Nullable HabitDayPlan habitDayPlan) {
        this.habitDayPlan = habitDayPlan;
        getMModel().setHabitDayPlan(habitDayPlan);
    }

    public final void setHasPreRoute(boolean z) {
        this.hasPreRoute = z;
    }

    public final void setLocalLaunch(boolean z) {
        this.isLocalLaunch = z;
    }

    public final void setMData(@Nullable MutableLiveData<SportingData> mutableLiveData) {
        this.mData = mutableLiveData;
    }

    public final void setMusicID(long j) {
        this.musicID = j;
    }

    public final void setNeedChangePlaylist(boolean z) {
        this.isNeedChangePlaylist = z;
    }

    public final void setOnMusicPlayingChangeListener(@Nullable IMusicPlaylintChanged listener) {
        this.iMusicPlayingChangeListener = listener;
    }

    public final void setPause(int i) {
        this.pause = i;
    }

    public final void setReportCallback(@Nullable IReportDataCallback iReportDataCallback) {
        this.reportCallback = iReportDataCallback;
    }

    public final void setReportDataCallback(@Nullable IReportDataCallback reportDataCallback) {
        Logger.i(getTAG(), "setReportDataCallback :" + reportDataCallback);
        this.reportCallback = reportDataCallback;
    }

    public final void setResumeSportNeedPlayNewPlaylist(boolean z) {
        this.resumeSportNeedPlayNewPlaylist = z;
    }

    public final void setRouteInfo(@Nullable RouteInfo routeInfo) {
        this.routeInfo = routeInfo;
    }

    public final void setSportData(@Nullable SportingData sportingData) {
        this.sportData = sportingData;
    }

    public final void setSportGoalType(int i) {
        this.sportGoalType = i;
        getMModel().setSportGoalType(i);
    }

    public final void setSportGoalValue(float f) {
        this.sportGoalValue = f;
        getMModel().setSportGoalValue(f);
    }

    public final void setSportRemind() {
        int i = this.sportGoalType;
        if (i != -1) {
            this.goalRemind = new GoalRemindData(i, this.sportGoalValue, this.sportType);
        }
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).refreshSportRemind(this.sportType, this.goalRemind);
    }

    public final void setSportStateCaller(@NotNull ISportRemoteState iSportRemoteState) {
        Intrinsics.checkNotNullParameter(iSportRemoteState, "<set-?>");
        this.sportStateCaller = iSportRemoteState;
    }

    public final void setSportTarget(@Nullable SportTarget sportTarget) {
        this.sportTarget = sportTarget;
    }

    public final void setSportType(int i) {
        this.sportType = i;
        getMModel().setSportType(i);
    }

    public final void setSportWearMode(int i) {
        this.sportWearMode = i;
        getMModel().setSportWearMode(i);
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setUISportStateChange(@NotNull Function1<? super UISportState, Unit> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.uiSportState = state;
    }

    public final void setUiSportState(@Nullable Function1<? super UISportState, Unit> function1) {
        this.uiSportState = function1;
    }

    public void startSport() {
        FitnessLogUtils.i("BaseSportVM", "startSport");
        setCurDeviceDid(getDeviceDid());
        if (this.sportGoalType != -1) {
            SportTarget sportTarget = new SportTarget();
            this.sportTarget = sportTarget;
            int i = this.sportGoalType;
            if (i == 0) {
                sportTarget.setType(3);
                SportTarget sportTarget2 = this.sportTarget;
                if (sportTarget2 != null) {
                    sportTarget2.setValue((int) (this.sportGoalValue * 1000));
                }
            } else if (i == 1) {
                sportTarget.setType(1);
                SportTarget sportTarget3 = this.sportTarget;
                if (sportTarget3 != null) {
                    sportTarget3.setValue((int) (this.sportGoalValue * 60));
                }
            } else if (i == 2) {
                sportTarget.setType(2);
                SportTarget sportTarget4 = this.sportTarget;
                if (sportTarget4 != null) {
                    sportTarget4.setValue((int) this.sportGoalValue);
                }
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long tZOffsetInMilli = FitnessDateUtils.getTZOffsetInMilli(jCurrentTimeMillis);
        SportRequestData.a aVar = new SportRequestData.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        SportRequestData.a aVarS = aVar.B(jCurrentTimeMillis, timeUnit).D(tZOffsetInMilli, timeUnit).z(this.sportType).H(this.sportWearMode).y(this.sportTarget).v(getRouteLists()).x(1).s(this.hasPreRoute);
        if (this.abilityPlanCourse != null) {
            SportCourse sportCourse = new SportCourse();
            AbilityPlanRunningCourse abilityPlanRunningCourse = this.abilityPlanCourse;
            Intrinsics.checkNotNull(abilityPlanRunningCourse);
            sportCourse.setCloudCourseId(abilityPlanRunningCourse.getPlanId());
            AbilityPlanRunningCourse abilityPlanRunningCourse2 = this.abilityPlanCourse;
            Intrinsics.checkNotNull(abilityPlanRunningCourse2);
            sportCourse.setCourseName(abilityPlanRunningCourse2.getName());
            aVarS.p(sportCourse);
            AbilityPlanRunningCourse abilityPlanRunningCourse3 = this.abilityPlanCourse;
            Intrinsics.checkNotNull(abilityPlanRunningCourse3);
            aVarS.G(abilityPlanRunningCourse3.getPlanId());
        }
        SportRequestData sportRequestDataO = aVarS.o();
        this.startTime = sportRequestDataO.timeStamp;
        ISportRemoteState iSportRemoteState = this.sportStateCaller;
        String str = this.curDeviceDid;
        Intrinsics.checkNotNull(sportRequestDataO);
        iSportRemoteState.startSport(str, sportRequestDataO, new RequestCallback(this) { // from class: com.xiaomi.fitness.sport.viewmodel.BaseSportVM.startSport.2
            final /* synthetic */ BaseSportVM<M> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.i(this.this$0.getTAG(), "start sport responseCode : " + responseCode);
            }
        });
        startTrack();
    }

    public final void startTrack() {
        String str;
        String str2;
        String name;
        String str3;
        String strValueOf;
        String str4;
        LaunchSportTrackBean launchSportTrackBean = new LaunchSportTrackBean();
        launchSportTrackBean.setName("workout_start");
        int i = this.sportType;
        if (i == 1) {
            str = "outdoor_running";
        } else if (i == 2) {
            str = "outdoor_walking";
        } else if (i != 3) {
            str = i != 6 ? "" : "outdoor_cycling";
        } else {
            str = this.deviceType == 1 ? "mijia_treadmill" : "indoor_running";
        }
        launchSportTrackBean.setExerciseTypeDetail(str);
        if (this.isLocalLaunch) {
            str2 = "instrument_to_phone";
        } else {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
                WearableDeviceModel wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
                str2 = (wearableDeviceModelCurGymDeviceModel == null || !wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected()) ? "phone" : "phone_to_instrument";
            } else {
                str2 = "phone_to_device";
            }
        }
        launchSportTrackBean.setSource(str2);
        launchSportTrackBean.setGPS(Boolean.valueOf(getGpsAccuracyStatus() != 0));
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        String name2 = AbstractJsonLexerKt.NULL;
        if (wearableDeviceModel2 == null || !wearableDeviceModel2.getIsDeviceConnected()) {
            name = AbstractJsonLexerKt.NULL;
        } else {
            WearableDeviceModel wearableDeviceModel3 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            name = wearableDeviceModel3 != null ? DeviceModelExtKt.getName(wearableDeviceModel3) : null;
        }
        launchSportTrackBean.setDeviceModel(name);
        GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel2 = gymDeviceModel.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel2 != null && wearableDeviceModelCurGymDeviceModel2.getIsDeviceConnected()) {
            WearableDeviceModel wearableDeviceModelCurGymDeviceModel3 = gymDeviceModel.curGymDeviceModel();
            name2 = wearableDeviceModelCurGymDeviceModel3 != null ? DeviceModelExtKt.getName(wearableDeviceModelCurGymDeviceModel3) : null;
        }
        launchSportTrackBean.setInstrumentModel(name2);
        int i2 = this.sportGoalType;
        if (i2 == 0) {
            str3 = "distance";
        } else if (i2 != 1) {
            str3 = i2 != 2 ? "unknown" : "calories";
        } else {
            str3 = "duration";
        }
        launchSportTrackBean.setTargetType(str3);
        launchSportTrackBean.setTargetValue(Float.valueOf(this.sportGoalValue));
        lcn sportConfigModel = getScmDao().getSportConfigModel(this.sportType);
        if (sportConfigModel == null) {
            sportConfigModel = new lcn();
        }
        launchSportTrackBean.setTempoAvg(Integer.valueOf(sportConfigModel.i ? sportConfigModel.j : 0));
        launchSportTrackBean.setDisplay(Boolean.valueOf(sportConfigModel.f24910k));
        launchSportTrackBean.setLighten(Boolean.valueOf(sportConfigModel.f24909b));
        launchSportTrackBean.setAuto(Boolean.valueOf(sportConfigModel.o));
        launchSportTrackBean.setVoice(Boolean.valueOf(sportConfigModel.m));
        launchSportTrackBean.setRemind(Boolean.valueOf(sportConfigModel.m ? sportConfigModel.h : false));
        if (sportConfigModel.m) {
            strValueOf = sportConfigModel.f24908a == 6 ? String.valueOf((int) (3600 / sportConfigModel.g)) : TimeDateUtil.getSportPaceStrWithSecDef(sportConfigModel.f);
        } else {
            strValueOf = "0";
        }
        launchSportTrackBean.setSpeedRemind(strValueOf);
        boolean z = sportConfigModel.m;
        String str5 = Constants.EXTRA_CLOSE_TAI;
        if (z && (str4 = sportConfigModel.l) != null) {
            str5 = str4;
        }
        launchSportTrackBean.setTypeStr(str5);
        AppSportTracker.INSTANCE.getInstance().appLaunchSportTrack(launchSportTrackBean);
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.interfaces.IMusicPlay
    public void toMusicZone(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).goQQPlayer(context, this.sportType == 6 ? 2 : 1);
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.interfaces.IMusicPlay
    public void toggleMusic() {
        if (isSupportSportMusic()) {
            Logger.i(SportMusicManager.TAG, "music button toggle , isNeedChangePlaylist:" + this.isNeedChangePlaylist + " , playing:" + this.playing);
            toggle();
        }
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ISportDataListener
    public void onSuccess(@NotNull SportingData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.sportData = data;
        if (!this.isPause) {
            MutableLiveData<SportingData> mutableLiveData = this.mData;
            if (mutableLiveData != null) {
                mutableLiveData.postValue(data);
            }
            SendFocusNotification.sendFocusNotification$default(SendFocusNotification.INSTANCE, data, this.sportType, null, 4, null);
        }
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).isSupportLaunchSport(1, new i7r() { // from class: id2
            @Override // defpackage.i7r
            public final void a(Boolean bool) {
                BaseSportVM.onSuccess$lambda$3(this.f21012a, bool);
            }
        });
    }

    public final void setPause(boolean z) {
        this.isPause = z;
    }
}
