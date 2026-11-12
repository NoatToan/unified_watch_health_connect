package com.xiaomi.fitness.sport.view.sporting;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.RouteReportData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportBasicReportKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport.SportConstants;
import com.xiaomi.fitness.sport.bean.SportingData;
import com.xiaomi.fitness.sport.data.UISportState;
import com.xiaomi.fitness.sport.interfaces.ISportStateOnViewCallback;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.model.SportModel;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport.model.utils.HabitTrainingTargetViewUtils;
import com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils;
import com.xiaomi.fitness.sport.utils.SportBeanHelperExtKt;
import com.xiaomi.fitness.sport.utils.SportUtilsExtKt;
import com.xiaomi.fitness.sport.utils.TransitionUtil;
import com.xiaomi.fitness.sport.view.config.SportRemindConfigActivity;
import com.xiaomi.fitness.sport.view.config.SportRemindConfigFragment;
import com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity;
import com.xiaomi.fitness.sport.view.wear.guide.SportBeanUiDataModel;
import com.xiaomi.fitness.sport.view.widget.SportCommandView;
import com.xiaomi.fitness.sport.viewmodel.BaseSportVM;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportTarget;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer;
import com.xiaomi.fitness.sport_manager_export.listener.ISCMRepository;
import com.xiaomi.fitness.sport_manager_export.listener.SCMDao;
import com.xiaomi.fitness.sport_manager_export.utils.SportStateUtilsKt;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.model.TrainingPlanConstantsKt;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.aje;
import defpackage.aki;
import defpackage.av6;
import defpackage.c1j;
import defpackage.lcn;
import defpackage.lp5;
import defpackage.n0d;
import defpackage.ne4;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\b\u0001\u0010\u0005*\u00020\u00042\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u00020\u0007B\u0018\u0012\u0006\u0010f\u001a\u00020\u0013\u0012\u0006\u0010j\u001a\u00020\u0013¢\u0006\u0005\bÜ\u0001\u0010#J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\nJ\u001f\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010\nJ\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\nJ\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010)H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020)H\u0014¢\u0006\u0004\b.\u0010,J\u0017\u0010/\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b/\u0010,J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\nJ\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0014¢\u0006\u0004\b5\u0010\nJ\u000f\u00106\u001a\u00020\bH\u0014¢\u0006\u0004\b6\u0010\nJ\u0019\u00109\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u000107H\u0004¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020&H\u0014¢\u0006\u0004\b;\u0010(J\u0017\u0010>\u001a\u00020\b2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\b2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b@\u0010?J\u0017\u0010A\u001a\u00020\b2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\bA\u0010?J'\u0010E\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u00132\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010C¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\bH\u0016¢\u0006\u0004\bG\u0010\nJ\u000f\u0010H\u001a\u00020\bH\u0016¢\u0006\u0004\bH\u0010\nJ\u0019\u0010I\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\bI\u0010\u001eJ\r\u0010J\u001a\u00020&¢\u0006\u0004\bJ\u0010(J\r\u0010K\u001a\u00020\b¢\u0006\u0004\bK\u0010\nJ\u0011\u0010M\u001a\u0004\u0018\u00010LH&¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\b¢\u0006\u0004\bO\u0010\nJ)\u0010T\u001a\u00020\b2\u0006\u0010P\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\u00132\b\u0010S\u001a\u0004\u0018\u00010RH\u0014¢\u0006\u0004\bT\u0010UJ\u001d\u0010Z\u001a\u00020\b2\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\r\u0010\\\u001a\u00020&¢\u0006\u0004\b\\\u0010(J\r\u0010]\u001a\u00020&¢\u0006\u0004\b]\u0010(J\u001f\u0010a\u001a\u00020\u00132\u0006\u0010^\u001a\u00020\u00132\u0006\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\ba\u0010bJ\u0011\u0010d\u001a\u0004\u0018\u00010cH\u0016¢\u0006\u0004\bd\u0010eR\u001a\u0010f\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010j\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010g\u001a\u0004\bk\u0010iR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010g\u001a\u0004\bl\u0010i\"\u0004\bm\u0010\u0016R\"\u0010n\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010g\u001a\u0004\bo\u0010i\"\u0004\bp\u0010\u0016R\"\u0010r\u001a\u00020q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010x\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010g\u001a\u0004\by\u0010i\"\u0004\bz\u0010\u0016R*\u0010|\u001a\b\u0012\u0002\b\u0003\u0018\u00010{8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R-\u0010\u0082\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010{8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0082\u0001\u0010}\u001a\u0005\b\u0083\u0001\u0010\u007f\"\u0006\b\u0084\u0001\u0010\u0081\u0001R(\u0010\u0085\u0001\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0085\u0001\u0010(\"\u0006\b\u0087\u0001\u0010\u0088\u0001R(\u0010\u0089\u0001\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u0086\u0001\u001a\u0005\b\u0089\u0001\u0010(\"\u0006\b\u008a\u0001\u0010\u0088\u0001R\u001d\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0006¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R(\u0010\u0090\u0001\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0090\u0001\u0010\u0086\u0001\u001a\u0005\b\u0090\u0001\u0010(\"\u0006\b\u0091\u0001\u0010\u0088\u0001R(\u0010\u0092\u0001\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0092\u0001\u0010\u0086\u0001\u001a\u0005\b\u0093\u0001\u0010(\"\u0006\b\u0094\u0001\u0010\u0088\u0001R\u0018\u0010\u0095\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010gR!\u0010\u009b\u0001\u001a\u00030\u0096\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R*\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R1\u0010¤\u0001\u001a\u00020&2\u0007\u0010£\u0001\u001a\u00020&8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b¤\u0001\u0010\u0086\u0001\u001a\u0005\b¥\u0001\u0010(\"\u0006\b¦\u0001\u0010\u0088\u0001R&\u0010§\u0001\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b§\u0001\u0010g\u001a\u0005\b¨\u0001\u0010i\"\u0005\b©\u0001\u0010\u0016R(\u0010ª\u0001\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bª\u0001\u0010\u0086\u0001\u001a\u0005\bª\u0001\u0010(\"\u0006\b«\u0001\u0010\u0088\u0001R,\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R,\u0010´\u0001\u001a\u0005\u0018\u00010³\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R,\u0010»\u0001\u001a\u0005\u0018\u00010º\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R\u0018\u0010Â\u0001\u001a\u00030Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010Å\u0001\u001a\u00030Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R+\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R+\u0010Í\u0001\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R\u001d\u0010Ô\u0001\u001a\u00030Ó\u00018\u0006¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001R&\u0010Ù\u0001\u001a\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030{\u0018\u00010Ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R&\u0010Û\u0001\u001a\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030{\u0018\u00010Ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ú\u0001¨\u0006Ý\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport/view/sporting/BaseSportingActivity;", "Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM;", "Lcom/xiaomi/fitness/sport/model/CommonSportModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/interfaces/ISportStateOnViewCallback;", "", "parseTrainingPlanParams", "()V", "Lne4;", "it", "handleDeviceConnect", "(Lne4;)V", "localDeviceConnectChanged", "wearDeviceConnectChanged", "localConnectDialot", "connectDialog", "", DailyRecordKey.sportType, "setSportConfig", "(I)V", "Lcom/xiaomi/fitness/sport/data/UISportState;", "state", "onSportStateChanged", "(Lcom/xiaomi/fitness/sport/data/UISportState;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportData;", "sportData", "gotoSportDetailPage", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportData;)V", "askIfResumeSportDialog", "titleRes", "descRes", "showResumeTrainingPlanSportDialogIfNeed", "(II)V", "showCourseMedalDialog", "askIfResumeDialogDismiss", "", "hasRunningPosture", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRestoreInstanceState", "hideRunningMusic", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_DESTROY, "Lcom/airbnb/lottie/LottieAnimationView;", "countdownView", "setCountdownMode", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "isNeedRemind", "Ln0d;", "callback", "onViewRestart", "(Ln0d;)V", "onViewPaused", "onViewFinish", "distance", "Lkotlin/Function0;", "dismissCallBack", "showHabitPop", "(ILkotlin/jvm/functions/Function0;)V", "onBackPressed", "showAdjustmentDistanceDialog", "jumpSportDetail", "isSupportAdjustmentDis", "showShortDistanceDialog", "Lcom/xiaomi/fitness/sport/view/widget/SportCommandView;", "getSportCommandView", "()Lcom/xiaomi/fitness/sport/view/widget/SportCommandView;", "gotoSportConfig", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/sport/view/wear/guide/SportBeanUiDataModel;", "sportBeanUiDataModel", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "analyzeLowBatteryCommandAndShowDialogOnceIfNeed", "(Lcom/xiaomi/fitness/sport/view/wear/guide/SportBeanUiDataModel;Landroidx/fragment/app/FragmentManager;)V", "isSportBeanMode", "isSportBeanWearModeAndHasRunningPosture", StepsInfo.KEY_DISTANCE, "", "length", "getRouteMatchResult", "(ID)I", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "getRouteInfo", "()Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "layoutId", "I", "getLayoutId", "()I", "viewModelId", "getViewModelId", "getSportType", "setSportType", "deviceType", "getDeviceType", "setDeviceType", "", "goalValue", "F", "getGoalValue", "()F", "setGoalValue", "(F)V", "goalType", "getGoalType", "setGoalType", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "dialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "localDialog", "getLocalDialog", "setLocalDialog", "isRecoverySport", "Z", "setRecoverySport", "(Z)V", "isRebootSport", "setRebootSport", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "isBackgroundProcessAlive", "setBackgroundProcessAlive", "disconnectFinishSport", "getDisconnectFinishSport", "setDisconnectFinishSport", "prevModeChangeStatus", "Lcom/xiaomi/fitness/sport_manager_export/listener/SCMDao;", "scmDao$delegate", "Lkotlin/Lazy;", "getScmDao", "()Lcom/xiaomi/fitness/sport_manager_export/listener/SCMDao;", "scmDao", "Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicPlayer;", "player", "Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicPlayer;", "getPlayer", "()Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicPlayer;", "setPlayer", "(Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicPlayer;)V", "value", "showRunningPosture", "getShowRunningPosture", "setShowRunningPosture", "wearMode", "getWearMode", "setWearMode", "isShowAskIfResumeSportDialog", "setShowAskIfResumeSportDialog", "Lcom/xiaomi/fitness/sport/view/sporting/SportBeanRunningPostureDrawerHolder;", "drawerHolder", "Lcom/xiaomi/fitness/sport/view/sporting/SportBeanRunningPostureDrawerHolder;", "getDrawerHolder", "()Lcom/xiaomi/fitness/sport/view/sporting/SportBeanRunningPostureDrawerHolder;", "setDrawerHolder", "(Lcom/xiaomi/fitness/sport/view/sporting/SportBeanRunningPostureDrawerHolder;)V", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "abilityPlanCourse", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "getAbilityPlanCourse", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "setAbilityPlanCourse", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;)V", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "habitDayPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "getHabitDayPlan", "()Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "setHabitDayPlan", "(Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;)V", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "onDeviceStatusListener", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "Lcom/xiaomi/fitness/device/manager/export/OnAccessoryDeviceStateListener;", "onAccessoryDeviceStateListener", "Lcom/xiaomi/fitness/device/manager/export/OnAccessoryDeviceStateListener;", "prevLowBattery", "Ljava/lang/Integer;", "getPrevLowBattery", "()Ljava/lang/Integer;", "setPrevLowBattery", "(Ljava/lang/Integer;)V", "prevModeChanged", "Ljava/lang/Boolean;", "getPrevModeChanged", "()Ljava/lang/Boolean;", "setPrevModeChanged", "(Ljava/lang/Boolean;)V", "Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM$IMusicPlaylintChanged;", "musicPlayChangeListener", "Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM$IMusicPlaylintChanged;", "getMusicPlayChangeListener", "()Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM$IMusicPlaylintChanged;", "Ljava/lang/ref/WeakReference;", "askIfResumeDialog", "Ljava/lang/ref/WeakReference;", "askIfResumeCourseSportDialog", "<init>", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseSportingActivity<VM extends BaseSportVM<CommonSportModel>, VDB extends ViewDataBinding> extends BaseBindingActivity<VM, VDB> implements ISportStateOnViewCallback {

    @Nullable
    private AbilityPlanRunningCourse abilityPlanCourse;

    @Nullable
    private WeakReference<CommonDialog<?>> askIfResumeCourseSportDialog;

    @Nullable
    private WeakReference<CommonDialog<?>> askIfResumeDialog;
    private int deviceType;

    @Nullable
    private CommonDialog<?> dialog;
    private boolean disconnectFinishSport;

    @Nullable
    private SportBeanRunningPostureDrawerHolder drawerHolder;
    private float goalValue;

    @Nullable
    private HabitDayPlan habitDayPlan;
    private boolean isRebootSport;
    private boolean isRecoverySport;
    private boolean isShowAskIfResumeSportDialog;
    private final int layoutId;

    @Nullable
    private CommonDialog<?> localDialog;
    public IMusicPlayer player;
    private int prevModeChangeStatus;
    private boolean showRunningPosture;
    private int sportType;
    private final int viewModelId;
    private int wearMode;
    private int goalType = -1;

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());
    private boolean isBackgroundProcessAlive = true;

    /* JADX INFO: renamed from: scmDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scmDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kd2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseSportingActivity.scmDao_delegate$lambda$0();
        }
    });

    @NotNull
    private final OnDeviceStatusListener onDeviceStatusListener = new OnDeviceStatusListener(this) { // from class: com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity$onDeviceStatusListener$1
        final /* synthetic */ BaseSportingActivity<VM, VDB> this$0;

        {
            this.this$0 = this;
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
            if (SportBeanHelperExtKt.getSupportRunningBeanAsAccessoryDevice()) {
                BaseSportingActivity.access$getMViewModel(this.this$0).getWearModeStatusChangeLiveData().postValue(3);
                Logger.d(BaseBindingActivity.TAG, "wearModeStatusChangeLiveData onConnectSuccess did=" + did);
            }
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            if (SportBeanHelperExtKt.getSupportRunningBeanAsAccessoryDevice() || this.this$0.getWearMode() != 1) {
                return;
            }
            BaseSportingActivity.access$getMViewModel(this.this$0).getWearModeStatusChangeLiveData().postValue(2);
            Logger.d(BaseBindingActivity.TAG, "wearModeStatusChangeLiveData onDisconnect did=" + did);
        }
    };

    @NotNull
    private final OnAccessoryDeviceStateListener onAccessoryDeviceStateListener = new OnAccessoryDeviceStateListener(this) { // from class: com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity$onAccessoryDeviceStateListener$1
        final /* synthetic */ BaseSportingActivity<VM, VDB> this$0;

        {
            this.this$0 = this;
        }

        @Override // com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener
        public void onAccessoryDeviceModeChange(String did, int mode, boolean fromApp) {
            if (did == null) {
                return;
            }
            Logger.d(BaseBindingActivity.TAG, "onAccessoryDeviceModeChange supportRunningBeanAsAccessoryDevice=" + SportBeanHelperExtKt.getSupportRunningBeanAsAccessoryDevice() + " supportRunningBeanAsPrimaryAndNoAccessory=" + SportBeanHelperExtKt.getSupportRunningBeanAsPrimaryAndNoAccessory());
            if (this.this$0.getWearMode() == 1 && SportBeanHelperExtKt.getSupportRunningBeanAsPrimaryAndNoAccessory()) {
                BaseSportingActivity.access$getMViewModel(this.this$0).getWearModeStatusChangeLiveData().setValue(4);
            } else {
                if (SportBeanHelperExtKt.getSupportRunningBeanAsAccessoryDevice()) {
                    return;
                }
                BaseSportingActivity.access$getMViewModel(this.this$0).getWearModeStatusChangeLiveData().setValue(1);
            }
        }

        @Override // com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener
        public void onAccessoryDeviceModeDuplicate(String did, int mode, boolean fromApp) {
            if (did == null) {
                return;
            }
            Logger.d(BaseBindingActivity.TAG, "wearModeStatusChangeLiveData onAccessoryDeviceModeDuplicate did=" + did + " mode=" + mode + " fromApp=" + fromApp);
        }
    };

    @Nullable
    private Integer prevLowBattery = 0;

    @Nullable
    private Boolean prevModeChanged = Boolean.FALSE;

    @NotNull
    private final BaseSportVM.IMusicPlaylintChanged musicPlayChangeListener = new BaseSportVM.IMusicPlaylintChanged(this) { // from class: com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity$musicPlayChangeListener$1
        final /* synthetic */ BaseSportingActivity<VM, VDB> this$0;

        {
            this.this$0 = this;
        }

        @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM.IMusicPlaylintChanged
        public void onChange(int code) {
            if (code != 0) {
                this.this$0.hideRunningMusic();
            }
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity$askIfResumeSportDialog$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/sport/view/sporting/BaseSportingActivity$askIfResumeSportDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends av6 {
        final /* synthetic */ BaseSportingActivity<VM, VDB> this$0;

        public AnonymousClass1(BaseSportingActivity<VM, VDB> baseSportingActivity) {
            this.this$0 = baseSportingActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onDialogClick$lambda$0() {
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (which != -2) {
                if (which != -1) {
                    return;
                }
                BaseSportingActivity.access$getMViewModel(this.this$0).resumeSport(new n0d() { // from class: yd2
                    @Override // defpackage.n0d
                    public final void a() {
                        BaseSportingActivity.AnonymousClass1.onDialogClick$lambda$0();
                    }
                });
            } else {
                this.this$0.setShowAskIfResumeSportDialog(true);
                BaseSportingActivity.access$getMViewModel(this.this$0).finishSport();
                if (dialog != null) {
                    dialog.dismiss();
                }
                this.this$0.finish();
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity$showResumeTrainingPlanSportDialogIfNeed$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/sport/view/sporting/BaseSportingActivity$showResumeTrainingPlanSportDialogIfNeed$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C30481 extends av6 {
        final /* synthetic */ BaseSportingActivity<VM, VDB> this$0;

        public C30481(BaseSportingActivity<VM, VDB> baseSportingActivity) {
            this.this$0 = baseSportingActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onDialogClick$lambda$0() {
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (which != -2) {
                if (which != -1) {
                    return;
                }
                BaseSportingActivity.access$getMViewModel(this.this$0).resumeSport(new n0d() { // from class: zd2
                    @Override // defpackage.n0d
                    public final void a() {
                        BaseSportingActivity.C30481.onDialogClick$lambda$0();
                    }
                });
            } else {
                BaseSportingActivity.access$getMViewModel(this.this$0).reEnableJumpToReport();
                BaseSportingActivity.access$getMViewModel(this.this$0).finishSport();
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }
    }

    public BaseSportingActivity(int i, int i2) {
        this.layoutId = i;
        this.viewModelId = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BaseSportVM access$getMViewModel(BaseSportingActivity baseSportingActivity) {
        return (BaseSportVM) baseSportingActivity.getMViewModel();
    }

    private final void askIfResumeDialogDismiss() {
        CommonDialog<?> commonDialog;
        WeakReference<CommonDialog<?>> weakReference = this.askIfResumeDialog;
        if (weakReference == null || (commonDialog = weakReference.get()) == null) {
            return;
        }
        commonDialog.dismiss();
    }

    private final void askIfResumeSportDialog() {
        CommonDialog<?> commonDialog;
        CommonDialog<?> commonDialog2;
        WeakReference<CommonDialog<?>> weakReference = new WeakReference<>(new CommonDialog.c("askIfResumeSportDialog").setDialogDescription(c1j.i1).setNegativeText(c1j.q1).setPositiveText(c1j.O0).create());
        this.askIfResumeDialog = weakReference;
        CommonDialog<?> commonDialog3 = weakReference.get();
        if (commonDialog3 != null) {
            commonDialog3.setCancelable(false);
        }
        WeakReference<CommonDialog<?>> weakReference2 = this.askIfResumeDialog;
        if (weakReference2 != null && (commonDialog2 = weakReference2.get()) != null) {
            commonDialog2.addDialogCallback(new AnonymousClass1(this));
        }
        WeakReference<CommonDialog<?>> weakReference3 = this.askIfResumeDialog;
        if (weakReference3 == null || (commonDialog = weakReference3.get()) == null) {
            return;
        }
        commonDialog.showIfNeed(getSupportFragmentManager());
    }

    private final void connectDialog(ne4 it) {
        if (!it.b()) {
            Logger.d(BaseBindingActivity.TAG, "supportsSportBean=" + SportBeanHelperExtKt.getSupportsSportBean() + " wearMode=" + this.wearMode);
            ToastUtil.INSTANCE.showToast(c1j.C5);
            return;
        }
        FitnessLogUtils.i(BaseBindingActivity.TAG, "connectDialog , resartSport");
        VM mViewModel = getMViewModel();
        String strA = it.a();
        if (strA == null) {
            strA = "";
        }
        mViewModel.restartSport(strA);
        CommonDialog<?> commonDialog = this.dialog;
        if (commonDialog != null) {
            commonDialog.dismissAllowingStateLoss();
        }
        this.dialog = null;
    }

    private final SCMDao getScmDao() {
        return (SCMDao) this.scmDao.getValue();
    }

    private final void gotoSportDetailPage(SportData sportData) {
        Map<Integer, String> targetValue;
        Map<Integer, String> targetValue2;
        Map<Integer, String> targetValue3;
        int iConvertSportType = SportUtilsExtKt.convertSportType(this.sportType);
        if (sportData == null) {
            return;
        }
        FitnessLogUtils.i(BaseBindingActivity.TAG, "sportReportData :" + sportData + " sportType=" + this.sportType);
        getMViewModel().finishTrack(sportData, this.disconnectFinishSport);
        if (sportData.distance < 100) {
            showShortDistanceDialog();
            return;
        }
        SportBasicReport sportBasicReport = new SportBasicReport(new FitnessDataId.Builder().timeStampInSec(sportData.startTime).timeZoneIn15Min(sportData.timezone).sportType(iConvertSportType).fileType(1).version(1).build());
        sportBasicReport.setSportType(this.sportType);
        sportBasicReport.setSid("xiaomiwear_app");
        sportBasicReport.setDuration(sportData.totalTime);
        sportBasicReport.setTimeStamp(sportData.startTime);
        sportBasicReport.setAvgHeight(Float.valueOf(sportData.aveHeight));
        int i = sportData.aveHrRate & 255;
        if (i != 0) {
            sportBasicReport.setAvgHr(Integer.valueOf(i));
        }
        sportBasicReport.setCalories(Integer.valueOf(sportData.cal));
        sportBasicReport.setDistance(Integer.valueOf(sportData.distance));
        if (isSupportAdjustmentDis()) {
            Integer distance = sportBasicReport.getDistance();
            int i2 = sportData.adjustmentDis;
            if (distance == null || distance.intValue() != i2) {
                sportBasicReport.setCorrectedDistance(Integer.valueOf(sportData.adjustmentDis));
            }
        }
        sportBasicReport.setDuration(sportData.totalTime);
        sportBasicReport.setMaxSpeed(Float.valueOf(sportData.fastestSpeed));
        sportBasicReport.setEndTime(sportData.endTime);
        sportBasicReport.setMaxHr(Integer.valueOf(sportData.maxHrRate & 255));
        sportBasicReport.setMaxHeight(Float.valueOf(sportData.maxHeight));
        sportBasicReport.setHrAerobicDuration(Integer.valueOf(sportData.hrAerobic));
        sportBasicReport.setHrAnaerobicDuration(Integer.valueOf(sportData.hrAnaerobic));
        sportBasicReport.setHrFatBurningDuration(Integer.valueOf(sportData.hrFat));
        sportBasicReport.setHrExtremeDuration(Integer.valueOf(sportData.hrLimit));
        sportBasicReport.setHrWarmUpDuration(Integer.valueOf(sportData.hrWarm));
        sportBasicReport.setMaxCadence(Integer.valueOf(sportData.maxStepRate));
        sportBasicReport.setMinHr(Integer.valueOf(sportData.minHrRate & 255));
        sportBasicReport.setMinHeight(Float.valueOf(sportData.minHeight));
        sportBasicReport.setStartTime(sportData.startTime);
        sportBasicReport.setSteps(Integer.valueOf(sportData.totalStep));
        sportBasicReport.setTimeStamp(sportData.startTime);
        sportBasicReport.setFullFootLandingDuration(Integer.valueOf(sportData.fullFootDurBySecond));
        sportBasicReport.setForeFootLandingDuration(Integer.valueOf(sportData.foreFootDurBySecond));
        sportBasicReport.setHeelLandingDuration(Integer.valueOf(sportData.hindFootDurBySecond));
        SportTarget sportTarget = getMViewModel().getSportTarget();
        if (sportTarget != null) {
            sportBasicReport.setTargetValue(new LinkedHashMap());
            if (sportTarget.getType() == 1 && (targetValue3 = sportBasicReport.getTargetValue()) != null) {
                targetValue3.put(2, String.valueOf(sportTarget.getValue()));
            }
            if (sportTarget.getType() == 2 && (targetValue2 = sportBasicReport.getTargetValue()) != null) {
                targetValue2.put(4, String.valueOf(sportTarget.getValue()));
            }
            if (sportTarget.getType() == 3 && (targetValue = sportBasicReport.getTargetValue()) != null) {
                targetValue.put(3, String.valueOf(sportTarget.getValue()));
            }
        }
        if (this.wearMode == 1 || SportStateUtilsKt.isSupportWristPosture(this.sportType)) {
            if (sportData.isHasDegree) {
                sportBasicReport.setValgusRange(Integer.valueOf(sportData.degree));
            }
            sportBasicReport.setAvgPace(Integer.valueOf(sportData.avgPace));
            sportBasicReport.setMaxPace(Integer.valueOf(sportData.fastestPace));
            sportBasicReport.setAvgSpeed(Float.valueOf(sportData.avgSpeed));
            sportBasicReport.setAvgCadence(Integer.valueOf(sportData.avgFrequency));
            sportBasicReport.setAvgCycleCadence(Integer.valueOf(sportData.avgFrequency));
            sportBasicReport.setMaxCycleCadence(Integer.valueOf(sportData.maxFrequency));
            sportBasicReport.setAvgStride(Integer.valueOf(sportData.avgStried));
            sportBasicReport.setMainLandingMode(Integer.valueOf(sportData.mainRunStyle));
            sportBasicReport.setForeFootLandingRatio(Integer.valueOf(sportData.forefootRatio));
            sportBasicReport.setHeelLandingRatio(Integer.valueOf(sportData.heelRatio));
            float f = 10;
            sportBasicReport.setAvgLandingImpact(Float.valueOf(sportData.avgImpact / f));
            sportBasicReport.setMaxLandingImpact(Float.valueOf(sportData.maxImpact / f));
            sportBasicReport.setAvgTouchDownDuration(Integer.valueOf(sportData.avgOnGround));
            sportBasicReport.setMinTouchDownDuration(Integer.valueOf(sportData.minOnGround));
            sportBasicReport.setAvgAirDuration(Integer.valueOf(sportData.avgOffGround));
            sportBasicReport.setMaxAirDuration(Integer.valueOf(sportData.maxOffGround));
            sportBasicReport.setAvgTouchDownAirRatio(Float.valueOf(sportData.avgOnOffRatio / f));
            sportBasicReport.setMinTouchDownAirRatio(Float.valueOf(sportData.minOnOffRatio / f));
        }
        sportBasicReport.setTrainingPlanId(Long.valueOf(sportData.planId));
        sportBasicReport.setCloudCourseId(Long.valueOf(sportData.courseId));
        if (SportStateUtilsKt.isSupportWristPosture(this.sportType)) {
            sportBasicReport.setAvgTouchDownDuration(Integer.valueOf(sportData.avgOnGround));
            sportBasicReport.setMinTouchDownDuration(Integer.valueOf(sportData.minOnGround));
            float f2 = 10;
            sportBasicReport.setAvgVerticalStrideRatio(Float.valueOf(sportData.avgVerticalStrideRatio / f2));
            sportBasicReport.setMinVerticalStrideRatio(Float.valueOf(sportData.minVerticalStrideRatio / f2));
            sportBasicReport.setMaxVerticalStrideRatio(Float.valueOf(sportData.maxVerticalStrideRatio / f2));
            sportBasicReport.setAvgVerticalAmplitude(Float.valueOf(sportData.avgVerticalAmplitude / f2));
            sportBasicReport.setMinVerticalAmplitude(Float.valueOf(sportData.minVerticalAmplitude / f2));
            sportBasicReport.setMaxVerticalAmplitude(Float.valueOf(sportData.maxVerticalAmplitude / f2));
        }
        Bundle bundle = new Bundle();
        bundle.putInt("sport_type", lp5.a(sportBasicReport));
        bundle.putLong("time_stamp", sportData.timeStamp);
        bundle.putSerializable("sport_report", sportBasicReport);
        boolean z = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel() == 0;
        bundle.putBoolean("connect_device", z);
        RouteInfo routeInfo = getRouteInfo();
        if (routeInfo != null) {
            int routeMatchResult = getRouteMatchResult(sportData.distance, routeInfo.getLength());
            Logger.i(BaseBindingActivity.TAG, "routeMatchResult:" + routeMatchResult + " , has routeInfo:" + routeInfo);
            bundle.putSerializable(SportBasicReportKt.getROUTE_KEY(), new RouteReportData(routeInfo.getId(), routeInfo.getName(), (float) routeInfo.getLength(), routeMatchResult, routeInfo.getIcon(), routeInfo.getFile()));
        }
        SportRecordApiKt.getSportRecordApi().goSportDetail(this, bundle, sportBasicReport, z);
        FitnessLogUtils.i(BaseBindingActivity.TAG, "goSportDetail , sportValues:" + sportBasicReport);
        finish();
    }

    private final void handleDeviceConnect(ne4 it) {
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        String strA = it.a();
        Intrinsics.checkNotNullExpressionValue(strA, "getDid(...)");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(strA);
        if (this.deviceType != 1) {
            wearDeviceConnectChanged(it);
        } else if (wearableDeviceModel == null || !DeviceModelExtKt.isLocalDevice(wearableDeviceModel)) {
            wearDeviceConnectChanged(it);
        } else {
            localDeviceConnectChanged(it);
        }
    }

    private final boolean hasRunningPosture() {
        int i = this.sportType;
        return i == 1 || i == 2 || i == 3;
    }

    private final void localConnectDialot(ne4 it) {
        CommonDialog<?> commonDialogCreate;
        if (it.b()) {
            FitnessLogUtils.i(BaseBindingActivity.TAG, "connectDialog , resartSport");
            VM mViewModel = getMViewModel();
            String strA = it.a();
            if (strA == null) {
                strA = "";
            }
            mViewModel.restartSport(strA);
            CommonDialog<?> commonDialog = this.dialog;
            if (commonDialog != null) {
                commonDialog.dismissAllowingStateLoss();
            }
            this.dialog = null;
            return;
        }
        Logger.d(BaseBindingActivity.TAG, "supportsSportBean=" + SportBeanHelperExtKt.getSupportsSportBean() + " wearMode=" + this.wearMode);
        if (this.dialog == null) {
            if (SportBeanHelperExtKt.getSupportsSportBean() && this.wearMode == 1) {
                String string = getString(c1j.h0);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                commonDialogCreate = new CommonDialog.c("connectDialog").setDialogTitle(c1j.C5).setDialogDescriptionString(new DialogParams.DialogDescriptionString(string)).setPositiveText(c1j.r1).create();
            } else {
                commonDialogCreate = new CommonDialog.c("connectDialog").setDialogTitle(c1j.t0).setDialogDescription(c1j.v3).setPositiveText(c1j.r1).create();
            }
            this.dialog = commonDialogCreate;
            if (commonDialogCreate != null) {
                commonDialogCreate.setCancelable(false);
            }
            CommonDialog<?> commonDialog2 = this.dialog;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new av6(this) { // from class: com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity.localConnectDialot.1
                    final /* synthetic */ BaseSportingActivity<VM, VDB> this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (which == -1) {
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            BaseSportingActivity.access$getMViewModel(this.this$0).disconnectOperate();
                            this.this$0.setDisconnectFinishSport(true);
                            this.this$0.finish();
                        }
                    }
                });
            }
            CommonDialog<?> commonDialog3 = this.dialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(getSupportFragmentManager());
            }
        }
    }

    private final void localDeviceConnectChanged(ne4 it) {
        FitnessLogUtils.i(BaseBindingActivity.TAG, "localDevice connect : " + it.b() + " , did : " + it.a());
        localConnectDialot(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onActivityResult$lambda$15(BaseSportingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).refreshSportRemind(this$0.sportType, ((BaseSportVM) this$0.getMViewModel()).getGoalRemind());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(final BaseSportingActivity this$0, Integer num) {
        SportBeanRunningPostureDrawerHolder sportBeanRunningPostureDrawerHolder;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(BaseBindingActivity.TAG, "wearModeStatusChangeLiveData curtVal=" + num + " supportRunningBeanAsPrimaryAndNoAccessory=" + SportBeanHelperExtKt.getSupportRunningBeanAsPrimaryAndNoAccessory());
        if (num != null && num.intValue() == 4) {
            FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            SportBeanHelperExtKt.showStatusChangeDialog(true, supportFragmentManager, new Function0() { // from class: ud2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseSportingActivity.onCreate$lambda$4$lambda$1(this.f35642a);
                }
            });
        } else if (num != null && num.intValue() == 2 && this$0.prevModeChangeStatus == 1) {
            FragmentManager supportFragmentManager2 = this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
            SportBeanHelperExtKt.showStatusChangeDialog(true, supportFragmentManager2, new Function0() { // from class: vd2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseSportingActivity.onCreate$lambda$4$lambda$2(this.f36762a);
                }
            });
        } else if (num != null && num.intValue() == 2 && this$0.prevModeChangeStatus != 2) {
            FragmentManager supportFragmentManager3 = this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
            SportBeanHelperExtKt.showStatusChangeDialog(false, supportFragmentManager3, new Function0() { // from class: wd2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseSportingActivity.onCreate$lambda$4$lambda$3(this.f37863a);
                }
            });
        } else if (num != null && num.intValue() == 3 && (sportBeanRunningPostureDrawerHolder = this$0.drawerHolder) != null) {
            sportBeanRunningPostureDrawerHolder.showRunningPosture(true);
        }
        this$0.prevModeChangeStatus = num.intValue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4$lambda$1(BaseSportingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportBeanRunningPostureDrawerHolder sportBeanRunningPostureDrawerHolder = this$0.drawerHolder;
        if (sportBeanRunningPostureDrawerHolder != null) {
            sportBeanRunningPostureDrawerHolder.showRunningPosture(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4$lambda$2(BaseSportingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportBeanRunningPostureDrawerHolder sportBeanRunningPostureDrawerHolder = this$0.drawerHolder;
        if (sportBeanRunningPostureDrawerHolder != null) {
            sportBeanRunningPostureDrawerHolder.showRunningPosture(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4$lambda$3(BaseSportingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportBeanRunningPostureDrawerHolder sportBeanRunningPostureDrawerHolder = this$0.drawerHolder;
        if (sportBeanRunningPostureDrawerHolder != null) {
            sportBeanRunningPostureDrawerHolder.showRunningPosture(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(BaseSportingActivity this$0, UISportState it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onSportStateChanged(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(BaseSportingActivity this$0, ne4 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.handleDeviceConnect(it);
        return Unit.INSTANCE;
    }

    private final void onSportStateChanged(UISportState state) {
        if (state instanceof UISportState.Finish) {
            SportCommandView sportCommandView = getSportCommandView();
            if (sportCommandView != null) {
                sportCommandView.setSportState(4);
            }
            showAdjustmentDistanceDialog();
            return;
        }
        if (Intrinsics.areEqual(state, UISportState.Pause.INSTANCE)) {
            SportCommandView sportCommandView2 = getSportCommandView();
            if (sportCommandView2 != null) {
                sportCommandView2.setSportState(2);
            }
            SportCommandView sportCommandView3 = getSportCommandView();
            if (sportCommandView3 != null) {
                sportCommandView3.getMStartOrPause();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(state, UISportState.Restart.INSTANCE)) {
            SportCommandView sportCommandView4 = getSportCommandView();
            if (sportCommandView4 != null) {
                sportCommandView4.setSportState(3);
            }
            askIfResumeDialogDismiss();
            return;
        }
        if (!Intrinsics.areEqual(state, UISportState.Start.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        SportCommandView sportCommandView5 = getSportCommandView();
        if (sportCommandView5 != null) {
            sportCommandView5.setSportState(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewFinish$lambda$9(BaseSportingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((BaseSportVM) this$0.getMViewModel()).finishSport();
        return Unit.INSTANCE;
    }

    private final void parseTrainingPlanParams() {
        try {
            Intent intent = getIntent();
            if (intent != null) {
                if ((this instanceof CommonSportActivity) || (this instanceof IndoorRunningActivity)) {
                    CommonSportModelUtil.INSTANCE.setTargetViewUtils(null);
                    Serializable serializableExtra = intent.getSerializableExtra(SportConstants.KEY_ABILITY_TRAINING_INFO);
                    this.abilityPlanCourse = serializableExtra instanceof AbilityPlanRunningCourse ? (AbilityPlanRunningCourse) serializableExtra : null;
                    Serializable serializableExtra2 = intent.getSerializableExtra(SportConstants.KEY_HABIT_TRAINING_INFO);
                    this.habitDayPlan = serializableExtra2 instanceof HabitDayPlan ? (HabitDayPlan) serializableExtra2 : null;
                    getMViewModel().setAbilityPlanCourse(this.abilityPlanCourse);
                    getMViewModel().setHabitDayPlan(this.habitDayPlan);
                    AbilityPlanRunningCourse abilityPlanRunningCourse = this.abilityPlanCourse;
                    Long lValueOf = abilityPlanRunningCourse != null ? Long.valueOf(abilityPlanRunningCourse.getPlanId()) : null;
                    AbilityPlanRunningCourse abilityPlanRunningCourse2 = this.abilityPlanCourse;
                    Long lValueOf2 = abilityPlanRunningCourse2 != null ? Long.valueOf(abilityPlanRunningCourse2.getCourseId()) : null;
                    HabitDayPlan habitDayPlan = this.habitDayPlan;
                    Logger.d(BaseBindingActivity.TAG, "parseTrainingPlanParams:" + lValueOf + " - " + lValueOf2 + " - " + (habitDayPlan != null ? Long.valueOf(habitDayPlan.getPlanId()) : null));
                } else {
                    Logger.d(BaseBindingActivity.TAG, "not sport activity!! do not parse training params!!");
                }
            }
            aje.b(this).d(new Intent(TrainingPlanConstantsKt.FINISH_COURSE_INFO_ACTIVITY));
        } catch (Exception e) {
            Logger.e(BaseBindingActivity.TAG, "parseTrainingPlanParams exception", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SCMDao scmDao_delegate$lambda$0() {
        return SportManagerExtKt.getInstance(ISCMRepository.INSTANCE).getScmDao();
    }

    private final void setSportConfig(int sportType) {
        lcn sportRemindTable = SportManagerExtKt.getInstance(ISCMRepository.INSTANCE).getSportRemindTable(sportType);
        if (Intrinsics.areEqual(sportRemindTable != null ? Boolean.valueOf(sportRemindTable.f24909b) : null, Boolean.TRUE)) {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(128);
                return;
            }
            return;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(128);
        }
    }

    private final void showCourseMedalDialog() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showHabitPop$default(BaseSportingActivity baseSportingActivity, int i, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showHabitPop");
        }
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        baseSportingActivity.showHabitPop(i, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showHabitPop$lambda$10(BaseSportingActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportingData sportData = ((BaseSportVM) this$0.getMViewModel()).getSportData();
        float duration = (sportData != null ? sportData.getDuration() : 0) / 60;
        float f = i / 1000.0f;
        float f2 = duration / f;
        Logger.i(BaseBindingActivity.TAG, "create-habit-plan-info:" + this$0.sportType + " - " + duration + " - " + f + " - " + i + " - " + f2);
        TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).launchHabitSuggestActivity(this$0, this$0.sportType, f, f2 < 4.0f);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showHabitPop$lambda$11(BaseSportingActivity this$0, Function0 function0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.sportType != 3) {
            ((BaseSportVM) this$0.getMViewModel()).finishSport();
        }
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final void showResumeTrainingPlanSportDialogIfNeed(int titleRes, int descRes) {
        CommonDialog<?> commonDialog;
        CommonDialog<?> commonDialog2;
        WeakReference<CommonDialog<?>> weakReference = new WeakReference<>(new CommonDialog.c("trainingPlanTip").setDialogTitle(titleRes).setDialogDescription(descRes).setNegativeText(c1j.q1).setPositiveText(c1j.O0).create());
        this.askIfResumeCourseSportDialog = weakReference;
        CommonDialog<?> commonDialog3 = weakReference.get();
        if (commonDialog3 != null) {
            commonDialog3.setCancelable(false);
        }
        WeakReference<CommonDialog<?>> weakReference2 = this.askIfResumeCourseSportDialog;
        if (weakReference2 != null && (commonDialog2 = weakReference2.get()) != null) {
            commonDialog2.addDialogCallback(new C30481(this));
        }
        WeakReference<CommonDialog<?>> weakReference3 = this.askIfResumeCourseSportDialog;
        if (weakReference3 == null || (commonDialog = weakReference3.get()) == null) {
            return;
        }
        commonDialog.showIfNeed(getSupportFragmentManager());
    }

    private final void wearDeviceConnectChanged(ne4 it) {
        FitnessLogUtils.i(BaseBindingActivity.TAG, "wearDevice connect : " + it.b() + " , did : " + it.a());
        connectDialog(it);
    }

    public final void analyzeLowBatteryCommandAndShowDialogOnceIfNeed(@NotNull SportBeanUiDataModel sportBeanUiDataModel, @NotNull FragmentManager supportFragmentManager) {
        Intrinsics.checkNotNullParameter(sportBeanUiDataModel, "sportBeanUiDataModel");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "supportFragmentManager");
        String lowBatteryStr = sportBeanUiDataModel.getLowBatteryStr();
        Integer numValueOf = lowBatteryStr != null ? Integer.valueOf(Integer.parseInt(lowBatteryStr)) : null;
        Integer num = this.prevLowBattery;
        if (num != null && num.intValue() == 0 && numValueOf != null && numValueOf.intValue() >= 1 && numValueOf.intValue() <= 5) {
            SportBeanHelperExtKt.showBandLowBatteryDialog(supportFragmentManager);
        }
        this.prevLowBattery = numValueOf;
    }

    @Nullable
    public final AbilityPlanRunningCourse getAbilityPlanCourse() {
        return this.abilityPlanCourse;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final CommonDialog<?> getDialog() {
        return this.dialog;
    }

    public final boolean getDisconnectFinishSport() {
        return this.disconnectFinishSport;
    }

    @Nullable
    public final SportBeanRunningPostureDrawerHolder getDrawerHolder() {
        return this.drawerHolder;
    }

    public final int getGoalType() {
        return this.goalType;
    }

    public final float getGoalValue() {
        return this.goalValue;
    }

    @Nullable
    public final HabitDayPlan getHabitDayPlan() {
        return this.habitDayPlan;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @Nullable
    public final CommonDialog<?> getLocalDialog() {
        return this.localDialog;
    }

    @NotNull
    public final BaseSportVM.IMusicPlaylintChanged getMusicPlayChangeListener() {
        return this.musicPlayChangeListener;
    }

    @NotNull
    public final IMusicPlayer getPlayer() {
        IMusicPlayer iMusicPlayer = this.player;
        if (iMusicPlayer != null) {
            return iMusicPlayer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("player");
        return null;
    }

    @Nullable
    public final Integer getPrevLowBattery() {
        return this.prevLowBattery;
    }

    @Nullable
    public final Boolean getPrevModeChanged() {
        return this.prevModeChanged;
    }

    @Nullable
    public RouteInfo getRouteInfo() {
        return null;
    }

    public int getRouteMatchResult(int dis, double length) {
        return 0;
    }

    public final boolean getShowRunningPosture() {
        return this.showRunningPosture;
    }

    @Nullable
    public abstract SportCommandView getSportCommandView();

    public final int getSportType() {
        return this.sportType;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return this.viewModelId;
    }

    public final int getWearMode() {
        return this.wearMode;
    }

    public final void gotoSportConfig() {
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_SPORT_TYPE", this.sportType);
        bundle.putInt("DEVICE_TYPE", this.deviceType);
        if (!UIUtils.INSTANCE.isTablet()) {
            TransitionUtil.INSTANCE.gotoActivityResult(this, SportRemindConfigFragment.class, bundle, 0);
            return;
        }
        Intent intent = new Intent(this, (Class<?>) SportRemindConfigActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void hideRunningMusic() {
    }

    /* JADX INFO: renamed from: isBackgroundProcessAlive, reason: from getter */
    public final boolean getIsBackgroundProcessAlive() {
        return this.isBackgroundProcessAlive;
    }

    public boolean isNeedRemind() {
        return true;
    }

    /* JADX INFO: renamed from: isRebootSport, reason: from getter */
    public final boolean getIsRebootSport() {
        return this.isRebootSport;
    }

    /* JADX INFO: renamed from: isRecoverySport, reason: from getter */
    public final boolean getIsRecoverySport() {
        return this.isRecoverySport;
    }

    /* JADX INFO: renamed from: isShowAskIfResumeSportDialog, reason: from getter */
    public final boolean getIsShowAskIfResumeSportDialog() {
        return this.isShowAskIfResumeSportDialog;
    }

    public final boolean isSportBeanMode() {
        return SportBeanHelperExtKt.getSupportsSportBean() && this.wearMode == 1;
    }

    public final boolean isSportBeanWearModeAndHasRunningPosture() {
        return isSportBeanMode() && hasRunningPosture();
    }

    public final boolean isSupportAdjustmentDis() {
        return this.sportType == 3 && this.deviceType == 0;
    }

    @SuppressLint({"WrongConstant"})
    public void jumpSportDetail(@Nullable SportData sportData) {
        FitnessLogUtils.i(BaseBindingActivity.TAG, "jumpSportDetail");
        gotoSportDetailPage(sportData);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            if (this.deviceType == 0) {
                lcn sportRemindTable = SportManagerExtKt.getInstance(ISCMRepository.INSTANCE).getSportRemindTable(this.sportType);
                Boolean boolValueOf = sportRemindTable != null ? Boolean.valueOf(sportRemindTable.o) : null;
                SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).setAutoPase(boolValueOf != null ? boolValueOf.booleanValue() : false);
            }
            setSportConfig(this.sportType);
            getMBinding().getRoot().postDelayed(new Runnable() { // from class: nd2
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSportingActivity.onActivityResult$lambda$15(this.f27803a);
                }
            }, 500L);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Logger.i(BaseBindingActivity.TAG, "onConfigurationChanged:" + newConfig.orientation);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ISportRemoteState.Companion companion = ISportRemoteState.INSTANCE;
        FitnessLogUtils.i(BaseBindingActivity.TAG, "onCreate , background process is alive : " + SportManagerExtKt.getInstance(companion).isBackgroundProcessAlive());
        if (SportManagerExtKt.getInstance(companion).isBackgroundProcessAlive()) {
            getMViewModel().getWearModeStatusChangeLiveData().observe(this, new BaseSportingActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rd2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseSportingActivity.onCreate$lambda$4(this.f32430a, (Integer) obj);
                }
            }));
            SportCommandView sportCommandView = getSportCommandView();
            if (sportCommandView != null) {
                sportCommandView.setOnSportStateOnViewListener(this);
            }
            parseTrainingPlanParams();
            Intent intent = getIntent();
            SportModel.Companion companion2 = SportModel.INSTANCE;
            this.sportType = intent.getIntExtra("KEY_SPORT_TYPE", companion2.getSPORT_TYPE());
            this.goalType = intent.getIntExtra("GOAL_TYPE", companion2.getGOAL_TYPE());
            this.goalValue = intent.getFloatExtra("GOAL_VALUE", companion2.getGOAL_VALUE());
            int intExtra = intent.getIntExtra("WEAR_MODE", 0);
            this.wearMode = intExtra;
            Logger.d(BaseBindingActivity.TAG, "onCreate wearMode=" + intExtra);
            this.isRecoverySport = intent.getBooleanExtra("IS_RECOVER_SPORT", false);
            boolean booleanExtra = intent.getBooleanExtra("IS_REBOOT_SPORT", false);
            this.isRebootSport = booleanExtra;
            if (booleanExtra) {
                getMViewModel().setCurDeviceDid(getMViewModel().getDeviceDid());
            }
            int i = this.sportType;
            float f = this.goalValue;
            FitnessLogUtils.d(BaseBindingActivity.TAG, "sportType : " + i + " , sportGoal : " + f + " , sportGoalValue : " + f + " , wearMode:" + this.wearMode);
            getMViewModel().setSportType(this.sportType);
            getMViewModel().setSportGoalType(this.goalType);
            getMViewModel().setSportGoalValue(this.goalValue);
            getMViewModel().setSportWearMode(this.wearMode);
            if (getMViewModel().getIsActivityFirstInit() && isNeedRemind()) {
                getMViewModel().setSportRemind();
            }
            setSportConfig(this.sportType);
            getMViewModel().setUISportStateChange(new Function1() { // from class: sd2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseSportingActivity.onCreate$lambda$6(this.f33520a, (UISportState) obj);
                }
            });
            getMViewModel().setConnectStateCallback(new Function1() { // from class: td2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseSportingActivity.onCreate$lambda$7(this.f34583a, (ne4) obj);
                }
            });
            getMViewModel().setReportDataCallback(new BaseSportVM.IReportDataCallback(this) { // from class: com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity.onCreate.5
                final /* synthetic */ BaseSportingActivity<VM, VDB> this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM.IReportDataCallback
                public void onReportData(SportData data) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    Logger.i(BaseBindingActivity.TAG, "SportData:" + data);
                    this.this$0.jumpSportDetail(data);
                }
            });
            getMViewModel().setActivityFirstInit(false);
            WearableDeviceManager.Companion companion3 = WearableDeviceManager.INSTANCE;
            DeviceManagerExtKt.getInstance(companion3).addAccessoryDeviceStateListener(this.onAccessoryDeviceStateListener);
            DeviceManagerExtKt.getInstance(companion3).addDeviceStatusListener(this.onDeviceStatusListener);
            getMViewModel().setOnMusicPlayingChangeListener(this.musicPlayChangeListener);
        } else {
            this.isBackgroundProcessAlive = false;
            finish();
        }
        getMViewModel().enableJumpToReportIfNeeded();
        lcn sportConfigModel = getScmDao().getSportConfigModel(this.sportType);
        if (sportConfigModel == null || !sportConfigModel.m) {
            return;
        }
        ISportAccessApi.DefaultImpls.checkAndDownloadAudioFeedbackResourcesIfNeed$default(SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE), true, "BaseSportActivity", null, null, 12, null);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).isBackgroundProcessAlive()) {
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            DeviceManagerExtKt.getInstance(companion).removeAccessoryDeviceStateListener(this.onAccessoryDeviceStateListener);
            DeviceManagerExtKt.getInstance(companion).removeDeviceStatusListener(this.onDeviceStatusListener);
        }
        getMViewModel().setOnMusicPlayingChangeListener(null);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, android.app.Activity
    public void onRestoreInstanceState(@NotNull Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        CommonSportModelUtil commonSportModelUtil = CommonSportModelUtil.INSTANCE;
        commonSportModelUtil.setTargetViewUtils(null);
        Serializable serializable = savedInstanceState.getSerializable(SportConstants.KEY_ABILITY_TRAINING_INFO);
        this.abilityPlanCourse = serializable instanceof AbilityPlanRunningCourse ? (AbilityPlanRunningCourse) serializable : null;
        Serializable serializable2 = savedInstanceState.getSerializable(SportConstants.KEY_HABIT_TRAINING_INFO);
        this.habitDayPlan = serializable2 instanceof HabitDayPlan ? (HabitDayPlan) serializable2 : null;
        getMViewModel().setAbilityPlanCourse(this.abilityPlanCourse);
        getMViewModel().setHabitDayPlan(this.habitDayPlan);
        if (this.abilityPlanCourse != null) {
            commonSportModelUtil.setTargetViewUtils((ITargetTitleViewUtils) savedInstanceState.getSerializable(SportConstants.KEY_ABILITY_TRAINING_VIEW_UTIL));
        }
        HabitDayPlan habitDayPlan = this.habitDayPlan;
        if (habitDayPlan != null) {
            commonSportModelUtil.setTargetViewUtils(new HabitTrainingTargetViewUtils(habitDayPlan));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getMViewModel().getAndPlaySportPlaylist();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        AbilityPlanRunningCourse abilityPlanRunningCourse = this.abilityPlanCourse;
        if (abilityPlanRunningCourse != null) {
            outState.putSerializable(SportConstants.KEY_ABILITY_TRAINING_INFO, abilityPlanRunningCourse);
            outState.putSerializable(SportConstants.KEY_ABILITY_TRAINING_VIEW_UTIL, CommonSportModelUtil.INSTANCE.getTargetViewUtils());
        }
        HabitDayPlan habitDayPlan = this.habitDayPlan;
        if (habitDayPlan != null) {
            outState.putSerializable(SportConstants.KEY_HABIT_TRAINING_INFO, habitDayPlan);
        }
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ISportStateOnViewCallback
    public void onViewFinish(@NotNull n0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!getMViewModel().isValidSport()) {
            askIfResumeSportDialog();
            return;
        }
        Logger.d(BaseBindingActivity.TAG, "onViewFinish training info:" + this.abilityPlanCourse + " - " + this.habitDayPlan);
        if (this.abilityPlanCourse != null) {
            if (((CommonSportModel) getMViewModel().getMModel()).isValidAbilityTrainingPlan()) {
                TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).showFinishedPop(this, new Function0() { // from class: ld2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseSportingActivity.onViewFinish$lambda$9(this.f24922a);
                    }
                });
                return;
            } else {
                showResumeTrainingPlanSportDialogIfNeed(c1j.W5, c1j.V5);
                return;
            }
        }
        HabitDayPlan habitDayPlan = this.habitDayPlan;
        if (habitDayPlan == null) {
            getMViewModel().finishSport();
            return;
        }
        Intrinsics.checkNotNull(habitDayPlan);
        if (habitDayPlan.isCreateTestRunning()) {
            Logger.d(BaseBindingActivity.TAG, "habit plan create testing!!");
            if (!((CommonSportModel) getMViewModel().getMModel()).isValidHabitCreateTrainingPlan(((CommonSportModel) getMViewModel().getMModel()).getDistance())) {
                showResumeTrainingPlanSportDialogIfNeed(c1j.S5, c1j.R5);
                return;
            }
            Logger.d(BaseBindingActivity.TAG, "habit plan valid create " + this.sportType);
            if (this.sportType == 3) {
                getMViewModel().finishSport();
                return;
            }
            SportingData sportData = getMViewModel().getSportData();
            Integer numValueOf = sportData != null ? Integer.valueOf(sportData.getDistance()) : null;
            Intrinsics.checkNotNull(numValueOf);
            showHabitPop$default(this, numValueOf.intValue(), null, 2, null);
            return;
        }
        Logger.d(BaseBindingActivity.TAG, "habit plan normal sport!!-" + ((CommonSportModel) getMViewModel().getMModel()).getDistance());
        if (!((CommonSportModel) getMViewModel().getMModel()).isValidHabitTrainingPlan()) {
            showResumeTrainingPlanSportDialogIfNeed(c1j.W5, c1j.V5);
            return;
        }
        Logger.d(BaseBindingActivity.TAG, "habit plan valid training plan " + this.sportType + "!!");
        if (this.sportType == 3) {
            getMViewModel().finishSport();
            return;
        }
        SportingData sportData2 = getMViewModel().getSportData();
        Integer numValueOf2 = sportData2 != null ? Integer.valueOf(sportData2.getDistance()) : null;
        Intrinsics.checkNotNull(numValueOf2);
        showHabitPop$default(this, numValueOf2.intValue(), null, 2, null);
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ISportStateOnViewCallback
    public void onViewPaused(@NotNull n0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        getMViewModel().onViewPaused(callback);
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ISportStateOnViewCallback
    public void onViewRestart(@NotNull n0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        getMViewModel().onViewRestart(callback);
    }

    public final void setAbilityPlanCourse(@Nullable AbilityPlanRunningCourse abilityPlanRunningCourse) {
        this.abilityPlanCourse = abilityPlanRunningCourse;
    }

    public final void setBackgroundProcessAlive(boolean z) {
        this.isBackgroundProcessAlive = z;
    }

    public final void setCountdownMode(@Nullable LottieAnimationView countdownView) {
        if (UIUtils.isNightMode(this)) {
            if (countdownView != null) {
                countdownView.setBackgroundResource(aki.f1134a);
            }
            if (countdownView != null) {
                countdownView.setAnimation("countdown_black.json");
                return;
            }
            return;
        }
        if (countdownView != null) {
            countdownView.setAnimation("countdown_white.json");
        }
        if (countdownView != null) {
            countdownView.setBackgroundResource(aki.G);
        }
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
    }

    public final void setDialog(@Nullable CommonDialog<?> commonDialog) {
        this.dialog = commonDialog;
    }

    public final void setDisconnectFinishSport(boolean z) {
        this.disconnectFinishSport = z;
    }

    public final void setDrawerHolder(@Nullable SportBeanRunningPostureDrawerHolder sportBeanRunningPostureDrawerHolder) {
        this.drawerHolder = sportBeanRunningPostureDrawerHolder;
    }

    public final void setGoalType(int i) {
        this.goalType = i;
    }

    public final void setGoalValue(float f) {
        this.goalValue = f;
    }

    public final void setHabitDayPlan(@Nullable HabitDayPlan habitDayPlan) {
        this.habitDayPlan = habitDayPlan;
    }

    public final void setLocalDialog(@Nullable CommonDialog<?> commonDialog) {
        this.localDialog = commonDialog;
    }

    public final void setPlayer(@NotNull IMusicPlayer iMusicPlayer) {
        Intrinsics.checkNotNullParameter(iMusicPlayer, "<set-?>");
        this.player = iMusicPlayer;
    }

    public final void setPrevLowBattery(@Nullable Integer num) {
        this.prevLowBattery = num;
    }

    public final void setPrevModeChanged(@Nullable Boolean bool) {
        this.prevModeChanged = bool;
    }

    public final void setRebootSport(boolean z) {
        this.isRebootSport = z;
    }

    public final void setRecoverySport(boolean z) {
        this.isRecoverySport = z;
    }

    public final void setShowAskIfResumeSportDialog(boolean z) {
        this.isShowAskIfResumeSportDialog = z;
    }

    public final void setShowRunningPosture(boolean z) {
        this.showRunningPosture = z;
        getMViewModel().setDisconnectFinishSport(z);
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public final void setWearMode(int i) {
        this.wearMode = i;
    }

    public void showAdjustmentDistanceDialog() {
    }

    public final void showHabitPop(final int distance, @Nullable final Function0<Unit> dismissCallBack) {
        HabitDayPlan habitDayPlan = this.habitDayPlan;
        Intrinsics.checkNotNull(habitDayPlan);
        if (!habitDayPlan.isCreateTestRunning()) {
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).showFinishedPop(this, new Function0() { // from class: qd2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseSportingActivity.showHabitPop$lambda$11(this.f31382a, dismissCallBack);
                }
            });
        } else if (((CommonSportModel) getMViewModel().getMModel()).isValidHabitCreateTrainingPlan(distance)) {
            if (this.sportType != 3) {
                getMViewModel().finishSport();
            }
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).showHabitFirstPop(this, new Function0() { // from class: pd2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseSportingActivity.showHabitPop$lambda$10(this.f30278a, distance);
                }
            });
        }
    }

    public final void showShortDistanceDialog() {
        if (this.isShowAskIfResumeSportDialog) {
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("finishsport").setDialogDescription(c1j.u5).setPositiveText(c1j.h).create();
        if (commonDialogCreate != null) {
            commonDialogCreate.setCancelable(false);
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new av6(this) { // from class: com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity.showShortDistanceDialog.1
                final /* synthetic */ BaseSportingActivity<VM, VDB> this$0;

                {
                    this.this$0 = this;
                }

                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    this.this$0.finish();
                }
            });
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.showIfNeed(getSupportFragmentManager());
        }
    }
}
