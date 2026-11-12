package com.mi.health.course.eco.activity;

import android.annotation.SuppressLint;
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
import android.widget.LinearLayout;
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
import com.mi.health.course.data.CastScreenCMD;
import com.mi.health.course.data.CourseSportState;
import com.mi.health.course.data.DeviceState;
import com.mi.health.course.data.Resolution;
import com.mi.health.course.data.Resolution1080;
import com.mi.health.course.data.Resolution4K;
import com.mi.health.course.data.Resolution720;
import com.mi.health.course.data.ResolutionKt;
import com.mi.health.course.eco.activity.EcoCourseVideoActivity;
import com.mi.health.course.eco.vm.EcoCourseVideoVM;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.TextTypefaceSpan;
import com.mi.health.course.util.WebViewUrlKt;
import com.mi.health.course.widget.CircleProgressBar;
import com.mi.health.course.widget.HrLevelView;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.account.HrZoneLevel;
import com.xiaomi.fitness.baseui.dialog.DriftDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
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
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.aop;
import defpackage.czi;
import defpackage.ew1;
import defpackage.hu4;
import defpackage.ipi;
import defpackage.kyi;
import defpackage.n0i;
import defpackage.nm1;
import defpackage.oqi;
import defpackage.rvn;
import defpackage.sti;
import defpackage.u56;
import defpackage.wrq;
import defpackage.xmi;
import defpackage.xr5;
import defpackage.zj7;
import java.util.ArrayList;
import java.util.Arrays;
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
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0002 \u0001\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\b¢\u0006\u0005\b´\u0001\u0010\u000bJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\u001f\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u000bJ\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010.\u001a\u00020\u001fH\u0002¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u00101\u001a\u00020\rH\u0002¢\u0006\u0004\b2\u0010-J\u001f\u00104\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\rH\u0002¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\rH\u0002¢\u0006\u0004\b7\u00105J\u001f\u00109\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u00108\u001a\u00020\rH\u0002¢\u0006\u0004\b9\u0010-J\u001f\u0010;\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010:\u001a\u00020\rH\u0002¢\u0006\u0004\b;\u0010-J\u001f\u0010=\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010<\u001a\u00020\u001dH\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010?\u001a\u00020\u001dH\u0002¢\u0006\u0004\b@\u0010>J\u001f\u0010B\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010A\u001a\u00020\u001fH\u0002¢\u0006\u0004\bB\u00100J'\u0010G\u001a\u00020F2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\r2\u0006\u0010E\u001a\u00020\rH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0007H\u0002¢\u0006\u0004\bI\u0010\u000bJ\u0017\u0010K\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u0014H\u0002¢\u0006\u0004\bK\u0010\u0017J\u000f\u0010L\u001a\u00020\u0007H\u0002¢\u0006\u0004\bL\u0010\u000bJ\u0017\u0010N\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\rH\u0002¢\u0006\u0004\bN\u0010%J\u0017\u0010P\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0005H\u0002¢\u0006\u0004\bP\u0010\tJ\u000f\u0010Q\u001a\u00020\u0007H\u0002¢\u0006\u0004\bQ\u0010\u000bJ\u000f\u0010R\u001a\u00020\u0007H\u0002¢\u0006\u0004\bR\u0010\u000bJ\u000f\u0010S\u001a\u00020\u0007H\u0002¢\u0006\u0004\bS\u0010\u000bJ\u001f\u0010V\u001a\u00020\u00142\u0006\u0010T\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u0014H\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0007H\u0002¢\u0006\u0004\bX\u0010\u000bJ\u000f\u0010Y\u001a\u00020\u0007H\u0002¢\u0006\u0004\bY\u0010\u000bJ\u0017\u0010[\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020)H\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0007H\u0002¢\u0006\u0004\b_\u0010\u000bJ\u001f\u0010`\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bb\u0010\u000bJ\u000f\u0010c\u001a\u00020\u0005H\u0002¢\u0006\u0004\bc\u0010dJ\u0019\u0010g\u001a\u00020\u00072\b\u0010f\u001a\u0004\u0018\u00010eH\u0014¢\u0006\u0004\bg\u0010hJ\u0017\u0010k\u001a\u00020\u00072\u0006\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020\u00072\u0006\u0010m\u001a\u00020\u0014H\u0014¢\u0006\u0004\bn\u0010\u0017J\u000f\u0010o\u001a\u00020\u0005H\u0016¢\u0006\u0004\bo\u0010dJ\u0017\u0010q\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u000fH\u0016¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020\u00072\u0006\u0010t\u001a\u00020sH\u0017¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u0005H\u0016¢\u0006\u0004\bw\u0010dJ\u000f\u0010x\u001a\u00020\u0007H\u0016¢\u0006\u0004\bx\u0010\u000bJ\u0017\u0010z\u001a\u00020\u00072\u0006\u0010t\u001a\u00020yH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020\u0007H\u0014¢\u0006\u0004\b|\u0010\u000bJ\u000f\u0010}\u001a\u00020\u0007H\u0016¢\u0006\u0004\b}\u0010\u000bR\u0017\u0010\u007f\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R(\u0010\u0096\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0005\b\u009a\u0001\u0010\u0017R\u0019\u0010\u009b\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R$\u0010\u009e\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f0\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¡\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001e\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R!\u0010«\u0001\u001a\u00030¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R!\u0010®\u0001\u001a\u00030¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¬\u0001\u0010¨\u0001\u001a\u0006\b\u00ad\u0001\u0010ª\u0001R\u0017\u0010±\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010³\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010°\u0001¨\u0006µ\u0001"}, d2 = {"Lcom/mi/health/course/eco/activity/EcoCourseVideoActivity;", "Lcom/mi/health/course/eco/activity/EcoBaseCourseActivity;", "Lcom/mi/health/course/eco/vm/EcoCourseVideoVM;", "Lzj7;", "Landroid/view/View$OnClickListener;", "", "casting", "", "setStyle", "(Z)V", "configConcernData", "()V", "hr", "", "index", "Landroid/view/View;", "getView", "(ZI)Landroid/view/View;", "getFrequencyHoppingView", "(I)Landroid/view/View;", "", "duration", "setDuration", "(J)V", "Lcom/mi/health/course/data/Resolution;", "resolution", "preparePlay", "(Lcom/mi/health/course/data/Resolution;)V", "startPlay", "", "key", "", "value", "setConcernData", "(Ljava/lang/String;F)V", "addObserver", "setHRView", "(I)V", "id", "spanTextSize", "(I)I", "Landroid/widget/TextView;", "view", "pace", "setPaceView", "(Landroid/widget/TextView;I)V", "speed", "setSpeed", "(Landroid/widget/TextView;F)V", "jumpRopCount", "setJumpRopCount", "frequencyHopping", "setFrequencyHopping", "(Landroid/view/View;I)V", "recommend", "setJumpRopRecommendCount", "distance", "setDistanceView", "calorie", "setCalorieView", "rpm", "setRpmView", "(Landroid/widget/TextView;Ljava/lang/String;)V", "resistance", "setResistanceView", "power", "setPowerView", "fullStr", "valueLength", "txtSize", "Landroid/text/SpannableStringBuilder;", "buildSpan", "(Ljava/lang/String;II)Landroid/text/SpannableStringBuilder;", "pause", "pos", "checkSegment", "hideClarityView", "clarity", "initTvResolutionList", "mConnected", "setCastScreenUi", "showFinishCastDialog", "playerContinue", "playerStop", "next", "currentPosition", "playLocate", "(ZJ)J", "playerPause", "toggleOverlay", "selectedView", "onClarityChoice", "(Landroid/widget/TextView;)V", "decideClarity", "(Lcom/mi/health/course/data/Resolution;)Lcom/mi/health/course/data/Resolution;", "onCurClarityClick", "bindClarityData", "(Landroid/widget/TextView;Lcom/mi/health/course/data/Resolution;)V", "startOverlay", "cancelOverlay", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", PluginDeviceInfo.FICONOFF, "onSecondTick", "isSendCmd", "v", "onClick", "(Landroid/view/View;)V", "Lcom/mi/health/course/data/CourseSportState;", "state", "onSportStateChange", "(Lcom/mi/health/course/data/CourseSportState;)V", "abnormalHeartRate", "finishCourse", "Lcom/mi/health/course/data/DeviceState;", "setDeviceStatus", "(Lcom/mi/health/course/data/DeviceState;)V", LifecycleConstantKt.ON_DESTROY, "onBackPressed", "Lcom/google/android/exoplayer2/q;", "player", "Lcom/google/android/exoplayer2/q;", "Landroid/graphics/Typeface;", "typeFace", "Landroid/graphics/Typeface;", "Lcom/mi/health/course/export/data/CourseConfigModel$VideoInfo;", "videoInfo", "Lcom/mi/health/course/export/data/CourseConfigModel$VideoInfo;", "tvUrl", "Ljava/lang/String;", "videoUrl", "isSupportMilink", "Z", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "errorDialog", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "Lcom/mi/health/course/data/CastScreenCMD$Operation;", "operationcmCMD", "Lcom/mi/health/course/data/CastScreenCMD$Operation;", "getOperationcmCMD", "()Lcom/mi/health/course/data/CastScreenCMD$Operation;", "setOperationcmCMD", "(Lcom/mi/health/course/data/CastScreenCMD$Operation;)V", "progressFromTV", "J", "getProgressFromTV", "()J", "setProgressFromTV", "style", "I", "", "concernedConfig", "Ljava/util/Map;", "com/mi/health/course/eco/activity/EcoCourseVideoActivity$playerListener$1", "playerListener", "Lcom/mi/health/course/eco/activity/EcoCourseVideoActivity$playerListener$1;", "", "tvResolutionSet", "Ljava/util/Set;", "Ljava/lang/Runnable;", "goneOverlay$delegate", "Lkotlin/Lazy;", "getGoneOverlay", "()Ljava/lang/Runnable;", "goneOverlay", "finishTimeout$delegate", "getFinishTimeout", "finishTimeout", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoCourseVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoCourseVideoActivity.kt\ncom/mi/health/course/eco/activity/EcoCourseVideoActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,880:1\n1#2:881\n1863#3,2:882\n230#3,2:884\n*S KotlinDebug\n*F\n+ 1 EcoCourseVideoActivity.kt\ncom/mi/health/course/eco/activity/EcoCourseVideoActivity\n*L\n178#1:882,2\n761#1:884,2\n*E\n"})
public final class EcoCourseVideoActivity extends Hilt_EcoCourseVideoActivity<EcoCourseVideoVM, zj7> implements View.OnClickListener {

    @Nullable
    private DriftDialog errorDialog;
    private boolean isSupportMilink;
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
    private final EcoCourseVideoActivity$playerListener$1 playerListener = new q.e() { // from class: com.mi.health.course.eco.activity.EcoCourseVideoActivity$playerListener$1
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
            EcoCourseVideoActivity.access$getMBinding(this.this$0).H.setRatio(videoSize.f38295a, videoSize.f38296b);
            View modestyView = EcoCourseVideoActivity.access$getMBinding(this.this$0).O;
            Intrinsics.checkNotNullExpressionValue(modestyView, "modestyView");
            ViewExtKt.gone(modestyView);
        }
    };

    @NotNull
    private final Set<Resolution> tvResolutionSet = new LinkedHashSet();

    /* JADX INFO: renamed from: goneOverlay$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy goneOverlay = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ep7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseVideoActivity.goneOverlay_delegate$lambda$14(this.f16916a);
        }
    });

    /* JADX INFO: renamed from: finishTimeout$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy finishTimeout = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gp7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseVideoActivity.finishTimeout_delegate$lambda$17(this.f19205a);
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
    public static final /* synthetic */ zj7 access$getMBinding(EcoCourseVideoActivity ecoCourseVideoActivity) {
        return (zj7) ecoCourseVideoActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addObserver() {
        q qVar = this.player;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            qVar = null;
        }
        qVar.K(this.playerListener);
        ((EcoCourseVideoVM) getMViewModel()).setOnPlayError(new Function1() { // from class: jp7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseVideoActivity.addObserver$lambda$4(this.f22999a, ((Boolean) obj).booleanValue());
            }
        });
        ((EcoCourseVideoVM) getMViewModel()).getProgressEmitter().observe(this, new EcoCourseVideoActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lp7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseVideoActivity.addObserver$lambda$5(this.f25293a, (Integer) obj);
            }
        }));
        ((EcoCourseVideoVM) getMViewModel()).setOnDataChange(new Function1() { // from class: np7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseVideoActivity.addObserver$lambda$6(this.f28222a, (PhoneSportData) obj);
            }
        });
        ((EcoCourseVideoVM) getMViewModel()).setMilinkConnectListener(new Function1() { // from class: pp7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseVideoActivity.addObserver$lambda$7(this.f30603a, ((Boolean) obj).booleanValue());
            }
        });
        ((EcoCourseVideoVM) getMViewModel()).setTVDataListener(new Function1() { // from class: rp7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseVideoActivity.addObserver$lambda$8(this.f32768a, (CastScreenCMD.GetVideoDataFromTV) obj);
            }
        });
        ((EcoCourseVideoVM) getMViewModel()).setOnPropertyChange(new Function1() { // from class: tp7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseVideoActivity.addObserver$lambda$9(this.f34910a, ((Integer) obj).intValue());
            }
        });
        ((zj7) getMBinding()).S.setOnClickListener(this);
        ((zj7) getMBinding()).R.setOnClickListener(this);
        ((zj7) getMBinding()).T.setOnClickListener(this);
        ((zj7) getMBinding()).P.setOnClickListener(this);
        ((zj7) getMBinding()).Y.setOnClickListener(this);
        ((zj7) getMBinding()).G.setOnClickListener(this);
        ((zj7) getMBinding()).C.setOnClickListener(this);
        ((zj7) getMBinding()).D.setOnClickListener(this);
        ((zj7) getMBinding()).F.setOnClickListener(this);
        ((zj7) getMBinding()).K.setOnClickListener(this);
        ((zj7) getMBinding()).A.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$4(EcoCourseVideoActivity this$0, boolean z) {
        DriftDialog driftDialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.pause();
            View modestyView = ((zj7) this$0.getMBinding()).O;
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
    public static final Unit addObserver$lambda$5(EcoCourseVideoActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CircleProgressBar circleProgressBar = ((zj7) this$0.getMBinding()).U;
        Intrinsics.checkNotNull(num);
        circleProgressBar.setProgress(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$6(EcoCourseVideoActivity this$0, PhoneSportData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.distance > 0 || it.jumpCount > 0) {
            this$0.dismissAllDialog();
        }
        if (((EcoCourseVideoVM) this$0.getMViewModel()).isRopeSkipping()) {
            this$0.setConcernData("frequency_hopping", it.jumpFrequency);
            this$0.setConcernData(CourseConfigModel.DeviceLinkage.DATA_JUMP_ROP_COUNT, it.jumpCount);
            this$0.setConcernData("calorie", it.calorie / 1000);
            this$0.setDuration(((long) it.jumpDuration) * 1000);
            ((EcoCourseVideoVM) this$0.getMViewModel()).sendDataToTV(it, CourseDevice.JUMPING.getType(), this$0.getDeviceLinkage());
        } else {
            this$0.setDistance(it.distance);
            this$0.setConcernData("distance", it.distance);
            this$0.setConcernData("rpm", it.bike_rpm);
            this$0.setConcernData("pace", it.pace);
            this$0.setConcernData("calorie", it.calorie / 1000);
            this$0.setConcernData("speed", it.speed);
            this$0.setConcernData("power", it.bike_power);
            this$0.setConcernData("resistance", it.bike_resistance_level);
            this$0.setHRView(it.heart_rate);
            this$0.setDuration((this$0.getSupportDeviceLink() ? it.deviceDuration : it.duration) * 1000);
            ((EcoCourseVideoVM) this$0.getMViewModel()).sendDataToTV(it, CourseDevice.TREADMILL.getType(), this$0.getDeviceLinkage());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$7(EcoCourseVideoActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setCastScreenUi(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$8(EcoCourseVideoActivity this$0, CastScreenCMD.GetVideoDataFromTV it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        int i = it.status;
        if (i == 1) {
            this$0.progressFromTV = it.progress;
            ((EcoCourseVideoVM) this$0.getMViewModel()).cmd(this$0.progressFromTV);
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
            q qVar2 = null;
            if (qVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                qVar = null;
            }
            if (qVar.isPlaying()) {
                EcoCourseVideoVM ecoCourseVideoVM = (EcoCourseVideoVM) this$0.getMViewModel();
                CastScreenCMD.Operation operation = CastScreenCMD.Operation.START;
                String str = this$0.tvUrl;
                q qVar3 = this$0.player;
                if (qVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("player");
                    qVar3 = null;
                }
                ecoCourseVideoVM.sendCmdToTV(operation, str, qVar3.getCurrentPosition());
            } else {
                EcoCourseVideoVM ecoCourseVideoVM2 = (EcoCourseVideoVM) this$0.getMViewModel();
                CastScreenCMD.Operation operation2 = CastScreenCMD.Operation.PAUSE;
                String str2 = this$0.tvUrl;
                q qVar4 = this$0.player;
                if (qVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("player");
                    qVar4 = null;
                }
                ecoCourseVideoVM2.sendCmdToTV(operation2, str2, qVar4.getCurrentPosition());
            }
            ((EcoCourseVideoVM) this$0.getMViewModel()).sendDeviceStatus(this$0.getDeviceLinkage());
            q qVar5 = this$0.player;
            if (qVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                qVar5 = null;
            }
            if (qVar5.isPlaying()) {
                q qVar6 = this$0.player;
                if (qVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("player");
                } else {
                    qVar2 = qVar6;
                }
                qVar2.pause();
                Group pauseGroup = ((zj7) this$0.getMBinding()).Q;
                Intrinsics.checkNotNullExpressionValue(pauseGroup, "pauseGroup");
                ViewExtKt.visible(pauseGroup);
                Group stopGroup = ((zj7) this$0.getMBinding()).X;
                Intrinsics.checkNotNullExpressionValue(stopGroup, "stopGroup");
                ViewExtKt.gone(stopGroup);
            } else {
                Logger.d(BaseBindingActivity.TAG, "player is pause before castscreen");
                Group pauseGroup2 = ((zj7) this$0.getMBinding()).Q;
                Intrinsics.checkNotNullExpressionValue(pauseGroup2, "pauseGroup");
                ViewExtKt.gone(pauseGroup2);
                Group stopGroup2 = ((zj7) this$0.getMBinding()).X;
                Intrinsics.checkNotNullExpressionValue(stopGroup2, "stopGroup");
                ViewExtKt.visible(stopGroup2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$9(EcoCourseVideoActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new EcoCourseVideoActivity$addObserver$6$1(this$0, i, null), 1, null);
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
        return ((zj7) getMBinding()).M.removeCallbacks(getGoneOverlay());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkSegment(long pos) {
        if (!((EcoCourseVideoVM) getMViewModel()).hasPreSegment(pos)) {
            ImageView preView = ((zj7) getMBinding()).T;
            Intrinsics.checkNotNullExpressionValue(preView, "preView");
            ViewExtKt.invisible(preView);
        }
        if (((EcoCourseVideoVM) getMViewModel()).hasNextSegment(pos)) {
            return;
        }
        ImageView nextView = ((zj7) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(nextView, "nextView");
        ViewExtKt.invisible(nextView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void configConcernData() {
        WearableDeviceModel wearableDeviceModel;
        ((zj7) getMBinding()).I.removeAllViews();
        CourseConfigModel.DeviceLinkage deviceLinkage = getDeviceLinkage();
        if (deviceLinkage != null) {
            List<String> concernDataSet = deviceLinkage.concernDataSet;
            Intrinsics.checkNotNullExpressionValue(concernDataSet, "concernDataSet");
            for (IndexedValue indexedValue : CollectionsKt___CollectionsKt.withIndex(concernDataSet)) {
                Logger.d(BaseBindingActivity.TAG, "setConcernData: " + indexedValue);
                if (Intrinsics.areEqual(indexedValue.getValue(), "frequency_hopping")) {
                    View frequencyHoppingView = getFrequencyHoppingView(indexedValue.getIndex());
                    ((zj7) getMBinding()).I.addView(frequencyHoppingView);
                    this.concernedConfig.put((String) indexedValue.getValue(), frequencyHoppingView);
                } else {
                    boolean zAreEqual = Intrinsics.areEqual(indexedValue.getValue(), "hrm");
                    View view = getView(zAreEqual, indexedValue.getIndex());
                    ((zj7) getMBinding()).I.addView(view);
                    if (zAreEqual && ((wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null || !wearableDeviceModel.getIsDeviceConnected())) {
                        ViewExtKt.gone(view);
                    } else if (zAreEqual && ((EcoCourseVideoVM) getMViewModel()).isRopeSkipping()) {
                        ViewExtKt.gone(view);
                    }
                    this.concernedConfig.put((String) indexedValue.getValue(), view);
                }
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
        if (!((EcoCourseVideoVM) getMViewModel()).isDataCasting() && Intrinsics.areEqual(resolution, Resolution4K.INSTANCE)) {
            resolution = Resolution1080.INSTANCE;
        }
        ((zj7) getMBinding()).F.setTag(Integer.valueOf(resolution.getId()));
        ((zj7) getMBinding()).F.setText(resolution.getResolutionDes());
        ArrayList<Resolution> unselectedResolutionList = ResolutionKt.getUnselectedResolutionList(resolution.getId());
        if (!((EcoCourseVideoVM) getMViewModel()).isDataCasting()) {
            TextView clarity2View = ((zj7) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(clarity2View, "clarity2View");
            Resolution resolution2 = unselectedResolutionList.get(1);
            Intrinsics.checkNotNullExpressionValue(resolution2, "get(...)");
            bindClarityData(clarity2View, resolution2);
        } else {
            if (this.tvResolutionSet.size() == 2) {
                for (Resolution resolution3 : this.tvResolutionSet) {
                    if (resolution3.getId() != resolution.getId()) {
                        TextView clarity2View2 = ((zj7) getMBinding()).D;
                        Intrinsics.checkNotNullExpressionValue(clarity2View2, "clarity2View");
                        bindClarityData(clarity2View2, resolution3);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (this.tvResolutionSet.size() == 3) {
                TextView clarity1View = ((zj7) getMBinding()).C;
                Intrinsics.checkNotNullExpressionValue(clarity1View, "clarity1View");
                Resolution resolution4 = unselectedResolutionList.get(0);
                Intrinsics.checkNotNullExpressionValue(resolution4, "get(...)");
                bindClarityData(clarity1View, resolution4);
                TextView clarity2View3 = ((zj7) getMBinding()).D;
                Intrinsics.checkNotNullExpressionValue(clarity2View3, "clarity2View");
                Resolution resolution5 = unselectedResolutionList.get(1);
                Intrinsics.checkNotNullExpressionValue(resolution5, "get(...)");
                bindClarityData(clarity2View3, resolution5);
            }
        }
        return resolution;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable finishTimeout_delegate$lambda$17(final EcoCourseVideoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Runnable() { // from class: hp7
            @Override // java.lang.Runnable
            public final void run() {
                EcoCourseVideoActivity.finishTimeout_delegate$lambda$17$lambda$16(this.f20309a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishTimeout_delegate$lambda$17$lambda$16(EcoCourseVideoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(BaseBindingActivity.TAG, "finish course timeout");
        this$0.finish();
    }

    private final Runnable getFinishTimeout() {
        return (Runnable) this.finishTimeout.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View getFrequencyHoppingView(int index) {
        View viewInflate = LayoutInflater.from(this).inflate(sti.course_layout_video_frequency_hopping, (ViewGroup) ((zj7) getMBinding()).I, false);
        TextView textView = (TextView) viewInflate.findViewById(oqi.b1);
        textView.setText(getResources().getString(czi.course_suggestions) + "：--");
        if (this.style == 2) {
            ((TextView) viewInflate.findViewById(oqi.P)).setTextColor(-1);
            textView.setTextColor(-1);
        }
        viewInflate.setTag(oqi.i0, Integer.valueOf(index));
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    private final Runnable getGoneOverlay() {
        return (Runnable) this.goneOverlay.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View getView(boolean hr, int index) {
        View viewInflate = LayoutInflater.from(this).inflate(hr ? sti.course_layout_video_hr : sti.course_layout_video_concern, (ViewGroup) ((zj7) getMBinding()).I, false);
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
    public static final Runnable goneOverlay_delegate$lambda$14(final EcoCourseVideoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Runnable() { // from class: cp7
            @Override // java.lang.Runnable
            public final void run() {
                EcoCourseVideoActivity.goneOverlay_delegate$lambda$14$lambda$13(this.f14582a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void goneOverlay_delegate$lambda$14$lambda$13(EcoCourseVideoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Group maskGroup = ((zj7) this$0.getMBinding()).M;
        Intrinsics.checkNotNullExpressionValue(maskGroup, "maskGroup");
        ViewExtKt.gone(maskGroup);
        Group pauseGroup = ((zj7) this$0.getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(pauseGroup, "pauseGroup");
        ViewExtKt.gone(pauseGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideClarityView() {
        TextView clarity2View = ((zj7) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(clarity2View, "clarity2View");
        ViewExtKt.gone(clarity2View);
        TextView clarity1View = ((zj7) getMBinding()).C;
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
    private final void onClarityChoice(TextView selectedView) {
        Object tag = selectedView.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        Resolution resolutionDecideClarity = decideClarity(ResolutionKt.getAndSaveResolution(((Integer) tag).intValue()));
        if (!((EcoCourseVideoVM) getMViewModel()).isDataCasting()) {
            ((EcoCourseVideoVM) getMViewModel()).setClarity(resolutionDecideClarity);
        } else {
            this.tvUrl = CourseExtKt.getTvUrl(getInfo(), resolutionDecideClarity);
            ((EcoCourseVideoVM) getMViewModel()).sendCmdToTV(CastScreenCMD.Operation.CLARITY, this.tvUrl, this.progressFromTV);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onCurClarityClick() {
        if (!((EcoCourseVideoVM) getMViewModel()).isDataCasting()) {
            TextView clarity1View = ((zj7) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(clarity1View, "clarity1View");
            ViewExtKt.gone(clarity1View);
            TextView clarity2View = ((zj7) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(clarity2View, "clarity2View");
            ExtUtilsKt.toggleGone(clarity2View);
            return;
        }
        int size = this.tvResolutionSet.size();
        if (size == 2) {
            TextView clarity1View2 = ((zj7) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(clarity1View2, "clarity1View");
            ViewExtKt.gone(clarity1View2);
            TextView clarity2View2 = ((zj7) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(clarity2View2, "clarity2View");
            ExtUtilsKt.toggleGone(clarity2View2);
            return;
        }
        if (size == 3) {
            TextView clarity1View3 = ((zj7) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(clarity1View3, "clarity1View");
            ExtUtilsKt.toggleGone(clarity1View3);
            TextView clarity2View3 = ((zj7) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(clarity2View3, "clarity2View");
            ExtUtilsKt.toggleGone(clarity2View3);
            return;
        }
        TextView clarity1View4 = ((zj7) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(clarity1View4, "clarity1View");
        ViewExtKt.gone(clarity1View4);
        TextView clarity2View4 = ((zj7) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(clarity2View4, "clarity2View");
        ViewExtKt.gone(clarity2View4);
        Unit unit = Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void pause() {
        Logger.i(BaseBindingActivity.TAG, "click pause");
        playerPause();
        ((EcoCourseVideoVM) getMViewModel()).pauseSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.eco.activity.EcoCourseVideoActivity.pause.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                Logger.i(BaseBindingActivity.TAG, "playPause:  data = " + responseCode);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long playLocate(boolean next, long currentPosition) {
        if (!((EcoCourseVideoVM) getMViewModel()).isDataCasting()) {
            startOverlay();
        }
        EcoCourseVideoVM ecoCourseVideoVM = (EcoCourseVideoVM) getMViewModel();
        Pair<Long, Boolean> nextSegmentPos = next ? ecoCourseVideoVM.getNextSegmentPos(currentPosition) : ecoCourseVideoVM.getPreSegmentPos(currentPosition);
        Logger.d(BaseBindingActivity.TAG, "playLocate: next = " + next + "; pair = " + nextSegmentPos);
        if (next) {
            ImageView preView = ((zj7) getMBinding()).T;
            Intrinsics.checkNotNullExpressionValue(preView, "preView");
            ViewExtKt.visible(preView);
            if (nextSegmentPos.getSecond().booleanValue()) {
                ImageView nextView = ((zj7) getMBinding()).P;
                Intrinsics.checkNotNullExpressionValue(nextView, "nextView");
                ViewExtKt.invisible(nextView);
            }
        } else {
            ImageView nextView2 = ((zj7) getMBinding()).P;
            Intrinsics.checkNotNullExpressionValue(nextView2, "nextView");
            ViewExtKt.visible(nextView2);
            if (nextSegmentPos.getSecond().booleanValue()) {
                ImageView preView2 = ((zj7) getMBinding()).T;
                Intrinsics.checkNotNullExpressionValue(preView2, "preView");
                ViewExtKt.invisible(preView2);
            }
        }
        return nextSegmentPos.getFirst().longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void playerContinue() {
        Group stopGroup = ((zj7) getMBinding()).X;
        Intrinsics.checkNotNullExpressionValue(stopGroup, "stopGroup");
        ViewExtKt.gone(stopGroup);
        if (((EcoCourseVideoVM) getMViewModel()).isDataCasting()) {
            Group pauseGroup = ((zj7) getMBinding()).Q;
            Intrinsics.checkNotNullExpressionValue(pauseGroup, "pauseGroup");
            ViewExtKt.visible(pauseGroup);
            CastScreenCMD.Operation operation = this.operationcmCMD;
            CastScreenCMD.Operation operation2 = CastScreenCMD.Operation.RESTART;
            if (operation != operation2) {
                this.operationcmCMD = operation2;
                EcoCourseVideoVM.sendCmdToTV$default((EcoCourseVideoVM) getMViewModel(), operation2, this.tvUrl, 0L, 4, null);
                return;
            }
            return;
        }
        q qVar = this.player;
        q qVar2 = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            qVar = null;
        }
        qVar.prepare();
        q qVar3 = this.player;
        if (qVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        } else {
            qVar2 = qVar3;
        }
        qVar2.z(true);
        Group pauseGroup2 = ((zj7) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(pauseGroup2, "pauseGroup");
        ViewExtKt.gone(pauseGroup2);
        Group maskGroup = ((zj7) getMBinding()).M;
        Intrinsics.checkNotNullExpressionValue(maskGroup, "maskGroup");
        ViewExtKt.gone(maskGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void playerPause() {
        Group pauseGroup = ((zj7) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(pauseGroup, "pauseGroup");
        ViewExtKt.gone(pauseGroup);
        Group stopGroup = ((zj7) getMBinding()).X;
        Intrinsics.checkNotNullExpressionValue(stopGroup, "stopGroup");
        ViewExtKt.visible(stopGroup);
        if (((EcoCourseVideoVM) getMViewModel()).isDataCasting()) {
            CastScreenCMD.Operation operation = this.operationcmCMD;
            CastScreenCMD.Operation operation2 = CastScreenCMD.Operation.PAUSE;
            if (operation != operation2) {
                this.operationcmCMD = operation2;
                EcoCourseVideoVM.sendCmdToTV$default((EcoCourseVideoVM) getMViewModel(), operation2, this.tvUrl, 0L, 4, null);
                return;
            }
            return;
        }
        cancelOverlay();
        q qVar = this.player;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            qVar = null;
        }
        qVar.pause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void playerStop() {
        q qVar = this.player;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            qVar = null;
        }
        qVar.stop();
        Group maskGroup = ((zj7) getMBinding()).M;
        Intrinsics.checkNotNullExpressionValue(maskGroup, "maskGroup");
        ViewExtKt.gone(maskGroup);
        Group stopGroup = ((zj7) getMBinding()).X;
        Intrinsics.checkNotNullExpressionValue(stopGroup, "stopGroup");
        ViewExtKt.gone(stopGroup);
        ((EcoCourseVideoVM) getMViewModel()).stopCast();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void preparePlay(Resolution resolution) {
        EcoCourseVideoVM ecoCourseVideoVM = (EcoCourseVideoVM) getMViewModel();
        String str = this.videoUrl;
        q qVar = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoUrl");
            str = null;
        }
        q qVarPrepare = ecoCourseVideoVM.prepare(str, resolution);
        this.player = qVarPrepare;
        if (qVarPrepare == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            qVarPrepare = null;
        }
        qVarPrepare.z(true);
        q qVar2 = this.player;
        if (qVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        } else {
            qVar = qVar2;
        }
        qVar.h(((zj7) getMBinding()).S);
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
        hideClarityView();
        ((zj7) getMBinding()).A.setSelected(mConnected);
        setStyle(mConnected);
        if (mConnected) {
            ((zj7) getMBinding()).B.setVisibility(0);
            cancelOverlay();
            return;
        }
        ((EcoCourseVideoVM) getMViewModel()).setClarity(decideClarity(ResolutionKt.getSavedResolution()));
        ((zj7) getMBinding()).B.setVisibility(8);
        if (this.progressFromTV > 0) {
            q qVar = this.player;
            if (qVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                qVar = null;
            }
            qVar.seekTo(this.progressFromTV);
        }
        Group pauseGroup = ((zj7) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(pauseGroup, "pauseGroup");
        if (ExtUtilsKt.isVisible(pauseGroup)) {
            playerContinue();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void setConcernData(String key, float value) {
        View view = this.concernedConfig.get(key);
        if (view != null) {
            if (!(view instanceof TextView)) {
                if ((view instanceof LinearLayout) && Intrinsics.areEqual(key, "frequency_hopping")) {
                    setFrequencyHopping(view, (int) value);
                }
                return;
            }
            switch (key.hashCode()) {
                case 113135:
                    if (key.equals("rpm")) {
                        setRpmView((TextView) view, String.valueOf(value));
                        break;
                    }
                    break;
                case 3432979:
                    if (key.equals("pace")) {
                        setPaceView((TextView) view, (int) value);
                        break;
                    }
                    break;
                case 106858757:
                    if (key.equals("power")) {
                        setPowerView((TextView) view, value);
                        break;
                    }
                    break;
                case 109641799:
                    if (key.equals("speed")) {
                        setSpeed((TextView) view, value);
                        break;
                    }
                    break;
                case 288459765:
                    if (key.equals("distance")) {
                        setDistanceView((TextView) view, (int) value);
                        break;
                    }
                    break;
                case 548738829:
                    if (key.equals("calorie")) {
                        setCalorieView((TextView) view, (int) value);
                        break;
                    }
                    break;
                case 1863800889:
                    if (key.equals("resistance")) {
                        setResistanceView((TextView) view, String.valueOf(value));
                        break;
                    }
                    break;
                case 2000916690:
                    if (key.equals(CourseConfigModel.DeviceLinkage.DATA_JUMP_ROP_COUNT)) {
                        setJumpRopCount((TextView) view, (int) value);
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
        ((zj7) getMBinding()).Z.setText(TimeDateUtil.INSTANCE.getDurationStr(duration));
    }

    private final void setFrequencyHopping(View view, int frequencyHopping) {
        String strValueOf = String.valueOf(frequencyHopping);
        String str = strValueOf + " " + getString(czi.course_unit_frequency);
        TextView textView = (TextView) view.findViewById(oqi.P);
        int length = strValueOf.length();
        Object tag = view.getTag(oqi.i0);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        textView.setText(buildSpan(str, length, spanTextSize(((Integer) tag).intValue())));
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

    private final void setJumpRopCount(TextView view, int jumpRopCount) {
        String strValueOf = String.valueOf(jumpRopCount);
        String str = strValueOf + " " + getString(czi.course_unit_number);
        int length = strValueOf.length();
        Object tag = view.getTag(oqi.i0);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        view.setText(buildSpan(str, length, spanTextSize(((Integer) tag).intValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setJumpRopRecommendCount(View view, int recommend) {
        String str;
        if (recommend == 0) {
            str = getResources().getString(czi.course_suggestions) + "：--";
        } else {
            str = getResources().getString(czi.course_suggestions) + "：" + recommend;
        }
        ((TextView) view.findViewById(oqi.b1)).setText(str);
    }

    private final void setPaceView(TextView view, int pace) {
        String sportPaceStrWithSecDef = TimeDateUtil.getSportPaceStrWithSecDef(pace);
        String str = sportPaceStrWithSecDef + getString(czi.course_pace);
        int length = sportPaceStrWithSecDef.length();
        Object tag = view.getTag(oqi.i0);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        view.setText(buildSpan(str, length, spanTextSize(((Integer) tag).intValue())));
    }

    private final void setPowerView(TextView view, float power) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(power)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        int length = String.valueOf(power).length();
        Object tag = view.getTag(oqi.i0);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        view.setText(buildSpan(str + " W", length, spanTextSize(((Integer) tag).intValue())));
    }

    private final void setResistanceView(TextView view, String resistance) {
        String str = resistance + "阻力";
        int length = resistance.length();
        Object tag = view.getTag(oqi.i0);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        view.setText(buildSpan(str, length, spanTextSize(((Integer) tag).intValue())));
    }

    private final void setRpmView(TextView view, String rpm) {
        String str = rpm + "RPM";
        int length = rpm.length();
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
            Drawable background = ((zj7) getMBinding()).E.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background).setColor(452984831);
            ((zj7) getMBinding()).T.setImageResource(xmi.course_video_pre_cast);
            ((zj7) getMBinding()).P.setImageResource(xmi.course_video_next_cast);
            ((zj7) getMBinding()).R.setImageResource(xmi.course_video_pause_cast);
            ((zj7) getMBinding()).Y.setImageResource(xmi.course_video_stop_cast);
            ((zj7) getMBinding()).G.setImageResource(xmi.course_video_start_cast);
            return;
        }
        ((zj7) getMBinding()).T.setImageResource(xmi.course_video_pre);
        ((zj7) getMBinding()).P.setImageResource(xmi.course_video_next);
        ((zj7) getMBinding()).R.setImageResource(xmi.course_video_pause);
        ((zj7) getMBinding()).Y.setImageResource(xmi.course_video_stop);
        ((zj7) getMBinding()).G.setImageResource(xmi.course_video_start);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        boolean zIsBandType = wearableDeviceModel != null ? DeviceModelExtKt.isBandType(wearableDeviceModel) : false;
        if (this.style == 2) {
            ((zj7) getMBinding()).Z.setTextColor(-1);
            ((zj7) getMBinding()).a0.setImageResource(zIsBandType ? xmi.course_band_light : xmi.course_watch_light);
            if (((EcoCourseVideoVM) getMViewModel()).isRopeSkipping()) {
                ((zj7) getMBinding()).V.setImageResource(xmi.course_rope_light);
            } else {
                ((zj7) getMBinding()).V.setImageResource(xmi.course_gms_light);
            }
            ((zj7) getMBinding()).U.setColor(872415231, -1);
            Drawable background2 = ((zj7) getMBinding()).E.getBackground();
            Intrinsics.checkNotNull(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background2).setColor(1711276032);
            ((zj7) getMBinding()).N.setBackgroundResource(xmi.course_video_mask_top_dark);
            ((zj7) getMBinding()).L.setBackgroundResource(xmi.course_video_mask_bottom_dark);
            ((zj7) getMBinding()).J.setBackgroundResource(xmi.course_info_dark);
            return;
        }
        ((zj7) getMBinding()).Z.setTextColor(-16777216);
        ((zj7) getMBinding()).a0.setImageResource(zIsBandType ? xmi.course_band_dark : xmi.course_watch_dark);
        if (((EcoCourseVideoVM) getMViewModel()).isRopeSkipping()) {
            ((zj7) getMBinding()).V.setImageResource(xmi.course_rope_dark);
        } else {
            ((zj7) getMBinding()).V.setImageResource(xmi.course_gms_dark);
        }
        ((zj7) getMBinding()).U.setColor(855638016, -16777216);
        Drawable background3 = ((zj7) getMBinding()).E.getBackground();
        Intrinsics.checkNotNull(background3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background3).setColor(436207616);
        ((zj7) getMBinding()).N.setBackgroundResource(xmi.course_video_mask_top_light);
        ((zj7) getMBinding()).L.setBackgroundResource(xmi.course_video_mask_bottom_light);
        ((zj7) getMBinding()).J.setBackgroundResource(xmi.course_info_light);
    }

    private final void showFinishCastDialog() {
        DriftDialog driftDialogCreate = new DriftDialog.Builder().setLayoutRes(sti.course_layout_dialog).addClickIds(oqi.C0, oqi.e1).setOnViewClick(new Function2() { // from class: vp7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoCourseVideoActivity.showFinishCastDialog$lambda$11(this.f37101a, (View) obj, (DriftDialog) obj2);
            }
        }).setOnViewBind(new Function1() { // from class: xp7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseVideoActivity.showFinishCastDialog$lambda$12(this.f39329a, (View) obj);
            }
        }).cancelable(false).create();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        driftDialogCreate.show(supportFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showFinishCastDialog$lambda$11(EcoCourseVideoActivity this$0, View view, DriftDialog dialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        int id = view.getId();
        if (id == oqi.C0) {
            dialog.dismiss();
        } else if (id == oqi.e1) {
            dialog.dismiss();
            ((EcoCourseVideoVM) this$0.getMViewModel()).stopCast();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showFinishCastDialog$lambda$12(EcoCourseVideoActivity this$0, View view) {
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
        ((zj7) getMBinding()).M.postDelayed(getGoneOverlay(), 5000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startPlay() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        Logger.i(BaseBindingActivity.TAG, "startSport");
        if (!CourseExtKt.getTEST()) {
            ((EcoCourseVideoVM) getMViewModel()).startLocalSport(new RequestCallback() { // from class: com.mi.health.course.eco.activity.EcoCourseVideoActivity.startPlay.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    Logger.i(BaseBindingActivity.TAG, "startPlay data = " + responseCode);
                    if (responseCode != 0) {
                        EcoCourseVideoActivity.this.dismissDialog();
                        ToastExtKt.toast$default(EcoCourseVideoActivity.this, czi.course_device_busy, 0, 0, 0L, 14, null);
                        EcoCourseVideoActivity.this.finish();
                    } else {
                        q qVar = EcoCourseVideoActivity.this.player;
                        if (qVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("player");
                            qVar = null;
                        }
                        qVar.play();
                    }
                }
            });
            return;
        }
        q qVar = this.player;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            qVar = null;
        }
        qVar.play();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void toggleOverlay() {
        q qVar = this.player;
        q qVar2 = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            qVar = null;
        }
        if (qVar.isPlaying()) {
            Group maskGroup = ((zj7) getMBinding()).M;
            Intrinsics.checkNotNullExpressionValue(maskGroup, "maskGroup");
            ExtUtilsKt.toggleGone(maskGroup);
            Group pauseGroup = ((zj7) getMBinding()).Q;
            Intrinsics.checkNotNullExpressionValue(pauseGroup, "pauseGroup");
            ExtUtilsKt.toggleGone(pauseGroup);
            q qVar3 = this.player;
            if (qVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
            } else {
                qVar2 = qVar3;
            }
            checkSegment(qVar2.getCurrentPosition());
            startOverlay();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.eco.activity.EcoBaseCourseActivity
    public boolean abnormalHeartRate() {
        return !((EcoCourseVideoVM) getMViewModel()).isDataCasting();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.eco.activity.EcoBaseCourseActivity
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
        ((zj7) getMBinding()).M.postDelayed(getFinishTimeout(), 10000L);
        ((EcoCourseVideoVM) getMViewModel()).finishSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.eco.activity.EcoCourseVideoActivity.finishCourse.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                Logger.i(BaseBindingActivity.TAG, "finishCourse data = " + responseCode + ".");
                if (responseCode != 0) {
                    EcoCourseVideoActivity.this.finish();
                }
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.f;
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
    @Override // com.mi.health.course.eco.activity.EcoBaseCourseActivity
    public boolean isSendCmd() {
        return ((EcoCourseVideoVM) getMViewModel()).isDataCasting();
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
        q qVar = null;
        if (id == oqi.U0) {
            if (((EcoCourseVideoVM) getMViewModel()).isDataCasting()) {
                ((EcoCourseVideoVM) getMViewModel()).sendCmdToTV(CastScreenCMD.Operation.PROGRESS, this.tvUrl, playLocate(false, this.progressFromTV));
                return;
            }
            q qVar2 = this.player;
            if (qVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                qVar2 = null;
            }
            long jPlayLocate = playLocate(false, qVar2.getCurrentPosition());
            q qVar3 = this.player;
            if (qVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
            } else {
                qVar = qVar3;
            }
            qVar.seekTo(jPlayLocate);
            return;
        }
        if (id == oqi.M0) {
            if (((EcoCourseVideoVM) getMViewModel()).isDataCasting()) {
                ((EcoCourseVideoVM) getMViewModel()).sendCmdToTV(CastScreenCMD.Operation.PROGRESS, this.tvUrl, playLocate(true, this.progressFromTV));
                return;
            }
            q qVar4 = this.player;
            if (qVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                qVar4 = null;
            }
            long jPlayLocate2 = playLocate(true, qVar4.getCurrentPosition());
            q qVar5 = this.player;
            if (qVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
            } else {
                qVar = qVar5;
            }
            qVar.seekTo(jPlayLocate2);
            return;
        }
        if (id == oqi.H) {
            playerContinue();
            Logger.i(BaseBindingActivity.TAG, "continue");
            ((EcoCourseVideoVM) getMViewModel()).resumeSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.eco.activity.EcoCourseVideoActivity.onClick.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    Logger.i(BaseBindingActivity.TAG, "playContinue " + responseCode);
                }
            });
            return;
        }
        if (id == oqi.q1) {
            if (((EcoCourseVideoVM) getMViewModel()).isSportValid()) {
                showStopDialog();
                return;
            } else {
                showTimeTooShortDialog();
                return;
            }
        }
        if (id == oqi.E0) {
            setCmdEnable(!getCmdEnable());
            ((EcoCourseVideoVM) getMViewModel()).setCmdEnable(getCmdEnable());
            ((zj7) getMBinding()).K.setSelected(!getCmdEnable());
        } else if (id == oqi.q) {
            if (!this.isSupportMilink) {
                WebViewUtilKt.startWebView$default(WebViewUrlKt.getCastScreenUrl(LocaleUtil.getCurrentLocale()), getString(czi.course_cast_desc), false, false, null, false, null, false, 252, null);
            } else {
                if (((EcoCourseVideoVM) getMViewModel()).isStartCast()) {
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
        ((zj7) getMBinding()).H.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.eco.activity.Hilt_EcoCourseVideoActivity, com.mi.health.course.eco.activity.EcoBaseCourseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
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
        this.videoUrl = strVideoUrl;
        CourseConfigModel.VideoInfo videoInfo = getInfo().getVideoInfo();
        Intrinsics.checkNotNull(videoInfo);
        this.videoInfo = videoInfo;
        List<CourseConfigModel.VideoSegment> segments = CourseExtKt.getSegments(getInfo());
        if (segments != null) {
            ((EcoCourseVideoVM) getMViewModel()).setSegments(segments);
        }
        Resolution savedResolution = (!NetworkExtKt.isNetworkAvailable() || NetworkExtKt.isWifiConnected()) ? ResolutionKt.getSavedResolution() : ResolutionKt.getAndSaveResolution(Resolution720.INSTANCE.getId());
        this.tvUrl = CourseExtKt.getTvUrl(getInfo(), savedResolution);
        preparePlay(decideClarity(savedResolution));
        addObserver();
        setStyle(false);
        if (((EcoCourseVideoVM) getMViewModel()).isRopeSkipping()) {
            ImageView linkView = ((zj7) getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(linkView, "linkView");
            ExtUtilsKt.setVisible(linkView, false);
        } else {
            ImageView linkView2 = ((zj7) getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(linkView2, "linkView");
            ExtUtilsKt.setVisible(linkView2, getSupportDeviceLink());
        }
        ((zj7) getMBinding()).K.setSelected(!getCmdEnable());
        configConcernData();
        if (((EcoCourseVideoVM) getMViewModel()).isSupportSendData()) {
            ((EcoCourseVideoVM) getMViewModel()).initMilinkClient();
            this.isSupportMilink = true;
        }
        startPlay();
        ((EcoCourseVideoVM) getMViewModel()).setMaxHeartRate(getHrZone().getMaxHr());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.eco.activity.Hilt_EcoCourseVideoActivity, com.mi.health.course.eco.activity.EcoBaseCourseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q qVar = this.player;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            qVar = null;
        }
        qVar.f(this.playerListener);
        ((zj7) getMBinding()).M.removeCallbacks(getGoneOverlay());
        ((zj7) getMBinding()).M.removeCallbacks(getFinishTimeout());
        ((EcoCourseVideoVM) getMViewModel()).stopCast();
    }

    @Override // com.mi.health.course.eco.activity.EcoBaseCourseActivity
    public void onSecondTick(long d) {
        q qVar = this.player;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            qVar = null;
        }
        checkSegment(qVar.getCurrentPosition());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.eco.activity.EcoBaseCourseActivity
    @SuppressLint({"SwitchIntDef"})
    public void onSportStateChange(@NotNull CourseSportState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof CourseSportState.Finish)) {
            if (Intrinsics.areEqual(state, CourseSportState.Pause.INSTANCE)) {
                if (((EcoCourseVideoVM) getMViewModel()).isRopeSkipping()) {
                    rvn.Y(this).I();
                }
                playerPause();
                return;
            } else {
                if (!Intrinsics.areEqual(state, CourseSportState.Restart.INSTANCE)) {
                    Logger.d(BaseBindingActivity.TAG, "onSportStateChange: other");
                    return;
                }
                if (((EcoCourseVideoVM) getMViewModel()).isRopeSkipping()) {
                    rvn.Y(this).K();
                }
                playerContinue();
                return;
            }
        }
        CourseSportState.Finish finish = (CourseSportState.Finish) state;
        Logger.i(BaseBindingActivity.TAG, "onSportStateChange: valid = " + finish.getValidSport());
        if (((EcoCourseVideoVM) getMViewModel()).isRopeSkipping()) {
            rvn.Y(this).X0();
        }
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
    @Override // com.mi.health.course.eco.activity.EcoBaseCourseActivity
    public void setDeviceStatus(@NotNull DeviceState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ImageView imageView = ((zj7) getMBinding()).a0;
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
        ImageView imageView2 = ((zj7) getMBinding()).V;
        if (state.getSportHas()) {
            Intrinsics.checkNotNull(imageView2);
            ViewExtKt.visible(imageView2);
            imageView2.setSelected(state.getSportConnect());
        } else {
            Intrinsics.checkNotNull(imageView2);
            ViewExtKt.gone(imageView2);
        }
        ((EcoCourseVideoVM) getMViewModel()).sendDeviceStatus(getDeviceLinkage());
    }

    public final void setOperationcmCMD(@NotNull CastScreenCMD.Operation operation) {
        Intrinsics.checkNotNullParameter(operation, "<set-?>");
        this.operationcmCMD = operation;
    }

    public final void setProgressFromTV(long j) {
        this.progressFromTV = j;
    }
}
