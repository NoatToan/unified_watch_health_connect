package com.mi.health.course.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.v;
import com.mi.health.course.CourseDevice;
import com.mi.health.course.activity.CourseVideoActivity;
import com.mi.health.course.data.CastScreenCMD;
import com.mi.health.course.data.CourseSportState;
import com.mi.health.course.data.DeviceState;
import com.mi.health.course.data.Resolution;
import com.mi.health.course.data.Resolution1080;
import com.mi.health.course.data.Resolution4K;
import com.mi.health.course.data.Resolution720;
import com.mi.health.course.data.ResolutionKt;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.TextTypefaceSpan;
import com.mi.health.course.util.WebViewUrlKt;
import com.mi.health.course.vm.CourseBasePlayerVM;
import com.mi.health.course.vm.CourseVideoVM;
import com.mi.health.course.widget.CircleProgressBar;
import com.mi.health.course.widget.HrLevelView;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.account.HrZoneLevel;
import com.xiaomi.fitness.baseui.dialog.DriftDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.training_plan_export.model.TrainingPlanConstantsKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.aje;
import defpackage.aop;
import defpackage.czi;
import defpackage.ew1;
import defpackage.hu4;
import defpackage.ipi;
import defpackage.kyi;
import defpackage.n0i;
import defpackage.nm1;
import defpackage.oqi;
import defpackage.sti;
import defpackage.u56;
import defpackage.vm4;
import defpackage.wrq;
import defpackage.xmi;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0002\u0092\u0001\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\b¢\u0006\u0005\b¦\u0001\u0010\u000bJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u000bJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020\u001dH\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b0\u0010+J\u001f\u00102\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u00101\u001a\u00020\rH\u0002¢\u0006\u0004\b2\u0010+J'\u00107\u001a\u0002062\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\rH\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0007H\u0002¢\u0006\u0004\b9\u0010\u000bJ\u0017\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0012H\u0002¢\u0006\u0004\b;\u0010\u0015J\u000f\u0010<\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u0010\u000bJ\u0017\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\rH\u0002¢\u0006\u0004\b>\u0010#J\u0017\u0010@\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u0005H\u0002¢\u0006\u0004\b@\u0010\tJ\u000f\u0010A\u001a\u00020\u0007H\u0002¢\u0006\u0004\bA\u0010\u000bJ\u000f\u0010B\u001a\u00020\u0007H\u0002¢\u0006\u0004\bB\u0010\u000bJ\u000f\u0010C\u001a\u00020\u0007H\u0002¢\u0006\u0004\bC\u0010\u000bJ\u001f\u0010F\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0012H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0007H\u0002¢\u0006\u0004\bH\u0010\u000bJ\u000f\u0010I\u001a\u00020\u0007H\u0002¢\u0006\u0004\bI\u0010\u000bJ\u0017\u0010K\u001a\u00020\u00072\u0006\u0010J\u001a\u00020'H\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0007H\u0002¢\u0006\u0004\bO\u0010\u000bJ\u001f\u0010P\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0007H\u0002¢\u0006\u0004\bR\u0010\u000bJ\u000f\u0010S\u001a\u00020\u0005H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0005H\u0002¢\u0006\u0004\bU\u0010TJ\u0019\u0010X\u001a\u00020\u00072\b\u0010W\u001a\u0004\u0018\u00010VH\u0014¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\u00072\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u0012H\u0014¢\u0006\u0004\b_\u0010\u0015J\u000f\u0010`\u001a\u00020\u0005H\u0016¢\u0006\u0004\b`\u0010TJ\u0017\u0010b\u001a\u00020\u00072\u0006\u0010a\u001a\u00020\u000fH\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010f\u001a\u00020\u00072\u0006\u0010e\u001a\u00020dH\u0017¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u0005H\u0016¢\u0006\u0004\bh\u0010TJ\u000f\u0010i\u001a\u00020\u0007H\u0016¢\u0006\u0004\bi\u0010\u000bJ\u0017\u0010k\u001a\u00020\u00072\u0006\u0010e\u001a\u00020jH\u0016¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u0007H\u0014¢\u0006\u0004\bm\u0010\u000bJ\u000f\u0010n\u001a\u00020\u0007H\u0014¢\u0006\u0004\bn\u0010\u000bJ\u000f\u0010o\u001a\u00020\u0007H\u0016¢\u0006\u0004\bo\u0010\u000bR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010t\u001a\u0004\u0018\u00010s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010y\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010{\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b{\u0010zR\u0016\u0010|\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R(\u0010\u0088\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0005\b\u008c\u0001\u0010\u0015R\u0019\u0010\u008d\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R$\u0010\u0090\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001e\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R!\u0010\u009d\u0001\u001a\u00030\u0098\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010 \u0001\u001a\u00030\u0098\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009a\u0001\u001a\u0006\b\u009f\u0001\u0010\u009c\u0001R\u0017\u0010£\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010¥\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¢\u0001¨\u0006§\u0001"}, d2 = {"Lcom/mi/health/course/activity/CourseVideoActivity;", "Lcom/mi/health/course/activity/BaseCourseActivity;", "Lcom/mi/health/course/vm/CourseVideoVM;", "Lvm4;", "Landroid/view/View$OnClickListener;", "", "casting", "", "setStyle", "(Z)V", "configConcernData", "()V", "hr", "", "index", "Landroid/view/View;", "getView", "(ZI)Landroid/view/View;", "", "duration", "setDuration", "(J)V", "Lcom/mi/health/course/data/Resolution;", "resolution", "preparePlay", "(Lcom/mi/health/course/data/Resolution;)V", "startPlay", "", "key", "", "value", "setConcernData", "(Ljava/lang/String;F)V", "addObserver", "setHRView", "(I)V", "id", "spanTextSize", "(I)I", "Landroid/widget/TextView;", "view", "pace", "setPaceView", "(Landroid/widget/TextView;I)V", "speed", "setSpeed", "(Landroid/widget/TextView;F)V", "distance", "setDistanceView", "calorie", "setCalorieView", "fullStr", "valueLength", "txtSize", "Landroid/text/SpannableStringBuilder;", "buildSpan", "(Ljava/lang/String;II)Landroid/text/SpannableStringBuilder;", "pause", "pos", "checkSegment", "hideClarityView", "clarity", "initTvResolutionList", "mConnected", "setCastScreenUi", "showFinishCastDialog", "playerContinue", "playerStop", "next", "currentPosition", "playLocate", "(ZJ)J", "playerPause", "toggleOverlay", "selectedView", "onClarityChoice", "(Landroid/widget/TextView;)V", "decideClarity", "(Lcom/mi/health/course/data/Resolution;)Lcom/mi/health/course/data/Resolution;", "onCurClarityClick", "bindClarityData", "(Landroid/widget/TextView;Lcom/mi/health/course/data/Resolution;)V", "startOverlay", "cancelOverlay", "()Z", "isValidTrainingPlan", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", PluginDeviceInfo.FICONOFF, "onSecondTick", "isSendCmd", "v", "onClick", "(Landroid/view/View;)V", "Lcom/mi/health/course/data/CourseSportState;", "state", "onSportStateChange", "(Lcom/mi/health/course/data/CourseSportState;)V", "abnormalHeartRate", "finishCourse", "Lcom/mi/health/course/data/DeviceState;", "setDeviceStatus", "(Lcom/mi/health/course/data/DeviceState;)V", LifecycleConstantKt.ON_DESTROY, LifecycleConstantKt.ON_STOP, "onBackPressed", "Lcom/google/android/exoplayer2/q;", "player", "Lcom/google/android/exoplayer2/q;", "Landroid/graphics/Typeface;", "typeFace", "Landroid/graphics/Typeface;", "Lcom/mi/health/course/export/data/CourseConfigModel$VideoInfo;", "videoInfo", "Lcom/mi/health/course/export/data/CourseConfigModel$VideoInfo;", "tvUrl", "Ljava/lang/String;", "videoUrl", "isSupportMilink", "Z", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "errorDialog", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "Lcom/mi/health/course/data/CastScreenCMD$Operation;", "operationcmCMD", "Lcom/mi/health/course/data/CastScreenCMD$Operation;", "getOperationcmCMD", "()Lcom/mi/health/course/data/CastScreenCMD$Operation;", "setOperationcmCMD", "(Lcom/mi/health/course/data/CastScreenCMD$Operation;)V", "progressFromTV", "J", "getProgressFromTV", "()J", "setProgressFromTV", "style", "I", "", "concernedConfig", "Ljava/util/Map;", "com/mi/health/course/activity/CourseVideoActivity$playerListener$1", "playerListener", "Lcom/mi/health/course/activity/CourseVideoActivity$playerListener$1;", "", "tvResolutionSet", "Ljava/util/Set;", "Ljava/lang/Runnable;", "goneOverlay$delegate", "Lkotlin/Lazy;", "getGoneOverlay", "()Ljava/lang/Runnable;", "goneOverlay", "finishTimeout$delegate", "getFinishTimeout", "finishTimeout", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseVideoActivity.kt\ncom/mi/health/course/activity/CourseVideoActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,821:1\n1#2:822\n1863#3,2:823\n230#3,2:825\n*S KotlinDebug\n*F\n+ 1 CourseVideoActivity.kt\ncom/mi/health/course/activity/CourseVideoActivity\n*L\n190#1:823,2\n680#1:825,2\n*E\n"})
public final class CourseVideoActivity extends Hilt_CourseVideoActivity<CourseVideoVM, vm4> implements View.OnClickListener {

    @Nullable
    private DriftDialog errorDialog;
    private boolean isSupportMilink;

    @Nullable
    private q player;
    private volatile long progressFromTV;
    private CourseConfigModel.VideoInfo videoInfo;
    private String videoUrl;

    @Nullable
    private final Typeface typeFace = DisplayUtil.getTypefaceAsResourceId(AppUtil.getApp(), ipi.f21979b);

    @NotNull
    private String tvUrl = "";

    @NotNull
    private CastScreenCMD.Operation operationcmCMD = CastScreenCMD.Operation.START;
    private int style = 1;

    @NotNull
    private final Map<String, View> concernedConfig = new LinkedHashMap();

    @NotNull
    private final CourseVideoActivity$playerListener$1 playerListener = new q.e() { // from class: com.mi.health.course.activity.CourseVideoActivity$playerListener$1
        @Override // defpackage.jn1
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(nm1 nm1Var) {
            super.onAudioAttributesChanged(nm1Var);
        }

        @Override // defpackage.jn1
        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
            super.onAudioSessionIdChanged(i);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(q.b bVar) {
            super.onAvailableCommandsChanged(bVar);
        }

        @Override // com.google.android.exoplayer2.q.e
        public /* bridge */ /* synthetic */ void onCues(List list) {
            super.onCues(list);
        }

        @Override // defpackage.d96
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(u56 u56Var) {
            super.onDeviceInfoChanged(u56Var);
        }

        @Override // defpackage.d96
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            super.onDeviceVolumeChanged(i, z);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onEvents(q qVar, q.d dVar) {
            super.onEvents(qVar, dVar);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
            super.onIsLoadingChanged(z);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
            super.onIsPlayingChanged(z);
        }

        @Override // com.google.android.exoplayer2.q.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
            super.onLoadingChanged(z);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onMediaItemTransition(m mVar, int i) {
            super.onMediaItemTransition(mVar, i);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(n nVar) {
            super.onMediaMetadataChanged(nVar);
        }

        @Override // com.google.android.exoplayer2.q.e, defpackage.stf
        public /* bridge */ /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
            super.onMetadata(metadata);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            super.onPlayWhenReadyChanged(z, i);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(n0i n0iVar) {
            super.onPlaybackParametersChanged(n0iVar);
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlaybackStateChanged(int state) {
            Logger.i(BaseBindingActivity.TAG, "onPlaybackStateChanged: state = " + state);
            if (state == 2) {
                PageState.DefaultImpls.showLoading$default(this.this$0, null, 0, false, 3, null);
            } else if (state == 3) {
                this.this$0.dismissDialog();
            } else {
                if (state != 4) {
                    return;
                }
                this.this$0.finishCourse();
            }
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            super.onPlaybackSuppressionReasonChanged(i);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onPlayerError(ExoPlaybackException exoPlaybackException) {
            super.onPlayerError(exoPlaybackException);
        }

        @Override // com.google.android.exoplayer2.q.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            super.onPlayerStateChanged(z, i);
        }

        @Override // com.google.android.exoplayer2.q.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
            super.onPositionDiscontinuity(i);
        }

        @Override // defpackage.erq
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            super.onRenderedFirstFrame();
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
            super.onRepeatModeChanged(i);
        }

        @Override // com.google.android.exoplayer2.q.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onSeekProcessed() {
            super.onSeekProcessed();
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            super.onShuffleModeEnabledChanged(z);
        }

        @Override // defpackage.jn1
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            super.onSkipSilenceEnabledChanged(z);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
            super.onStaticMetadataChanged(list);
        }

        @Override // defpackage.erq
        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            super.onSurfaceSizeChanged(i, i2);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onTimelineChanged(v vVar, int i) {
            super.onTimelineChanged(vVar, i);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, aop aopVar) {
            super.onTracksChanged(trackGroupArray, aopVar);
        }

        @Override // defpackage.erq
        @Deprecated
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
            super.onVideoSizeChanged(i, i2, i3, f);
        }

        @Override // defpackage.jn1
        public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
            super.onVolumeChanged(f);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(q.f fVar, q.f fVar2, int i) {
            super.onPositionDiscontinuity(fVar, fVar2, i);
        }

        @Override // com.google.android.exoplayer2.q.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onTimelineChanged(v vVar, Object obj, int i) {
            super.onTimelineChanged(vVar, obj, i);
        }

        @Override // defpackage.erq
        public void onVideoSizeChanged(wrq videoSize) {
            Intrinsics.checkNotNullParameter(videoSize, "videoSize");
            Logger.i(BaseBindingActivity.TAG, "onVideoSizeChanged: " + videoSize.d + "; w = " + videoSize.f38295a + "; h = " + videoSize.f38296b);
            CourseVideoActivity.access$getMBinding(this.this$0).H.setRatio(videoSize.f38295a, videoSize.f38296b);
            View modestyView = CourseVideoActivity.access$getMBinding(this.this$0).O;
            Intrinsics.checkNotNullExpressionValue(modestyView, "modestyView");
            ViewExtKt.gone(modestyView);
        }
    };

    @NotNull
    private final Set<Resolution> tvResolutionSet = new LinkedHashSet();

    /* JADX INFO: renamed from: goneOverlay$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy goneOverlay = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sy4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseVideoActivity.goneOverlay_delegate$lambda$13(this.f34096a);
        }
    });

    /* JADX INFO: renamed from: finishTimeout$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy finishTimeout = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ty4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseVideoActivity.finishTimeout_delegate$lambda$16(this.f35175a);
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HrZoneLevel.values().length];
            try {
                iArr[HrZoneLevel.Extreme.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HrZoneLevel.Anaerobic.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HrZoneLevel.Aerobic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HrZoneLevel.FatBurning.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HrZoneLevel.WarmUp.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ vm4 access$getMBinding(CourseVideoActivity courseVideoActivity) {
        return (vm4) courseVideoActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addObserver() {
        q qVar = this.player;
        if (qVar != null) {
            qVar.K(this.playerListener);
        }
        ((CourseVideoVM) getMViewModel()).setOnPlayError(new Function1() { // from class: ny4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVideoActivity.addObserver$lambda$4(this.f28555a, ((Boolean) obj).booleanValue());
            }
        });
        ((CourseVideoVM) getMViewModel()).getProgressEmitter().observe(this, new CourseVideoActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: oy4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVideoActivity.addObserver$lambda$5(this.f29802a, (Integer) obj);
            }
        }));
        ((CourseVideoVM) getMViewModel()).setOnDataChange(new Function1() { // from class: py4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVideoActivity.addObserver$lambda$6(this.f30892a, (PhoneSportData) obj);
            }
        });
        ((CourseVideoVM) getMViewModel()).setMilinkConnectListener(new Function1() { // from class: qy4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVideoActivity.addObserver$lambda$7(this.f31952a, ((Boolean) obj).booleanValue());
            }
        });
        ((CourseVideoVM) getMViewModel()).setTVDataListener(new Function1() { // from class: ry4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVideoActivity.addObserver$lambda$8(this.f33053a, (CastScreenCMD.GetVideoDataFromTV) obj);
            }
        });
        ((vm4) getMBinding()).S.setOnClickListener(this);
        ((vm4) getMBinding()).R.setOnClickListener(this);
        ((vm4) getMBinding()).T.setOnClickListener(this);
        ((vm4) getMBinding()).P.setOnClickListener(this);
        ((vm4) getMBinding()).Y.setOnClickListener(this);
        ((vm4) getMBinding()).G.setOnClickListener(this);
        ((vm4) getMBinding()).C.setOnClickListener(this);
        ((vm4) getMBinding()).D.setOnClickListener(this);
        ((vm4) getMBinding()).F.setOnClickListener(this);
        ((vm4) getMBinding()).K.setOnClickListener(this);
        ((vm4) getMBinding()).A.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$4(CourseVideoActivity this$0, boolean z) {
        DriftDialog driftDialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.pause();
            View modestyView = ((vm4) this$0.getMBinding()).O;
            Intrinsics.checkNotNullExpressionValue(modestyView, "modestyView");
            ViewExtKt.gone(modestyView);
            this$0.dismissDialog();
            DriftDialog driftDialog2 = this$0.errorDialog;
            if (driftDialog2 != null && driftDialog2.isVisible()) {
                return Unit.INSTANCE;
            }
            String string = this$0.getString(czi.course_error_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = this$0.getString(czi.course_error_desc);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            DriftDialog driftDialogShowErrorDialog = this$0.showErrorDialog(string, string2);
            this$0.errorDialog = driftDialogShowErrorDialog;
            if (driftDialogShowErrorDialog != null) {
                FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                driftDialogShowErrorDialog.show(supportFragmentManager);
            }
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            this$0.dismissDialog();
            DriftDialog driftDialog3 = this$0.errorDialog;
            if (driftDialog3 != null && driftDialog3.isVisible() && (driftDialog = this$0.errorDialog) != null) {
                driftDialog.dismissAllowingStateLoss();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$5(CourseVideoActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CircleProgressBar circleProgressBar = ((vm4) this$0.getMBinding()).U;
        Intrinsics.checkNotNull(num);
        circleProgressBar.setProgress(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$6(CourseVideoActivity this$0, PhoneSportData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.setDistance(it.distance);
        this$0.setConcernData("distance", this$0.getDistance());
        this$0.setConcernData("pace", it.pace);
        this$0.setConcernData("calorie", it.calorie / 1000);
        this$0.setConcernData("speed", it.speed);
        this$0.setHRView(it.heart_rate);
        this$0.setDuration((this$0.getSupportDeviceLink() ? it.deviceDuration : it.duration) * 1000);
        ((CourseVideoVM) this$0.getMViewModel()).sendDataToTV(it, CourseDevice.TREADMILL.getType(), this$0.getDeviceLinkage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$7(CourseVideoActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setCastScreenUi(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$8(CourseVideoActivity this$0, CastScreenCMD.GetVideoDataFromTV it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        int i = it.status;
        if (i == 1) {
            this$0.progressFromTV = it.progress;
            ((CourseVideoVM) this$0.getMViewModel()).cmd(this$0.progressFromTV);
            this$0.checkSegment(this$0.progressFromTV);
        } else if (i == 2) {
            this$0.finishCourse();
        } else if (i == 3) {
            this$0.initTvResolutionList(it.clarity);
            Resolution savedResolution = ResolutionKt.getSavedResolution();
            if ((!this$0.tvResolutionSet.isEmpty()) && !this$0.tvResolutionSet.contains(savedResolution)) {
                savedResolution = (Resolution) CollectionsKt___CollectionsKt.first(this$0.tvResolutionSet);
                ResolutionKt.getAndSaveResolution(savedResolution.getId());
            }
            this$0.tvUrl = CourseExtKt.getTvUrl(this$0.getInfo(), this$0.decideClarity(savedResolution));
            q qVar = this$0.player;
            Intrinsics.checkNotNull(qVar);
            if (qVar.isPlaying()) {
                CourseVideoVM courseVideoVM = (CourseVideoVM) this$0.getMViewModel();
                CastScreenCMD.Operation operation = CastScreenCMD.Operation.START;
                String str = this$0.tvUrl;
                q qVar2 = this$0.player;
                Intrinsics.checkNotNull(qVar2);
                courseVideoVM.sendCmdToTV(operation, str, qVar2.getCurrentPosition());
            } else {
                CourseVideoVM courseVideoVM2 = (CourseVideoVM) this$0.getMViewModel();
                CastScreenCMD.Operation operation2 = CastScreenCMD.Operation.PAUSE;
                String str2 = this$0.tvUrl;
                q qVar3 = this$0.player;
                Intrinsics.checkNotNull(qVar3);
                courseVideoVM2.sendCmdToTV(operation2, str2, qVar3.getCurrentPosition());
            }
            ((CourseVideoVM) this$0.getMViewModel()).sendDeviceStatus(this$0.getDeviceLinkage());
            q qVar4 = this$0.player;
            Intrinsics.checkNotNull(qVar4);
            if (qVar4.isPlaying()) {
                q qVar5 = this$0.player;
                Intrinsics.checkNotNull(qVar5);
                qVar5.pause();
                Group pauseGroup = ((vm4) this$0.getMBinding()).Q;
                Intrinsics.checkNotNullExpressionValue(pauseGroup, "pauseGroup");
                ViewExtKt.visible(pauseGroup);
                Group stopGroup = ((vm4) this$0.getMBinding()).X;
                Intrinsics.checkNotNullExpressionValue(stopGroup, "stopGroup");
                ViewExtKt.gone(stopGroup);
            } else {
                Logger.d(BaseBindingActivity.TAG, "player is pause before castscreen");
                Group pauseGroup2 = ((vm4) this$0.getMBinding()).Q;
                Intrinsics.checkNotNullExpressionValue(pauseGroup2, "pauseGroup");
                ViewExtKt.gone(pauseGroup2);
                Group stopGroup2 = ((vm4) this$0.getMBinding()).X;
                Intrinsics.checkNotNullExpressionValue(stopGroup2, "stopGroup");
                ViewExtKt.visible(stopGroup2);
            }
        }
        return Unit.INSTANCE;
    }

    private final void bindClarityData(TextView view, Resolution resolution) {
        view.setTag(Integer.valueOf(resolution.getId()));
        view.setText(resolution.getResolutionDes());
    }

    private final SpannableStringBuilder buildSpan(String fullStr, int valueLength, int txtSize) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fullStr);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(txtSize, true), 0, valueLength, 17);
        Typeface typeface = this.typeFace;
        Intrinsics.checkNotNull(typeface);
        spannableStringBuilder.setSpan(new TextTypefaceSpan(typeface), 0, valueLength, 17);
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean cancelOverlay() {
        return ((vm4) getMBinding()).M.removeCallbacks(getGoneOverlay());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkSegment(long pos) {
        if (!((CourseVideoVM) getMViewModel()).hasPreSegment(pos)) {
            ImageView preView = ((vm4) getMBinding()).T;
            Intrinsics.checkNotNullExpressionValue(preView, "preView");
            ViewExtKt.invisible(preView);
        }
        if (((CourseVideoVM) getMViewModel()).hasNextSegment(pos)) {
            return;
        }
        ImageView nextView = ((vm4) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(nextView, "nextView");
        ViewExtKt.invisible(nextView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void configConcernData() {
        WearableDeviceModel wearableDeviceModel;
        ((vm4) getMBinding()).I.removeAllViews();
        CourseConfigModel.DeviceLinkage deviceLinkage = getDeviceLinkage();
        if (deviceLinkage != null) {
            List<String> concernDataSet = deviceLinkage.concernDataSet;
            Intrinsics.checkNotNullExpressionValue(concernDataSet, "concernDataSet");
            for (IndexedValue indexedValue : CollectionsKt___CollectionsKt.withIndex(concernDataSet)) {
                Logger.d(BaseBindingActivity.TAG, "setConcernData: " + indexedValue);
                boolean zAreEqual = Intrinsics.areEqual(indexedValue.getValue(), "hrm");
                View view = getView(zAreEqual, indexedValue.getIndex());
                ((vm4) getMBinding()).I.addView(view);
                if (zAreEqual && ((wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null || !wearableDeviceModel.getIsDeviceConnected())) {
                    ViewExtKt.gone(view);
                }
                this.concernedConfig.put((String) indexedValue.getValue(), view);
            }
            for (Map.Entry<String, View> entry : this.concernedConfig.entrySet()) {
                if (!Intrinsics.areEqual(entry.getKey(), "hrm")) {
                    setConcernData(entry.getKey(), 0.0f);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Resolution decideClarity(Resolution resolution) {
        if (!((CourseVideoVM) getMViewModel()).isDataCasting() && Intrinsics.areEqual(resolution, Resolution4K.INSTANCE)) {
            resolution = Resolution1080.INSTANCE;
        }
        ((vm4) getMBinding()).F.setTag(Integer.valueOf(resolution.getId()));
        ((vm4) getMBinding()).F.setText(resolution.getResolutionDes());
        ArrayList<Resolution> unselectedResolutionList = ResolutionKt.getUnselectedResolutionList(resolution.getId());
        if (!((CourseVideoVM) getMViewModel()).isDataCasting()) {
            TextView clarity2View = ((vm4) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(clarity2View, "clarity2View");
            Resolution resolution2 = unselectedResolutionList.get(1);
            Intrinsics.checkNotNullExpressionValue(resolution2, "get(...)");
            bindClarityData(clarity2View, resolution2);
        } else {
            if (this.tvResolutionSet.size() == 2) {
                for (Resolution resolution3 : this.tvResolutionSet) {
                    if (resolution3.getId() != resolution.getId()) {
                        TextView clarity2View2 = ((vm4) getMBinding()).D;
                        Intrinsics.checkNotNullExpressionValue(clarity2View2, "clarity2View");
                        bindClarityData(clarity2View2, resolution3);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (this.tvResolutionSet.size() == 3) {
                TextView clarity1View = ((vm4) getMBinding()).C;
                Intrinsics.checkNotNullExpressionValue(clarity1View, "clarity1View");
                Resolution resolution4 = unselectedResolutionList.get(0);
                Intrinsics.checkNotNullExpressionValue(resolution4, "get(...)");
                bindClarityData(clarity1View, resolution4);
                TextView clarity2View3 = ((vm4) getMBinding()).D;
                Intrinsics.checkNotNullExpressionValue(clarity2View3, "clarity2View");
                Resolution resolution5 = unselectedResolutionList.get(1);
                Intrinsics.checkNotNullExpressionValue(resolution5, "get(...)");
                bindClarityData(clarity2View3, resolution5);
            }
        }
        return resolution;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable finishTimeout_delegate$lambda$16(final CourseVideoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Runnable() { // from class: ky4
            @Override // java.lang.Runnable
            public final void run() {
                CourseVideoActivity.finishTimeout_delegate$lambda$16$lambda$15(this.f24408a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishTimeout_delegate$lambda$16$lambda$15(CourseVideoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(BaseBindingActivity.TAG, "finish course timeout");
        this$0.finish();
    }

    private final Runnable getFinishTimeout() {
        return (Runnable) this.finishTimeout.getValue();
    }

    private final Runnable getGoneOverlay() {
        return (Runnable) this.goneOverlay.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View getView(boolean hr, int index) {
        View viewInflate = LayoutInflater.from(this).inflate(hr ? sti.course_layout_video_hr : sti.course_layout_video_concern, (ViewGroup) ((vm4) getMBinding()).I, false);
        if (this.style == 2) {
            if (viewInflate instanceof TextView) {
                ((TextView) viewInflate).setTextColor(-1);
            } else {
                ((TextView) viewInflate.findViewById(oqi.i0)).setTextColor(-1);
                ((TextView) viewInflate.findViewById(oqi.k0)).setTextColor(-1);
                ((HrLevelView) viewInflate.findViewById(oqi.l0)).setDark(true);
            }
        }
        viewInflate.setTag(oqi.i0, Integer.valueOf(index));
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable goneOverlay_delegate$lambda$13(final CourseVideoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Runnable() { // from class: my4
            @Override // java.lang.Runnable
            public final void run() {
                CourseVideoActivity.goneOverlay_delegate$lambda$13$lambda$12(this.f27329a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void goneOverlay_delegate$lambda$13$lambda$12(CourseVideoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Group maskGroup = ((vm4) this$0.getMBinding()).M;
        Intrinsics.checkNotNullExpressionValue(maskGroup, "maskGroup");
        ViewExtKt.gone(maskGroup);
        Group pauseGroup = ((vm4) this$0.getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(pauseGroup, "pauseGroup");
        ViewExtKt.gone(pauseGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideClarityView() {
        TextView clarity2View = ((vm4) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(clarity2View, "clarity2View");
        ViewExtKt.gone(clarity2View);
        TextView clarity1View = ((vm4) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(clarity1View, "clarity1View");
        ViewExtKt.gone(clarity1View);
    }

    private final void initTvResolutionList(int clarity) {
        this.tvResolutionSet.clear();
        if (clarity == 1) {
            this.tvResolutionSet.add(Resolution720.INSTANCE);
            return;
        }
        if (clarity == 2) {
            this.tvResolutionSet.add(Resolution720.INSTANCE);
            this.tvResolutionSet.add(Resolution1080.INSTANCE);
        } else {
            if (clarity != 3) {
                return;
            }
            this.tvResolutionSet.add(Resolution720.INSTANCE);
            this.tvResolutionSet.add(Resolution1080.INSTANCE);
            this.tvResolutionSet.add(Resolution4K.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isValidTrainingPlan() {
        long planId = getPlanId();
        CourseModel.CourseData basicInfo = getInfo().getBasicInfo();
        Logger.d(BaseBindingActivity.TAG, "training-plan-info-isValidTrainingPlan:" + planId + " - " + (basicInfo != null ? Integer.valueOf(basicInfo.duration) : null));
        if (getPlanId() == 0) {
            return false;
        }
        CourseVideoVM courseVideoVM = (CourseVideoVM) getMViewModel();
        CourseModel.CourseData basicInfo2 = getInfo().getBasicInfo();
        return courseVideoVM.isFinishPlanCourse((int) (((double) ((basicInfo2 != null ? basicInfo2.duration : 0) * 60)) * 0.9d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onClarityChoice(TextView selectedView) {
        Object tag = selectedView.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        Resolution resolutionDecideClarity = decideClarity(ResolutionKt.getAndSaveResolution(((Integer) tag).intValue()));
        if (!((CourseVideoVM) getMViewModel()).isDataCasting()) {
            ((CourseVideoVM) getMViewModel()).setClarity(resolutionDecideClarity);
        } else {
            this.tvUrl = CourseExtKt.getTvUrl(getInfo(), resolutionDecideClarity);
            ((CourseVideoVM) getMViewModel()).sendCmdToTV(CastScreenCMD.Operation.CLARITY, this.tvUrl, this.progressFromTV);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onCurClarityClick() {
        if (!((CourseVideoVM) getMViewModel()).isDataCasting()) {
            TextView clarity1View = ((vm4) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(clarity1View, "clarity1View");
            ViewExtKt.gone(clarity1View);
            TextView clarity2View = ((vm4) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(clarity2View, "clarity2View");
            ExtUtilsKt.toggleGone(clarity2View);
            return;
        }
        int size = this.tvResolutionSet.size();
        if (size == 2) {
            TextView clarity1View2 = ((vm4) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(clarity1View2, "clarity1View");
            ViewExtKt.gone(clarity1View2);
            TextView clarity2View2 = ((vm4) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(clarity2View2, "clarity2View");
            ExtUtilsKt.toggleGone(clarity2View2);
            return;
        }
        if (size == 3) {
            TextView clarity1View3 = ((vm4) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(clarity1View3, "clarity1View");
            ExtUtilsKt.toggleGone(clarity1View3);
            TextView clarity2View3 = ((vm4) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(clarity2View3, "clarity2View");
            ExtUtilsKt.toggleGone(clarity2View3);
            return;
        }
        TextView clarity1View4 = ((vm4) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(clarity1View4, "clarity1View");
        ViewExtKt.gone(clarity1View4);
        TextView clarity2View4 = ((vm4) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(clarity2View4, "clarity2View");
        ViewExtKt.gone(clarity2View4);
        Unit unit = Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void pause() {
        if (((CourseVideoVM) getMViewModel()).getSportIsFinished()) {
            return;
        }
        Logger.i(BaseBindingActivity.TAG, "click pause");
        playerPause();
        ((CourseVideoVM) getMViewModel()).pauseSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.activity.CourseVideoActivity.pause.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                Logger.i(BaseBindingActivity.TAG, "playPause:  data = " + responseCode);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long playLocate(boolean next, long currentPosition) {
        if (!((CourseVideoVM) getMViewModel()).isDataCasting()) {
            startOverlay();
        }
        CourseVideoVM courseVideoVM = (CourseVideoVM) getMViewModel();
        Pair<Long, Boolean> nextSegmentPos = next ? courseVideoVM.getNextSegmentPos(currentPosition) : courseVideoVM.getPreSegmentPos(currentPosition);
        Logger.d(BaseBindingActivity.TAG, "playLocate: next = " + next + "; pair = " + nextSegmentPos);
        if (next) {
            ImageView preView = ((vm4) getMBinding()).T;
            Intrinsics.checkNotNullExpressionValue(preView, "preView");
            ViewExtKt.visible(preView);
            if (nextSegmentPos.getSecond().booleanValue()) {
                ImageView nextView = ((vm4) getMBinding()).P;
                Intrinsics.checkNotNullExpressionValue(nextView, "nextView");
                ViewExtKt.invisible(nextView);
            }
        } else {
            ImageView nextView2 = ((vm4) getMBinding()).P;
            Intrinsics.checkNotNullExpressionValue(nextView2, "nextView");
            ViewExtKt.visible(nextView2);
            if (nextSegmentPos.getSecond().booleanValue()) {
                ImageView preView2 = ((vm4) getMBinding()).T;
                Intrinsics.checkNotNullExpressionValue(preView2, "preView");
                ViewExtKt.invisible(preView2);
            }
        }
        return nextSegmentPos.getFirst().longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void playerContinue() {
        Group stopGroup = ((vm4) getMBinding()).X;
        Intrinsics.checkNotNullExpressionValue(stopGroup, "stopGroup");
        ViewExtKt.gone(stopGroup);
        if (((CourseVideoVM) getMViewModel()).isDataCasting()) {
            Group pauseGroup = ((vm4) getMBinding()).Q;
            Intrinsics.checkNotNullExpressionValue(pauseGroup, "pauseGroup");
            ViewExtKt.visible(pauseGroup);
            CastScreenCMD.Operation operation = this.operationcmCMD;
            CastScreenCMD.Operation operation2 = CastScreenCMD.Operation.RESTART;
            if (operation != operation2) {
                this.operationcmCMD = operation2;
                CourseVideoVM.sendCmdToTV$default((CourseVideoVM) getMViewModel(), operation2, this.tvUrl, 0L, 4, null);
                return;
            }
            return;
        }
        q qVar = this.player;
        if (qVar != null) {
            qVar.prepare();
        }
        q qVar2 = this.player;
        if (qVar2 != null) {
            qVar2.z(true);
        }
        Group pauseGroup2 = ((vm4) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(pauseGroup2, "pauseGroup");
        ViewExtKt.gone(pauseGroup2);
        Group maskGroup = ((vm4) getMBinding()).M;
        Intrinsics.checkNotNullExpressionValue(maskGroup, "maskGroup");
        ViewExtKt.gone(maskGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void playerPause() {
        Group pauseGroup = ((vm4) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(pauseGroup, "pauseGroup");
        ViewExtKt.gone(pauseGroup);
        Group stopGroup = ((vm4) getMBinding()).X;
        Intrinsics.checkNotNullExpressionValue(stopGroup, "stopGroup");
        ViewExtKt.visible(stopGroup);
        if (!((CourseVideoVM) getMViewModel()).isDataCasting()) {
            cancelOverlay();
            q qVar = this.player;
            if (qVar != null) {
                qVar.pause();
                return;
            }
            return;
        }
        CastScreenCMD.Operation operation = this.operationcmCMD;
        CastScreenCMD.Operation operation2 = CastScreenCMD.Operation.PAUSE;
        if (operation != operation2) {
            this.operationcmCMD = operation2;
            CourseVideoVM.sendCmdToTV$default((CourseVideoVM) getMViewModel(), operation2, this.tvUrl, 0L, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void playerStop() {
        q qVar = this.player;
        if (qVar != null) {
            qVar.stop();
        }
        Group maskGroup = ((vm4) getMBinding()).M;
        Intrinsics.checkNotNullExpressionValue(maskGroup, "maskGroup");
        ViewExtKt.gone(maskGroup);
        Group stopGroup = ((vm4) getMBinding()).X;
        Intrinsics.checkNotNullExpressionValue(stopGroup, "stopGroup");
        ViewExtKt.gone(stopGroup);
        ((CourseVideoVM) getMViewModel()).stopCast();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void preparePlay(Resolution resolution) {
        CourseVideoVM courseVideoVM = (CourseVideoVM) getMViewModel();
        String str = this.videoUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoUrl");
            str = null;
        }
        q qVarPrepare = courseVideoVM.prepare(str, resolution);
        this.player = qVarPrepare;
        if (qVarPrepare != null) {
            qVarPrepare.z(true);
        }
        q qVar = this.player;
        if (qVar != null) {
            qVar.h(((vm4) getMBinding()).S);
        }
    }

    private final void setCalorieView(TextView view, int calorie) {
        String str = calorie + " " + getString(czi.course_calorie_label);
        int length = String.valueOf(calorie).length();
        Object tag = view.getTag(oqi.i0);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        view.setText(buildSpan(str, length, spanTextSize(((Integer) tag).intValue())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCastScreenUi(boolean mConnected) {
        q qVar;
        hideClarityView();
        ((vm4) getMBinding()).A.setSelected(mConnected);
        setStyle(mConnected);
        if (mConnected) {
            ((vm4) getMBinding()).B.setVisibility(0);
            cancelOverlay();
            return;
        }
        ((CourseVideoVM) getMViewModel()).setClarity(decideClarity(ResolutionKt.getSavedResolution()));
        ((vm4) getMBinding()).B.setVisibility(8);
        if (this.progressFromTV > 0 && (qVar = this.player) != null) {
            qVar.seekTo(this.progressFromTV);
        }
        Group pauseGroup = ((vm4) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(pauseGroup, "pauseGroup");
        if (ExtUtilsKt.isVisible(pauseGroup)) {
            playerContinue();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void setConcernData(String key, float value) {
        View view = this.concernedConfig.get(key);
        if (view != null) {
            TextView textView = (TextView) view;
            switch (key.hashCode()) {
                case 3432979:
                    if (key.equals("pace")) {
                        setPaceView(textView, (int) value);
                        break;
                    }
                    break;
                case 109641799:
                    if (key.equals("speed")) {
                        setSpeed(textView, value);
                        break;
                    }
                    break;
                case 288459765:
                    if (key.equals("distance")) {
                        setDistanceView(textView, (int) value);
                        break;
                    }
                    break;
                case 548738829:
                    if (key.equals("calorie")) {
                        setCalorieView(textView, (int) value);
                        break;
                    }
                    break;
            }
        }
    }

    private final void setDistanceView(TextView view, int distance) {
        String strG = xr5.g(2, distance / 1000.0f);
        String str = strG + " " + getResources().getQuantityString(kyi.common_unit_kilometer, 1);
        int length = strG.length();
        Object tag = view.getTag(oqi.i0);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        view.setText(buildSpan(str, length, spanTextSize(((Integer) tag).intValue())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setDuration(long duration) {
        if (duration < 0) {
            return;
        }
        ((vm4) getMBinding()).Z.setText(TimeDateUtil.INSTANCE.getDurationStr(duration));
    }

    private final void setHRView(int hr) {
        String string;
        View view = this.concernedConfig.get("hrm");
        if (view != null) {
            checkHr(hr);
            TextView textView = (TextView) view.findViewById(oqi.i0);
            Object tag = view.getTag(oqi.i0);
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
            textView.setTextSize(spanTextSize(((Integer) tag).intValue()));
            textView.setText(hr <= 0 ? "--" : String.valueOf(hr));
            HrZoneLevel hrZone = getHrZone().getHrZone(hr);
            TextView textView2 = (TextView) view.findViewById(oqi.k0);
            int i = WhenMappings.$EnumSwitchMapping$0[hrZone.ordinal()];
            if (i == 1) {
                string = getString(czi.course_hr_distribute_acme);
            } else if (i == 2) {
                string = getString(czi.course_hr_distribute_anaerobic);
            } else if (i == 3) {
                string = getString(czi.course_hr_distribute_aerobic);
            } else if (i != 4) {
                string = i != 5 ? "" : getString(czi.course_hr_distribute_warm_up);
            } else {
                string = getString(czi.course_hr_distribute_fat_burn);
            }
            textView2.setText(string);
            ((HrLevelView) view.findViewById(oqi.l0)).setHrLevel(hrZone);
        }
    }

    private final void setPaceView(TextView view, int pace) {
        String sportPaceStrWithSecDef = TimeDateUtil.getSportPaceStrWithSecDef(pace);
        String str = sportPaceStrWithSecDef + getString(czi.course_pace);
        int length = sportPaceStrWithSecDef.length();
        Object tag = view.getTag(oqi.i0);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        view.setText(buildSpan(str, length, spanTextSize(((Integer) tag).intValue())));
    }

    private final void setSpeed(TextView view, float speed) {
        String strOpFloat = CourseExtKt.opFloat(speed);
        String str = strOpFloat + " " + getString(czi.course_unit_speed);
        int length = strOpFloat.length();
        Object tag = view.getTag(oqi.i0);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        view.setText(buildSpan(str, length, spanTextSize(((Integer) tag).intValue())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setStyle(boolean casting) {
        CourseConfigModel.DeviceLinkage deviceLinkage = getDeviceLinkage();
        this.style = deviceLinkage != null ? deviceLinkage.style : 1;
        if (casting) {
            Drawable background = ((vm4) getMBinding()).E.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background).setColor(452984831);
            ((vm4) getMBinding()).T.setImageResource(xmi.course_video_pre_cast);
            ((vm4) getMBinding()).P.setImageResource(xmi.course_video_next_cast);
            ((vm4) getMBinding()).R.setImageResource(xmi.course_video_pause_cast);
            ((vm4) getMBinding()).Y.setImageResource(xmi.course_video_stop_cast);
            ((vm4) getMBinding()).G.setImageResource(xmi.course_video_start_cast);
            return;
        }
        ((vm4) getMBinding()).T.setImageResource(xmi.course_video_pre);
        ((vm4) getMBinding()).P.setImageResource(xmi.course_video_next);
        ((vm4) getMBinding()).R.setImageResource(xmi.course_video_pause);
        ((vm4) getMBinding()).Y.setImageResource(xmi.course_video_stop);
        ((vm4) getMBinding()).G.setImageResource(xmi.course_video_start);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        boolean zIsBandType = wearableDeviceModel != null ? DeviceModelExtKt.isBandType(wearableDeviceModel) : false;
        if (this.style == 2) {
            ((vm4) getMBinding()).Z.setTextColor(-1);
            ((vm4) getMBinding()).a0.setImageResource(zIsBandType ? xmi.course_band_light : xmi.course_watch_light);
            ((vm4) getMBinding()).V.setImageResource(xmi.course_gms_light);
            ((vm4) getMBinding()).U.setColor(872415231, -1);
            Drawable background2 = ((vm4) getMBinding()).E.getBackground();
            Intrinsics.checkNotNull(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background2).setColor(1711276032);
            ((vm4) getMBinding()).N.setBackgroundResource(xmi.course_video_mask_top_dark);
            ((vm4) getMBinding()).L.setBackgroundResource(xmi.course_video_mask_bottom_dark);
            ((vm4) getMBinding()).J.setBackgroundResource(xmi.course_info_dark);
            return;
        }
        ((vm4) getMBinding()).Z.setTextColor(-16777216);
        ((vm4) getMBinding()).a0.setImageResource(zIsBandType ? xmi.course_band_dark : xmi.course_watch_dark);
        ((vm4) getMBinding()).V.setImageResource(xmi.course_gms_dark);
        ((vm4) getMBinding()).U.setColor(855638016, -16777216);
        Drawable background3 = ((vm4) getMBinding()).E.getBackground();
        Intrinsics.checkNotNull(background3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background3).setColor(436207616);
        ((vm4) getMBinding()).N.setBackgroundResource(xmi.course_video_mask_top_light);
        ((vm4) getMBinding()).L.setBackgroundResource(xmi.course_video_mask_bottom_light);
        ((vm4) getMBinding()).J.setBackgroundResource(xmi.course_info_light);
    }

    private final void showFinishCastDialog() {
        DriftDialog driftDialogCreate = new DriftDialog.Builder().setLayoutRes(sti.course_layout_dialog).addClickIds(oqi.C0, oqi.e1).setOnViewClick(new Function2() { // from class: jy4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CourseVideoActivity.showFinishCastDialog$lambda$10(this.f23234a, (View) obj, (DriftDialog) obj2);
            }
        }).setOnViewBind(new Function1() { // from class: ly4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVideoActivity.showFinishCastDialog$lambda$11(this.f25545a, (View) obj);
            }
        }).cancelable(false).create();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        driftDialogCreate.show(supportFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showFinishCastDialog$lambda$10(CourseVideoActivity this$0, View view, DriftDialog dialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        int id = view.getId();
        if (id == oqi.C0) {
            dialog.dismiss();
        } else if (id == oqi.e1) {
            dialog.dismiss();
            ((CourseVideoVM) this$0.getMViewModel()).stopCast();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showFinishCastDialog$lambda$11(CourseVideoActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        hu4 hu4VarA0 = hu4.A0(view);
        hu4VarA0.E.setText(this$0.getString(czi.course_cast_stop_title));
        hu4VarA0.A.setText(this$0.getString(czi.course_cast_stop_content));
        hu4VarA0.B.setText(czi.common_cancel);
        hu4VarA0.D.setText(this$0.getString(czi.course_cast_stop_yes));
        return Unit.INSTANCE;
    }

    private final int spanTextSize(int id) {
        return id < 2 ? 24 : 22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startOverlay() {
        cancelOverlay();
        ((vm4) getMBinding()).M.postDelayed(getGoneOverlay(), 5000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startPlay() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        Logger.i(BaseBindingActivity.TAG, "startSport");
        if (!CourseExtKt.getTEST()) {
            ((CourseVideoVM) getMViewModel()).startLocalSport(new RequestCallback() { // from class: com.mi.health.course.activity.CourseVideoActivity.startPlay.1
                @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    Logger.i(BaseBindingActivity.TAG, "startPlay data = " + responseCode);
                    if (responseCode != 0) {
                        CourseVideoActivity.this.dismissDialog();
                        ToastExtKt.toast$default(CourseVideoActivity.this, czi.course_device_busy, 0, 0, 0L, 14, null);
                        CourseVideoActivity.this.finish();
                    } else {
                        q qVar = CourseVideoActivity.this.player;
                        if (qVar != null) {
                            qVar.play();
                        }
                    }
                }
            });
            return;
        }
        q qVar = this.player;
        if (qVar != null) {
            qVar.play();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void toggleOverlay() {
        q qVar = this.player;
        Intrinsics.checkNotNull(qVar);
        if (qVar.isPlaying()) {
            Group maskGroup = ((vm4) getMBinding()).M;
            Intrinsics.checkNotNullExpressionValue(maskGroup, "maskGroup");
            ExtUtilsKt.toggleGone(maskGroup);
            Group pauseGroup = ((vm4) getMBinding()).Q;
            Intrinsics.checkNotNullExpressionValue(pauseGroup, "pauseGroup");
            ExtUtilsKt.toggleGone(pauseGroup);
            q qVar2 = this.player;
            Intrinsics.checkNotNull(qVar2);
            checkSegment(qVar2.getCurrentPosition());
            startOverlay();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.BaseCourseActivity
    public boolean abnormalHeartRate() {
        return !((CourseVideoVM) getMViewModel()).isDataCasting();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.BaseCourseActivity
    public void finishCourse() {
        playerStop();
        Logger.i(BaseBindingActivity.TAG, "finishCourse: startTime = " + getStartTime());
        if (getStartTime() <= 0) {
            finish();
            return;
        }
        if (!isLoadingShowing()) {
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        }
        ((vm4) getMBinding()).M.postDelayed(getFinishTimeout(), 10000L);
        if (isValidTrainingPlan()) {
            ((CourseVideoVM) getMViewModel()).finishSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.activity.CourseVideoActivity.finishCourse.1
                @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    Logger.i(BaseBindingActivity.TAG, "finishCourse with planId=" + CourseVideoActivity.this.getPlanId() + " data = " + responseCode + ".");
                    if (responseCode != 0) {
                        CourseVideoActivity.this.finish();
                    }
                }
            }, getPlanId());
        } else {
            CourseBasePlayerVM.finishSport$default((CourseBasePlayerVM) getMViewModel(), getSportType(), new RequestCallback() { // from class: com.mi.health.course.activity.CourseVideoActivity.finishCourse.2
                @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    Logger.i(BaseBindingActivity.TAG, "finishCourse data = " + responseCode + ".");
                    if (responseCode != 0) {
                        CourseVideoActivity.this.finish();
                    }
                }
            }, 0L, 4, null);
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.course_activity_video;
    }

    @NotNull
    public final CastScreenCMD.Operation getOperationcmCMD() {
        return this.operationcmCMD;
    }

    public final long getProgressFromTV() {
        return this.progressFromTV;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.BaseCourseActivity
    public boolean isSendCmd() {
        return ((CourseVideoVM) getMViewModel()).isDataCasting();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        pause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (v.getId() != oqi.w) {
            hideClarityView();
        }
        int id = v.getId();
        if (id == oqi.w) {
            onCurClarityClick();
            return;
        }
        if (id == oqi.t || id == oqi.u) {
            onClarityChoice((TextView) v);
            return;
        }
        if (id == oqi.S0) {
            toggleOverlay();
            return;
        }
        if (id == oqi.P0) {
            pause();
            return;
        }
        if (id == oqi.U0) {
            if (((CourseVideoVM) getMViewModel()).isDataCasting()) {
                ((CourseVideoVM) getMViewModel()).sendCmdToTV(CastScreenCMD.Operation.PROGRESS, this.tvUrl, playLocate(false, this.progressFromTV));
                return;
            }
            q qVar = this.player;
            Intrinsics.checkNotNull(qVar);
            long jPlayLocate = playLocate(false, qVar.getCurrentPosition());
            q qVar2 = this.player;
            if (qVar2 != null) {
                qVar2.seekTo(jPlayLocate);
                return;
            }
            return;
        }
        if (id == oqi.M0) {
            if (((CourseVideoVM) getMViewModel()).isDataCasting()) {
                ((CourseVideoVM) getMViewModel()).sendCmdToTV(CastScreenCMD.Operation.PROGRESS, this.tvUrl, playLocate(true, this.progressFromTV));
                return;
            }
            q qVar3 = this.player;
            Intrinsics.checkNotNull(qVar3);
            long jPlayLocate2 = playLocate(true, qVar3.getCurrentPosition());
            q qVar4 = this.player;
            if (qVar4 != null) {
                qVar4.seekTo(jPlayLocate2);
                return;
            }
            return;
        }
        if (id == oqi.H) {
            playerContinue();
            Logger.i(BaseBindingActivity.TAG, "continue");
            ((CourseVideoVM) getMViewModel()).resumeSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.activity.CourseVideoActivity.onClick.1
                @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    Logger.i(BaseBindingActivity.TAG, "playContinue " + responseCode);
                }
            });
            return;
        }
        if (id == oqi.q1) {
            if (!((CourseVideoVM) getMViewModel()).isSportValid()) {
                showTimeTooShortDialog();
                return;
            }
            if (getPlanId() != 0) {
                CourseVideoVM courseVideoVM = (CourseVideoVM) getMViewModel();
                CourseModel.CourseData basicInfo = getInfo().getBasicInfo();
                if (!courseVideoVM.isFinishPlanCourse((basicInfo != null ? basicInfo.duration : 0) * 60)) {
                    showPlanCourseTimeTooShortDialog();
                    return;
                }
            }
            showStopDialog();
            return;
        }
        if (id == oqi.E0) {
            setCmdEnable(!getCmdEnable());
            ((CourseVideoVM) getMViewModel()).setCmdEnable(getCmdEnable());
            ((vm4) getMBinding()).K.setSelected(!getCmdEnable());
        } else if (id == oqi.q) {
            if (!this.isSupportMilink) {
                WebViewUtilKt.startWebView$default(WebViewUrlKt.getCastScreenUrl(LocaleUtil.getCurrentLocale()), getString(czi.course_cast_desc), false, false, null, false, null, false, 252, null);
            } else {
                if (((CourseVideoVM) getMViewModel()).isStartCast()) {
                    return;
                }
                showFinishCastDialog();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ((vm4) getMBinding()).H.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.Hilt_CourseVideoActivity, com.mi.health.course.activity.BaseCourseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(512);
        String strVideoUrl = CourseExtKt.videoUrl(getInfo());
        Logger.i(BaseBindingActivity.TAG, "onCreate: url = " + strVideoUrl);
        if (strVideoUrl == null || strVideoUrl.length() == 0) {
            ToastExtKt.toastShort(this, czi.common_hint_unkonwn_error);
            finish();
            return;
        }
        CourseApiKt.getCourseApi().notifyCourseChanged(CourseApiKt.getWEAR_COURSE_START(), getInfo().getType());
        this.videoUrl = strVideoUrl;
        CourseConfigModel.VideoInfo videoInfo = getInfo().getVideoInfo();
        Intrinsics.checkNotNull(videoInfo);
        this.videoInfo = videoInfo;
        List<CourseConfigModel.VideoSegment> segments = CourseExtKt.getSegments(getInfo());
        if (segments != null) {
            ((CourseVideoVM) getMViewModel()).setSegments(segments);
        }
        Resolution savedResolution = (!NetworkExtKt.isNetworkAvailable() || NetworkExtKt.isWifiConnected()) ? ResolutionKt.getSavedResolution() : ResolutionKt.getAndSaveResolution(Resolution720.INSTANCE.getId());
        this.tvUrl = CourseExtKt.getTvUrl(getInfo(), savedResolution);
        preparePlay(decideClarity(savedResolution));
        addObserver();
        setStyle(false);
        ImageView linkView = ((vm4) getMBinding()).K;
        Intrinsics.checkNotNullExpressionValue(linkView, "linkView");
        ExtUtilsKt.setVisible(linkView, getSupportDeviceLink());
        ((vm4) getMBinding()).K.setSelected(!getCmdEnable());
        configConcernData();
        if (((CourseVideoVM) getMViewModel()).isSupportSendData()) {
            ((CourseVideoVM) getMViewModel()).initMilinkClient();
            this.isSupportMilink = true;
        }
        startPlay();
        ((CourseVideoVM) getMViewModel()).setMaxHeartRate(getHrZone().getMaxHr());
        if (getPlanId() != 0) {
            aje.b(this).d(new Intent(TrainingPlanConstantsKt.FINISH_COURSE_INFO_ACTIVITY));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.Hilt_CourseVideoActivity, com.mi.health.course.activity.BaseCourseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CourseApiKt.getCourseApi().notifyCourseChanged(CourseApiKt.getWEAR_COURSE_FINISHED(), getInfo().getType());
        q qVar = this.player;
        if (qVar != null) {
            qVar.f(this.playerListener);
        }
        ((vm4) getMBinding()).M.removeCallbacks(getGoneOverlay());
        ((vm4) getMBinding()).M.removeCallbacks(getFinishTimeout());
        ((CourseVideoVM) getMViewModel()).stopCast();
    }

    @Override // com.mi.health.course.activity.BaseCourseActivity
    public void onSecondTick(long d) {
        q qVar = this.player;
        if (qVar != null) {
            Intrinsics.checkNotNull(qVar);
            checkSegment(qVar.getCurrentPosition());
        }
    }

    @Override // com.mi.health.course.activity.BaseCourseActivity
    @SuppressLint({"SwitchIntDef"})
    public void onSportStateChange(@NotNull CourseSportState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof CourseSportState.Finish)) {
            if (Intrinsics.areEqual(state, CourseSportState.Pause.INSTANCE)) {
                playerPause();
                return;
            } else if (Intrinsics.areEqual(state, CourseSportState.Restart.INSTANCE)) {
                playerContinue();
                return;
            } else {
                Logger.d(BaseBindingActivity.TAG, "onSportStateChange: other");
                return;
            }
        }
        CourseSportState.Finish finish = (CourseSportState.Finish) state;
        Logger.i(BaseBindingActivity.TAG, "onSportStateChange: valid = " + finish.getValidSport());
        playerStop();
        if (!finish.getValidSport()) {
            dismissDialog();
            finish();
        } else {
            if (isLoadingShowing()) {
                return;
            }
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.BaseCourseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        Logger.i(BaseBindingActivity.TAG, "onStop: ");
        Group stopGroup = ((vm4) getMBinding()).X;
        Intrinsics.checkNotNullExpressionValue(stopGroup, "stopGroup");
        if (ExtUtilsKt.isVisible(stopGroup)) {
            return;
        }
        pause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.BaseCourseActivity
    public void setDeviceStatus(@NotNull DeviceState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ImageView imageView = ((vm4) getMBinding()).a0;
        View view = this.concernedConfig.get("hrm");
        if (view != null) {
            ExtUtilsKt.setVisible(view, state.getWearHas() && state.getWearConnect());
        }
        if (state.getWearHas()) {
            Intrinsics.checkNotNull(imageView);
            ViewExtKt.visible(imageView);
            imageView.setSelected(state.getWearConnect());
        } else {
            Intrinsics.checkNotNull(imageView);
            ViewExtKt.gone(imageView);
        }
        ImageView imageView2 = ((vm4) getMBinding()).V;
        if (state.getSportHas()) {
            Intrinsics.checkNotNull(imageView2);
            ViewExtKt.visible(imageView2);
            imageView2.setSelected(state.getSportConnect());
        } else {
            Intrinsics.checkNotNull(imageView2);
            ViewExtKt.gone(imageView2);
        }
        ((CourseVideoVM) getMViewModel()).sendDeviceStatus(getDeviceLinkage());
    }

    public final void setOperationcmCMD(@NotNull CastScreenCMD.Operation operation) {
        Intrinsics.checkNotNullParameter(operation, "<set-?>");
        this.operationcmCMD = operation;
    }

    public final void setProgressFromTV(long j) {
        this.progressFromTV = j;
    }
}
