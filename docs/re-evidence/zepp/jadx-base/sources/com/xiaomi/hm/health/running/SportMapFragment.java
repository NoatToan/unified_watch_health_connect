package com.xiaomi.hm.health.running;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.ad.AdRepository;
import com.huami.ad.db.AdProvider;
import com.huami.ad.web.AdAPI;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.device.RealtimeHeartRateDevice;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.lib.v2.SportMapPermissionManager;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.mifit.sportlib.locate.GPSSignal;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.observer.IServiceSportObserver;
import com.huami.mifit.sportlib.services.GPSServiceConn;
import com.huami.mifit.sportlib.services.IGPSServiceConn;
import com.huami.moving.maps.IInfoWindow;
import com.huami.moving.maps.IMapFragmentDelegate;
import com.huami.moving.maps.IMarker;
import com.huami.moving.maps.OnInfoWindowClickListener;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.utils.SportUIKeeper;
import com.huami.moving.ui.view.GpsSignalView;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.data.BoltSportState;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.running.RunningActivity;
import com.huami.treadmill.ui.running.StartupActivity;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.treadmill.ui.tdmillhome.TdmillHmViewModel;
import com.huami.watch.companion.dataflow.Constant;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.MozartDevice;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController;
import com.xiaomi.hm.health.databases.model.AdEntity;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.eventbus.EventAppInBackground;
import com.xiaomi.hm.health.fragment.SportView;
import com.xiaomi.hm.health.heartrate.HeartRateCenter;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.running.SportMapFragment;
import com.xiaomi.hm.health.running.event.EventSportTypeSwitched;
import com.xiaomi.hm.health.ui.SetTemperatureActivity;
import com.xiaomi.hm.health.ui.sportdevice.SportSpecifiedTypeOpenDeviceActivity;
import com.xiaomi.hm.health.ui.sportdevice.utils.SportOpenDeviceUtil;
import com.xiaomi.hm.health.ui.sportfitness.fragment.ExerciseSettingFragment;
import com.xiaomi.hm.health.ui.sportfitness.manager.SportDeviceManager;
import com.xiaomi.hm.health.ui.sportfitness.utils.SportStartDelegate;
import com.xiaomi.hm.health.ui.sportfitness.view.SportDeviceView;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import defpackage.u6;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 Ê\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004Ê\u0001^cB\t¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0014\u0010\u000f\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0014\u0010\u0012\u001a\u00020\u0006*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u0004H\u0002J\b\u0010 \u001a\u00020\u0004H\u0002J\b\u0010!\u001a\u00020\u0004H\u0002J\b\u0010\"\u001a\u00020\u0006H\u0002J\b\u0010#\u001a\u00020\u0004H\u0002J\b\u0010$\u001a\u00020\u0004H\u0002J\b\u0010%\u001a\u00020\u0004H\u0002J\b\u0010&\u001a\u00020\u0004H\u0002J\b\u0010'\u001a\u00020\u0004H\u0002J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020\u0004H\u0002J\b\u0010,\u001a\u00020\u0004H\u0002J\b\u0010-\u001a\u00020\u0004H\u0002J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0015H\u0002J\b\u00100\u001a\u00020\u0004H\u0002J\u0018\u00104\u001a\u00020\u00042\u000e\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101H\u0002J\u0018\u00107\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u0006H\u0002J\u0010\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0002J\b\u0010;\u001a\u00020\u0004H\u0002J\b\u0010<\u001a\u00020\u0006H\u0002J\b\u0010=\u001a\u00020\u0006H\u0002J\u0010\u0010>\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0015H\u0016J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016J\u0012\u0010D\u001a\u00020\u00042\b\u0010C\u001a\u0004\u0018\u00010BH\u0016J&\u0010I\u001a\u0004\u0018\u00010\u001c2\u0006\u0010F\u001a\u00020E2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016J\u0012\u0010J\u001a\u00020\u00042\b\u0010C\u001a\u0004\u0018\u00010BH\u0016J\u001a\u0010K\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016J\u0010\u0010M\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0006H\u0016J\b\u0010N\u001a\u00020\u0004H\u0016J\b\u0010O\u001a\u00020\u0004H\u0016J\b\u0010P\u001a\u00020\u0004H\u0016J\u000e\u0010S\u001a\b\u0012\u0004\u0012\u00020R0QH\u0016J\b\u0010T\u001a\u00020\u0006H\u0016J\b\u0010U\u001a\u00020\u0006H\u0016J\b\u0010V\u001a\u00020\u0015H\u0016J\b\u0010W\u001a\u00020\u0006H\u0016J\b\u0010X\u001a\u00020\u0006H\u0016J\u000e\u0010[\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020YJ\u000e\u0010[\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\\R\u001d\u0010b\u001a\u00020]8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\"\u00105\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0018\u0010k\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010p\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010mR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001d\u0010y\u001a\u00020u8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010_\u001a\u0004\bw\u0010xR\u0016\u0010}\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b{\u0010|R \u0010\u0081\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0083\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010jR\u0018\u0010\u0085\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010dR\u0018\u0010\u0087\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010dR#\u0010\u008b\u0001\u001a\u0004\u0018\u0001088B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010_\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0096\u0001R(\u0010\u009f\u0001\u001a\t0\u009a\u0001¢\u0006\u0003\b\u009b\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009c\u0001\u0010_\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R \u0010£\u0001\u001a\t\u0012\u0005\u0012\u00030 \u0001018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010V\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010dR\u001b\u0010¥\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010¤\u0001R\u001b\u0010¦\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b=\u0010¤\u0001R\u001c\u0010¨\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¤\u0001R\u001b\u0010«\u0001\u001a\u0005\u0018\u00010©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b+\u0010ª\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010dR\u0018\u0010¬\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010mR\u0017\u0010\u00ad\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010mR\"\u0010±\u0001\u001a\u00030®\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009d\u0001\u0010_\u001a\u0006\b¯\u0001\u0010°\u0001R\u001c\u0010µ\u0001\u001a\u0005\u0018\u00010²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0019\u0010¸\u0001\u001a\u00030¶\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b`\u0010·\u0001R\u0018\u0010¹\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¯\u0001\u0010mR\u001b\u0010¼\u0001\u001a\u0005\u0018\u00010º\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010»\u0001R\u001c\u0010À\u0001\u001a\u0005\u0018\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001a\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0017\u0010Ã\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010mR\"\u0010Ç\u0001\u001a\u00030Ä\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÅ\u0001\u0010_\u001a\u0006\b³\u0001\u0010Æ\u0001¨\u0006Ë\u0001"}, d2 = {"Lcom/xiaomi/hm/health/running/SportMapFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/xiaomi/hm/health/ui/sportfitness/view/SportDeviceView$DeviceDataSource;", "Lcom/xiaomi/hm/health/fragment/SportView;", "", "a0", "", "o0", "n0", "b0", "force", "Y", "r0", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "K", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "L", "y0", "p0", "", "lastCheckedId", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "f0", "W", ExifInterface.LATITUDE_SOUTH, "X", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", "Q", "V", "q0", "M", "u", "U", "F", "z0", "d0", "Lcom/huami/mifit/sportlib/model/GPSPoint;", "gpsPoint", ExifInterface.GPS_DIRECTION_TRUE, "x", "e0", "s0", FirebaseAnalytics.Param.LEVEL, "R", "t0", "", "Lcom/xiaomi/hm/health/databases/model/AdEntity;", "it", "x0", "sportType", "startIcon", "t", "", "msg", "m0", "j0", "g0", "v", "showSportType", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "onActivityCreated", "onViewCreated", "isVisibleToUser", "setUserVisibleHint", "onDestroyView", "onResume", "onPause", "", "Lcom/xiaomi/hm/health/ui/sportfitness/view/SportDeviceView$DeviceDataSource$DeviceInfo;", "availableDevices", "hasHeartRateDevice", "isHeartRateConnected", Constant.KEY_HR_VALUE, "hasHardwareDataDevice", "isHardwareDataConnected", "Lcom/xiaomi/hm/health/eventbus/EventAppInBackground;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "Lcom/huami/lib/v2/SportMapPermissionManager;", "a", "Lkotlin/Lazy;", LogUtil.D, "()Lcom/huami/lib/v2/SportMapPermissionManager;", "sportPermissionManager", "b", LogUtil.I, "getSportType", "()I", "setSportType", "(I)V", "c", "Ljava/lang/String;", "name", GoogleApiAvailabilityLight.a, "Z", "isFirstVisible", "e", "showDataAfterViewInited", "Lcom/huami/mifit/sportlib/services/GPSServiceConn;", "f", "Lcom/huami/mifit/sportlib/services/GPSServiceConn;", "gpsConn", "Lcom/xiaomi/hm/health/running/BoltEntranceViewModel;", "g", "y", "()Lcom/xiaomi/hm/health/running/BoltEntranceViewModel;", "boltEntranceViewModel", "Lcom/huami/treadmill/ui/tdmillhome/TdmillHmViewModel;", "h", "Lcom/huami/treadmill/ui/tdmillhome/TdmillHmViewModel;", "boltHomeViewModel", "Landroidx/lifecycle/Observer;", "i", "Landroidx/lifecycle/Observer;", "bindingObserver", z.j, "boltResourceUrl", hl.k, "drawableRes", "l", "drawableResOverSea", "m", "z", "()Ljava/lang/String;", "eventSportType", "Lio/reactivex/disposables/Disposable;", GoogleApiAvailabilityLight.b, "Lio/reactivex/disposables/Disposable;", "disposable", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "o", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/android/design/dialog/AlertDialogFragment;", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/huami/android/design/dialog/AlertDialogFragment;", "connectFailedDialog", DTransferConstants.SEARCH_KEY, "mBleAlertDialog", "Lcom/xiaomi/hm/health/ui/sportfitness/manager/SportDeviceManager;", "Lorg/jetbrains/annotations/NotNull;", "r", "B", "()Lcom/xiaomi/hm/health/ui/sportfitness/manager/SportDeviceManager;", "sportDeviceManager", "Lcom/xiaomi/hm/health/running/SportMapFragment$a;", SOAP.XMLNS, "Ljava/util/List;", "devices", "Lcom/xiaomi/hm/health/running/SportMapFragment$a;", "heartRateAnalysisDevice", "poseAnalysisDevice", "w", "effectAnalysisDevice", "Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController$IHeartRateCallback;", "Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController$IHeartRateCallback;", "heartRateCallback", TdmillHmFragment.ARG_IS_OVERSEA, "isGPSAvailable", "Lcom/xiaomi/hm/health/ui/sportfitness/utils/SportStartDelegate;", "E", "()Lcom/xiaomi/hm/health/ui/sportfitness/utils/SportStartDelegate;", "sportStartDelegate", "Lcom/huami/moving/maps/IMapFragmentDelegate$MapType;", "C", "Lcom/huami/moving/maps/IMapFragmentDelegate$MapType;", "mapType", "Lcom/huami/moving/maps/IMapFragmentDelegate;", "Lcom/huami/moving/maps/IMapFragmentDelegate;", "mapFragmentDelegate", "mapFragmentDelegateInit", "Lcom/xiaomi/hm/health/running/SportMapFragment$b;", "Lcom/xiaomi/hm/health/running/SportMapFragment$b;", "gpsInfoWindow", "Lcom/huami/moving/maps/IMarker;", "G", "Lcom/huami/moving/maps/IMarker;", "gpsMarker", "H", "Lcom/huami/mifit/sportlib/model/GPSPoint;", "gpsStarted", "Lcom/huami/mifit/sportlib/observer/IServiceSportObserver;", "J", "()Lcom/huami/mifit/sportlib/observer/IServiceSportObserver;", "sportGpsObserver", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportMapFragment extends Fragment implements SportDeviceView.DeviceDataSource, SportView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String K = "SportMapFragment";
    private static final int L = 6;

    @NotNull
    private static final String M = "is_oversea";

    @NotNull
    private static final String N = "sport_type";
    private static final long O = 500;
    private static final int P = 20;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean isGPSAvailable;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportStartDelegate;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private IMapFragmentDelegate.MapType mapType;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private IMapFragmentDelegate mapFragmentDelegate;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean mapFragmentDelegateInit;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    private b gpsInfoWindow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private IMarker gpsMarker;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    private GPSPoint gpsPoint;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean gpsStarted;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportGpsObserver;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportPermissionManager = LazyKt__LazyJVMKt.lazy(q.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int sportType = 6;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isFirstVisible;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean showDataAfterViewInited;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private GPSServiceConn gpsConn;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy boltEntranceViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private TdmillHmViewModel boltHomeViewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Observer<Boolean> bindingObserver;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private String boltResourceUrl;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int drawableRes;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int drawableResOverSea;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy eventSportType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private Disposable disposable;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment connectFailedDialog;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment mBleAlertDialog;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportDeviceManager;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final List<a> devices;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int heartRate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    private a heartRateAnalysisDevice;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    private a poseAnalysisDevice;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    private a effectAnalysisDevice;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private HMHeartRateController.IHeartRateCallback heartRateCallback;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int lastCheckedId;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean isOversea;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/running/SportMapFragment$Companion;", "", "", TdmillHmFragment.ARG_IS_OVERSEA, "Lcom/xiaomi/hm/health/running/SportMapFragment;", "newInstance", "", "sportType", "", "name", "ARG_IS_OVERSEA", "Ljava/lang/String;", "ARG_SPORT_TYPE", "DEFAULT_SPORT_TYPE", LogUtil.I, "HEADSET_BATTERY_LOW_LEVEL", "", "SINGLE_CLICK_INTERVAL", "J", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SportMapFragment newInstance(boolean isOversea) {
            return newInstance(isOversea, 6, "type_6");
        }

        @JvmStatic
        @NotNull
        public final SportMapFragment newInstance(boolean isOversea, int sportType, @NotNull String name) {
            SportMapFragment sportMapFragment = new SportMapFragment();
            sportMapFragment.setUserVisibleHint(false);
            Bundle bundle = new Bundle();
            bundle.putBoolean(SportMapFragment.M, isOversea);
            bundle.putInt("sport_type", sportType);
            Unit unit = Unit.INSTANCE;
            sportMapFragment.setArguments(bundle);
            sportMapFragment.name = name;
            return sportMapFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"com/xiaomi/hm/health/running/SportMapFragment$a", "Lcom/xiaomi/hm/health/ui/sportfitness/view/SportDeviceView$DeviceDataSource$DeviceInfo;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "b", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a implements SportDeviceView.DeviceDataSource.DeviceInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final HMDeviceSource deviceSource;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final HMBaseDevice device;

        public a(@NotNull HMDeviceSource hMDeviceSource, @NotNull HMBaseDevice hMBaseDevice) {
            this.deviceSource = hMDeviceSource;
            this.device = hMBaseDevice;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final HMBaseDevice getDevice() {
            return this.device;
        }

        @Override // com.xiaomi.hm.health.ui.sportfitness.view.SportDeviceView.DeviceDataSource.DeviceInfo
        @NotNull
        /* JADX INFO: renamed from: deviceSource, reason: from getter */
        public HMDeviceSource getDeviceSource() {
            return this.deviceSource;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0013\u001a\n \u0011*\u0004\u0018\u00010\u00030\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0019"}, d2 = {"com/xiaomi/hm/health/running/SportMapFragment$b", "Lcom/huami/moving/maps/IInfoWindow;", "Lcom/huami/moving/maps/OnInfoWindowClickListener;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Lcom/huami/moving/maps/IMarker;", "marker", "", "onInfoWindowClick", "b", "", FirebaseAnalytics.Param.LEVEL, "c", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "requestLocationPermission", "kotlin.jvm.PlatformType", "Landroid/view/View;", "infoWindow", "clickAction", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class b implements IInfoWindow, OnInfoWindowClickListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Function0<Unit> requestLocationPermission;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final View infoWindow;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private Function0<Unit> clickAction;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                b.this.requestLocationPermission.invoke();
            }
        }

        public b(@NotNull Context context, @NotNull Function0<Unit> function0) {
            this.requestLocationPermission = function0;
            this.infoWindow = View.inflate(context, R.layout.gps_level_info_window, null);
        }

        public final void b() {
            this.clickAction = new a();
            View view = this.infoWindow;
            view.findViewById(R.id.gps_signal).setVisibility(8);
            TextView textView = (TextView) view.findViewById(R.id.gps_not_work_text);
            textView.setVisibility(0);
            textView.setText(R.string.gps_no_permission);
        }

        public final void c(int level) {
            this.clickAction = null;
            View view = this.infoWindow;
            view.setOnClickListener(null);
            view.findViewById(R.id.gps_not_work_text).setVisibility(8);
            GpsSignalView gpsSignalView = (GpsSignalView) view.findViewById(R.id.gps_signal);
            gpsSignalView.setVisibility(0);
            gpsSignalView.updateSignalLevel(level);
        }

        @Override // com.huami.moving.maps.OnInfoWindowClickListener
        public void onInfoWindowClick(@NotNull IMarker marker) {
            Function0<Unit> function0 = this.clickAction;
            if (function0 == null) {
                return;
            }
            function0.invoke();
        }

        @Override // com.huami.moving.maps.IInfoWindow
        @NotNull
        /* JADX INFO: renamed from: view, reason: from getter */
        public View getInfoWindow() {
            return this.infoWindow;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "destroyGpsConnect";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            int sportType = SportMapFragment.this.getSportType();
            if (sportType == 1) {
                return "run";
            }
            if (sportType == 6) {
                return "walk";
            }
            if (sportType == 8) {
                return "run";
            }
            if (sportType != 9) {
                return null;
            }
            return "ride";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<View, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            SportMapFragment.this.Q();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<View, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            if (SportMapFragment.this.v()) {
                return;
            }
            SportMapFragment.this.V();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<View, Unit> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            SportMapFragment.this.U();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00072\u0006\u0010\u0001\u001a\u00020\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00050\u0002H\n"}, d2 = {"Landroid/view/View;", "v", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "l", "Lrx/Subscription;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function2<View, Function1<? super View, ? extends Unit>, Subscription> {
        public static final h a = new h();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "";
            }
        }

        public h() {
            super(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(View view, Long l) {
            view.setClickable(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(Throwable th) {
            HMLog.warn$default(null, th, a.a, 1, null);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Subscription invoke(@NotNull final View view, @NotNull Function1<? super View, Unit> function1) {
            view.setClickable(false);
            function1.invoke(view);
            return Observable.timer(500L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: com.xiaomi.hm.health.running.a
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    SportMapFragment.h.e(view, (Long) obj);
                }
            }, new Action1() { // from class: com.xiaomi.hm.health.running.b
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    SportMapFragment.h.f((Throwable) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onActivityCreated " + SportMapFragment.this.getSportType();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Unit> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ EventAppInBackground a;
        public final /* synthetic */ SportMapFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(EventAppInBackground eventAppInBackground, SportMapFragment sportMapFragment) {
            super(0);
            this.a = eventAppInBackground;
            this.b = sportMapFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "EventAppInBackground :" + this.a.isInBackground + ",v:" + this.b.getUserVisibleHint() + ", in:" + GPSDataController.getInstance().isRunning();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "map " + SportMapFragment.this.getSportType() + " onResume visible :" + SportMapFragment.this.getUserVisibleHint();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "map " + SportMapFragment.this.getSportType() + " onVisible :" + SportMapFragment.this.isFirstVisible;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Skip refreshDevices: isResumed-" + SportMapFragment.this.isResumed() + ", userVisibleHint-" + SportMapFragment.this.getUserVisibleHint() + ", isTreadmillRunning-" + SportMapFragment.this.M();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "map " + SportMapFragment.this.getSportType() + " setUserVisibleHint visible :" + SportMapFragment.this.getUserVisibleHint() + ", resume = " + SportMapFragment.this.isResumed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/manager/SportDeviceManager;", "Lorg/jetbrains/annotations/NotNull;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<SportDeviceManager> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportDeviceManager invoke() {
            return SportDeviceManager.getInstance(SportMapFragment.this.requireActivity());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/lib/v2/SportMapPermissionManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<SportMapPermissionManager> {
        public static final q a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportMapPermissionManager invoke() {
            return new SportMapPermissionManager();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startObserveDeviceData " + SportMapFragment.this.name;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(a aVar) {
            super(0);
            this.a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startRealtimeMeasureHr " + this.a.getDeviceSource();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(a aVar) {
            super(0);
            this.a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "stopRealtimeMeasureHr " + this.a.getDeviceSource();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public static final u a = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "tryStartGpsConnect";
        }
    }

    public SportMapFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.xiaomi.hm.health.running.SportMapFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }
        };
        this.boltEntranceViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BoltEntranceViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.running.SportMapFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return ((ViewModelStoreOwner) function0.invoke()).getViewModelStore();
            }
        }, null);
        this.boltResourceUrl = "";
        this.drawableRes = R.drawable.ic_sport_treadmill_bg_unbinding;
        this.drawableResOverSea = R.drawable.ic_sport_treadmill_oversea_bg_unbinding;
        this.eventSportType = LazyKt__LazyJVMKt.lazy(new d());
        this.sportDeviceManager = LazyKt__LazyJVMKt.lazy(new p());
        this.devices = new ArrayList();
        this.lastCheckedId = -1;
        this.sportStartDelegate = LazyKt__LazyJVMKt.lazy(new Function0<SportStartDelegate>() { // from class: com.xiaomi.hm.health.running.SportMapFragment$sportStartDelegate$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SportStartDelegate invoke() {
                final SportMapFragment sportMapFragment = this.a;
                return new SportStartDelegate(sportMapFragment, new SportStartDelegate.Action() { // from class: com.xiaomi.hm.health.running.SportMapFragment$sportStartDelegate$2.1
                    @Override // com.xiaomi.hm.health.ui.sportfitness.utils.SportStartDelegate.Action
                    public int gpsSignalLevel() {
                        GPSServiceConn gPSServiceConn = sportMapFragment.gpsConn;
                        Integer numValueOf = gPSServiceConn == null ? null : Integer.valueOf(gPSServiceConn.getGPSSignalLevel());
                        return numValueOf == null ? GPSSignal.SignalLevel.DEFAULT.getValue() : numValueOf.intValue();
                    }

                    @Override // com.xiaomi.hm.health.ui.sportfitness.utils.SportStartDelegate.Action
                    public boolean isGPSAvailable() {
                        return sportMapFragment.isGPSAvailable;
                    }

                    @Override // com.xiaomi.hm.health.ui.sportfitness.utils.SportStartDelegate.Action
                    public void onRequestLocationPermission() {
                        sportMapFragment.D().requestLocationPermission(sportMapFragment.requireActivity());
                    }

                    @Override // com.xiaomi.hm.health.ui.sportfitness.utils.SportStartDelegate.Action
                    public void registerGpsObserver(@NotNull IServiceSportObserver observer) {
                        GPSServiceConn gPSServiceConn = sportMapFragment.gpsConn;
                        if (gPSServiceConn == null) {
                            return;
                        }
                        gPSServiceConn.registerSportObserver(observer);
                    }

                    @Override // com.xiaomi.hm.health.ui.sportfitness.utils.SportStartDelegate.Action
                    public void unRegisterGpsObserver(@NotNull IServiceSportObserver observer) {
                        GPSServiceConn gPSServiceConn = sportMapFragment.gpsConn;
                        if (gPSServiceConn == null) {
                            return;
                        }
                        gPSServiceConn.unregisterSportObserver(observer);
                    }
                });
            }
        });
        this.sportGpsObserver = LazyKt__LazyJVMKt.lazy(new Function0<SportMapFragment$sportGpsObserver$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.running.SportMapFragment$sportGpsObserver$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.hm.health.running.SportMapFragment$sportGpsObserver$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 invoke() {
                final SportMapFragment sportMapFragment = this.a;
                return new IServiceSportObserver() { // from class: com.xiaomi.hm.health.running.SportMapFragment$sportGpsObserver$2.1
                    @Override // com.huami.mifit.sportlib.observer.IServiceSportObserver
                    public void onDeviceStatusChanged(boolean isBand, boolean connect) {
                    }

                    @Override // com.huami.mifit.sportlib.observer.IServiceSportObserver
                    public void onGPSSignalChanged(int level) {
                        sportMapFragment.R(level);
                    }

                    @Override // com.huami.mifit.sportlib.observer.IServiceSportObserver
                    public void onInaccuracyLocationChanged(@NotNull GPSPoint gpsPoint) {
                        sportMapFragment.T(gpsPoint);
                    }

                    @Override // com.huami.mifit.sportlib.observer.IServiceSportObserver
                    public void onScreenStatusChanged(@Nullable String action, @Nullable String lastAction) {
                    }
                };
            }
        });
    }

    private final int A(int lastCheckedId) {
        switch (lastCheckedId) {
            case R.id.sport_map_radio_indoor_run_btn /* 2131367818 */:
                return 8;
            case R.id.sport_map_radio_outdoor_run_btn /* 2131367819 */:
            default:
                return 1;
            case R.id.sport_map_radio_treadmill_btn /* 2131367820 */:
                return 25;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List A0() {
        return AdProvider.getHomePagesAdByType(AdAPI.TYPE_GPS_POINT);
    }

    private final SportDeviceManager B() {
        return (SportDeviceManager) this.sportDeviceManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean B0(List list) {
        return Boolean.valueOf(list != null && list.size() > 0);
    }

    private final IServiceSportObserver C() {
        return (IServiceSportObserver) this.sportGpsObserver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(final SportMapFragment sportMapFragment, List list) {
        final AdEntity adEntity = (AdEntity) list.get(0);
        String imgUrl = adEntity.getImgUrl();
        if (imgUrl.length() > 0) {
            HMImageLoader.with(sportMapFragment.getContext()).load(imgUrl).asBitmap().into(new HMLoadTarget<Bitmap>() { // from class: com.xiaomi.hm.health.running.SportMapFragment$updateGpsMarkerIcon$3$1
                @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
                public void onLoadFailed(@NotNull Exception e2) {
                }

                @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
                public void onLoadFinish(@NotNull Bitmap resource) {
                    int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.size_45dp);
                    float width = resource.getWidth();
                    float height = resource.getHeight();
                    float f2 = dimensionPixelSize;
                    float f3 = width / f2;
                    float f4 = height / f2;
                    if (f3 <= f4) {
                        f3 = f4;
                    }
                    if (f3 > 1.0f) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(resource, (int) (width / f3), (int) (height / f3), false);
                        IMarker iMarker = this.a.gpsMarker;
                        if (iMarker != null) {
                            iMarker.updateIcon(bitmapCreateScaledBitmap);
                        }
                    } else {
                        IMarker iMarker2 = this.a.gpsMarker;
                        if (iMarker2 != null) {
                            iMarker2.updateIcon(resource);
                        }
                    }
                    SportMapFragment sportMapFragment2 = this.a;
                    sportMapFragment2.t(sportMapFragment2.getSportType(), false);
                    AdRepository adRepository = AdRepository.getInstance();
                    AdEntity adEntity2 = adEntity;
                    adRepository.requestMonitor(adEntity2.adMonitor, adEntity2.getId(), true);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SportMapPermissionManager D() {
        return (SportMapPermissionManager) this.sportPermissionManager.getValue();
    }

    private final SportStartDelegate E() {
        return (SportStartDelegate) this.sportStartDelegate.getValue();
    }

    private final void F() {
        IMapFragmentDelegate.MapType mapType = !E().checkUseGaodeMap() ? IMapFragmentDelegate.MapType.GOOGLE : IMapFragmentDelegate.MapType.GAO_DE;
        IMapFragmentDelegate.MapType mapType2 = this.mapType;
        if (mapType2 == null || mapType2 != mapType) {
            this.mapType = mapType;
            if (this.isOversea) {
                return;
            }
            t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Function2 function2, SportMapFragment sportMapFragment, View view) {
        function2.invoke(view, sportMapFragment.new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(Function2 function2, SportMapFragment sportMapFragment, View view) {
        function2.invoke(view, sportMapFragment.new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Function2 function2, SportMapFragment sportMapFragment, View view) {
        function2.invoke(view, sportMapFragment.new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J(SportMapFragment sportMapFragment, View view) {
        SetTemperatureActivity.INSTANCE.start(sportMapFragment.requireContext());
        return true;
    }

    private final boolean K(HMDeviceSource hMDeviceSource, HMDeviceSource hMDeviceSource2) {
        return hMDeviceSource == hMDeviceSource2;
    }

    private final boolean L(HMDeviceType hMDeviceType, HMDeviceType hMDeviceType2) {
        return hMDeviceType == hMDeviceType2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M() {
        BoltSportState sportState = ProxyTreadmill.INSTANCE.getInstance().getSportState();
        return sportState == BoltSportState.RUNNING || sportState == BoltSportState.PAUSED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(SportMapFragment sportMapFragment, RadioGroup radioGroup, int i2) {
        View view = sportMapFragment.getView();
        if (((RadioGroup) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.sport_map_radio))).findViewById(i2).isPressed()) {
            switch (i2) {
                case R.id.sport_map_radio_indoor_run_btn /* 2131367818 */:
                    View view2 = sportMapFragment.getView();
                    ((ImageView) (view2 == null ? null : view2.findViewById(com.xiaomi.hm.health.R.id.sport_map_bg))).setVisibility(0);
                    View view3 = sportMapFragment.getView();
                    ((ImageView) (view3 == null ? null : view3.findViewById(com.xiaomi.hm.health.R.id.sport_map_content))).setVisibility(8);
                    View view4 = sportMapFragment.getView();
                    ((ImageView) (view4 != null ? view4.findViewById(com.xiaomi.hm.health.R.id.sport_map_bg) : null)).setBackgroundResource(RainbowUtils.isDarkMode(sportMapFragment.getContext()) ? R.drawable.ic_sport_indoor_run_bg_dark : R.drawable.ic_sport_indoor_run_bg);
                    sportMapFragment.setSportType(8);
                    EventBus.getDefault().post(new EventSportTypeSwitched(sportMapFragment.A(sportMapFragment.lastCheckedId), sportMapFragment.getSportType()));
                    break;
                case R.id.sport_map_radio_outdoor_run_btn /* 2131367819 */:
                    View view5 = sportMapFragment.getView();
                    ((ImageView) (view5 == null ? null : view5.findViewById(com.xiaomi.hm.health.R.id.sport_map_content))).setVisibility(0);
                    View view6 = sportMapFragment.getView();
                    ((ImageView) (view6 != null ? view6.findViewById(com.xiaomi.hm.health.R.id.sport_map_bg) : null)).setVisibility(8);
                    sportMapFragment.setSportType(1);
                    EventBus.getDefault().post(new EventSportTypeSwitched(sportMapFragment.A(sportMapFragment.lastCheckedId), sportMapFragment.getSportType()));
                    break;
                case R.id.sport_map_radio_treadmill_btn /* 2131367820 */:
                    View view7 = sportMapFragment.getView();
                    ((ImageView) (view7 == null ? null : view7.findViewById(com.xiaomi.hm.health.R.id.sport_map_bg))).setVisibility(0);
                    View view8 = sportMapFragment.getView();
                    ((ImageView) (view8 != null ? view8.findViewById(com.xiaomi.hm.health.R.id.sport_map_content) : null)).setVisibility(8);
                    sportMapFragment.f0();
                    sportMapFragment.setSportType(25);
                    EventBus.getDefault().post(new EventSportTypeSwitched(sportMapFragment.A(sportMapFragment.lastCheckedId), sportMapFragment.getSportType()));
                    break;
            }
            sportMapFragment.Y(true);
        }
        sportMapFragment.lastCheckedId = i2;
        sportMapFragment.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(SportMapFragment sportMapFragment, Boolean bool) {
        if (bool.booleanValue()) {
            View view = sportMapFragment.getView();
            RadioButton radioButton = view != null ? (RadioButton) view.findViewById(R.id.sport_map_radio_treadmill_btn) : null;
            if (radioButton == null) {
                return;
            }
            radioButton.setVisibility(0);
            return;
        }
        if (sportMapFragment.getSportType() != 25) {
            View view2 = sportMapFragment.getView();
            RadioButton radioButton2 = view2 != null ? (RadioButton) view2.findViewById(R.id.sport_map_radio_treadmill_btn) : null;
            if (radioButton2 == null) {
                return;
            }
            radioButton2.setVisibility(8);
            return;
        }
        View view3 = sportMapFragment.getView();
        RadioButton radioButton3 = view3 == null ? null : (RadioButton) view3.findViewById(R.id.sport_map_radio_treadmill_btn);
        if (radioButton3 != null) {
            radioButton3.setVisibility(8);
        }
        View view4 = sportMapFragment.getView();
        ((RadioButton) (view4 != null ? view4.findViewById(com.xiaomi.hm.health.R.id.sport_map_radio_outdoor_run_btn) : null)).setSelected(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(SportMapFragment sportMapFragment, String str) {
        sportMapFragment.boltResourceUrl = str;
        if (sportMapFragment.getSportType() == 25) {
            sportMapFragment.f0();
        }
        View view = sportMapFragment.getView();
        ((RadioButton) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.sport_map_radio_outdoor_run_btn))).setSelected(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_HARDWARE_STATUS_CLICK));
        SportSpecifiedTypeOpenDeviceActivity.openSportSpecifiedTypeDeviceActivity(getActivity(), this.sportType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(int level) {
        if (this.mapFragmentDelegateInit) {
            b bVar = this.gpsInfoWindow;
            if (bVar != null) {
                bVar.c(level);
            }
            IMarker iMarker = this.gpsMarker;
            if (iMarker == null) {
                return;
            }
            iMarker.refreshInfoWindow();
        }
    }

    private final void S() {
        if (this.sportType != 25) {
            r0();
        }
        e0();
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(GPSPoint gpsPoint) {
        this.gpsPoint = gpsPoint;
        e0();
        if (!getUserVisibleHint()) {
            x();
            return;
        }
        if (this.mapFragmentDelegateInit) {
            Location locationCreateLocation = GPSPoint.createLocation(gpsPoint);
            IMapFragmentDelegate iMapFragmentDelegate = this.mapFragmentDelegate;
            Objects.requireNonNull(iMapFragmentDelegate);
            iMapFragmentDelegate.moveCamera(locationCreateLocation, IMapFragmentDelegate.ZoomLevel.DEFAULT);
            IMarker iMarker = this.gpsMarker;
            if (iMarker == null) {
                return;
            }
            iMarker.updateLocation(locationCreateLocation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U() {
        getChildFragmentManager().beginTransaction().add(ExerciseSettingFragment.newInstance(this.sportType, 0L), ExerciseSettingFragment.TAG).commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        if (this.sportType != 25) {
            u();
            GPSServiceConn gPSServiceConn = this.gpsConn;
            if (gPSServiceConn != null) {
                gPSServiceConn.changeSportType(this.sportType);
            }
            SportUIKeeper.setSelectSportType(getContext(), this.sportType);
            E().tryStartSport(this.sportType, this.isOversea);
            return;
        }
        if (g0()) {
            return;
        }
        RunningManager.setOrUpdateRunnerData();
        SportDeviceManager.getInstance(requireContext()).registerSportUsingDevice(25);
        ProxyTreadmill.Companion companion = ProxyTreadmill.INSTANCE;
        if (companion.getInstance().isConnectedBolt()) {
            q0();
        } else {
            companion.getInstance().connectBolt();
            m0(getString(R.string.td_connecting));
        }
    }

    private final void W() {
        HMLog.debug(K, new m());
        if (!this.isFirstVisible) {
            this.isFirstVisible = true;
            if (isResumed()) {
                F();
                a0();
            } else {
                this.showDataAfterViewInited = true;
            }
        }
        if (isResumed()) {
            X();
        }
    }

    private final void X() {
        d0();
        if (isResumed()) {
            Y(true);
        }
    }

    private final void Y(boolean force) {
        boolean z;
        if (((isResumed() && getUserVisibleHint()) || M()) ? false : true) {
            HMLog.info(K, new n());
            return;
        }
        List<HMDeviceSource> userOpenedBoundDevices = B().getUserOpenedBoundDevices(this.sportType);
        if (!force && userOpenedBoundDevices.size() == this.devices.size()) {
            int size = userOpenedBoundDevices.size() - 1;
            if (size >= 0) {
                int i2 = 0;
                z = true;
                while (true) {
                    int i3 = i2 + 1;
                    if (userOpenedBoundDevices.get(i2) != this.devices.get(i2).getDeviceSource()) {
                        z = false;
                    }
                    if (i3 > size) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            } else {
                z = true;
            }
            if (z) {
                return;
            }
        }
        if (!this.devices.isEmpty()) {
            r0();
            this.devices.clear();
        }
        if (userOpenedBoundDevices.isEmpty()) {
            y0();
            View view = getView();
            ((SportDeviceView) (view != null ? view.findViewById(com.xiaomi.hm.health.R.id.sport_map_device) : null)).notifyDataChanged();
            return;
        }
        for (HMDeviceSource hMDeviceSource : userOpenedBoundDevices) {
            HMBaseDevice hMBaseDeviceCreateDevice = HMDeviceManager.getInstance().createDevice(hMDeviceSource.getType());
            if (hMBaseDeviceCreateDevice != null) {
                this.devices.add(new a(hMDeviceSource, hMBaseDeviceCreateDevice));
            }
        }
        this.heartRate = 0;
        y0();
        p0();
        View view2 = getView();
        ((SportDeviceView) (view2 != null ? view2.findViewById(com.xiaomi.hm.health.R.id.sport_map_device) : null)).notifyDataChanged();
    }

    public static /* synthetic */ void Z(SportMapFragment sportMapFragment, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        sportMapFragment.Y(z);
    }

    private final void a0() {
        int i2;
        boolean zIsDarkMode = RainbowUtils.isDarkMode(getContext());
        int i3 = R.drawable.ic_sport_treadmill_bg_dark;
        if (zIsDarkMode) {
            this.drawableRes = R.drawable.ic_sport_treadmill_bg_dark;
            this.drawableResOverSea = R.drawable.ic_sport_treadmill_oversea_bg_dark;
        } else {
            this.drawableRes = R.drawable.ic_sport_treadmill_bg_unbinding;
            this.drawableResOverSea = R.drawable.ic_sport_treadmill_oversea_bg_unbinding;
        }
        if (GlobalConfig.get().isBuildMidong()) {
            if (this.sportType != 25) {
                FragmentActivity activity = getActivity();
                Object systemService = activity == null ? null : activity.getSystemService("window");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
                int i4 = displayMetrics.heightPixels;
                View view = getView();
                CardView cardView = (CardView) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.sport_map_card));
                View view2 = getView();
                ViewGroup.LayoutParams layoutParams = ((CardView) (view2 == null ? null : view2.findViewById(com.xiaomi.hm.health.R.id.sport_map_card))).getLayoutParams();
                layoutParams.height = i4 - ((((int) ViewUtils.dp2px(getContext(), 66.7f)) + ((int) ViewUtils.dp2px(getContext(), 42.0f))) + (-((int) ViewUtils.dp2px(getContext(), 30.0f))));
                Unit unit = Unit.INSTANCE;
                cardView.setLayoutParams(layoutParams);
            } else {
                View view3 = getView();
                CardView cardView2 = (CardView) (view3 == null ? null : view3.findViewById(com.xiaomi.hm.health.R.id.sport_map_card));
                View view4 = getView();
                ViewGroup.LayoutParams layoutParams2 = ((CardView) (view4 == null ? null : view4.findViewById(com.xiaomi.hm.health.R.id.sport_map_card))).getLayoutParams();
                layoutParams2.height = -2;
                Unit unit2 = Unit.INSTANCE;
                cardView2.setLayoutParams(layoutParams2);
            }
        }
        if (n0()) {
            HMLog.i(K, "ddd", new Object[0]);
            View view5 = getView();
            ((ImageView) (view5 == null ? null : view5.findViewById(com.xiaomi.hm.health.R.id.sport_map_bg))).setVisibility(8);
            View view6 = getView();
            ((ImageView) (view6 == null ? null : view6.findViewById(com.xiaomi.hm.health.R.id.sport_map_content))).setVisibility(0);
        } else {
            View view7 = getView();
            ((ImageView) (view7 == null ? null : view7.findViewById(com.xiaomi.hm.health.R.id.sport_map_bg))).setVisibility(0);
            View view8 = getView();
            ((ImageView) (view8 == null ? null : view8.findViewById(com.xiaomi.hm.health.R.id.sport_map_content))).setVisibility(8);
            int i5 = this.sportType;
            if (i5 == 8) {
                i3 = RainbowUtils.isDarkMode(getContext()) ? R.drawable.ic_sport_indoor_run_oversea_bg_dark : R.drawable.ic_sport_indoor_run_oversea_bg;
            } else if (i5 != 25) {
                i3 = RainbowUtils.isDarkMode(getContext()) ? R.drawable.ic_sport_indoor_run_bg_dark : R.drawable.ic_sport_indoor_run_bg;
            } else if (!RainbowUtils.isDarkMode(getContext())) {
                i3 = R.drawable.ic_sport_treadmill_bg;
            }
            if (this.sportType == 25) {
                f0();
            } else {
                View view9 = getView();
                ((ImageView) (view9 == null ? null : view9.findViewById(com.xiaomi.hm.health.R.id.sport_map_bg))).setBackgroundResource(i3);
            }
        }
        if (o0()) {
            View view10 = getView();
            ((RadioGroup) (view10 == null ? null : view10.findViewById(com.xiaomi.hm.health.R.id.sport_map_radio))).setVisibility(0);
            View view11 = getView();
            RadioGroup radioGroup = (RadioGroup) (view11 != null ? view11.findViewById(com.xiaomi.hm.health.R.id.sport_map_radio) : null);
            int i6 = this.sportType;
            if (i6 != 1) {
                i2 = i6 != 25 ? R.id.sport_map_radio_indoor_run_btn : R.id.sport_map_radio_treadmill_btn;
            } else {
                i2 = R.id.sport_map_radio_outdoor_run_btn;
            }
            radioGroup.check(i2);
        } else {
            View view12 = getView();
            ((RadioGroup) (view12 != null ? view12.findViewById(com.xiaomi.hm.health.R.id.sport_map_radio) : null)).setVisibility(8);
        }
        b0();
    }

    private final void b0() {
        int i2;
        int i3;
        int i4;
        int i5 = 8;
        if (25 != this.sportType) {
            View view = getView();
            ((ImageView) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.sport_map_start))).setVisibility(0);
            View view2 = getView();
            ViewGroup viewGroup = view2 == null ? null : (ViewGroup) view2.findViewById(R.id.amazfit_treadmill_title);
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            View view3 = getView();
            ((SportDeviceView) (view3 == null ? null : view3.findViewById(com.xiaomi.hm.health.R.id.sport_map_device))).setVisibility(0);
            View view4 = getView();
            ((ImageView) (view4 != null ? view4.findViewById(com.xiaomi.hm.health.R.id.sport_map_settings) : null)).setVisibility(0);
        } else {
            TdmillHmViewModel tdmillHmViewModel = this.boltHomeViewModel;
            Objects.requireNonNull(tdmillHmViewModel);
            Boolean value = tdmillHmViewModel.isBinding().getValue();
            if (value != null) {
                View view5 = getView();
                ImageView imageView = (ImageView) (view5 == null ? null : view5.findViewById(com.xiaomi.hm.health.R.id.sport_map_start));
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.areEqual(value, bool)) {
                    i2 = 0;
                } else {
                    if (!Intrinsics.areEqual(value, Boolean.FALSE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 8;
                }
                imageView.setVisibility(i2);
                View view6 = getView();
                ViewGroup viewGroup2 = view6 == null ? null : (ViewGroup) view6.findViewById(R.id.amazfit_treadmill_title);
                if (viewGroup2 != null) {
                    if (Intrinsics.areEqual(value, bool)) {
                        i4 = 8;
                    } else {
                        if (!Intrinsics.areEqual(value, Boolean.FALSE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i4 = 0;
                    }
                    viewGroup2.setVisibility(i4);
                }
                View view7 = getView();
                SportDeviceView sportDeviceView = (SportDeviceView) (view7 == null ? null : view7.findViewById(com.xiaomi.hm.health.R.id.sport_map_device));
                if (Intrinsics.areEqual(value, bool)) {
                    i3 = 0;
                } else {
                    if (!Intrinsics.areEqual(value, Boolean.FALSE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 8;
                }
                sportDeviceView.setVisibility(i3);
                View view8 = getView();
                ImageView imageView2 = (ImageView) (view8 != null ? view8.findViewById(com.xiaomi.hm.health.R.id.sport_map_settings) : null);
                if (Intrinsics.areEqual(value, bool)) {
                    i5 = 0;
                } else if (!Intrinsics.areEqual(value, Boolean.FALSE)) {
                    throw new NoWhenBranchMatchedException();
                }
                imageView2.setVisibility(i5);
            }
        }
        if (this.bindingObserver == null) {
            this.bindingObserver = new Observer() { // from class: xa7
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    SportMapFragment.c0(this.a, (Boolean) obj);
                }
            };
        }
        TdmillHmViewModel tdmillHmViewModel2 = this.boltHomeViewModel;
        Objects.requireNonNull(tdmillHmViewModel2);
        tdmillHmViewModel2.isBinding().observe(getViewLifecycleOwner(), this.bindingObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(SportMapFragment sportMapFragment, Boolean bool) {
        int i2;
        int i3;
        int i4;
        if (25 != sportMapFragment.getSportType()) {
            return;
        }
        View view = sportMapFragment.getView();
        ImageView imageView = (ImageView) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.sport_map_start));
        int i5 = 8;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            i2 = 0;
        } else {
            if (!Intrinsics.areEqual(bool, Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 8;
        }
        imageView.setVisibility(i2);
        View view2 = sportMapFragment.getView();
        ViewGroup viewGroup = view2 == null ? null : (ViewGroup) view2.findViewById(R.id.amazfit_treadmill_title);
        if (viewGroup != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (zBooleanValue) {
                i4 = 8;
            } else {
                if (zBooleanValue) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 = 0;
            }
            viewGroup.setVisibility(i4);
        }
        View view3 = sportMapFragment.getView();
        SportDeviceView sportDeviceView = (SportDeviceView) (view3 == null ? null : view3.findViewById(com.xiaomi.hm.health.R.id.sport_map_device));
        boolean zBooleanValue2 = bool.booleanValue();
        if (zBooleanValue2) {
            i3 = 0;
        } else {
            if (zBooleanValue2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 8;
        }
        sportDeviceView.setVisibility(i3);
        View view4 = sportMapFragment.getView();
        ImageView imageView2 = (ImageView) (view4 != null ? view4.findViewById(com.xiaomi.hm.health.R.id.sport_map_settings) : null);
        boolean zBooleanValue3 = bool.booleanValue();
        if (zBooleanValue3) {
            i5 = 0;
        } else if (zBooleanValue3) {
            throw new NoWhenBranchMatchedException();
        }
        imageView2.setVisibility(i5);
        if (bool.booleanValue()) {
            if (RainbowUtils.isDarkMode(sportMapFragment.getContext())) {
                sportMapFragment.drawableRes = R.drawable.ic_sport_treadmill_bg_dark;
                sportMapFragment.drawableResOverSea = R.drawable.ic_sport_treadmill_oversea_bg_dark;
                return;
            } else {
                sportMapFragment.drawableRes = R.drawable.ic_sport_treadmill_bg;
                sportMapFragment.drawableResOverSea = R.drawable.ic_sport_treadmill_oversea_bg;
                return;
            }
        }
        if (RainbowUtils.isDarkMode(sportMapFragment.getContext())) {
            sportMapFragment.drawableRes = R.drawable.ic_sport_treadmill_bg_dark;
            sportMapFragment.drawableResOverSea = R.drawable.ic_sport_treadmill_oversea_bg_dark;
        } else {
            sportMapFragment.drawableRes = R.drawable.ic_sport_treadmill_bg_unbinding;
            sportMapFragment.drawableResOverSea = R.drawable.ic_sport_treadmill_oversea_bg_unbinding;
        }
    }

    private final void d0() {
        if (!E().checkLocatePermissionForM()) {
            b bVar = this.gpsInfoWindow;
            if (bVar != null) {
                bVar.b();
            }
            IMarker iMarker = this.gpsMarker;
            if (iMarker == null) {
                return;
            }
            iMarker.refreshInfoWindow();
            return;
        }
        b bVar2 = this.gpsInfoWindow;
        if (bVar2 != null) {
            GPSServiceConn gPSServiceConn = this.gpsConn;
            Integer numValueOf = gPSServiceConn == null ? null : Integer.valueOf(gPSServiceConn.getGPSSignalLevel());
            bVar2.c(numValueOf == null ? GPSSignal.SignalLevel.DEFAULT.getValue() : numValueOf.intValue());
        }
        IMarker iMarker2 = this.gpsMarker;
        if (iMarker2 == null) {
            return;
        }
        iMarker2.refreshInfoWindow();
    }

    private final void e0() {
        GPSPoint gPSPoint = this.gpsPoint;
        if (gPSPoint == null) {
            return;
        }
        SportUIKeeper.saveLastLocationLatLng(getContext(), GPSPoint.createLocation(gPSPoint));
    }

    private final void f0() {
        String str = this.boltResourceUrl;
        View view = getView();
        ((ImageView) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.sport_map_bg))).setBackgroundResource(this.drawableResOverSea);
        HMImageLoader.with(getContext()).load(str).asDrawable().into(new HMLoadTarget<Drawable>() { // from class: com.xiaomi.hm.health.running.SportMapFragment$setBoltResource$1
            @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
            public void onLoadFailed(@NotNull Exception e2) {
                View view2 = this.a.getView();
                ((ImageView) (view2 == null ? null : view2.findViewById(com.xiaomi.hm.health.R.id.sport_map_bg))).setBackgroundResource(this.a.drawableResOverSea);
            }

            @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
            public void onLoadFinish(@NotNull Drawable resource) {
                View view2 = this.a.getView();
                ((ImageView) (view2 == null ? null : view2.findViewById(com.xiaomi.hm.health.R.id.sport_map_bg))).setBackground(resource);
            }
        });
    }

    private final boolean g0() {
        AlertDialogFragment alertDialogFragment;
        if (HMDeviceManager.getInstance().isBluetoothEnable()) {
            return false;
        }
        if (this.mBleAlertDialog == null) {
            this.mBleAlertDialog = new AlertDialogFragment.Builder(getContext()).setCancelable(true).setTitle(R.string.td_running_dialog_open_ble).setNegativeButton(getString(R.string.td_running_dialog_invoke_ble), new DialogInterface.OnClickListener() { // from class: fb7
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SportMapFragment.h0(this.a, dialogInterface, i2);
                }
            }).setPositiveButton(getString(R.string.td_running_dialog_quit_sport), new DialogInterface.OnClickListener() { // from class: hb7
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SportMapFragment.i0(dialogInterface, i2);
                }
            }).create();
        }
        AlertDialogFragment alertDialogFragment2 = this.mBleAlertDialog;
        if (!(alertDialogFragment2 == null ? null : Boolean.valueOf(alertDialogFragment2.isShowing())).booleanValue() && (alertDialogFragment = this.mBleAlertDialog) != null) {
            alertDialogFragment.show(getFragmentManager());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(SportMapFragment sportMapFragment, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        sportMapFragment.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private final void initView(View view) {
        if (RainbowUtils.isDarkMode(getContext())) {
            View view2 = getView();
            ((ImageView) (view2 == null ? null : view2.findViewById(com.xiaomi.hm.health.R.id.sport_map_content))).setImageResource(R.drawable.sport_map_default_dark);
        }
        final h hVar = h.a;
        View view3 = getView();
        ((SportDeviceView) (view3 == null ? null : view3.findViewById(com.xiaomi.hm.health.R.id.sport_map_device))).setDeviceDataSource(this);
        View view4 = getView();
        ((SportDeviceView) (view4 == null ? null : view4.findViewById(com.xiaomi.hm.health.R.id.sport_map_device))).setOnClickListener(new View.OnClickListener() { // from class: kb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                SportMapFragment.G(hVar, this, view5);
            }
        });
        View view5 = getView();
        ((ImageView) (view5 == null ? null : view5.findViewById(com.xiaomi.hm.health.R.id.sport_map_start))).setOnClickListener(new View.OnClickListener() { // from class: lb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                SportMapFragment.H(hVar, this, view6);
            }
        });
        View view6 = getView();
        ((ImageView) (view6 == null ? null : view6.findViewById(com.xiaomi.hm.health.R.id.sport_map_settings))).setOnClickListener(new View.OnClickListener() { // from class: jb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                SportMapFragment.I(hVar, this, view7);
            }
        });
        if (SetTemperatureActivity.INSTANCE.getCanTestTemperature()) {
            View view7 = getView();
            ((ImageView) (view7 != null ? view7.findViewById(com.xiaomi.hm.health.R.id.sport_map_start) : null)).setOnLongClickListener(new View.OnLongClickListener() { // from class: mb7
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view8) {
                    return SportMapFragment.J(this.a, view8);
                }
            });
        }
        if (this.showDataAfterViewInited) {
            F();
            a0();
            X();
        }
    }

    private final void j0() {
        AlertDialogFragment alertDialogFragment;
        if (this.connectFailedDialog == null) {
            this.connectFailedDialog = new AlertDialogFragment.Builder(getContext()).setCancelable(true).setTitle(R.string.td_bolt_connect_failed).setMessage(R.string.td_bolt_connect_failed_content).setNegativeButton(getString(R.string.td_exit), new DialogInterface.OnClickListener() { // from class: ib7
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SportMapFragment.k0(dialogInterface, i2);
                }
            }).setPositiveButton(getString(R.string.td_retry), new DialogInterface.OnClickListener() { // from class: va7
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SportMapFragment.l0(this.a, dialogInterface, i2);
                }
            }).create();
        }
        AlertDialogFragment alertDialogFragment2 = this.connectFailedDialog;
        if (!((alertDialogFragment2 == null || alertDialogFragment2.isShowing()) ? false : true) || (alertDialogFragment = this.connectFailedDialog) == null) {
            return;
        }
        alertDialogFragment.show(getFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(SportMapFragment sportMapFragment, DialogInterface dialogInterface, int i2) {
        ProxyTreadmill.INSTANCE.getInstance().connectBolt();
        sportMapFragment.m0(sportMapFragment.getString(R.string.td_connecting));
    }

    private final void m0(String msg) {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2;
        if (this.mLoadingDialog == null) {
            this.mLoadingDialog = LoadingDialog.showDialog(getContext());
        }
        LoadingDialog loadingDialog3 = this.mLoadingDialog;
        if (((loadingDialog3 == null || loadingDialog3.isShowing()) ? false : true) && (loadingDialog2 = this.mLoadingDialog) != null) {
            loadingDialog2.show();
        }
        LoadingDialog loadingDialog4 = this.mLoadingDialog;
        if (loadingDialog4 != null) {
            loadingDialog4.setCancelable(false);
        }
        if (TextUtils.isEmpty(msg) || (loadingDialog = this.mLoadingDialog) == null) {
            return;
        }
        loadingDialog.setMessage(msg);
    }

    private final boolean n0() {
        int i2 = this.sportType;
        return (i2 == 8 || i2 == 25) ? false : true;
    }

    @JvmStatic
    @NotNull
    public static final SportMapFragment newInstance(boolean z) {
        return INSTANCE.newInstance(z);
    }

    @JvmStatic
    @NotNull
    public static final SportMapFragment newInstance(boolean z, int i2, @NotNull String str) {
        return INSTANCE.newInstance(z, i2, str);
    }

    private final boolean o0() {
        int i2 = this.sportType;
        return i2 == 8 || i2 == 1 || i2 == 25;
    }

    private final void p0() {
        a aVar = this.heartRateAnalysisDevice;
        if (aVar == null) {
            return;
        }
        HMLog.debug(K, new r());
        if (aVar.getDevice() instanceof RealtimeHeartRateDevice) {
            HMLog.info(K, new s(aVar));
            this.heartRateCallback = new SportMapFragment$startObserveDeviceData$HeartRateCallback(this, aVar);
            if (aVar.getDevice().getDeviceType() == HMDeviceType.MILI) {
                HeartRateCenter.INSTANCE.startRealtimeHrForSpecialModule(K, this.heartRateCallback);
            } else {
                ((RealtimeHeartRateDevice) aVar.getDevice()).startRealtimeMeasureHr(this.heartRateCallback);
            }
        }
    }

    private final void q0() {
        if (M()) {
            RunningActivity.INSTANCE.startMe(requireContext(), true);
        } else {
            startActivity(new Intent(getContext(), (Class<?>) StartupActivity.class));
        }
    }

    private final void r0() {
        a aVar = this.heartRateAnalysisDevice;
        if (aVar != null && (aVar.getDevice() instanceof RealtimeHeartRateDevice)) {
            HMLog.info(K, new t(aVar));
            if (aVar.getDevice().getDeviceType() == HMDeviceType.MILI) {
                HeartRateCenter.INSTANCE.stopRealtimeHrForSpecialModule(K);
            } else {
                ((RealtimeHeartRateDevice) aVar.getDevice()).stopRealtimeMeasureHr();
            }
        }
    }

    private final void s0() {
        if (E().checkLocatePermissionForM()) {
            synchronized (Boolean.valueOf(this.gpsStarted)) {
                if (this.gpsStarted) {
                    return;
                }
                HMLog.info(K, u.a);
                R(GPSSignal.SignalLevel.DEFAULT.getValue());
                final GPSServiceConn gPSServiceConn = new GPSServiceConn(getActivity(), getSportType());
                this.gpsConn = gPSServiceConn;
                gPSServiceConn.registerSportObserver(C());
                gPSServiceConn.setServiceStateListener(new IGPSServiceConn.IServiceStateListener() { // from class: com.xiaomi.hm.health.running.SportMapFragment$tryStartGpsConnect$1$2$1
                    @Override // com.huami.mifit.sportlib.services.IGPSServiceConn.IServiceStateListener
                    public void onServerStateChanged(@Nullable IGPSServiceConn.ServiceState state) {
                        if (state == null) {
                            return;
                        }
                        this.a.isGPSAvailable = state == IGPSServiceConn.ServiceState.SERVICE_READY;
                    }

                    @Override // com.huami.mifit.sportlib.services.IGPSServiceConn.IServiceStateListener
                    public void onServiceConnected() {
                        this.a.isGPSAvailable = true;
                        this.a.R(gPSServiceConn.getGPSSignalLevel());
                    }

                    @Override // com.huami.mifit.sportlib.services.IGPSServiceConn.IServiceStateListener
                    public void onServiceDisConnected() {
                        this.a.isGPSAvailable = false;
                    }
                });
                this.gpsStarted = true;
                gPSServiceConn.connect();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(int sportType, boolean startIcon) {
        CountEventBuilder identified = new CountEventBuilder("ADS_V").setAnonymous(true).setIdentified(true);
        if (sportType == 1) {
            identified.addExtra("fr", StatEvent.EventParams.SPORT_RUN_OUTER);
        } else if (sportType == 6) {
            identified.addExtra("fr", "walk");
        } else if (sportType == 8) {
            identified.addExtra("fr", StatEvent.EventParams.SPORT_RUN_INNER);
        } else if (sportType == 9) {
            identified.addExtra("fr", "ride");
        }
        if (startIcon) {
            identified.addExtra("tp", StatEvent.EventParams.SPORT_READY);
        } else {
            identified.addExtra("tp", StatEvent.EventParams.SPORT_PROGRESS);
        }
        Analytics.recordEvent(identified);
    }

    private final void t0() {
        this.disposable = io.reactivex.Observable.fromCallable(new Callable() { // from class: bb7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SportMapFragment.u0();
            }
        }).subscribeOn(Schedulers.io()).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: ab7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SportMapFragment.v0(this.a, (List) obj);
            }
        }, new Consumer() { // from class: za7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SportMapFragment.w0(this.a, (Throwable) obj);
            }
        });
    }

    private final void u() {
        String strZ = z();
        if (strZ == null) {
            return;
        }
        CountEventBuilder countEventBuilder = new CountEventBuilder(StatEvent.SPORT_TOP_START_C);
        countEventBuilder.addExtra("fr", strZ);
        int sportType = getSportType();
        boolean z = true;
        if (sportType == 1) {
            countEventBuilder.addExtra("tp", StatEvent.EventParams.SPORT_RUN_OUTER);
        } else if (sportType == 8) {
            countEventBuilder.addExtra("tp", StatEvent.EventParams.SPORT_RUN_INNER);
        }
        GPSServiceConn gPSServiceConn = this.gpsConn;
        Integer numValueOf = gPSServiceConn == null ? null : Integer.valueOf(gPSServiceConn.getGPSSignalLevel());
        int value = numValueOf == null ? GPSSignal.SignalLevel.DEFAULT.getValue() : numValueOf.intValue();
        if (value != GPSSignal.SignalLevel.MIDDLE.getValue() && value != GPSSignal.SignalLevel.STRONG.getValue()) {
            z = false;
        }
        String str = "none";
        countEventBuilder.addExtra("gps", z ? SportAnalytics.ParamValue.GpsStatus.GOOD : value == GPSSignal.SignalLevel.WEAK.getValue() ? SportAnalytics.ParamValue.GpsStatus.BAD : "none");
        List<a> list = this.devices;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((a) obj).getDevice().isConnected()) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            str = size == 0 ? SportAnalytics.ParamValue.HardwareStatus.DISCONNECTION : size == list.size() ? SportAnalytics.ParamValue.HardwareStatus.ALL_CONNECTION : SportAnalytics.ParamValue.HardwareStatus.PARTIAL_CONNECTION;
        }
        countEventBuilder.addExtra(StatEvent.Key.HARDWARE, str);
        Analytics.recordEvent(countEventBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List u0() {
        return AdProvider.getHomePagesAdByType(AdAPI.TYPE_SPORT_BTN_REPLACE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v() {
        HMBaseDevice device;
        a aVar = this.heartRateAnalysisDevice;
        if (aVar != null) {
            if ((aVar == null ? null : Boolean.valueOf(aVar.getDevice().isConnected())).booleanValue()) {
                Feature feature = Feature.HEADSET_MOZART_SOURCE_S;
                a aVar2 = this.heartRateAnalysisDevice;
                if (ConfigHelperKt.hasFeature(feature, aVar2 != null ? aVar2.getDeviceSource() : null) && (device = HMDeviceManager.getInstance().getDevice(HMDeviceType.HEADSET)) != null && device.isConnected() && (device instanceof MozartDevice)) {
                    MozartDevice mozartDevice = (MozartDevice) device;
                    BatteryInfo batteryInfo = mozartDevice.getBatteryInfo(HeadsetDevice.Part.Left.INSTANCE);
                    BatteryInfo batteryInfo2 = mozartDevice.getBatteryInfo(HeadsetDevice.Part.Right.INSTANCE);
                    HeadsetDevice.HeadsetDeviceState headsetState = mozartDevice.getHeadsetState();
                    if (headsetState == null) {
                        return false;
                    }
                    boolean z = headsetState.isLeftConnected() && batteryInfo != null && !batteryInfo.isCharging() && batteryInfo.getLevel() < 20;
                    boolean z2 = headsetState.isRightConnected() && batteryInfo2 != null && !batteryInfo2.isCharging() && batteryInfo2.getLevel() < 20;
                    if (!z && !z2) {
                        return false;
                    }
                    new AlertDialogFragment.Builder(getContext()).setTitle(R.string.headset_low_battery_title).setMessage(R.string.headset_low_battery_message).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: gb7
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            SportMapFragment.w(this.a, dialogInterface, i2);
                        }
                    }).create().show(getFragmentManager());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(SportMapFragment sportMapFragment, List list) {
        sportMapFragment.x0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(SportMapFragment sportMapFragment, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        sportMapFragment.V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(SportMapFragment sportMapFragment, Throwable th) {
        View view = sportMapFragment.getView();
        ((ImageView) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.sport_map_start))).setImageResource(R.drawable.btn_sport_go);
    }

    private final void x() {
        synchronized (Boolean.valueOf(this.gpsStarted)) {
            if (this.gpsStarted) {
                GPSServiceConn gPSServiceConn = this.gpsConn;
                if (gPSServiceConn != null) {
                    gPSServiceConn.unregisterSportObserver(C());
                    gPSServiceConn.destroy(getActivity());
                }
                this.gpsConn = null;
                this.gpsStarted = false;
                HMLog.info(K, c.a);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    private final void x0(List<AdEntity> it2) {
        if (!(it2 == null ? null : Boolean.valueOf(!it2.isEmpty())).booleanValue()) {
            View view = getView();
            ((ImageView) (view != null ? view.findViewById(com.xiaomi.hm.health.R.id.sport_map_start) : null)).setImageResource(R.drawable.btn_sport_go);
            return;
        }
        RequestBuilder<Drawable> requestBuilderApply = Glide.with(this).load(it2.get(0).getImgUrl()).apply(RequestOptions.bitmapTransform(new CircleCrop()).error(R.drawable.btn_sport_go).placeholder(R.drawable.btn_sport_go));
        View view2 = getView();
        requestBuilderApply.into((ImageView) (view2 != null ? view2.findViewById(com.xiaomi.hm.health.R.id.sport_map_start) : null));
        t(this.sportType, true);
        AdRepository.getInstance().requestMonitor(it2.get(0).adMonitor, it2.get(0).getId(), true);
    }

    private final BoltEntranceViewModel y() {
        return (BoltEntranceViewModel) this.boltEntranceViewModel.getValue();
    }

    private final void y0() {
        this.heartRateAnalysisDevice = null;
        this.poseAnalysisDevice = null;
        this.effectAnalysisDevice = null;
        if (this.devices.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (a aVar : this.devices) {
            if (SportOpenDeviceUtil.isDeviceSupportHeartRateAnalysis(aVar.getDeviceSource())) {
                arrayList.add(aVar);
            }
            if (SportOpenDeviceUtil.isDeviceSupportPoseAnalysis(aVar.getDeviceSource())) {
                arrayList2.add(aVar);
            }
            if (SportOpenDeviceUtil.isDeviceSupportEffectAnalysis(aVar.getDeviceSource())) {
                arrayList3.add(aVar);
            }
        }
        SportMapFragment$updateDataDevice$findDevice$1 sportMapFragment$updateDataDevice$findDevice$1 = new Function2<List<? extends a>, List<? extends Object>, a>() { // from class: com.xiaomi.hm.health.running.SportMapFragment$updateDataDevice$findDevice$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SportMapFragment.a invoke(@NotNull List<SportMapFragment.a> list, @NotNull final List<? extends Object> list2) {
                return (SportMapFragment.a) CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.xiaomi.hm.health.running.SportMapFragment$updateDataDevice$findDevice$1$invoke$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t2, T t3) {
                        SportMapFragment.a aVar2 = (SportMapFragment.a) t2;
                        HMDeviceSource deviceSource = aVar2.getDeviceSource();
                        HMDeviceSource hMDeviceSource = HMDeviceSource.OTHER_BM;
                        int iIndexOf = deviceSource == hMDeviceSource ? list2.indexOf(aVar2) : list2.indexOf(aVar2.getDeviceSource().getType());
                        if (iIndexOf == -1) {
                            iIndexOf = list2.size();
                        }
                        Integer numValueOf = Integer.valueOf(iIndexOf);
                        SportMapFragment.a aVar3 = (SportMapFragment.a) t3;
                        int iIndexOf2 = aVar3.getDeviceSource() == hMDeviceSource ? list2.indexOf(aVar3) : list2.indexOf(aVar3.getDeviceSource().getType());
                        if (iIndexOf2 == -1) {
                            iIndexOf2 = list2.size();
                        }
                        return ComparisonsKt__ComparisonsKt.compareValues(numValueOf, Integer.valueOf(iIndexOf2));
                    }
                }).get(0);
            }
        };
        if (!arrayList.isEmpty()) {
            this.heartRateAnalysisDevice = sportMapFragment$updateDataDevice$findDevice$1.invoke(arrayList, CollectionsKt__CollectionsKt.listOf((Object[]) new Enum[]{HMDeviceType.HEADSET, HMDeviceSource.OTHER_BM, HMDeviceType.MILI, HMDeviceType.WATCH}));
        }
        if (!arrayList2.isEmpty()) {
            this.poseAnalysisDevice = sportMapFragment$updateDataDevice$findDevice$1.invoke(arrayList2, CollectionsKt__CollectionsKt.listOf((Object[]) new Enum[]{HMDeviceSource.OTHER_BM, HMDeviceType.MILI, HMDeviceType.WATCH}));
        }
        if (!arrayList3.isEmpty()) {
            this.effectAnalysisDevice = sportMapFragment$updateDataDevice$findDevice$1.invoke(arrayList3, CollectionsKt__CollectionsKt.listOf((Object[]) new Enum[]{HMDeviceSource.OTHER_BM, HMDeviceType.HEADSET, HMDeviceType.MILI, HMDeviceType.WATCH}));
        }
    }

    private final String z() {
        return (String) this.eventSportType.getValue();
    }

    private final void z0() {
        Observable.fromCallable(new Callable() { // from class: cb7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SportMapFragment.A0();
            }
        }).subscribeOn(rx.schedulers.Schedulers.io()).filter(new Func1() { // from class: eb7
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return SportMapFragment.B0((List) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: db7
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                SportMapFragment.C0(this.a, (List) obj);
            }
        }, u6.a);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.ui.sportfitness.view.SportDeviceView.DeviceDataSource
    @NotNull
    public List<SportDeviceView.DeviceDataSource.DeviceInfo> availableDevices() {
        return this.devices;
    }

    public final int getSportType() {
        return this.sportType;
    }

    @Override // com.xiaomi.hm.health.ui.sportfitness.view.SportDeviceView.DeviceDataSource
    public boolean hasHardwareDataDevice() {
        return (this.poseAnalysisDevice == null && this.effectAnalysisDevice == null) ? false : true;
    }

    @Override // com.xiaomi.hm.health.ui.sportfitness.view.SportDeviceView.DeviceDataSource
    public boolean hasHeartRateDevice() {
        return this.heartRateAnalysisDevice != null;
    }

    @Override // com.xiaomi.hm.health.ui.sportfitness.view.SportDeviceView.DeviceDataSource
    /* JADX INFO: renamed from: heartRate, reason: from getter */
    public int getHeartRate() {
        return this.heartRate;
    }

    @Override // com.xiaomi.hm.health.ui.sportfitness.view.SportDeviceView.DeviceDataSource
    public boolean isHardwareDataConnected() {
        a aVar = this.poseAnalysisDevice;
        a aVar2 = this.effectAnalysisDevice;
        if (aVar != null && aVar2 != null) {
            return aVar.getDevice().isConnected() && aVar2.getDevice().isConnected();
        }
        if (aVar != null) {
            return aVar.getDevice().isConnected();
        }
        if (aVar2 != null) {
            return aVar2.getDevice().isConnected();
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.ui.sportfitness.view.SportDeviceView.DeviceDataSource
    public boolean isHeartRateConnected() {
        a aVar = this.heartRateAnalysisDevice;
        if (aVar == null) {
            return false;
        }
        return aVar.getDevice().isConnected();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        HMLog.debug(K, new i());
        View view = getView();
        this.lastCheckedId = ((RadioGroup) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.sport_map_radio))).getCheckedRadioButtonId();
        View view2 = getView();
        ((RadioGroup) (view2 != null ? view2.findViewById(com.xiaomi.hm.health.R.id.sport_map_radio) : null)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: nb7
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                SportMapFragment.N(this.a, radioGroup, i2);
            }
        });
        y().getStatusPageEntranceLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: wa7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportMapFragment.O(this.a, (Boolean) obj);
            }
        });
        y().getStatusPageResourceLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ya7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportMapFragment.P(this.a, (String) obj);
            }
        });
        D().applySuccessCallback(j.a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        this.boltHomeViewModel = (TdmillHmViewModel) AppCompatActivityExtKt.obtainViewModel((AppCompatActivity) activity, TdmillHmViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        boolean zBooleanValue;
        int iIntValue;
        super.onCreate(savedInstanceState);
        Boolean boolValueOf = savedInstanceState == null ? null : Boolean.valueOf(savedInstanceState.getBoolean(M));
        if (boolValueOf == null) {
            Bundle arguments = getArguments();
            zBooleanValue = arguments == null ? false : arguments.getBoolean(M);
        } else {
            zBooleanValue = boolValueOf.booleanValue();
        }
        this.isOversea = zBooleanValue;
        Integer numValueOf = savedInstanceState != null ? Integer.valueOf(savedInstanceState.getInt("sport_type")) : null;
        if (numValueOf == null) {
            Bundle arguments2 = getArguments();
            iIntValue = arguments2 == null ? 6 : arguments2.getInt("sport_type");
        } else {
            iIntValue = numValueOf.intValue();
        }
        this.sportType = iIntValue;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        ProxyTreadmill.INSTANCE.getInstance().registerEventBus();
        return inflater.inflate(R.layout.fragment_sport_map, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        ProxyTreadmill.INSTANCE.getInstance().unregisterEventBus();
        Disposable disposable = this.disposable;
        if (disposable != null && disposable.isDisposed()) {
            disposable.dispose();
        }
        r0();
        x();
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        super.onDestroyView();
    }

    public final void onEventMainThread(@NotNull EventAppInBackground event) {
        HMLog.debug(K, new k(event, this));
        if (getUserVisibleHint() && !GPSDataController.getInstance().isRunning() && ProxyTreadmill.INSTANCE.getInstance().getSportState() == BoltSportState.NONE && event.isInBackground) {
            r0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        if (this.sportType != 25) {
            r0();
        }
        e0();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        HMLog.debug(K, new l());
        if (getUserVisibleHint()) {
            d0();
            Y(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        initView(view);
    }

    public final void setSportType(int i2) {
        this.sportType = i2;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        HMLog.debug(K, new o());
        if (getUserVisibleHint()) {
            W();
        } else {
            S();
        }
    }

    @Override // com.xiaomi.hm.health.fragment.SportView
    public void showSportType(int sportType) {
        this.sportType = sportType;
        if (getView() == null) {
            return;
        }
        a0();
        EventBus.getDefault().post(new EventSportTypeSwitched(A(this.lastCheckedId), sportType));
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        if (event.getDeviceType() != HMDeviceType.TREADMILL) {
            Z(this, false, 1, null);
            return;
        }
        if (event.isConnected()) {
            LoadingDialog loadingDialog = this.mLoadingDialog;
            if (loadingDialog != null && loadingDialog.isShowing()) {
                LoadingDialog loadingDialog2 = this.mLoadingDialog;
                if (loadingDialog2 != null) {
                    loadingDialog2.dismiss();
                }
                q0();
                return;
            }
            return;
        }
        if (event.isConnecting()) {
            return;
        }
        if (event.isConnectingTimeout()) {
            LoadingDialog loadingDialog3 = this.mLoadingDialog;
            if (loadingDialog3 != null && loadingDialog3.isShowing()) {
                LoadingDialog loadingDialog4 = this.mLoadingDialog;
                if (loadingDialog4 != null) {
                    loadingDialog4.dismiss();
                }
                j0();
                return;
            }
            return;
        }
        if (event.isDisconnected()) {
            LoadingDialog loadingDialog5 = this.mLoadingDialog;
            if (loadingDialog5 != null && loadingDialog5.isShowing()) {
                LoadingDialog loadingDialog6 = this.mLoadingDialog;
                if (loadingDialog6 != null) {
                    loadingDialog6.dismiss();
                }
                j0();
            }
        }
    }
}
