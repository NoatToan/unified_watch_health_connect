package com.xiaomi.fitness.sport.view.route;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelKt;
import com.amap.api.maps.AMap;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.fitness.banner.export.newbieguide.model.HighLight;
import com.mi.health.sport.CreateRouteMap;
import com.mi.health.sport.TrackShareRoutineView;
import com.mibi.sdk.common.MibiSdkConstants;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.utils.ViewUiUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SystemSetting;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.fitness.sport.baseui.TitleBar;
import com.xiaomi.fitness.sport.route.detail.model.AddressInfo;
import com.xiaomi.fitness.sport.route.detail.model.RouteSceneType;
import com.xiaomi.fitness.sport.route.detail.util.RouteDetailExtKt;
import com.xiaomi.fitness.sport.service.SportDataStoreManagerKt;
import com.xiaomi.fitness.sport.view.route.CreateRouteActivity;
import com.xiaomi.fitness.sport.view.route.address.AddressSearchActivity;
import com.xiaomi.fitness.sport.view.route.ext.RunningRouteExtKt;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import com.xiaomi.fitness.sport_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.aki;
import defpackage.c1j;
import defpackage.cyq;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.mhk;
import defpackage.nuf;
import defpackage.o7h;
import defpackage.olg;
import defpackage.p7h;
import defpackage.p9n;
import defpackage.pah;
import defpackage.rbd;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u0000 Å\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002Å\u0001B\b¢\u0006\u0005\bÄ\u0001\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0006J\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u0006J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u0006J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(JC\u00101\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010%2\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*2\u001c\u00100\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0012\u0006\u0012\u0004\u0018\u00010/0,¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0004H\u0014¢\u0006\u0004\b3\u0010\u0006J\u0017\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0013H\u0014¢\u0006\u0004\b5\u0010\u0016J\u000f\u00106\u001a\u00020\u0004H\u0014¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\u0004H\u0014¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u0010\u0006J\u001d\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u0002092\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\u00042\u0006\u0010:\u001a\u000209¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\b2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b?\u0010@J\u0015\u0010C\u001a\u0002092\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ3\u0010I\u001a\u00020\u00042\u0006\u0010E\u001a\u00020A2\b\b\u0002\u0010F\u001a\u0002092\b\b\u0002\u0010G\u001a\u00020\b2\b\b\u0002\u0010H\u001a\u00020\b¢\u0006\u0004\bI\u0010JJ\u001f\u0010O\u001a\u0004\u0018\u00010N2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010K¢\u0006\u0004\bO\u0010PJ)\u0010T\u001a\u00020\u00042\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010K2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010R¢\u0006\u0004\bT\u0010UJM\u0010[\u001a\u00020\u00042\f\u0010V\u001a\b\u0012\u0004\u0012\u00020L0K2\b\b\u0002\u0010W\u001a\u0002092\b\b\u0002\u0010X\u001a\u0002092\b\b\u0002\u0010Y\u001a\u0002092\b\b\u0002\u0010Z\u001a\u0002092\b\b\u0002\u0010S\u001a\u00020R¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\u0004¢\u0006\u0004\b]\u0010\u0006J\u0015\u0010_\u001a\u00020\u00042\u0006\u0010^\u001a\u00020.¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020\u0004¢\u0006\u0004\ba\u0010\u0006J\r\u0010b\u001a\u00020\u0004¢\u0006\u0004\bb\u0010\u0006J\u0015\u0010d\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\b¢\u0006\u0004\bd\u0010eJ#\u0010h\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00040f¢\u0006\u0004\bh\u0010iJ\u001f\u0010m\u001a\u00020\u00042\u0006\u0010k\u001a\u00020j2\b\b\u0002\u0010l\u001a\u000209¢\u0006\u0004\bm\u0010nJ\r\u0010o\u001a\u00020\u0004¢\u0006\u0004\bo\u0010\u0006J/\u0010u\u001a\u00020\u00042\u0006\u0010p\u001a\u0002092\u000e\u0010r\u001a\n\u0012\u0006\b\u0001\u0012\u00020j0q2\u0006\u0010t\u001a\u00020sH\u0016¢\u0006\u0004\bu\u0010vR\"\u0010w\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010>R\u001d\u0010\u0081\u0001\u001a\u00020|8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R&\u0010\u0082\u0001\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010x\u001a\u0005\b\u0083\u0001\u0010z\"\u0005\b\u0084\u0001\u0010>R&\u0010\u0085\u0001\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010x\u001a\u0005\b\u0086\u0001\u0010z\"\u0005\b\u0087\u0001\u0010>R&\u0010\u0088\u0001\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010x\u001a\u0005\b\u0089\u0001\u0010z\"\u0005\b\u008a\u0001\u0010>R&\u0010\u008b\u0001\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010x\u001a\u0005\b\u008c\u0001\u0010z\"\u0005\b\u008d\u0001\u0010>R&\u0010\u008e\u0001\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010x\u001a\u0005\b\u008f\u0001\u0010z\"\u0005\b\u0090\u0001\u0010>R&\u0010\u0091\u0001\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010x\u001a\u0005\b\u0092\u0001\u0010z\"\u0005\b\u0093\u0001\u0010>R*\u0010\u0096\u0001\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u00018\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001d\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020j0K8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R&\u0010\u009c\u0001\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010x\u001a\u0005\b\u009d\u0001\u0010z\"\u0005\b\u009e\u0001\u0010>R)\u0010\u009f\u0001\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R,\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R)\u0010¬\u0001\u001a\u00020j8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R*\u0010²\u0001\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0005\b¶\u0001\u0010\u001aR&\u0010·\u0001\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b·\u0001\u0010x\u001a\u0005\b¸\u0001\u0010z\"\u0005\b¹\u0001\u0010>R\u0014\u0010¼\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R\u0016\u0010¾\u0001\u001a\u0002098VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b½\u0001\u0010zR\u0014\u0010Á\u0001\u001a\u00020\u00038F¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0016\u0010Ã\u0001\u001a\u0002098VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010z¨\u0006Æ\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "Lp9n;", "", "updateLastLocation", "()V", "initToastMessageListener", "", "shouldShowStartPointNotice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setStartPointNoticeShown", "showStartPointNotice", "initContentFragment", "initTitles", "initData", "abnormalCheck", "initViews", "initParseLastLocationListener", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/amap/api/maps/model/CameraPosition;", "cameraPosition", "parseCameraPosition", "(Lcom/amap/api/maps/model/CameraPosition;)V", "", "startDelayTime", "firstDuration", "secondDuration", "textDUration", "performLocationIconAnimation", "(JJJJ)V", "initStyleTitleBar", "addChildTab", "switchTab", "Landroidx/fragment/app/Fragment;", "fragment", "replaceBottomSheetFragment", "(Landroidx/fragment/app/Fragment;)V", "nextFragment", "Lkotlinx/coroutines/flow/Flow;", "dataFlow", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$StatusCodes;", "", "request", "replaceWithWait", "(Landroidx/fragment/app/Fragment;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)V", LifecycleConstantKt.ON_RESUME, "outState", "onSaveInstanceState", LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_DESTROY, "onLowMemory", "", "resId", "transactionReplaceFragment", "(ILandroidx/fragment/app/Fragment;)V", "transactionRemoveFragment", "(I)V", "isFragmentAttached", "(I)Z", "Landroid/view/View;", "view", "getViewTopOnScreen", "(Landroid/view/View;)I", "rootView", "midMinHeight", "behaviorIsDraggable", "behaviorIsHidable", "setDefaultBehavior", "(Landroid/view/View;IZZ)V", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "tracks", "Landroid/graphics/Bitmap;", "buildBitmap", "(Ljava/util/List;)Landroid/graphics/Bitmap;", "routeList", "", "rotateAngle", "drawRoute", "(Ljava/util/List;Ljava/lang/Float;)V", "data", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "drawMap", "(Ljava/util/List;IIIIF)V", "clearMap", Constants.PARAM_STATUS_CODE, "createRouteStatusCodeHandler", "(Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$StatusCodes;)V", "startLoading", "showEmptyMapGuide", "smallWindow", "resizeRouteImage", "(Z)V", "Lkotlin/Function0;", "action", "setBackPressedFragment", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V", "", "text", "duration", "showHintText", "(Ljava/lang/String;I)V", "hideKeyboard", AccountInteractActivity.KEY_REQUEST_CODE, "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "curExceptionState", "I", "getCurExceptionState", "()I", "setCurExceptionState", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteMidCompressionBottomSheetBehavior;", "behavior$delegate", "Lkotlin/Lazy;", "getBehavior", "()Lcom/xiaomi/fitness/sport/view/route/CreateRouteMidCompressionBottomSheetBehavior;", "behavior", "rootHeight", "getRootHeight", "setRootHeight", "rootWidth", "getRootWidth", "setRootWidth", "rootMaxLength", "getRootMaxLength", "setRootMaxLength", "statusBarHeight", "getStatusBarHeight", "setStatusBarHeight", "navigationBarHeight", "getNavigationBarHeight", "setNavigationBarHeight", "rootDpi", "getRootDpi", "setRootDpi", "", "Lmiuix/miuixbasewidget/widget/FilterSortView$TabView;", "tabViewMap", "Ljava/util/Map;", "getTabViewMap", "()Ljava/util/Map;", "mTabTitleList", "Ljava/util/List;", "styleFragmentIndex", "getStyleFragmentIndex", "setStyleFragmentIndex", "bottomSheetContentView", "Landroid/view/View;", "getBottomSheetContentView", "()Landroid/view/View;", "setBottomSheetContentView", "(Landroid/view/View;)V", "Landroid/animation/AnimatorSet;", "animatorSet", "Landroid/animation/AnimatorSet;", "getAnimatorSet", "()Landroid/animation/AnimatorSet;", "setAnimatorSet", "(Landroid/animation/AnimatorSet;)V", "currentCity", "Ljava/lang/String;", "getCurrentCity", "()Ljava/lang/String;", "setCurrentCity", "(Ljava/lang/String;)V", "lastCameraPosition", "Lcom/amap/api/maps/model/CameraPosition;", "getLastCameraPosition", "()Lcom/amap/api/maps/model/CameraPosition;", "setLastCameraPosition", "routeImageRowWidth", "getRouteImageRowWidth", "setRouteImageRowWidth", "getCreateRouteViewModel", "()Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "getLayoutId", "layoutId", "getCreateRouteActivityBinding", "()Lp9n;", "createRouteActivityBinding", "getViewModelId", "viewModelId", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCreateRouteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteActivity.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteActivity\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1205:1\n53#2:1206\n55#2:1210\n50#3:1207\n55#3:1209\n107#4:1208\n1872#5,3:1211\n1863#5,2:1215\n1872#5,3:1217\n81#6:1214\n*S KotlinDebug\n*F\n+ 1 CreateRouteActivity.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteActivity\n*L\n377#1:1206\n377#1:1210\n377#1:1207\n377#1:1209\n377#1:1208\n481#1:1211,3\n950#1:1215,2\n961#1:1217,3\n759#1:1214\n*E\n"})
public final class CreateRouteActivity extends Hilt_CreateRouteActivity<CreateRouteViewModel, p9n> {
    public static final int EXCEPTION_NO_DATA = -3;
    public static final int EXCEPTION_NO_NETWORK = -1;
    public static final int EXCEPTION_NO_PEIMISSION = -2;

    @NotNull
    public static final String KEY_ITEM_DATA = "key_item_data";
    public static final int NORMAL_STATUS = 0;

    @NotNull
    public static final String TAG = "CreateRouteActivity";

    @NotNull
    public static final String URL_RUNNING_ROUTE_GUIDE = "https://watch.iot.mi.com/libai/index.html#/article?id=604";

    @Nullable
    private AnimatorSet animatorSet;
    public View bottomSheetContentView;
    private int curExceptionState;

    @Nullable
    private CameraPosition lastCameraPosition;
    private int navigationBarHeight;
    private int rootDpi;
    private int rootHeight;
    private int rootMaxLength;
    private int rootWidth;
    private int routeImageRowWidth;
    private int statusBarHeight;
    private int styleFragmentIndex;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Preferences.Key<Boolean> HAS_SHOWN_START_POINT_NOTICE = PreferencesKeys.booleanKey("CreateRouteActivityHasShownCreateNotice");

    /* JADX INFO: renamed from: behavior$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy behavior = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: f15
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CreateRouteActivity.behavior_delegate$lambda$0(this.f17282a);
        }
    });

    @NotNull
    private final Map<Integer, FilterSortView.TabView> tabViewMap = new LinkedHashMap();

    @NotNull
    private final List<String> mTabTitleList = new ArrayList();

    @NotNull
    private String currentCity = "";

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_ITEM_DATA", "URL_RUNNING_ROUTE_GUIDE", "EXCEPTION_NO_NETWORK", "", "EXCEPTION_NO_PEIMISSION", "EXCEPTION_NO_DATA", "NORMAL_STATUS", StatConstants.PARAM_START, "", "context", "Landroid/content/Context;", "HAS_SHOWN_START_POINT_NOTICE", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                context.startActivity(new Intent(context, (Class<?>) CreateRouteActivity.class));
            } else {
                CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreateRouteViewModel.StatusCodes.values().length];
            try {
                iArr[CreateRouteViewModel.StatusCodes.StatusErrorStrategyBlacklist.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateRouteViewModel.StatusCodes.StatusErrorStrategyNoSupport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CreateRouteViewModel.StatusCodes.StatusErrorStrategyOutLimit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CreateRouteViewModel.StatusCodes.StatusErrorStrategySensitive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CreateRouteViewModel.StatusCodes.StatusErrorClickFrequently.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CreateRouteViewModel.StatusCodes.StatusErrorExistRouteDoing.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CreateRouteViewModel.StatusCodes.StausErrorLocationEmpty.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$abnormalCheck$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$abnormalCheck$1", f = "CreateRouteActivity.kt", i = {}, l = {631}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$abnormalCheck$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$abnormalCheck$1$1", f = "CreateRouteActivity.kt", i = {}, l = {678}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CreateRouteActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07441(CreateRouteActivity createRouteActivity, Continuation<? super C07441> continuation) {
                super(2, continuation);
                this.this$0 = createRouteActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07441(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0 && i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                do {
                    if (NetworkUtils.isNetworkConnected(this.this$0) || (this.this$0.getCreateRouteViewModel().getCurrentFragment() instanceof CreateRouteAbnormalFragment)) {
                        if (LocationExtKt.supportsOutdoorSportPositionService(this.this$0) && (PermissionExtKt.isPermissionGranted(this.this$0, "android.permission.ACCESS_FINE_LOCATION") || (this.this$0.getCreateRouteViewModel().getCurrentFragment() instanceof CreateRouteAbnormalFragment))) {
                            if (this.this$0.getCurExceptionState() != 0) {
                                Logger.i(CreateRouteActivity.TAG, "abnormalCheck: return normal");
                                this.this$0.setCurExceptionState(0);
                                CreateRouteActivity createRouteActivity = this.this$0;
                                createRouteActivity.transactionRemoveFragment(CreateRouteActivity.access$getMBinding(createRouteActivity).A.getId());
                                ViewExtKt.visible(this.this$0.getBottomSheetContentView());
                                CreateRouteActivity.access$getMBinding(this.this$0).M.getMLocationClient().stopLocation();
                                CreateRouteActivity.access$getMBinding(this.this$0).M.getMLocationClient().startLocation();
                                CreateRouteActivity createRouteActivity2 = this.this$0;
                                CameraPosition cameraPosition = CreateRouteActivity.access$getMBinding(createRouteActivity2).M.getMMapView().getMap().getCameraPosition();
                                Intrinsics.checkNotNullExpressionValue(cameraPosition, "getCameraPosition(...)");
                                createRouteActivity2.parseCameraPosition(cameraPosition);
                                FrameLayout abnormalContent = CreateRouteActivity.access$getMBinding(this.this$0).A;
                                Intrinsics.checkNotNullExpressionValue(abnormalContent, "abnormalContent");
                                ViewExtKt.gone(abnormalContent);
                            }
                        } else if (this.this$0.getCurExceptionState() == 0) {
                            Logger.i(CreateRouteActivity.TAG, "abnormalCheck: no permission");
                            this.this$0.setCurExceptionState(-2);
                            ViewExtKt.gone(this.this$0.getBottomSheetContentView());
                            FrameLayout abnormalContent2 = CreateRouteActivity.access$getMBinding(this.this$0).A;
                            Intrinsics.checkNotNullExpressionValue(abnormalContent2, "abnormalContent");
                            ViewExtKt.visible(abnormalContent2);
                            CreateRouteActivity createRouteActivity3 = this.this$0;
                            createRouteActivity3.transactionReplaceFragment(CreateRouteActivity.access$getMBinding(createRouteActivity3).A.getId(), new CreateRouteAbnormalFragment());
                        }
                    } else if (this.this$0.getCurExceptionState() == 0) {
                        Logger.i(CreateRouteActivity.TAG, "abnormalCheck: no network");
                        this.this$0.setCurExceptionState(-1);
                        ViewExtKt.gone(this.this$0.getBottomSheetContentView());
                        FrameLayout abnormalContent3 = CreateRouteActivity.access$getMBinding(this.this$0).A;
                        Intrinsics.checkNotNullExpressionValue(abnormalContent3, "abnormalContent");
                        ViewExtKt.visible(abnormalContent3);
                        CreateRouteActivity createRouteActivity4 = this.this$0;
                        createRouteActivity4.transactionReplaceFragment(CreateRouteActivity.access$getMBinding(createRouteActivity4).A.getId(), new CreateRouteAbnormalFragment());
                    }
                    this.label = 1;
                } while (DelayKt.delay(2700L, this) != coroutine_suspended);
                return coroutine_suspended;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateRouteActivity createRouteActivity = CreateRouteActivity.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C07441 c07441 = new C07441(createRouteActivity, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(createRouteActivity, state, c07441, this) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$drawRoute$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$drawRoute$1", f = "CreateRouteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCreateRouteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteActivity.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteActivity$drawRoute$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1205:1\n65#2,4:1206\n37#2:1210\n53#2:1211\n72#2:1212\n*S KotlinDebug\n*F\n+ 1 CreateRouteActivity.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteActivity$drawRoute$1\n*L\n999#1:1206,4\n999#1:1210\n999#1:1211\n999#1:1212\n*E\n"})
    public static final class C30271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Float $rotateAngle;
        final /* synthetic */ List<CommonTrackData> $routeList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30271(List<CommonTrackData> list, Float f, Continuation<? super C30271> continuation) {
            super(2, continuation);
            this.$routeList = list;
            this.$rotateAngle = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteActivity.this.new C30271(this.$routeList, this.$rotateAngle, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FrameLayout mapContent = CreateRouteActivity.access$getMBinding(CreateRouteActivity.this).L;
            Intrinsics.checkNotNullExpressionValue(mapContent, "mapContent");
            final CreateRouteActivity createRouteActivity = CreateRouteActivity.this;
            final List<CommonTrackData> list = this.$routeList;
            final Float f = this.$rotateAngle;
            if (!mapContent.isLaidOut() || mapContent.isLayoutRequested()) {
                mapContent.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$drawRoute$1$invokeSuspend$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        int rootHeight = createRouteActivity.getRootHeight() - CreateRouteActivity.access$getMBinding(createRouteActivity).L.getHeight();
                        Logger.i(CreateRouteActivity.TAG, "drawed mapContent height :" + CreateRouteActivity.access$getMBinding(createRouteActivity).L.getHeight());
                        List<CommonTrackData> list2 = list;
                        if (list2 != null) {
                            int i = (int) (rootHeight / 2.0f);
                            int dp = ExtUtilsKt.getDp(39) + i;
                            int dp2 = i + ExtUtilsKt.getDp(39);
                            int dp3 = ExtUtilsKt.getDp(39);
                            int dp4 = ExtUtilsKt.getDp(39);
                            Float f2 = f;
                            createRouteActivity.drawMap(list2, dp3, dp4, dp, dp2, f2 != null ? f2.floatValue() : 0.0f);
                        }
                    }
                });
            } else {
                int rootHeight = createRouteActivity.getRootHeight() - CreateRouteActivity.access$getMBinding(createRouteActivity).L.getHeight();
                Logger.i(CreateRouteActivity.TAG, "drawed mapContent height :" + CreateRouteActivity.access$getMBinding(createRouteActivity).L.getHeight());
                if (list != null) {
                    int i = (int) (rootHeight / 2.0f);
                    createRouteActivity.drawMap(list, ExtUtilsKt.getDp(Boxing.boxInt(39)), ExtUtilsKt.getDp(Boxing.boxInt(39)), i + ExtUtilsKt.getDp(Boxing.boxInt(39)), i + ExtUtilsKt.getDp(Boxing.boxInt(39)), f != null ? f.floatValue() : 0.0f);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initContentFragment$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initContentFragment$1", f = "CreateRouteActivity.kt", i = {}, l = {424}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initContentFragment$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initContentFragment$1$1", f = "CreateRouteActivity.kt", i = {}, l = {MibiSdkConstants.REQUEST_MIBI}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CreateRouteActivity this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initContentFragment$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "fragment", "Landroidx/fragment/app/Fragment;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initContentFragment$1$1$1", f = "CreateRouteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C07461 extends SuspendLambda implements Function2<Fragment, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CreateRouteActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07461(CreateRouteActivity createRouteActivity, Continuation<? super C07461> continuation) {
                    super(2, continuation);
                    this.this$0 = createRouteActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C07461 c07461 = new C07461(this.this$0, continuation);
                    c07461.L$0 = obj;
                    return c07461;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Fragment fragment, Continuation<? super Unit> continuation) {
                    return ((C07461) create(fragment, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CardView cardView;
                    CardView cardView2;
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Fragment fragment = (Fragment) this.L$0;
                    if (fragment != null) {
                        CreateRouteActivity createRouteActivity = this.this$0;
                        if (Intrinsics.areEqual(createRouteActivity.getSupportFragmentManager().k0(CreateRouteActivity.access$getMBinding(createRouteActivity).B.getId()), fragment)) {
                            return Unit.INSTANCE;
                        }
                        FitnessLogUtils.i(CreateRouteActivity.TAG, "current frag:" + fragment.getClass().getName());
                        if ((fragment instanceof CreateRouteSelectTargetFragment) || (fragment instanceof CreateRouteSelectStyleFragment)) {
                            LinearLayoutCompat curLocationLayout = CreateRouteActivity.access$getMBinding(createRouteActivity).C;
                            Intrinsics.checkNotNullExpressionValue(curLocationLayout, "curLocationLayout");
                            ViewExtKt.setVisible(curLocationLayout, true);
                            createRouteActivity.getCreateRouteActivityBinding().E.setAlpha(0.0f);
                            createRouteActivity.getCreateRouteActivityBinding().E.setClickable(true);
                            createRouteActivity.getCreateRouteActivityBinding().E.setVisibility(0);
                            if (!CreateRouteActivity.access$getMBinding(createRouteActivity).M.adjustCurrentLocationWhenShown()) {
                                CameraPosition cameraPosition = createRouteActivity.getCreateRouteActivityBinding().M.getCameraPosition();
                                Intrinsics.checkNotNull(cameraPosition);
                                createRouteActivity.parseCameraPosition(cameraPosition);
                            }
                            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(createRouteActivity), null, null, new CreateRouteActivity$initContentFragment$1$1$1$1$1(createRouteActivity, null), 3, null);
                        } else {
                            LinearLayoutCompat curLocationLayout2 = CreateRouteActivity.access$getMBinding(createRouteActivity).C;
                            Intrinsics.checkNotNullExpressionValue(curLocationLayout2, "curLocationLayout");
                            ViewExtKt.setVisible(curLocationLayout2, false);
                            p9n createRouteActivityBinding = createRouteActivity.getCreateRouteActivityBinding();
                            if (createRouteActivityBinding != null && (cardView2 = createRouteActivityBinding.E) != null) {
                                cardView2.setVisibility(8);
                            }
                            p9n createRouteActivityBinding2 = createRouteActivity.getCreateRouteActivityBinding();
                            if (createRouteActivityBinding2 != null && (cardView = createRouteActivityBinding2.E) != null) {
                                cardView.setClickable(false);
                            }
                        }
                        if (!(fragment instanceof CreateRouteEmptyRouteFragment) && !(fragment instanceof CreateRouteConfirmRouteFragment) && !(fragment instanceof CreateRouteEmptyMapFragment)) {
                            LinearLayout titleLayout = CreateRouteActivity.access$getMBinding(createRouteActivity).T;
                            Intrinsics.checkNotNullExpressionValue(titleLayout, "titleLayout");
                            ViewExtKt.gone(titleLayout);
                            View root = CreateRouteActivity.access$getMBinding(createRouteActivity).R.getRoot();
                            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                            ViewExtKt.setVisible(root, true);
                        }
                        createRouteActivity.transactionReplaceFragment(CreateRouteActivity.access$getMBinding(createRouteActivity).B.getId(), fragment);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07451(CreateRouteActivity createRouteActivity, Continuation<? super C07451> continuation) {
                super(2, continuation);
                this.this$0 = createRouteActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07451(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Fragment> currentFragmentFlow = this.this$0.getCreateRouteViewModel().getCurrentFragmentFlow();
                    C07461 c07461 = new C07461(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(currentFragmentFlow, c07461, this) == coroutine_suspended) {
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
                return ((C07451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C30281(Continuation<? super C30281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteActivity.this.new C30281(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateRouteActivity createRouteActivity = CreateRouteActivity.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C07451 c07451 = new C07451(createRouteActivity, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(createRouteActivity, state, c07451, this) == coroutine_suspended) {
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
            return ((C30281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initData$1", f = "CreateRouteActivity.kt", i = {}, l = {610}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initData$1$1", f = "CreateRouteActivity.kt", i = {}, l = {611}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CreateRouteActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07471(CreateRouteActivity createRouteActivity, Continuation<? super C07471> continuation) {
                super(2, continuation);
                this.this$0 = createRouteActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07471(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableStateFlow<Boolean> showLoadingFlow = this.this$0.getCreateRouteViewModel().getShowLoadingFlow();
                    final CreateRouteActivity createRouteActivity = this.this$0;
                    FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteActivity.initData.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                            if (z) {
                                CreateRouteActivity createRouteActivity2 = createRouteActivity;
                                if (!createRouteActivity2.isFragmentAttached(CreateRouteActivity.access$getMBinding(createRouteActivity2).J.getId())) {
                                    FrameLayout loadingFrameLayout = createRouteActivity.getCreateRouteActivityBinding().J;
                                    Intrinsics.checkNotNullExpressionValue(loadingFrameLayout, "loadingFrameLayout");
                                    ViewExtKt.visible(loadingFrameLayout);
                                    CreateRouteActivity createRouteActivity3 = createRouteActivity;
                                    createRouteActivity3.transactionReplaceFragment(CreateRouteActivity.access$getMBinding(createRouteActivity3).J.getId(), new CreateRouteLoadingFragment());
                                    return Unit.INSTANCE;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (showLoadingFlow.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C30291(Continuation<? super C30291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteActivity.this.new C30291(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateRouteActivity createRouteActivity = CreateRouteActivity.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C07471 c07471 = new C07471(createRouteActivity, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(createRouteActivity, state, c07471, this) == coroutine_suspended) {
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
            return ((C30291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initData$2", f = "CreateRouteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteActivity.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateRouteActivity.this.startLoading();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initParseLastLocationListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initParseLastLocationListener$1", f = "CreateRouteActivity.kt", i = {}, l = {907}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initParseLastLocationListener$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initParseLastLocationListener$1$1", f = "CreateRouteActivity.kt", i = {}, l = {908}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CreateRouteActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07491(CreateRouteActivity createRouteActivity, Continuation<? super C07491> continuation) {
                super(2, continuation);
                this.this$0 = createRouteActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07491(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableStateFlow<Boolean> parseLastCameraPositionFlow = this.this$0.getCreateRouteViewModel().getParseLastCameraPositionFlow();
                    final CreateRouteActivity createRouteActivity = this.this$0;
                    FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteActivity.initParseLastLocationListener.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                            if (!z) {
                                return Unit.INSTANCE;
                            }
                            createRouteActivity.updateLastLocation();
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (parseLastCameraPositionFlow.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C30301(Continuation<? super C30301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteActivity.this.new C30301(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateRouteActivity createRouteActivity = CreateRouteActivity.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C07491 c07491 = new C07491(createRouteActivity, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(createRouteActivity, state, c07491, this) == coroutine_suspended) {
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
            return ((C30301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initToastMessageListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initToastMessageListener$1", f = "CreateRouteActivity.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initToastMessageListener$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initToastMessageListener$1$1", f = "CreateRouteActivity.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CreateRouteActivity this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initToastMessageListener$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$StatusCodes;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initToastMessageListener$1$1$1", f = "CreateRouteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C07521 extends SuspendLambda implements Function2<CreateRouteViewModel.StatusCodes, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CreateRouteActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07521(CreateRouteActivity createRouteActivity, Continuation<? super C07521> continuation) {
                    super(2, continuation);
                    this.this$0 = createRouteActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C07521 c07521 = new C07521(this.this$0, continuation);
                    c07521.L$0 = obj;
                    return c07521;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CreateRouteViewModel.StatusCodes statusCodes, Continuation<? super Unit> continuation) {
                    return ((C07521) create(statusCodes, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.createRouteStatusCodeHandler((CreateRouteViewModel.StatusCodes) this.L$0);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07511(CreateRouteActivity createRouteActivity, Continuation<? super C07511> continuation) {
                super(2, continuation);
                this.this$0 = createRouteActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07511(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<CreateRouteViewModel.StatusCodes> stateMessageFlow = this.this$0.getCreateRouteViewModel().getStateMessageFlow();
                    C07521 c07521 = new C07521(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateMessageFlow, c07521, this) == coroutine_suspended) {
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
                return ((C07511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C30311(Continuation<? super C30311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteActivity.this.new C30311(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateRouteActivity createRouteActivity = CreateRouteActivity.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C07511 c07511 = new C07511(createRouteActivity, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(createRouteActivity, state, c07511, this) == coroutine_suspended) {
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
            return ((C30311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$replaceWithWait$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$replaceWithWait$1", f = "CreateRouteActivity.kt", i = {}, l = {523}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<?> $dataFlow;
        final /* synthetic */ Fragment $nextFragment;
        final /* synthetic */ Function1<Continuation<? super CreateRouteViewModel.StatusCodes>, Object> $request;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$replaceWithWait$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$replaceWithWait$1$1", f = "CreateRouteActivity.kt", i = {}, l = {546}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<?> $dataFlow;
            final /* synthetic */ Fragment $nextFragment;
            final /* synthetic */ Function1<Continuation<? super CreateRouteViewModel.StatusCodes>, Object> $request;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreateRouteActivity this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$replaceWithWait$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$replaceWithWait$1$1$1", f = "CreateRouteActivity.kt", i = {0, 1}, l = {535, 537}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
            public static final class C07541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1<Continuation<? super CreateRouteViewModel.StatusCodes>, Object> $request;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CreateRouteActivity this$0;

                /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$replaceWithWait$1$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$replaceWithWait$1$1$1$1", f = "CreateRouteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class C07551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ CreateRouteViewModel.StatusCodes $state;
                    int label;
                    final /* synthetic */ CreateRouteActivity this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C07551(CreateRouteActivity createRouteActivity, CreateRouteViewModel.StatusCodes statusCodes, Continuation<? super C07551> continuation) {
                        super(2, continuation);
                        this.this$0 = createRouteActivity;
                        this.$state = statusCodes;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C07551(this.this$0, this.$state, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        this.this$0.getBehavior().setState(3);
                        this.this$0.getCreateRouteViewModel().sendStateMessage(this.$state);
                        return Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C07551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C07541(Function1<? super Continuation<? super CreateRouteViewModel.StatusCodes>, ? extends Object> function1, CreateRouteActivity createRouteActivity, Continuation<? super C07541> continuation) {
                    super(2, continuation);
                    this.$request = function1;
                    this.this$0 = createRouteActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C07541 c07541 = new C07541(this.$request, this.this$0, continuation);
                    c07541.L$0 = obj;
                    return c07541;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineScope coroutineScope;
                    CoroutineScope coroutineScope2;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i == 1) {
                            coroutineScope = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            coroutineScope2 = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                        }
                        CoroutineScopeKt.cancel$default(coroutineScope2, null, 1, null);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                    Function1<Continuation<? super CreateRouteViewModel.StatusCodes>, Object> function1 = this.$request;
                    this.L$0 = coroutineScope3;
                    this.label = 1;
                    Object objInvoke2 = function1.invoke2(this);
                    if (objInvoke2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope = coroutineScope3;
                    obj = objInvoke2;
                    CreateRouteViewModel.StatusCodes statusCodes = (CreateRouteViewModel.StatusCodes) obj;
                    if (statusCodes != CreateRouteViewModel.StatusCodes.StatusSuccess) {
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        C07551 c07551 = new C07551(this.this$0, statusCodes, null);
                        this.L$0 = coroutineScope;
                        this.label = 2;
                        if (BuildersKt.withContext(main, c07551, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope2 = coroutineScope;
                        CoroutineScopeKt.cancel$default(coroutineScope2, null, 1, null);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C07541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$replaceWithWait$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "result", "", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$replaceWithWait$1$1$2", f = "CreateRouteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$withContext;
                final /* synthetic */ Fragment $nextFragment;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CreateRouteActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(CreateRouteActivity createRouteActivity, CoroutineScope coroutineScope, Fragment fragment, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = createRouteActivity;
                    this.$$this$withContext = coroutineScope;
                    this.$nextFragment = fragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$$this$withContext, this.$nextFragment, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.L$0 == null) {
                        return Unit.INSTANCE;
                    }
                    this.this$0.getBehavior().setState(3);
                    Fragment fragment = this.$nextFragment;
                    CreateRouteActivity createRouteActivity = this.this$0;
                    if (fragment != null) {
                        createRouteActivity.replaceBottomSheetFragment(fragment);
                    }
                    CoroutineScopeKt.cancel$default(this.$$this$withContext, null, 1, null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07531(CreateRouteActivity createRouteActivity, Flow<?> flow, Function1<? super Continuation<? super CreateRouteViewModel.StatusCodes>, ? extends Object> function1, Fragment fragment, Continuation<? super C07531> continuation) {
                super(2, continuation);
                this.this$0 = createRouteActivity;
                this.$dataFlow = flow;
                this.$request = function1;
                this.$nextFragment = fragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07531 c07531 = new C07531(this.this$0, this.$dataFlow, this.$request, this.$nextFragment, continuation);
                c07531.L$0 = obj;
                return c07531;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    this.this$0.hideKeyboard();
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this.this$0.getCreateRouteViewModel()), null, null, new C07541(this.$request, this.this$0, null), 3, null);
                    Flow<?> flow = this.$dataFlow;
                    if (flow != null) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, coroutineScope, this.$nextFragment, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
                return ((C07531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30321(Flow<?> flow, Function1<? super Continuation<? super CreateRouteViewModel.StatusCodes>, ? extends Object> function1, Fragment fragment, Continuation<? super C30321> continuation) {
            super(2, continuation);
            this.$dataFlow = flow;
            this.$request = function1;
            this.$nextFragment = fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteActivity.this.new C30321(this.$dataFlow, this.$request, this.$nextFragment, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C07531 c07531 = new C07531(CreateRouteActivity.this, this.$dataFlow, this.$request, this.$nextFragment, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c07531, this) == coroutine_suspended) {
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
            return ((C30321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$setStartPointNoticeShown$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$setStartPointNoticeShown$2", f = "CreateRouteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30342 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C30342(Continuation<? super C30342> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30342 c30342 = new C30342(continuation);
            c30342.L$0 = obj;
            return c30342;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C30342) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).set(CreateRouteActivity.HAS_SHOWN_START_POINT_NOTICE, Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$showStartPointNotice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity", f = "CreateRouteActivity.kt", i = {0, 0}, l = {395, 396}, m = "showStartPointNotice", n = {"this", "createNotice"}, s = {"L$0", "L$1"})
    public static final class C30351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C30351(Continuation<? super C30351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreateRouteActivity.this.showStartPointNotice(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$showStartPointNotice$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$showStartPointNotice$2", f = "CreateRouteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30362 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ LinearLayoutCompat $createNotice;
        int label;
        final /* synthetic */ CreateRouteActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30362(LinearLayoutCompat linearLayoutCompat, CreateRouteActivity createRouteActivity, Continuation<? super C30362> continuation) {
            super(2, continuation);
            this.$createNotice = linearLayoutCompat;
            this.this$0 = createRouteActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(LinearLayoutCompat linearLayoutCompat, CreateRouteActivity createRouteActivity, View view) {
            linearLayoutCompat.setVisibility(8);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(createRouteActivity), null, null, new CreateRouteActivity$showStartPointNotice$2$1$1(createRouteActivity, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(LinearLayoutCompat linearLayoutCompat, CreateRouteActivity createRouteActivity) {
            linearLayoutCompat.setVisibility(8);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(createRouteActivity), null, null, new CreateRouteActivity$showStartPointNotice$2$2$1(createRouteActivity, null), 3, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30362(this.$createNotice, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$createNotice.setVisibility(0);
            final LinearLayoutCompat linearLayoutCompat = this.$createNotice;
            final CreateRouteActivity createRouteActivity = this.this$0;
            linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.sport.view.route.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CreateRouteActivity.C30362.invokeSuspend$lambda$0(linearLayoutCompat, createRouteActivity, view);
                }
            });
            final LinearLayoutCompat linearLayoutCompat2 = this.$createNotice;
            final CreateRouteActivity createRouteActivity2 = this.this$0;
            return Boxing.boxBoolean(linearLayoutCompat2.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.sport.view.route.b
                @Override // java.lang.Runnable
                public final void run() {
                    CreateRouteActivity.C30362.invokeSuspend$lambda$1(linearLayoutCompat2, createRouteActivity2);
                }
            }, 3000L));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C30362) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$transactionRemoveFragment$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$transactionRemoveFragment$1", f = "CreateRouteActivity.kt", i = {0}, l = {705}, m = "invokeSuspend", n = {"timeDelayed"}, s = {"J$0"})
    public static final class C30371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $resId;
        long J$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30371(int i, Continuation<? super C30371> continuation) {
            super(2, continuation);
            this.$resId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteActivity.this.new C30371(this.$resId, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0050  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:16:0x003d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j;
            Fragment fragmentK0;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                j = 0;
                if (CreateRouteActivity.this.getSupportFragmentManager().T0() || j >= 1500) {
                    fragmentK0 = CreateRouteActivity.this.getSupportFragmentManager().k0(this.$resId);
                    if (fragmentK0 != null) {
                        androidx.fragment.app.k kVarO = CreateRouteActivity.this.getSupportFragmentManager().o();
                        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
                        kVarO.v(fragmentK0);
                        kVarO.m();
                    }
                    return Unit.INSTANCE;
                }
                this.J$0 = j;
                this.label = 1;
                if (DelayKt.delay(50L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                ResultKt.throwOnFailure(obj);
            }
            j += (long) 50;
            if (CreateRouteActivity.this.getSupportFragmentManager().T0()) {
            }
            fragmentK0 = CreateRouteActivity.this.getSupportFragmentManager().k0(this.$resId);
            if (fragmentK0 != null) {
                androidx.fragment.app.k kVarO2 = CreateRouteActivity.this.getSupportFragmentManager().o();
                Intrinsics.checkNotNullExpressionValue(kVarO2, "beginTransaction(...)");
                kVarO2.v(fragmentK0);
                kVarO2.m();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$transactionReplaceFragment$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$transactionReplaceFragment$1", f = "CreateRouteActivity.kt", i = {0}, l = {688}, m = "invokeSuspend", n = {"timeDelayed"}, s = {"J$0"})
    public static final class C30381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ int $resId;
        long J$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30381(int i, Fragment fragment, Continuation<? super C30381> continuation) {
            super(2, continuation);
            this.$resId = i;
            this.$fragment = fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteActivity.this.new C30381(this.$resId, this.$fragment, continuation);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:16:0x003d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                j = 0;
                if (CreateRouteActivity.this.getSupportFragmentManager().T0() || j >= 1500) {
                    androidx.fragment.app.k kVarO = CreateRouteActivity.this.getSupportFragmentManager().o();
                    Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
                    kVarO.w(this.$resId, this.$fragment);
                    kVarO.m();
                    return Unit.INSTANCE;
                }
                this.J$0 = j;
                this.label = 1;
                if (DelayKt.delay(50L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                ResultKt.throwOnFailure(obj);
            }
            j += (long) 50;
            if (CreateRouteActivity.this.getSupportFragmentManager().T0()) {
            }
            androidx.fragment.app.k kVarO2 = CreateRouteActivity.this.getSupportFragmentManager().o();
            Intrinsics.checkNotNullExpressionValue(kVarO2, "beginTransaction(...)");
            kVarO2.w(this.$resId, this.$fragment);
            kVarO2.m();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void abnormalCheck() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ p9n access$getMBinding(CreateRouteActivity createRouteActivity) {
        return (p9n) createRouteActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CreateRouteViewModel access$getMViewModel(CreateRouteActivity createRouteActivity) {
        return (CreateRouteViewModel) createRouteActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addChildTab$lambda$18$lambda$17(CreateRouteActivity this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.styleFragmentIndex == i) {
            return;
        }
        this$0.styleFragmentIndex = i;
        this$0.switchTab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final CreateRouteMidCompressionBottomSheetBehavior behavior_delegate$lambda$0(CreateRouteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewGroup.LayoutParams layoutParams = ((p9n) this$0.getMBinding()).B.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.e) layoutParams).f();
        Intrinsics.checkNotNull(behaviorF, "null cannot be cast to non-null type com.xiaomi.fitness.sport.view.route.CreateRouteMidCompressionBottomSheetBehavior");
        return (CreateRouteMidCompressionBottomSheetBehavior) behaviorF;
    }

    public static /* synthetic */ void drawRoute$default(CreateRouteActivity createRouteActivity, List list, Float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = null;
        }
        createRouteActivity.drawRoute(list, f);
    }

    private final void initContentFragment() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C30281(null), 3, null);
    }

    private final void initData() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C30291(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    private final void initParseLastLocationListener() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C30301(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTitles() {
        ((p9n) getMBinding()).R.H.setVisibility(8);
        ((p9n) getMBinding()).R.D.setVisibility(8);
        ((p9n) getMBinding()).R.I.setVisibility(0);
        ((p9n) getMBinding()).R.I.setOnClickListener(new View.OnClickListener() { // from class: s15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewUtilKt.startWebView$default("https://watch.iot.mi.com/libai/index.html#/article?id=604", null, false, false, null, false, null, false, 254, null);
            }
        });
        getCreateRouteActivityBinding().S.f(new TitleBar.d() { // from class: t15
            @Override // com.xiaomi.fitness.sport.baseui.TitleBar.d
            public final void a() {
                CreateRouteActivity.initTitles$lambda$20(this.f34194a);
            }
        });
        getCreateRouteActivityBinding().R.A.setOnClickListener(new View.OnClickListener() { // from class: c15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteActivity.initTitles$lambda$21(this.f4816a, view);
            }
        });
        nuf.f(((p9n) getMBinding()).R.I);
        nuf.f(getCreateRouteActivityBinding().S.getLeftButton());
        nuf.f(getCreateRouteActivityBinding().R.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitles$lambda$20(CreateRouteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitles$lambda$21(CreateRouteActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().d();
    }

    private final void initToastMessageListener() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C30311(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViews() {
        setActionBarDisplayable(false);
        setBottomSheetContentView(((p9n) getMBinding()).B);
        Object systemService = getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        int i = Build.VERSION.SDK_INT;
        if (i > 29) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            Rect bounds = currentWindowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            this.rootHeight = bounds.height();
            this.rootWidth = bounds.width();
            WindowInsets windowInsets = currentWindowMetrics.getWindowInsets();
            Intrinsics.checkNotNullExpressionValue(windowInsets, "getWindowInsets(...)");
            Insets insets = windowInsets.getInsets(WindowInsetsCompat.m.h());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            this.statusBarHeight = insets.top;
            this.navigationBarHeight = insets.bottom;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.rootHeight = displayMetrics.heightPixels;
            this.rootWidth = displayMetrics.widthPixels;
            int identifier = getResources().getIdentifier("status_bar_height", "dimen", PluginPackageConstant.RN_DIR_A);
            if (identifier > 0) {
                this.statusBarHeight = getResources().getDimensionPixelSize(identifier);
            }
            int identifier2 = getResources().getIdentifier("navigation_bar_height", "dimen", PluginPackageConstant.RN_DIR_A);
            if (identifier2 > 0) {
                this.navigationBarHeight = getResources().getDimensionPixelSize(identifier2);
            }
        }
        final CoordinatorLayout rootView = ((p9n) getMBinding()).N;
        Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
        pah.a(rootView, new Runnable() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initViews$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                CreateRouteActivity createRouteActivity = this;
                CoordinatorLayout rootView2 = CreateRouteActivity.access$getMBinding(createRouteActivity).N;
                Intrinsics.checkNotNullExpressionValue(rootView2, "rootView");
                int viewTopOnScreen = createRouteActivity.getViewTopOnScreen(rootView2);
                if (viewTopOnScreen > 0) {
                    CreateRouteActivity createRouteActivity2 = this;
                    createRouteActivity2.setRootHeight(CreateRouteActivity.access$getMBinding(createRouteActivity2).N.getHeight());
                    this.setStatusBarHeight(0);
                }
                if (viewTopOnScreen + CreateRouteActivity.access$getMBinding(this).N.getHeight() >= this.getRootHeight()) {
                    this.setNavigationBarHeight(0);
                }
                CreateRouteActivity createRouteActivity3 = this;
                createRouteActivity3.setRootMaxLength(RangesKt___RangesKt.coerceAtLeast(createRouteActivity3.getRootHeight(), this.getRootWidth()));
                CoordinatorLayout rootView3 = CreateRouteActivity.access$getMBinding(this).N;
                Intrinsics.checkNotNullExpressionValue(rootView3, "rootView");
                if (!rootView3.isLaidOut() || rootView3.isLayoutRequested()) {
                    final CreateRouteActivity createRouteActivity4 = this;
                    rootView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$initViews$lambda$23$$inlined$doOnLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view.removeOnLayoutChangeListener(this);
                            CreateRouteMap mapView = CreateRouteActivity.access$getMBinding(createRouteActivity4).M;
                            Intrinsics.checkNotNullExpressionValue(mapView, "mapView");
                            ViewExtKt.visible(mapView);
                            CreateRouteMap mapView2 = CreateRouteActivity.access$getMBinding(createRouteActivity4).M;
                            Intrinsics.checkNotNullExpressionValue(mapView2, "mapView");
                            ViewExtKt.setHeight(mapView2, createRouteActivity4.getRootHeight());
                            TrackShareRoutineView routineView = CreateRouteActivity.access$getMBinding(createRouteActivity4).P;
                            Intrinsics.checkNotNullExpressionValue(routineView, "routineView");
                            ViewExtKt.visible(routineView);
                        }
                    });
                    return;
                }
                CreateRouteMap mapView = CreateRouteActivity.access$getMBinding(this).M;
                Intrinsics.checkNotNullExpressionValue(mapView, "mapView");
                ViewExtKt.visible(mapView);
                CreateRouteMap mapView2 = CreateRouteActivity.access$getMBinding(this).M;
                Intrinsics.checkNotNullExpressionValue(mapView2, "mapView");
                ViewExtKt.setHeight(mapView2, this.getRootHeight());
                TrackShareRoutineView routineView = CreateRouteActivity.access$getMBinding(this).P;
                Intrinsics.checkNotNullExpressionValue(routineView, "routineView");
                ViewExtKt.visible(routineView);
            }
        });
        if (i >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
            getWindow().setSoftInputMode(48);
        } else {
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(0);
        }
        androidx.core.view.c.H0(getWindow().getDecorView(), new o7h() { // from class: h15
            @Override // defpackage.o7h
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return CreateRouteActivity.initViews$lambda$24(this.f19565a, view, windowInsetsCompat);
            }
        });
        nuf.f(((p9n) getMBinding()).K);
        ((p9n) getMBinding()).K.setOnClickListener(new View.OnClickListener() { // from class: i15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteActivity.initViews$lambda$26(this.f20659a, view);
            }
        });
        ((p9n) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: j15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteActivity.initViews$lambda$30(this.f22322a, view);
            }
        });
        nuf.f(((p9n) getMBinding()).E);
        initContentFragment();
        initStyleTitleBar();
        initToastMessageListener();
        initParseLastLocationListener();
        ((p9n) getMBinding()).M.setOnCameraChange(new AMap.OnCameraChangeListener() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteActivity.initViews.5
            @Override // com.amap.api.maps.AMap.OnCameraChangeListener
            public void onCameraChange(CameraPosition cameraPosition) {
                Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
                CreateRouteActivity.this.getCreateRouteActivityBinding().M.setMapRotation(cameraPosition.bearing);
                LinearLayoutCompat curLocationLayout = CreateRouteActivity.access$getMBinding(CreateRouteActivity.this).C;
                Intrinsics.checkNotNullExpressionValue(curLocationLayout, "curLocationLayout");
                if (ExtUtilsKt.isVisible(curLocationLayout)) {
                    AnimatorSet animatorSet = CreateRouteActivity.this.getAnimatorSet();
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    CreateRouteActivity.access$getMBinding(CreateRouteActivity.this).E.setAlpha(0.0f);
                    CreateRouteActivity.this.getCreateRouteViewModel().clearRouteStrategyLocationParams();
                    CreateRouteActivity.this.setLastCameraPosition(cameraPosition);
                }
            }

            @Override // com.amap.api.maps.AMap.OnCameraChangeListener
            public void onCameraChangeFinish(CameraPosition cameraPosition) {
                Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
                LinearLayoutCompat curLocationLayout = CreateRouteActivity.access$getMBinding(CreateRouteActivity.this).C;
                Intrinsics.checkNotNullExpressionValue(curLocationLayout, "curLocationLayout");
                if (ExtUtilsKt.isVisible(curLocationLayout)) {
                    boolean z = CreateRouteActivity.access$getMBinding(CreateRouteActivity.this).M.getCurLocationdata() != null;
                    FitnessLogUtils.d(CreateRouteActivity.TAG, "onCameraChangeFinish,position:" + cameraPosition + ",hasLocation:" + z);
                    if (z) {
                        CreateRouteActivity.access$getMBinding(CreateRouteActivity.this).M.setCameraPosition(cameraPosition);
                        CreateRouteActivity.this.parseCameraPosition(cameraPosition);
                        if (CreateRouteActivity.this.getLastCameraPosition() != null) {
                            CreateRouteActivity.this.setLastCameraPosition(null);
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WindowInsetsCompat initViews$lambda$24(CreateRouteActivity this$0, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        rbd rbdVarF = insets.f(WindowInsetsCompat.m.c());
        Intrinsics.checkNotNullExpressionValue(rbdVarF, "getInsets(...)");
        rbd rbdVarF2 = insets.f(WindowInsetsCompat.m.f());
        Intrinsics.checkNotNullExpressionValue(rbdVarF2, "getInsets(...)");
        int iMax = Math.max(rbdVarF.d, rbdVarF2.d);
        rbd rbdVarF3 = insets.f(WindowInsetsCompat.m.g());
        Intrinsics.checkNotNullExpressionValue(rbdVarF3, "getInsets(...)");
        int i = rbdVarF3.f32379b;
        ((p9n) this$0.getMBinding()).R.getRoot().setPaddingRelative(0, i, 0, 0);
        ((p9n) this$0.getMBinding()).T.setPaddingRelative(0, i, 0, 0);
        this$0.statusBarHeight = i;
        ((p9n) this$0.getMBinding()).B.setPaddingRelative(0, 0, 0, iMax);
        return WindowInsetsCompat.f2098b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$26(final CreateRouteActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RunningRouteExtKt.routeCheckPermission(new Function0() { // from class: p15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteActivity.initViews$lambda$26$lambda$25(this.f29902a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViews$lambda$26$lambda$25(CreateRouteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((p9n) this$0.getMBinding()).M.moveCameraToCurrentLocation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initViews$lambda$30(final CreateRouteActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Fragment fragmentK0 = this$0.getSupportFragmentManager().k0(((p9n) this$0.getMBinding()).B.getId());
        if ((fragmentK0 instanceof CreateRouteEmptyRouteFragment) || (fragmentK0 instanceof CreateRouteEmptyMapFragment) || (fragmentK0 instanceof CreateRouteConfirmRouteFragment)) {
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) AddressSearchActivity.class);
        intent.putExtra(AddressSearchActivity.EXTRA_SEARCH_CITY, this$0.currentCity);
        this$0.startForActivityResult(intent, new Function2() { // from class: r15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CreateRouteActivity.initViews$lambda$30$lambda$29(this.f32071a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViews$lambda$30$lambda$29(final CreateRouteActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == -1) {
            Logger.i(TAG, "address select back data:" + intent);
            if (intent != null) {
                final double doubleExtra = intent.getDoubleExtra(AddressSearchActivity.EXTRA_RESULT_LAT, 0.0d);
                final double doubleExtra2 = intent.getDoubleExtra(AddressSearchActivity.EXTRA_RESULT_LON, 0.0d);
                Logger.i(TAG, "address select back data lat:" + doubleExtra + ",lon:" + doubleExtra2);
                ((p9n) this$0.getMBinding()).M.post(new Runnable() { // from class: k15
                    @Override // java.lang.Runnable
                    public final void run() {
                        CreateRouteActivity.initViews$lambda$30$lambda$29$lambda$28$lambda$27(this.f23320a, doubleExtra, doubleExtra2);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initViews$lambda$30$lambda$29$lambda$28$lambda$27(CreateRouteActivity this$0, double d, double d2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((p9n) this$0.getMBinding()).M.animateLatLng(new LatLng(d, d2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit parseCameraPosition$lambda$3(CreateRouteActivity this$0, double d, double d2, AddressInfo address) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(address, "address");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new CreateRouteActivity$parseCameraPosition$1$1(this$0, address, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this$0.getCreateRouteViewModel()), null, null, new CreateRouteActivity$parseCameraPosition$1$2(address, this$0, d, d2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void performLocationIconAnimation$lambda$11$lambda$10(CreateRouteActivity this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = ((p9n) this$0.getMBinding()).H.getLayoutParams();
        layoutParams.height = iIntValue;
        ((p9n) this$0.getMBinding()).H.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performLocationIconAnimation$lambda$13$lambda$12(CardView curLocationNameCardView, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(curLocationNameCardView, "$curLocationNameCardView");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        curLocationNameCardView.getLayoutParams().width = ((Integer) animatedValue).intValue();
        curLocationNameCardView.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void performLocationIconAnimation$lambda$7$lambda$6(CreateRouteActivity this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = ((p9n) this$0.getMBinding()).H.getLayoutParams();
        layoutParams.height = iIntValue;
        ((p9n) this$0.getMBinding()).H.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resizeRouteImage$lambda$36(CreateRouteActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.routeImageRowWidth == 0) {
            this$0.routeImageRowWidth = this$0.getCreateRouteActivityBinding().O.getWidth();
        }
        Logger.i(TAG, "routeImage post rawWidth:" + this$0.routeImageRowWidth + ",screenHeight:" + UIUtils.INSTANCE.getScreenHeight(this$0));
        if (z) {
            ImageView routeImage = this$0.getCreateRouteActivityBinding().O;
            Intrinsics.checkNotNullExpressionValue(routeImage, "routeImage");
            ViewExtKt.setWidth(routeImage, this$0.routeImageRowWidth / 2);
        } else {
            ImageView routeImage2 = this$0.getCreateRouteActivityBinding().O;
            Intrinsics.checkNotNullExpressionValue(routeImage2, "routeImage");
            ViewExtKt.setWidth(routeImage2, this$0.routeImageRowWidth);
        }
    }

    public static /* synthetic */ void setDefaultBehavior$default(CreateRouteActivity createRouteActivity, View view, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = ExtUtilsKt.getDp(0);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        createRouteActivity.setDefaultBehavior(view, i, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setStartPointNoticeShown(Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(SportDataStoreManagerKt.getSportDataStore(this), new C30342(null), continuation);
        return objEdit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object shouldShowStartPointNotice(Continuation<? super Boolean> continuation) {
        final Flow<Preferences> data = SportDataStoreManagerKt.getSportDataStore(this).getData();
        return FlowKt.first(new Flow<Boolean>() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$shouldShowStartPointNotice$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$shouldShowStartPointNotice$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CreateRouteActivity.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteActivity\n*L\n1#1,222:1\n54#2:223\n378#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteActivity$shouldShowStartPointNotice$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$shouldShowStartPointNotice$$inlined$map$1$2", f = "CreateRouteActivity.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Boolean bool = (Boolean) ((Preferences) obj).get(CreateRouteActivity.HAS_SHOWN_START_POINT_NOTICE);
                        Boolean boolBoxBoolean = Boxing.boxBoolean(bool != null ? bool.booleanValue() : true);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showEmptyMapGuide$lambda$35(CreateRouteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Rect rectA = cyq.a(this$0.getWindow().getDecorView(), ((p9n) this$0.getMBinding()).O);
        if (rectA == null) {
            return;
        }
        RectF rectF = new RectF();
        if (rectA.width() > 600) {
            rectF.top = rectA.top;
            rectF.bottom = rectA.bottom;
            rectF.left = rectA.left - 50.0f;
            rectF.right = rectA.right + 50.0f;
        } else {
            rectF.top = rectA.top - 100.0f;
            rectF.bottom = rectA.bottom + 100.0f;
            rectF.left = rectA.left - 200.0f;
            rectF.right = rectA.right + 200.0f;
        }
        olg.a(this$0).d("createRouteEmptyMapGuide").b(false).e(1).f(-1).a(com.fitness.banner.export.newbieguide.model.a.k().a(rectF, HighLight.Shape.ROUND_RECTANGLE, 36, new mhk(dvi.m, 80)).l(true)).g();
        SportManagerExportPreference.INSTANCE.setKEY_CREATE_ROUTE_EMPTY_MAP_GUIDE(true);
    }

    public static /* synthetic */ void showHintText$default(CreateRouteActivity createRouteActivity, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3000;
        }
        createRouteActivity.showHintText(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object showStartPointNotice(Continuation<? super Unit> continuation) {
        C30351 c30351;
        LinearLayoutCompat startPointNotice;
        CreateRouteActivity createRouteActivity;
        if (continuation instanceof C30351) {
            c30351 = (C30351) continuation;
            int i = c30351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30351.label = i - Integer.MIN_VALUE;
            } else {
                c30351 = new C30351(continuation);
            }
        } else {
            c30351 = new C30351(continuation);
        }
        Object objShouldShowStartPointNotice = c30351.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c30351.label;
        if (i2 != 0) {
            if (i2 == 1) {
                startPointNotice = (LinearLayoutCompat) c30351.L$1;
                createRouteActivity = (CreateRouteActivity) c30351.L$0;
                ResultKt.throwOnFailure(objShouldShowStartPointNotice);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objShouldShowStartPointNotice);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objShouldShowStartPointNotice);
        startPointNotice = ((p9n) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(startPointNotice, "startPointNotice");
        c30351.L$0 = this;
        c30351.L$1 = startPointNotice;
        c30351.label = 1;
        objShouldShowStartPointNotice = shouldShowStartPointNotice(c30351);
        if (objShouldShowStartPointNotice == coroutine_suspended) {
            return coroutine_suspended;
        }
        createRouteActivity = this;
        if (!((Boolean) objShouldShowStartPointNotice).booleanValue()) {
            return Unit.INSTANCE;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        C30362 c30362 = new C30362(startPointNotice, createRouteActivity, null);
        c30351.L$0 = null;
        c30351.L$1 = null;
        c30351.label = 2;
        if (BuildersKt.withContext(main, c30362, c30351) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLastLocation() {
        CameraPosition cameraPosition = this.lastCameraPosition;
        if (cameraPosition == null) {
            Logger.d(TAG, "updateLastLocation lastCameraPosition is null");
        } else if (cameraPosition != null) {
            LatLng latLng = cameraPosition.target;
            final double d = latLng.latitude;
            final double d2 = latLng.longitude;
            GeoUtils.INSTANCE.getAddressByAmap(this, d, d2, new Function1() { // from class: e15
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CreateRouteActivity.updateLastLocation$lambda$2$lambda$1(this.f16144a, d, d2, (AddressInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateLastLocation$lambda$2$lambda$1(CreateRouteActivity this$0, double d, double d2, AddressInfo address) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(address, "address");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this$0.getCreateRouteViewModel()), null, null, new CreateRouteActivity$updateLastLocation$1$1$1(d, d2, this$0, address, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addChildTab() {
        final int i = 0;
        for (Object obj : this.mTabTitleList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            FilterSortView.TabView tabViewK = ((p9n) getMBinding()).G.k((String) obj);
            tabViewK.setGravity(17);
            this.tabViewMap.put(Integer.valueOf(i), tabViewK);
            nuf.f(tabViewK);
            tabViewK.setOnClickListener(new View.OnClickListener() { // from class: g15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CreateRouteActivity.addChildTab$lambda$18$lambda$17(this.f18454a, i, view);
                }
            });
            i = i2;
        }
        FilterSortView.TabView tabView = this.tabViewMap.get(Integer.valueOf(this.styleFragmentIndex));
        if (tabView != null) {
            ((p9n) getMBinding()).G.setFilteredTab(tabView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Bitmap buildBitmap(@Nullable List<CommonTrackData> tracks) {
        PointF pointF;
        PointF pointF2 = null;
        if (tracks == null) {
            return null;
        }
        AMap map = ((p9n) getMBinding()).M.getMMapView().getMap();
        ArrayList arrayList = new ArrayList();
        for (CommonTrackData commonTrackData : tracks) {
            Point screenLocation = map.getProjection().toScreenLocation(new LatLng(commonTrackData.getLatitude(), commonTrackData.getLongitude()));
            Location location = new Location();
            location.longitude = screenLocation.x;
            location.latitude = screenLocation.y;
            location.flagSegment = commonTrackData.getFlagSegment();
            ListExtKt.add(arrayList, location);
        }
        Path path = new Path();
        int i = -1;
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Location location2 = (Location) obj;
            boolean z = location2.flagSegment;
            if (i2 != i + 1) {
                path.lineTo((float) location2.longitude, (float) location2.latitude);
            } else if (!z) {
                path.moveTo((float) location2.longitude, (float) location2.latitude);
            }
            if (z) {
                i = i2;
            }
            i2 = i3;
        }
        if (arrayList.isEmpty()) {
            pointF = null;
        } else {
            PointF pointF3 = new PointF((float) ((Location) arrayList.get(0)).longitude, (float) ((Location) arrayList.get(0)).latitude);
            int size = arrayList.size();
            if (size > 1) {
                int i4 = size - 1;
                pointF2 = new PointF((float) ((Location) arrayList.get(i4)).longitude, (float) ((Location) arrayList.get(i4)).latitude);
            }
            pointF = pointF2;
            pointF2 = pointF3;
        }
        ((p9n) getMBinding()).P.setPath(path, pointF2, pointF);
        TrackShareRoutineView trackShareRoutineView = ((p9n) getMBinding()).P;
        TrackShareRoutineView routineView = ((p9n) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(routineView, "routineView");
        return trackShareRoutineView.createBitmap(routineView, ((p9n) getMBinding()).P.getWidth(), ((p9n) getMBinding()).P.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void clearMap() {
        ImageView routeImage = ((p9n) getMBinding()).O;
        Intrinsics.checkNotNullExpressionValue(routeImage, "routeImage");
        ViewExtKt.gone(routeImage);
        ((p9n) getMBinding()).M.clearMap();
    }

    public final void createRouteStatusCodeHandler(@NotNull CreateRouteViewModel.StatusCodes statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        FitnessLogUtils.i(TAG, "createRouteStatusCodeHandler " + statusCode);
        switch (WhenMappings.$EnumSwitchMapping$0[statusCode.ordinal()]) {
            case 1:
                Calendar calendar = Calendar.getInstance();
                calendar.add(6, 1);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                String str = new SimpleDateFormat(getString(c1j.P3), Locale.getDefault()).format(calendar.getTime());
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                showHintText$default(this, str, 0, 2, null);
                break;
            case 2:
                String string = getString(c1j.Y0);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                showHintText$default(this, string, 0, 2, null);
                break;
            case 3:
                String string2 = getString(c1j.h3);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                showHintText$default(this, string2, 0, 2, null);
                break;
            case 4:
                String string3 = getString(c1j.J0);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                showHintText$default(this, string3, 0, 2, null);
                break;
            case 5:
                String string4 = getString(c1j.w0);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                showHintText$default(this, string4, 0, 2, null);
                break;
            case 6:
                String string5 = getString(c1j.m5);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                showHintText$default(this, string5, 0, 2, null);
                startLoading();
                break;
            case 7:
                String string6 = getString(c1j.Q4);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                showHintText$default(this, string6, 0, 2, null);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void drawMap(@NotNull List<CommonTrackData> data, int paddingLeft, int paddingRight, int paddingTop, int paddingBottom, float rotateAngle) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.isEmpty()) {
            return;
        }
        clearMap();
        List<List<LatLng>> listConvertCommonTrackToLatLngs = RouteDetailExtKt.convertCommonTrackToLatLngs(data);
        AMap map = ((p9n) getMBinding()).M.getMMapView().getMap();
        Intrinsics.checkNotNullExpressionValue(map, "getMap(...)");
        ((p9n) getMBinding()).M.setMapLineData(RouteDetailExtKt.moveToPathAreaAndDrawTrace(map, listConvertCommonTrackToLatLngs, paddingLeft, paddingRight, paddingTop, paddingBottom, Float.valueOf(rotateAngle)));
    }

    public final void drawRoute(@Nullable List<CommonTrackData> routeList, @Nullable Float rotateAngle) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C30271(routeList, rotateAngle, null), 3, null);
    }

    @Nullable
    public final AnimatorSet getAnimatorSet() {
        return this.animatorSet;
    }

    @NotNull
    public final CreateRouteMidCompressionBottomSheetBehavior getBehavior() {
        return (CreateRouteMidCompressionBottomSheetBehavior) this.behavior.getValue();
    }

    @NotNull
    public final View getBottomSheetContentView() {
        View view = this.bottomSheetContentView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bottomSheetContentView");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final p9n getCreateRouteActivityBinding() {
        return (p9n) getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final CreateRouteViewModel getCreateRouteViewModel() {
        return (CreateRouteViewModel) getMViewModel();
    }

    public final int getCurExceptionState() {
        return this.curExceptionState;
    }

    @NotNull
    public final String getCurrentCity() {
        return this.currentCity;
    }

    @Nullable
    public final CameraPosition getLastCameraPosition() {
        return this.lastCameraPosition;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.J;
    }

    public final int getNavigationBarHeight() {
        return this.navigationBarHeight;
    }

    public final int getRootDpi() {
        return this.rootDpi;
    }

    public final int getRootHeight() {
        return this.rootHeight;
    }

    public final int getRootMaxLength() {
        return this.rootMaxLength;
    }

    public final int getRootWidth() {
        return this.rootWidth;
    }

    public final int getRouteImageRowWidth() {
        return this.routeImageRowWidth;
    }

    public final int getStatusBarHeight() {
        return this.statusBarHeight;
    }

    public final int getStyleFragmentIndex() {
        return this.styleFragmentIndex;
    }

    @NotNull
    public final Map<Integer, FilterSortView.TabView> getTabViewMap() {
        return this.tabViewMap;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    public final int getViewTopOnScreen(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hideKeyboard() {
        Object systemService = getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(((p9n) getMBinding()).P.getWindowToken(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initStyleTitleBar() {
        ListExtKt.add(this.mTabTitleList, getString(c1j.n4));
        ListExtKt.add(this.mTabTitleList, getString(c1j.o4));
        ((p9n) getMBinding()).S.l(getString(c1j.p4));
        addChildTab();
    }

    public final boolean isFragmentAttached(int resId) {
        return getSupportFragmentManager().k0(resId) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.route.Hilt_CreateRouteActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((p9n) getMBinding()).M.onCreate(savedInstanceState);
        initData();
        initTitles();
        initViews();
        abnormalCheck();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.route.Hilt_CreateRouteActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((p9n) getMBinding()).M.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        ((p9n) getMBinding()).M.onLowMemory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((p9n) getMBinding()).M.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == Math.abs(-2)) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                return;
            }
            SystemSetting.INSTANCE.goToSetting(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((p9n) getMBinding()).M.onResume();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        ((p9n) getMBinding()).M.onSaveInstanceState(outState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void parseCameraPosition(@NotNull CameraPosition cameraPosition) {
        Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
        LinearLayoutCompat curLocationLayout = ((p9n) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(curLocationLayout, "curLocationLayout");
        if (ExtUtilsKt.isVisible(curLocationLayout)) {
            LatLng latLng = cameraPosition.target;
            final double d = latLng.latitude;
            final double d2 = latLng.longitude;
            GeoUtils.INSTANCE.getAddressByAmap(this, d, d2, new Function1() { // from class: l15
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CreateRouteActivity.parseCameraPosition$lambda$3(this.f24500a, d, d2, (AddressInfo) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void performLocationIconAnimation(long startDelayTime, long firstDuration, long secondDuration, long textDUration) {
        PathInterpolator pathInterpolator = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((p9n) getMBinding()).I, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, 0.0f, -ExtUtilsKt.getDp(15));
        objectAnimatorOfFloat.setDuration(firstDuration);
        objectAnimatorOfFloat.setStartDelay(startDelayTime);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(((p9n) getMBinding()).H, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, 0.0f, -ExtUtilsKt.getDp(15));
        objectAnimatorOfFloat2.setDuration(firstDuration);
        objectAnimatorOfFloat2.setStartDelay(startDelayTime);
        objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(ExtUtilsKt.getDp(9), ExtUtilsKt.getDp(7));
        valueAnimatorOfInt.setDuration(firstDuration);
        valueAnimatorOfInt.setStartDelay(startDelayTime);
        valueAnimatorOfInt.setInterpolator(pathInterpolator);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m15
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CreateRouteActivity.performLocationIconAnimation$lambda$7$lambda$6(this.f25641a, valueAnimator);
            }
        });
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(((p9n) getMBinding()).I, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, -ExtUtilsKt.getDp(15), 0.0f);
        objectAnimatorOfFloat3.setDuration(secondDuration);
        long j = startDelayTime + firstDuration;
        objectAnimatorOfFloat3.setStartDelay(j);
        objectAnimatorOfFloat3.setInterpolator(pathInterpolator);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(((p9n) getMBinding()).H, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, -ExtUtilsKt.getDp(15), 0.0f);
        objectAnimatorOfFloat4.setDuration(secondDuration);
        objectAnimatorOfFloat4.setStartDelay(j);
        objectAnimatorOfFloat4.setInterpolator(pathInterpolator);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(ExtUtilsKt.getDp(7), ExtUtilsKt.getDp(9));
        valueAnimatorOfInt2.setDuration(secondDuration);
        valueAnimatorOfInt2.setStartDelay(j);
        valueAnimatorOfInt2.setInterpolator(pathInterpolator);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: n15
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CreateRouteActivity.performLocationIconAnimation$lambda$11$lambda$10(this.f27432a, valueAnimator);
            }
        });
        TextView curLocationName = ((p9n) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(curLocationName, "curLocationName");
        final CardView curLocationNameCardView = ((p9n) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(curLocationNameCardView, "curLocationNameCardView");
        float fMeasureText = curLocationName.getPaint().measureText(curLocationName.getText().toString()) + curLocationName.getPaddingStart() + curLocationName.getPaddingEnd();
        Drawable drawable = curLocationName.getCompoundDrawables()[0];
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        Drawable drawable2 = curLocationName.getCompoundDrawables()[2];
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(1, (int) (fMeasureText + intrinsicWidth + (drawable2 != null ? drawable2.getIntrinsicWidth() : 0) + curLocationName.getCompoundDrawablePadding() + curLocationNameCardView.getPaddingStart() + curLocationNameCardView.getPaddingEnd()));
        valueAnimatorOfInt3.setDuration(textDUration);
        long j2 = j + secondDuration;
        valueAnimatorOfInt3.setStartDelay(j2);
        valueAnimatorOfInt3.setInterpolator(pathInterpolator);
        valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o15
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CreateRouteActivity.performLocationIconAnimation$lambda$13$lambda$12(curLocationNameCardView, valueAnimator);
            }
        });
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(((p9n) getMBinding()).E, SleepAnalyzerAlpha.NAME_ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat5.setDuration(textDUration);
        objectAnimatorOfFloat5.setStartDelay(j2);
        objectAnimatorOfFloat5.setInterpolator(pathInterpolator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorOfInt, objectAnimatorOfFloat3, objectAnimatorOfFloat4, valueAnimatorOfInt2, valueAnimatorOfInt3, objectAnimatorOfFloat5);
        this.animatorSet = animatorSet;
        animatorSet.start();
    }

    public final void replaceBottomSheetFragment(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        clearMap();
        hideKeyboard();
        getCreateRouteViewModel().setCurrentFragment(fragment);
    }

    public final void replaceWithWait(@Nullable Fragment nextFragment, @Nullable Flow<?> dataFlow, @NotNull Function1<? super Continuation<? super CreateRouteViewModel.StatusCodes>, ? extends Object> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C30321(dataFlow, request, nextFragment, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void resizeRouteImage(final boolean smallWindow) {
        ((p9n) getMBinding()).O.post(new Runnable() { // from class: d15
            @Override // java.lang.Runnable
            public final void run() {
                CreateRouteActivity.resizeRouteImage$lambda$36(this.f14949a, smallWindow);
            }
        });
    }

    public final void setAnimatorSet(@Nullable AnimatorSet animatorSet) {
        this.animatorSet = animatorSet;
    }

    public final void setBackPressedFragment(@NotNull Fragment fragment, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(action, "action");
        getOnBackPressedDispatcher().b(fragment.getViewLifecycleOwner(), new p7h() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteActivity.setBackPressedFragment.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // defpackage.p7h
            public void handleOnBackPressed() {
                action.invoke();
            }
        });
    }

    public final void setBottomSheetContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.bottomSheetContentView = view;
    }

    public final void setCurExceptionState(int i) {
        this.curExceptionState = i;
    }

    public final void setCurrentCity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentCity = str;
    }

    public final void setDefaultBehavior(@NotNull View rootView, int midMinHeight, boolean behaviorIsDraggable, boolean behaviorIsHidable) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        CreateRouteMidCompressionBottomSheetBehavior behavior = getBehavior();
        behavior.setHideable(behaviorIsHidable);
        behavior.setState(3);
        behavior.setMinMidContentViewHeight(midMinHeight);
        behavior.setDraggable(behaviorIsDraggable);
    }

    public final void setLastCameraPosition(@Nullable CameraPosition cameraPosition) {
        this.lastCameraPosition = cameraPosition;
    }

    public final void setNavigationBarHeight(int i) {
        this.navigationBarHeight = i;
    }

    public final void setRootDpi(int i) {
        this.rootDpi = i;
    }

    public final void setRootHeight(int i) {
        this.rootHeight = i;
    }

    public final void setRootMaxLength(int i) {
        this.rootMaxLength = i;
    }

    public final void setRootWidth(int i) {
        this.rootWidth = i;
    }

    public final void setRouteImageRowWidth(int i) {
        this.routeImageRowWidth = i;
    }

    public final void setStatusBarHeight(int i) {
        this.statusBarHeight = i;
    }

    public final void setStyleFragmentIndex(int i) {
        this.styleFragmentIndex = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showEmptyMapGuide() {
        SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
        Logger.i(TAG, "showEmptyMapGuide preferences:" + sportManagerExportPreference.getKEY_CREATE_ROUTE_EMPTY_MAP_GUIDE());
        if (sportManagerExportPreference.getKEY_CREATE_ROUTE_EMPTY_MAP_GUIDE()) {
            return;
        }
        ((p9n) getMBinding()).O.postDelayed(new Runnable() { // from class: q15
            @Override // java.lang.Runnable
            public final void run() {
                CreateRouteActivity.showEmptyMapGuide$lambda$35(this.f30978a);
            }
        }, 500L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showHintText(@NotNull String text, int duration) {
        Intrinsics.checkNotNullParameter(text, "text");
        ViewUiUtils viewUiUtils = ViewUiUtils.INSTANCE;
        CoordinatorLayout rootView = ((p9n) getMBinding()).N;
        Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
        ViewUiUtils.showSnackbarToast$default(viewUiUtils, rootView, text, duration, null, 0, 0.0f, 0, 0, 0, Integer.valueOf(eoi.l0), 0, 0, 0, 0, 0, Integer.valueOf(aki.A), 0, null, null, 245500, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startLoading() {
        ((CreateRouteViewModel) getMViewModel()).startLoading();
    }

    public final void switchTab() {
        int i = this.styleFragmentIndex;
        if (i == 1) {
            replaceBottomSheetFragment(new CreateRouteEmptyMapFragment());
        } else if (i == 0) {
            replaceBottomSheetFragment(new CreateRouteConfirmRouteFragment(RouteSceneType.RouteSceneTypeStyle));
        }
    }

    public final void transactionRemoveFragment(int resId) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C30371(resId, null), 3, null);
    }

    public final void transactionReplaceFragment(int resId, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C30381(resId, fragment, null), 3, null);
    }
}
