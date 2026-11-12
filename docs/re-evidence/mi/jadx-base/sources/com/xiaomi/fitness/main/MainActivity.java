package com.xiaomi.fitness.main;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.app.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.appupgrade.export.AppUpgradeHelper;
import com.example.statistics.export.AccountType;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mi.fitness.checkupdate.export.CheckUpdateManager;
import com.mi.health.uri_parser.UriParserExportKt;
import com.mi.health.uri_parser.links.HttpLinkActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.circulate.device.api.DeviceInfo;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.export.sp.FitnessDataPreference;
import com.xiaomi.fitness.about.utils.MainCommonAppUrlsKt;
import com.xiaomi.fitness.account.api.bean.RegionBean;
import com.xiaomi.fitness.account.api.bean.RegionInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.AppVersionUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.SystemSetting;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.config.preference.ChooseAppPreference;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnProductChangeListener;
import com.xiaomi.fitness.device.manager.ProductManager;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceTool;
import com.xiaomi.fitness.device.manager.export.FoundDeviceCallback;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.export.scan.ScannedDeviceInfo;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.PrivacyEasyModePreference;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.main.MainActivity;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.main.utils.ActivityRecognitionPermissionUtil;
import com.xiaomi.fitness.main.utils.BluetoothHelper;
import com.xiaomi.fitness.main.utils.DialogHelper;
import com.xiaomi.fitness.main.utils.SimplifiedChineseModel;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.membership.export.MembershipHelper;
import com.xiaomi.fitness.membership.export.MembershipHelperExtKt;
import com.xiaomi.fitness.nfc.export.NfcManager;
import com.xiaomi.fitness.nfc.export.NfcManagerExtKt;
import com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.push.export.PushManager;
import com.xiaomi.fitness.push.export.PushManagerKt;
import com.xiaomi.fitness.relative.export.IRelativeCareAccessApi;
import com.xiaomi.fitness.relative.export.RelativeCareAccessExtKt;
import com.xiaomi.fitness.rn.export.DeviceShareManager;
import com.xiaomi.fitness.rn.export.DeviceShareManagerExtKt;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.PrivacySensitive;
import com.xiaomi.fitness.sport_export.IJustDanceApi;
import com.xiaomi.fitness.sport_export.JustDanceExtKt;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.watch.face.data.FaceEntranceRespV4;
import com.xiaomi.fitness.watch.face.data.RecentOnlineData;
import com.xiaomi.fitness.watch.face.data.RecentOnlineListData;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.wearos.export.FastPairManager;
import com.xiaomi.fitness.wearos.export.WearOSUtil;
import com.xiaomi.fitness.wearos.export.WearOsExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.a1d;
import defpackage.av6;
import defpackage.b1d;
import defpackage.d2m;
import defpackage.ev1;
import defpackage.fur;
import defpackage.fv5;
import defpackage.gsh;
import defpackage.gv5;
import defpackage.h0j;
import defpackage.hri;
import defpackage.j1f;
import defpackage.kb;
import defpackage.mji;
import defpackage.ni4;
import defpackage.nui;
import defpackage.of4;
import defpackage.prh;
import defpackage.u2f;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Route(path = MainExtKt.MAIN_ACTIVITY_PATH)
@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\n*\u0006Õ\u0001á\u0001ê\u0001\b\u0007\u0018\u0000 ò\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0002ò\u0001B\b¢\u0006\u0005\bñ\u0001\u0010\tJ\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ+\u0010\u0011\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\tJ\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\tJ\u0019\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\tJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u001bJ\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\tJ\u001b\u0010'\u001a\u00020\u0007*\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020\u0007*\u00020)2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010\tJ\u000f\u0010.\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\tJ\u0017\u00101\u001a\u00020*2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u0010\tJ\u0017\u00105\u001a\u00020*2\u0006\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u0010\tJ\u000f\u00108\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u0010\tJ\u0017\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u00020*H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u0010\tJ\u000f\u0010=\u001a\u00020\u0007H\u0002¢\u0006\u0004\b=\u0010\tJ\u000f\u0010>\u001a\u00020\u0007H\u0002¢\u0006\u0004\b>\u0010\tJ\u000f\u0010?\u001a\u00020\u0007H\u0002¢\u0006\u0004\b?\u0010\tJ\u001f\u0010D\u001a\u00020\u00072\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u000bH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020*2\u0006\u0010F\u001a\u00020\u000bH\u0002¢\u0006\u0004\bI\u00106J\u000f\u0010J\u001a\u00020\u0007H\u0002¢\u0006\u0004\bJ\u0010\tJ\u000f\u0010K\u001a\u00020\u0007H\u0002¢\u0006\u0004\bK\u0010\tJ\u000f\u0010L\u001a\u00020\u0007H\u0003¢\u0006\u0004\bL\u0010\tJ\u000f\u0010M\u001a\u00020\u0007H\u0002¢\u0006\u0004\bM\u0010\tJ\u000f\u0010N\u001a\u00020\u0007H\u0002¢\u0006\u0004\bN\u0010\tJ\u000f\u0010O\u001a\u00020\u0007H\u0002¢\u0006\u0004\bO\u0010\tJ\u0017\u0010R\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u00072\u0006\u0010W\u001a\u00020/H\u0016¢\u0006\u0004\bX\u0010YJ\u0019\u0010[\u001a\u00020\u00072\b\u0010Z\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b[\u0010\u001bJ\u0017\u0010^\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b^\u0010_J\r\u0010`\u001a\u00020\u0007¢\u0006\u0004\b`\u0010\tJ\u0017\u0010a\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\ba\u0010!J\u0013\u0010b\u001a\u00020\u0007*\u00020\u0003H\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u0007H\u0014¢\u0006\u0004\bd\u0010\tJ\u000f\u0010e\u001a\u00020\u0007H\u0016¢\u0006\u0004\be\u0010\tJ\u000f\u0010f\u001a\u00020\u0007H\u0015¢\u0006\u0004\bf\u0010\tJ\r\u0010g\u001a\u00020\u0007¢\u0006\u0004\bg\u0010\tJ\u000f\u0010h\u001a\u00020\u0007H\u0014¢\u0006\u0004\bh\u0010\tJ\u000f\u0010i\u001a\u00020*H\u0014¢\u0006\u0004\bi\u0010jJ)\u0010n\u001a\u00020\u00072\u0006\u0010k\u001a\u00020/2\u0006\u0010l\u001a\u00020/2\b\u0010m\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\bn\u0010oJ\u0015\u0010p\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bp\u0010SJ\u000f\u0010q\u001a\u00020\u0007H\u0014¢\u0006\u0004\bq\u0010\tJ!\u0010u\u001a\u00020*2\u0006\u0010r\u001a\u00020/2\b\u0010t\u001a\u0004\u0018\u00010sH\u0016¢\u0006\u0004\bu\u0010vJ\u0011\u0010x\u001a\u0004\u0018\u00010wH\u0016¢\u0006\u0004\bx\u0010yJ3\u0010~\u001a\u00020\u00072\u0010\u0010{\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010z2\u0006\u0010k\u001a\u00020/2\b\u0010}\u001a\u0004\u0018\u00010|H\u0016¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u0080\u0001\u0010\tJ&\u0010\u0083\u0001\u001a\u00020\u00072\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000b¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001R'\u0010\u0085\u0001\u001a\u00020*8\u0014@\u0014X\u0094\u000e¢\u0006\u0016\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010j\"\u0005\b\u0088\u0001\u0010;R!\u0010\u008e\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0090\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0092\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0086\u0001R\u0019\u0010\u0093\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0086\u0001R\u0019\u0010\u0094\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0086\u0001R\u0019\u0010\u0095\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0086\u0001R1\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R*\u0010¦\u0001\u001a\u00030¥\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R*\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R*\u0010´\u0001\u001a\u00030³\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R*\u0010»\u0001\u001a\u00030º\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R\u0019\u0010Á\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u001b\u0010Ã\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R!\u0010É\u0001\u001a\u00030Å\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÆ\u0001\u0010\u008b\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R(\u0010Ê\u0001\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÊ\u0001\u0010Â\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0005\bÍ\u0001\u0010YR'\u0010Î\u0001\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bÎ\u0001\u0010\u0086\u0001\u001a\u0005\bÎ\u0001\u0010j\"\u0005\bÏ\u0001\u0010;R)\u0010Ñ\u0001\u001a\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00070Ð\u00018\u0006¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0018\u0010Ö\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R(\u0010Ø\u0001\u001a\u0011\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0007\u0018\u00010Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ò\u0001R\u001c\u0010Ú\u0001\u001a\u0005\u0018\u00010Ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R(\u0010Ü\u0001\u001a\u0011\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0007\u0018\u00010Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ò\u0001R(\u0010Ý\u0001\u001a\u0011\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0007\u0018\u00010Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Ò\u0001R\u001b\u0010Þ\u0001\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R \u0010à\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010\u0091\u0001R\u0018\u0010â\u0001\u001a\u00030á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R'\u0010ä\u0001\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bä\u0001\u0010\u0086\u0001\u001a\u0005\bä\u0001\u0010j\"\u0005\bå\u0001\u0010;R8\u0010é\u0001\u001a#\u0012\u0018\u0012\u0016\u0018\u00010æ\u0001¢\u0006\u000e\bç\u0001\u0012\t\bè\u0001\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010Ò\u0001R&\u0010}\u001a\u0011\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0007\u0018\u00010Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b}\u0010Ò\u0001R\u0018\u0010ë\u0001\u001a\u00030ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u0017\u0010î\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010Ì\u0001R\u0017\u0010ð\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010Ì\u0001¨\u0006ó\u0001"}, d2 = {"Lcom/xiaomi/fitness/main/MainActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/main/MainViewModel;", "Lj1f;", "Lfv5;", "Lprh;", "Lb1d;", "", "registerDataChangedBroadcast", "()V", "removeServiceConnectionListener", "", "modelId", "Landroid/bluetooth/BluetoothDevice;", "device", "Landroid/os/Bundle;", "fastPairExtras", "doFastPairProductListener", "(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;Landroid/os/Bundle;)V", "", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "productList", "launchBindDevice", "(Ljava/util/List;Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;Landroid/os/Bundle;)V", "showLoginDialogIfNeed", SdkContants.KEY_BUNDLE, "checkCarCard", "(Landroid/os/Bundle;)V", "showConnectNewPhoneIfNeed", "processIntent", "Landroid/content/Intent;", "intent", "initBundleParams", "(Landroid/content/Intent;)V", "gotoTargetPage", "initIndex", "shouldShowLoginWhenTokenInvalid", "Landroidx/fragment/app/Fragment;", "showFragment", "selectSportTab", "(Lj1f;Landroidx/fragment/app/Fragment;)V", "Lcom/google/android/material/tabs/TabLayout$g;", "", "selected", "(Lcom/google/android/material/tabs/TabLayout$g;Z)V", "showKeepLinkDialog", "requestDeviceTabRedPoint", "", "type", "isWearProduct", "(I)Z", "initEarPhone", "mac", "isDeviceAlreadyBonded", "(Ljava/lang/String;)Z", "refreshDeviceTabIcon", "triggerSyncWithServer", "isShowGuide", "syncLocalStatusToWeb", "(Z)V", "showPrivacyDialog", "showPrivacySensitiveDialog", "showUserInfoGuide", "showSyncWebDialog", "", "delayMillis", "Ljava/lang/Runnable;", "r", "postDelayed", "(JLjava/lang/Runnable;)V", "scanResult", "handleQRScanResult", "(Ljava/lang/String;)V", "checkWhetherScanResultCanBeQrCodeId", "dealWithMedal", "checkCommonApplication", "showGoToWearableAppDialog", "handlePrivacySensitiveDialog", "handleAutoLogin", "checkUpdaterDialog", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "showRecognitionPermissionGuide", "(Landroidx/fragment/app/FragmentActivity;)V", "Lfur;", "createReactActivityDelegate", "()Lfur;", "featureId", "setWindowFeature", "(I)V", "savedInstanceState", "onCreate", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "doFastPairing", "onNewIntent", "bindView", "(Lj1f;)V", "onRelease", "onBackPressed", LifecycleConstantKt.ON_RESUME, "foundDeviceByScanBluetooth", LifecycleConstantKt.ON_PAUSE, "isNeedRestore", "()Z", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "showRecognitionPermission", LifecycleConstantKt.ON_DESTROY, "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "La1d;", "getActivityDelegate", "()La1d;", "", "permissions", "Lgsh;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "requestPermissions", "([Ljava/lang/String;ILgsh;)V", "invokeDefaultOnBackPressed", "appName", RnReportConst.ApiReport.PARAM_MODULE, "attachModule", "(Ljava/lang/String;Ljava/lang/String;)V", "enableAutoSetLayoutUiMode", "Z", "getEnableAutoSetLayoutUiMode", "setEnableAutoSetLayoutUiMode", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer$delegate", "Lkotlin/Lazy;", "getServerSyncer", "()Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mGoToAppDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mShowGuide", "mCheckShowGuide", "mLoginOnetrack", "mFirstSetCommonProperties", "", "Lcom/xiaomi/fitness/main/export/MainTab;", "mMainTabs", "Ljava/util/Set;", "getMMainTabs", "()Ljava/util/Set;", "setMMainTabs", "(Ljava/util/Set;)V", "Lcom/mi/fitness/checkupdate/export/CheckUpdateManager;", "checkUpdate", "Lcom/mi/fitness/checkupdate/export/CheckUpdateManager;", "getCheckUpdate", "()Lcom/mi/fitness/checkupdate/export/CheckUpdateManager;", "setCheckUpdate", "(Lcom/mi/fitness/checkupdate/export/CheckUpdateManager;)V", "Lcom/xiaomi/fitness/push/export/PushManager;", "pushManager", "Lcom/xiaomi/fitness/push/export/PushManager;", "getPushManager", "()Lcom/xiaomi/fitness/push/export/PushManager;", "setPushManager", "(Lcom/xiaomi/fitness/push/export/PushManager;)V", "Lcom/example/appupgrade/export/AppUpgradeHelper;", "appUpgradeHelper", "Lcom/example/appupgrade/export/AppUpgradeHelper;", "getAppUpgradeHelper", "()Lcom/example/appupgrade/export/AppUpgradeHelper;", "setAppUpgradeHelper", "(Lcom/example/appupgrade/export/AppUpgradeHelper;)V", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "Lcom/google/android/material/tabs/TabLayout;", "mainTlBottom", "Lcom/google/android/material/tabs/TabLayout;", "getMainTlBottom", "()Lcom/google/android/material/tabs/TabLayout;", "setMainTlBottom", "(Lcom/google/android/material/tabs/TabLayout;)V", "mCurrentTab", "I", "mCurrentFragment", "Landroidx/fragment/app/Fragment;", "Lcom/xiaomi/fitness/main/utils/SimplifiedChineseModel;", "simplifiedChineseModel$delegate", "getSimplifiedChineseModel", "()Lcom/xiaomi/fitness/main/utils/SimplifiedChineseModel;", "simplifiedChineseModel", "sportPageIndex", "getSportPageIndex", "()I", "setSportPageIndex", "isShowKeepAliveDialog", "setShowKeepAliveDialog", "Lkotlin/Function1;", "mNetworkListener", "Lkotlin/jvm/functions/Function1;", "getMNetworkListener", "()Lkotlin/jvm/functions/Function1;", "com/xiaomi/fitness/main/MainActivity$mDataChangedReceiver$1", "mDataChangedReceiver", "Lcom/xiaomi/fitness/main/MainActivity$mDataChangedReceiver$1;", "mGuideFinishListener", "Landroid/os/Handler;", "mTimerHandler", "Landroid/os/Handler;", "mSyncWebListener", "mAccountListener", "mDelegate", "Lfur;", "mDialog", "com/xiaomi/fitness/main/MainActivity$mServiceConnection$1", "mServiceConnection", "Lcom/xiaomi/fitness/main/MainActivity$mServiceConnection$1;", "isInBackground", "setInBackground", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lkotlin/ParameterName;", "name", "deviceChangeListener", "com/xiaomi/fitness/main/MainActivity$listenerDeviceManager$1", "listenerDeviceManager", "Lcom/xiaomi/fitness/main/MainActivity$listenerDeviceManager$1;", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/xiaomi/fitness/main/MainActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,1433:1\n1863#2,2:1434\n1053#2:1436\n1872#2,3:1437\n1863#2,2:1440\n1863#2,2:1442\n1863#2,2:1446\n1#3:1444\n29#4:1445\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/xiaomi/fitness/main/MainActivity\n*L\n428#1:1434,2\n600#1:1436\n600#1:1437,3\n858#1:1440,2\n907#1:1442,2\n792#1:1446,2\n1302#1:1445\n*E\n"})
public final class MainActivity extends Hilt_MainActivity<MainViewModel, j1f> implements fv5, prh, b1d {

    @NotNull
    private static final String ACTION_CHOICE_APP = "choose_app";

    @NotNull
    private static final String ACTION_CHOICE_APP_TIME = "choose_app_time";

    @NotNull
    public static final String RELATIVE_CARE_QR_CODE_ID_PREFIX = "com.mi.health://relativecare/qrcodeid/";

    @NotNull
    public static final String SPORT_TAB_INDEX = "sport_tab_index";

    @NotNull
    private static final String TAG = "MainActivity";

    @NotNull
    private static final String WEARABLE_PACKAGE_NAME = "com.xiaomi.wearable";
    public AppUpgradeHelper appUpgradeHelper;
    public CheckUpdateManager checkUpdate;
    private boolean enableAutoSetLayoutUiMode;
    private boolean isShowKeepAliveDialog;

    @Nullable
    private Function1<? super Boolean, Unit> listener;

    @Nullable
    private Function1<? super Boolean, Unit> mAccountListener;
    private boolean mCheckShowGuide;

    @Nullable
    private Fragment mCurrentFragment;

    @Nullable
    private fur mDelegate;

    @Nullable
    private CommonDialog<?> mDialog;
    private boolean mFirstSetCommonProperties;

    @Nullable
    private CommonDialog<?> mGoToAppDialog;

    @Nullable
    private Function1<? super Boolean, Unit> mGuideFinishListener;
    private boolean mLoginOnetrack;
    public Set<MainTab> mMainTabs;
    private boolean mShowGuide;

    @Nullable
    private Function1<? super Boolean, Unit> mSyncWebListener;

    @Nullable
    private Handler mTimerHandler;
    public UserInfoManager mUserInfoManager;
    public TabLayout mainTlBottom;
    public PushManager pushManager;
    private int sportPageIndex;

    /* JADX INFO: renamed from: serverSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy serverSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s0f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.serverSyncer_delegate$lambda$0();
        }
    });
    private int mCurrentTab = -1;

    /* JADX INFO: renamed from: simplifiedChineseModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy simplifiedChineseModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: u0f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.simplifiedChineseModel_delegate$lambda$1();
        }
    });

    @NotNull
    private final Function1<Boolean, Unit> mNetworkListener = new MainActivity$mNetworkListener$1(this);

    @NotNull
    private final MainActivity$mDataChangedReceiver$1 mDataChangedReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.main.MainActivity$mDataChangedReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AnyExtKt.main$default(null, new MainActivity$mDataChangedReceiver$1$onReceive$1(intent, this.this$0, null), 1, null);
        }
    };

    @NotNull
    private final MainActivity$mServiceConnection$1 mServiceConnection = new ServiceConnection() { // from class: com.xiaomi.fitness.main.MainActivity$mServiceConnection$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Logger.i(com.xiaomi.fitness.electronic.scale.MainActivity.TAG, "onServiceConnected");
            this.this$0.doFastPairing();
            this.this$0.removeServiceConnectionListener();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Logger.i(com.xiaomi.fitness.electronic.scale.MainActivity.TAG, "onServiceDisconnected");
        }
    };
    private boolean isInBackground = true;

    @NotNull
    private final Function1<WearableDeviceModel, Unit> deviceChangeListener = new Function1() { // from class: ize
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return MainActivity.deviceChangeListener$lambda$14(this.f22253a, (WearableDeviceModel) obj);
        }
    };

    @NotNull
    private final MainActivity$listenerDeviceManager$1 listenerDeviceManager = new DeviceSettingManager.UpdateSettingInfoListener() { // from class: com.xiaomi.fitness.main.MainActivity$listenerDeviceManager$1
        @Override // com.xiaomi.fitness.settingitem.DeviceSettingManager.UpdateSettingInfoListener
        public void onSettingValueUpdate(String did, HashMap<String, String> settingMap) {
            Intrinsics.checkNotNullParameter(settingMap, "settingMap");
            Logger.d(com.xiaomi.fitness.electronic.scale.MainActivity.TAG, "onSettingValueUpdate: " + did + ", " + settingMap);
            if (Intrinsics.areEqual(did, "xiaomiwear_app")) {
                Logger.d(com.xiaomi.fitness.electronic.scale.MainActivity.TAG, "readSettingItem");
                this.this$0.handlePrivacySensitiveDialog();
                DeviceSettingManager.INSTANCE.getInstance().removeUpdateListener(this);
            }
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.main.MainActivity$onCreate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.main.MainActivity$onCreate$2", f = "MainActivity.kt", i = {}, l = {322}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(VibrateModeProgressBar.sLongToLong, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MainActivity.this.initEarPhone();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void checkCarCard(Bundle bundle) {
        if (Intrinsics.areEqual(bundle.get("key_tab"), Integer.valueOf(MainTab.INSTANCE.getINDEX_DEVICE())) && bundle.getBoolean("nfc", false)) {
            int i = bundle.getInt("act", -1);
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                String string = bundle.getString("card_name");
                NfcManager nfcManagerExtKt = NfcManagerExtKt.getInstance(NfcManager.INSTANCE);
                if (string == null) {
                    string = "";
                }
                nfcManagerExtKt.showDeleteCarDialog(this, string);
                return;
            }
            String string2 = bundle.getString("mailbox_id");
            Intrinsics.checkNotNull(string2);
            Logger.i("FITNESS.PUSH", "mailboxId:" + string2);
            NfcManagerExtKt.getInstance(NfcManager.INSTANCE).showCanIssueCarDialog(this, string2);
        }
    }

    private final void checkCommonApplication() {
        if (ConfigPreference.INSTANCE.getIS_APP_CHOSEN_OPEN() && !AppUtil.INSTANCE.isPlayChannel() && AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            int chooseApp = ChooseAppPreference.INSTANCE.getChooseApp();
            boolean intentStartApp = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).getIntentStartApp();
            Logger.i("MainActivity", "checkCommonApplication commonApp=" + chooseApp + ", intentStartActivity is " + intentStartApp);
            if (intentStartApp && chooseApp == 2) {
                Logger.i("MainActivity", "checkCommonApplication SET INTENT START APP FALSE");
                WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
                if (wearableDeviceModel != null) {
                    DeviceManagerExtKt.getInstance(companion).disconnectDevice(wearableDeviceModel.getDid());
                }
                postDelayed(500L, new Runnable() { // from class: e0f
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.checkCommonApplication$lambda$31(this.f16124a);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkCommonApplication$lambda$31(MainActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showGoToWearableAppDialog();
    }

    private final void checkUpdaterDialog() {
        FitnessDataPreference fitnessDataPreference = FitnessDataPreference.INSTANCE;
        if (!Intrinsics.areEqual(fitnessDataPreference.getDEVICE_SYNC_INVALID_VERSION(), AppVersionUtil.INSTANCE.getAppVersionName()) || fitnessDataPreference.getDEVICE_SYNC_INVALID_MODEL_INFO().length() <= 0) {
            AppUpgradeHelper appUpgradeHelper = getAppUpgradeHelper();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            appUpgradeHelper.doCheckAppUpgrade(supportFragmentManager);
            return;
        }
        String updater_dialog_app_in_black_list = ConfigPreference.INSTANCE.getUPDATER_DIALOG_APP_IN_BLACK_LIST();
        if (updater_dialog_app_in_black_list.length() > 0) {
            List list = (List) new Gson().fromJson(updater_dialog_app_in_black_list, new TypeToken<List<? extends String>>() { // from class: com.xiaomi.fitness.main.MainActivity$checkUpdaterDialog$$inlined$fromJson$1
            }.getType());
            if ((!list.isEmpty()) && list.contains(fitnessDataPreference.getDEVICE_SYNC_INVALID_MODEL_INFO())) {
                Logger.i("DEVICE_SYNC_INVALID_VERSION " + fitnessDataPreference.getDEVICE_SYNC_INVALID_VERSION() + ", deviceMode in black " + fitnessDataPreference.getDEVICE_SYNC_INVALID_MODEL_INFO(), new Object[0]);
                AppUpgradeHelper appUpgradeHelper2 = getAppUpgradeHelper();
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                appUpgradeHelper2.doCheckAppUpgrade(supportFragmentManager2);
                return;
            }
        }
        Logger.i("DEVICE_SYNC_INVALID_VERSION " + fitnessDataPreference.getDEVICE_SYNC_INVALID_VERSION() + ", deviceMode " + fitnessDataPreference.getDEVICE_SYNC_INVALID_MODEL_INFO(), new Object[0]);
        AppUpgradeHelper appUpgradeHelper3 = getAppUpgradeHelper();
        FragmentManager supportFragmentManager3 = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
        appUpgradeHelper3.doCheckAppUpgradeInSyncError(supportFragmentManager3);
    }

    private final boolean checkWhetherScanResultCanBeQrCodeId(String scanResult) {
        return StringsKt__StringsJVMKt.startsWith$default(scanResult, "com.mi.health://relativecare/qrcodeid/", false, 2, null);
    }

    private final fur createReactActivityDelegate() {
        return new fur(this);
    }

    private final void dealWithMedal() {
        MedalManagerExtKt.getInstance(MedalManager.INSTANCE).checkBirthday();
        MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE).showVipExpiredFaceDialog(new Function0() { // from class: c0f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.dealWithMedal$lambda$29(this.f4790a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealWithMedal$lambda$29(MainActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MedalManager.DefaultImpls.requestMedalList$default(MedalManagerExtKt.getInstance(MedalManager.INSTANCE), this$0, 0, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deviceChangeListener$lambda$14(final MainActivity this$0, final WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (wearableDeviceModel != null) {
            FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).requestLoadFaceEntranceV4(wearableDeviceModel, new Function1() { // from class: rze
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MainActivity.deviceChangeListener$lambda$14$lambda$12(wearableDeviceModel, this$0, (FaceEntranceRespV4) obj);
                }
            }, new Function1() { // from class: tze
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MainActivity.deviceChangeListener$lambda$14$lambda$13(((Integer) obj).intValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    public static final Unit deviceChangeListener$lambda$14$lambda$12(WearableDeviceModel wearableDeviceModel, MainActivity this$0, FaceEntranceRespV4 it) {
        int i;
        List<RecentOnlineListData> list;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        RecentOnlineData recentOnlineData = it.getRecentOnlineData();
        if (recentOnlineData == null) {
            return Unit.INSTANCE;
        }
        if (!recentOnlineData.getHasRecent() || (list = recentOnlineData.getList()) == null || list.isEmpty()) {
            i = 0;
        } else {
            long enterFaceEntranceTime = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).getEnterFaceEntranceTime(wearableDeviceModel.getDid());
            List<RecentOnlineListData> list2 = recentOnlineData.getList();
            if (list2 != null) {
                Iterator<T> it2 = list2.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((RecentOnlineListData) it2.next()).getTime() > enterFaceEntranceTime) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
        }
        FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).setFaceEntranceRedPoint(wearableDeviceModel.getDid(), i >= 5);
        this$0.refreshDeviceTabIcon();
        Logger.d("MainActivity", "deviceChangeListener isIgnoringBattery=" + d2m.y(this$0));
        if (!d2m.y(this$0)) {
            KeepaliveTimePreference keepaliveTimePreference = KeepaliveTimePreference.INSTANCE;
            long keepaliveLastTime = keepaliveTimePreference.getKeepaliveLastTime();
            ConfigPreference configPreference = ConfigPreference.INSTANCE;
            Logger.i("MainActivity", "deviceChangeListener KeepaliveTimePreference.getKeepaliveLastTime()= " + keepaliveLastTime + " ConfigPreference.KEEPALIVE_REMAIN_TIME = " + configPreference.getAUTO_SHOW_KEEPALIVE());
            if ((System.currentTimeMillis() / ((long) 1000)) - keepaliveTimePreference.getKeepaliveLastTime() > configPreference.getAUTO_SHOW_KEEPALIVE()) {
                this$0.showKeepLinkDialog();
            } else {
                Logger.i("MainActivity", "deviceChangeListener showTime less than " + configPreference.getAUTO_SHOW_KEEPALIVE() + " s");
            }
        }
        Logger.i("MainActivity", "requestLoadFaceEntranceV4 success: " + i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deviceChangeListener$lambda$14$lambda$13(int i) {
        Logger.i("MainActivity", "requestLoadFaceEntranceV4 fail: " + i);
        return Unit.INSTANCE;
    }

    private final void doFastPairProductListener(final String modelId, final BluetoothDevice device, final Bundle fastPairExtras) {
        WearableProductManager.Companion companion = WearableProductManager.INSTANCE;
        List<? extends Product> productList$default = ProductManager.DefaultImpls.getProductList$default(DeviceManagerExtKt.getInstance(companion), null, 1, null);
        if (productList$default.isEmpty()) {
            Logger.i("MainActivity", "fast pair product list is empty add product change listener");
            DeviceManagerExtKt.getInstance(companion).addProductChangeListener(new OnProductChangeListener() { // from class: com.xiaomi.fitness.main.MainActivity.doFastPairProductListener.1
                @Override // com.xiaomi.fitness.device.manager.OnProductChangeListener
                public void onChange() {
                    WearableProductManager.Companion companion2 = WearableProductManager.INSTANCE;
                    List productList$default2 = ProductManager.DefaultImpls.getProductList$default(DeviceManagerExtKt.getInstance(companion2), null, 1, null);
                    Logger.i("MainActivity", "fast pair product change listener onChange product.size = " + productList$default2.size());
                    MainActivity.this.launchBindDevice(productList$default2, modelId, device, fastPairExtras);
                    DeviceManagerExtKt.getInstance(companion2).removeProductChangeListener(this);
                }
            });
        } else {
            Logger.i("MainActivity", "fast pair product list is not empty");
            launchBindDevice(productList$default, modelId, device, fastPairExtras);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit foundDeviceByScanBluetooth$lambda$21(final MainActivity this$0, FoundDeviceCallback foundDeviceCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(foundDeviceCallback, "<this>");
        foundDeviceCallback.setOnFound(new Function1() { // from class: gze
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainActivity.foundDeviceByScanBluetooth$lambda$21$lambda$18(this.f19494a, (ScannedDeviceInfo) obj);
            }
        });
        foundDeviceCallback.setOnFailed(new Function1() { // from class: kze
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainActivity.foundDeviceByScanBluetooth$lambda$21$lambda$19(((Integer) obj).intValue());
            }
        });
        foundDeviceCallback.setOnStop(new Function0() { // from class: g0f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.foundDeviceByScanBluetooth$lambda$21$lambda$20();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit foundDeviceByScanBluetooth$lambda$21$lambda$18(final MainActivity this$0, final ScannedDeviceInfo scannedDeviceInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(scannedDeviceInfo, "scannedDeviceInfo");
        Logger.i("scan scannedDeviceInfo " + scannedDeviceInfo, new Object[0]);
        Application application = this$0.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        new BluetoothHelper(application).isTargetDeviceConnected(new Function1() { // from class: k0f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainActivity.foundDeviceByScanBluetooth$lambda$21$lambda$18$lambda$17(scannedDeviceInfo, this$0, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit foundDeviceByScanBluetooth$lambda$21$lambda$18$lambda$17(final ScannedDeviceInfo scannedDeviceInfo, final MainActivity this$0, String address) {
        Intrinsics.checkNotNullParameter(scannedDeviceInfo, "$scannedDeviceInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(address, "address");
        Logger.i("MainActivity", "isTargetDeviceConnected " + address);
        if (Intrinsics.areEqual(scannedDeviceInfo.getBleMac(), address) && !this$0.isDeviceAlreadyBonded(address)) {
            Logger.i("MainActivity", "found target scannedDeviceInfo " + address);
            DialogHelper dialogHelper = DialogHelper.INSTANCE;
            FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            dialogHelper.boundEarPhone(supportFragmentManager, scannedDeviceInfo, new Function0() { // from class: d0f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainActivity.foundDeviceByScanBluetooth$lambda$21$lambda$18$lambda$17$lambda$16(scannedDeviceInfo, this$0);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit foundDeviceByScanBluetooth$lambda$21$lambda$18$lambda$17$lambda$16(ScannedDeviceInfo scannedDeviceInfo, MainActivity this$0) {
        Intrinsics.checkNotNullParameter(scannedDeviceInfo, "$scannedDeviceInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("MainActivity", "goto bind ear phone");
        kb.c().a(DeviceManagerExtKt.BIND_HEAD_PHONE_DEVICE_PATH).withInt("from", 1).withString("key_device_info", null).withParcelable("key_device_info", scannedDeviceInfo).navigation(this$0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit foundDeviceByScanBluetooth$lambda$21$lambda$19(int i) {
        Logger.e("fail to scan, code=" + i, new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit foundDeviceByScanBluetooth$lambda$21$lambda$20() {
        Logger.e("bluetooth stop scan", new Object[0]);
        return Unit.INSTANCE;
    }

    private final FitnessServerSyncer getServerSyncer() {
        return (FitnessServerSyncer) this.serverSyncer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SimplifiedChineseModel getSimplifiedChineseModel() {
        return (SimplifiedChineseModel) this.simplifiedChineseModel.getValue();
    }

    private final void gotoTargetPage() {
        MainTab mainTab;
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString(MainTab.PAGE_TYPE) : null;
        Bundle extras2 = getIntent().getExtras();
        String string2 = extras2 != null ? extras2.getString(MainTab.SON_PAGE_TYPE) : null;
        Logger.i("MainActivity", "gotoTargetPage " + string + " " + string2);
        if (Intrinsics.areEqual(string, "shareDevices")) {
            DeviceShareManagerExtKt.getInstance(DeviceShareManager.INSTANCE).gotoDeviceShareListActivity(this, string2);
        } else {
            if (!Intrinsics.areEqual(string, "otherDevice") || (mainTab = (MainTab) CollectionsKt___CollectionsKt.elementAtOrNull(getMMainTabs(), 1)) == null) {
                return;
            }
            DeviceManagerExtKt.getInstance(DeviceTool.INSTANCE).selectOtherDeviceTab(mainTab.getFragment());
        }
    }

    private final void handleAutoLogin() {
        this.mCheckShowGuide = true;
        Logger.d("MainActivity", "MainActivity is Login");
        checkUpdaterDialog();
        RegionManager.Companion companion = RegionManager.INSTANCE;
        RegionExtKt.getInstance(companion).setUserRegion(new RegionBean.CountryInfo(RegionExtKt.getInstance(companion).getLocalCountry()), new Function1() { // from class: pze
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainActivity.handleAutoLogin$lambda$35((RegionInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleAutoLogin$lambda$35(RegionInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d("MainActivity", "setUserRegion country is " + it.getRegion());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePrivacySensitiveDialog() {
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem("xiaomiwear_app", DeviceSettingConfigKey.KEY_PRIVACY_SENSITIVE).valueToObject(PrivacySensitive.class);
        PrivacySensitive privacySensitive = objValueToObject instanceof PrivacySensitive ? (PrivacySensitive) objValueToObject : null;
        Logger.d("MainActivity", "config-" + privacySensitive);
        if (privacySensitive != null && privacySensitive.isAgreeSensitive()) {
            showUserInfoGuide();
            return;
        }
        PrivacyHelper.Companion companion = PrivacyHelper.INSTANCE;
        PrivacyHelperPointKt.getInstance(companion).showPrivacySensitiveDialogIfNeed(this, new IPrivacySensitiveImpl() { // from class: com.xiaomi.fitness.main.MainActivity.handlePrivacySensitiveDialog.1
            @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl, com.xiaomi.fitness.privacy.export.IPrivacySensitive
            public void onPrivacyAccepted() {
                PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE).setKeyUserSetting(true);
            }

            @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl, com.xiaomi.fitness.privacy.export.IPrivacySensitive
            public void onPrivacyDenied() {
                PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE).setKeyUserSetting(true);
            }
        });
        PrivacyHelperPointKt.getInstance(companion).addUserSettingFinishedListener(new Function1() { // from class: m0f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainActivity.handlePrivacySensitiveDialog$lambda$33(this.f25615a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePrivacySensitiveDialog$lambda$33(MainActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE).getKeyUserSetting()) {
            this$0.showUserInfoGuide();
        }
        return Unit.INSTANCE;
    }

    private final void handleQRScanResult(final String scanResult) {
        List listEmptyList;
        Logger.i("MainActivity", "handleQRScanResult: " + scanResult);
        if (!TextUtils.isEmpty(scanResult) && (StringsKt__StringsJVMKt.startsWith$default(scanResult, "https:", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(scanResult, "http:", false, 2, null))) {
            if (StringsKt__StringsJVMKt.startsWith$default(scanResult, "https://watch.iot.mi.com/html/user-guide/index.html?", false, 2, null)) {
                WebViewUtilKt.startWebView$default(scanResult, getString(h0j.p), false, false, null, false, null, false, 252, null);
                return;
            }
            if (!StringsKt__StringsJVMKt.startsWith$default(scanResult, "https://jd.ubicdn.com", false, 2, null)) {
                LaunchExtensionKt.startActivity(this, (Class<?>) HttpLinkActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: wze
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return MainActivity.handleQRScanResult$lambda$28(scanResult, (Intent) obj);
                    }
                });
                return;
            }
            String query = new URL(scanResult).getQuery();
            if (query == null || (listEmptyList = StringsKt__StringsKt.split$default((CharSequence) query, new String[]{gv5.CONNECT_STR}, false, 0, 6, (Object) null)) == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            Iterator it = listEmptyList.iterator();
            String str = "";
            String str2 = str;
            while (it.hasNext()) {
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 0, 6, (Object) null);
                if (Intrinsics.areEqual(listSplit$default.get(0), DeviceInfo.Builder.PrivateDataKey.IP)) {
                    String str3 = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1);
                    str = str3 == null ? "" : str3;
                }
                if (Intrinsics.areEqual(listSplit$default.get(0), b.F)) {
                    String str4 = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1);
                    str2 = str4 == null ? "" : str4;
                }
            }
            IJustDanceApi.DefaultImpls.gotoControlActivity$default(JustDanceExtKt.getInstance(IJustDanceApi.INSTANCE), this, str, str2, false, 8, null);
            return;
        }
        if (!checkWhetherScanResultCanBeQrCodeId(scanResult)) {
            ToastExtKt.toastShort(this, h0j.common_not_support);
            return;
        }
        String strSubstring = scanResult.substring(38);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        try {
            long j = Long.parseLong(strSubstring);
            if (j > 0) {
                IRelativeCareAccessApi.DefaultImpls.goToConfirmUserinfoPage$default(RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE), this, null, null, Long.valueOf(j), 6, null);
                return;
            }
            Logger.i("MainActivity", "tried to convert scan result to qrCodeId but qrCodeLong=" + j + " <=0");
            ToastExtKt.toastShort(this, h0j.common_not_support);
        } catch (Exception e) {
            Logger.i("MainActivity", "tried to convert scan result to qrCodeId but failed. message=" + e.getMessage());
            ToastExtKt.toastShort(this, h0j.common_not_support);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleQRScanResult$lambda$28(String scanResult, Intent it) {
        Intrinsics.checkNotNullParameter(scanResult, "$scanResult");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra(UriParserExportKt.KEY_LINK_URI, scanResult);
        it.putExtra(UriParserExportKt.KEY_FROM, 3);
        return Unit.INSTANCE;
    }

    private final void initBundleParams(Intent intent) {
        Bundle extras = intent != null ? intent.getExtras() : null;
        boolean z = false;
        if (extras != null) {
            initIndex(extras);
            checkCarCard(extras);
            boolean z2 = extras.getBoolean(MainTab.KEY_SHOW_CHOOSE_COMMON_APP, false);
            Bundle extras2 = intent.getExtras();
            this.sportPageIndex = extras2 != null ? extras2.getInt(SPORT_TAB_INDEX) : 0;
            gotoTargetPage();
            z = z2;
        }
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).setShowCommonAppDialog(z);
        Logger.i("MainActivity", "mCurrentTab is " + this.mCurrentTab + " shouldShowCommonDialog is " + z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initEarPhone() {
        Logger.i("MainActivity", "initEarPhone");
        WearableProductManager.Companion companion = WearableProductManager.INSTANCE;
        List productList$default = ProductManager.DefaultImpls.getProductList$default(DeviceManagerExtKt.getInstance(companion), null, 1, null);
        if (productList$default.isEmpty()) {
            Logger.i("MainActivity", "initEarPhone product list is empty add product change listener");
            DeviceManagerExtKt.getInstance(companion).addProductChangeListener(new OnProductChangeListener() { // from class: com.xiaomi.fitness.main.MainActivity.initEarPhone.1
                @Override // com.xiaomi.fitness.device.manager.OnProductChangeListener
                public void onChange() {
                    WearableProductManager.Companion companion2 = WearableProductManager.INSTANCE;
                    List productList$default2 = ProductManager.DefaultImpls.getProductList$default(DeviceManagerExtKt.getInstance(companion2), null, 1, null);
                    Logger.i("MainActivity", "initEarPhone product change listener onChange product.size = " + productList$default2.size());
                    DeviceManagerExtKt.getInstance(companion2).removeProductChangeListener(this);
                    if (productList$default2.isEmpty()) {
                        Logger.i("MainActivity", "initEarPhone product list is empty");
                    } else {
                        MainActivity.this.foundDeviceByScanBluetooth();
                    }
                }
            });
            return;
        }
        Logger.i("MainActivity", "initEarPhone product list is not empty");
        Iterator it = productList$default.iterator();
        while (it.hasNext()) {
            Logger.i("MainActivity", "productList " + ((WearableProduct) it.next()).getModel());
        }
        foundDeviceByScanBluetooth();
    }

    private final void initIndex(Bundle bundle) {
        int iIntValue;
        Object obj = bundle.get("key_tab");
        if (obj instanceof Integer) {
            iIntValue = ((Number) obj).intValue();
        } else {
            iIntValue = obj instanceof String ? Integer.parseInt((String) obj) : -1;
        }
        this.mCurrentTab = iIntValue;
    }

    private final boolean isDeviceAlreadyBonded(final String mac) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).findDeviceModel(new Function1() { // from class: vze
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(MainActivity.isDeviceAlreadyBonded$lambda$23(mac, (WearableDeviceModel) obj));
            }
        });
        Logger.i("MainActivity", "isAlreadyBonded() called with: " + wearableDeviceModel);
        return wearableDeviceModel != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDeviceAlreadyBonded$lambda$23(String mac, WearableDeviceModel it) {
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(DeviceModelExtKt.getMac(it), mac);
    }

    private final boolean isWearProduct(int type) {
        return type == 2 || type == 3 || type == 6 || type == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBindDevice(List<? extends Product> productList, String modelId, BluetoothDevice device, Bundle fastPairExtras) {
        for (Product product : productList) {
            List<String> wearOsModelIds = product.getWearOsModelIds();
            if (wearOsModelIds != null && CollectionsKt___CollectionsKt.contains(wearOsModelIds, modelId)) {
                Logger.i("MainActivity", "fast pair product matched " + product.getModel());
                WearOSUtil.Companion companion = WearOSUtil.INSTANCE;
                if (WearOsExtKt.getInstance(companion).isWearosRequirementNotPass()) {
                    ToastExtKt.toastLong(this, "Please upgrade Google GMS version first");
                    return;
                }
                if (WearOsExtKt.getInstance(companion).isUnderOobe()) {
                    Logger.i("MainActivity", "fast pair returned as it's already under oobe");
                    return;
                }
                String productName = product.getProductName();
                if (productName == null) {
                    productName = "";
                }
                String address = device.getAddress();
                Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
                DeviceManagerExtKt.launchToBindDevice(this, productName, address, null, product, 5, "", (128 & 64) != 0 ? null : fastPairExtras, (128 & 128) != 0 ? false : false);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(MainActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d("MainActivity", "getAppUpgrade ");
        if (z && RegionPreference.INSTANCE.getPRIVACY_AGREE()) {
            this$0.mShowGuide = true;
            this$0.handleAutoLogin();
        }
        return Unit.INSTANCE;
    }

    private final void postDelayed(long delayMillis, Runnable r2) {
        if (this.mTimerHandler == null) {
            this.mTimerHandler = new Handler(Looper.getMainLooper());
        }
        Handler handler = this.mTimerHandler;
        Intrinsics.checkNotNull(handler);
        handler.postDelayed(r2, delayMillis);
    }

    private final void processIntent() {
        String action;
        Intent intent = getIntent();
        if (intent == null || (action = intent.getAction()) == null || action.hashCode() != -2087046445 || !action.equals(PushManagerKt.sMainPageHandlerPaddingAction)) {
            return;
        }
        getPushManager().processPendingMessage();
    }

    private final void refreshDeviceTabIcon() {
        WearableDeviceModel wearableDeviceModel;
        TabLayout.g gVarX = getMainTlBottom().x(2);
        View viewE = gVarX != null ? gVarX.e() : null;
        ViewGroup viewGroup = viewE instanceof ViewGroup ? (ViewGroup) viewE : null;
        if (viewGroup == null || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null) {
            return;
        }
        boolean z = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).getFaceEntranceRedPoint(wearableDeviceModel.getDid()) || !d2m.y(this);
        ImageView imageView = (ImageView) viewGroup.findViewById(hri.h);
        if (imageView == null) {
            return;
        }
        ViewExtKt.setVisible(imageView, z);
        Logger.d("MainActivity", "deviceChangeListener isIgnoringBattery=" + d2m.y(this));
    }

    private final void registerDataChangedBroadcast() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("recent_data_changed_broadcast");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.mDataChangedReceiver, intentFilter, 2);
        } else {
            ni4.k(this, this.mDataChangedReceiver, intentFilter, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeServiceConnectionListener() {
        ServiceConnector.removeServiceConnectListener$default(ServiceConnector.INSTANCE.getInstance(), this.mServiceConnection, 0, 2, null);
    }

    private final void requestDeviceTabRedPoint() {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        try {
            DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceChangeListener(this.deviceChangeListener);
        } catch (Exception e) {
            Logger.e("MainActivity", "requestDeviceTabRedPoint error: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectSportTab(j1f j1fVar, Fragment fragment) {
        if (j1fVar.B.getSelectedTabPosition() == MainTab.INSTANCE.getINDEX_SPORT()) {
            getSimplifiedChineseModel().showFragment(this, j1fVar.B.getSelectedTabPosition(), hri.c, fragment, this.mCurrentFragment);
            this.mCurrentFragment = fragment;
        }
        SimplifiedChineseModel simplifiedChineseModel = getSimplifiedChineseModel();
        TabLayout mainTlBottom = j1fVar.B;
        Intrinsics.checkNotNullExpressionValue(mainTlBottom, "mainTlBottom");
        simplifiedChineseModel.selectTab(this, mainTlBottom, this.mCurrentTab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selected(TabLayout.g gVar, boolean z) {
        if (gVar.e() instanceof TextView) {
            int i = z ? mji.f26931a : mji.c;
            View viewE = gVar.e();
            Intrinsics.checkNotNull(viewE, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewE).setTextColor(getColor(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessServerSyncer serverSyncer_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shouldShowLoginWhenTokenInvalid() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            AccountManagerExtKt.getInstance(TokenManager.INSTANCE).update();
        }
    }

    private final void showConnectNewPhoneIfNeed() {
        if (MainExtKt.getBindNew()) {
            SettingsPageUtilExtKt.getSettingsPageUtil().gotoConnectNewPhonePage(this);
            MainExtKt.setBindNew(false);
        }
    }

    @SuppressLint({"StringFormatInvalid"})
    private final void showGoToWearableAppDialog() {
        String string = ApplicationExtKt.getApplication().getResources().getString(h0j.m, MainCommonAppUrlsKt.getSelectCommonApplicationUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Spannable spannableA = LinkSpanHelper.a(this, string, Integer.valueOf(mji.f26931a), new LinkSpanHelper.a() { // from class: b0f
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                MainActivity.showGoToWearableAppDialog$lambda$32(view, str);
            }
        });
        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).setIntentStartApp(false);
        CommonDialog<?> commonDialog = this.mGoToAppDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            if (this.mGoToAppDialog == null) {
                this.mGoToAppDialog = new CommonDialog.c("goto").setDialogTitle(h0j.l).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableA)).setPositiveText(h0j.f19543k).setNegativeText(h0j.i).setCanceledOnBackPressed(false).setCancelable(false).create();
            }
            CommonDialog<?> commonDialog2 = this.mGoToAppDialog;
            Intrinsics.checkNotNull(commonDialog2 != null ? commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.main.MainActivity.showGoToWearableAppDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        dialog.dismiss();
                        MainActivity.this.mGoToAppDialog = null;
                    } else {
                        if (which != -1) {
                            return;
                        }
                        dialog.dismiss();
                        Intent launchIntentForPackage = MainActivity.this.getPackageManager().getLaunchIntentForPackage("com.xiaomi.wearable");
                        if (launchIntentForPackage != null) {
                            MainActivity.this.startActivity(launchIntentForPackage);
                        }
                        MainActivity.this.mGoToAppDialog = null;
                    }
                }

                @Override // defpackage.av6
                public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    super.onDialogMultiClick(dialogName, which, isChecked);
                }
            }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
            Logger.d("MainActivity", "SYNC WEB showIfNeed");
            CommonDialog<?> commonDialog3 = this.mGoToAppDialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(getSupportFragmentManager());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showGoToWearableAppDialog$lambda$32(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    private final void showKeepLinkDialog() {
        WearableDeviceInfo deviceInfo;
        WearableDeviceInfo deviceInfo2;
        Logger.d("MainActivity", "showKeepLinkDialog isShowKeepAliveDialog = " + this.isShowKeepAliveDialog + " ");
        CommonDialog<?> commonDialog = this.mDialog;
        if ((commonDialog == null || !commonDialog.isShowing()) && !this.isShowKeepAliveDialog) {
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            final int i = (wearableDeviceModel == null || (deviceInfo2 = wearableDeviceModel.getDeviceInfo()) == null || !deviceInfo2.isBandType()) ? h0j.f : h0j.f19542b;
            CommonDialog.c canceledOnTouchOutside = new CommonDialog.c("keep_link_permission").setDialogTitle(i).setCanceledOnTouchOutside(true);
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            CommonDialog<?> commonDialogCreate = canceledOnTouchOutside.setDialogDescription((wearableDeviceModel2 == null || (deviceInfo = wearableDeviceModel2.getDeviceInfo()) == null || !deviceInfo.isBandType()) ? h0j.c : h0j.d).setCancelable(true).setPositiveText(h0j.e).create();
            this.mDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate != null ? commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.main.MainActivity.showKeepLinkDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        String strA = of4.a(LocaleUtil.getCurrentLocale(), "app");
                        Intrinsics.checkNotNullExpressionValue(strA, "getKeepAliveHelpUrl(...)");
                        WebViewUtilKt.startWebView$default(strA, ResourceExtKt.getString(i), false, false, null, false, null, false, 252, null);
                    }
                }
            }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
            KeepaliveTimePreference.INSTANCE.setKeepaliveLastTime(System.currentTimeMillis() / ((long) 1000));
            this.isShowKeepAliveDialog = true;
            CommonDialog<?> commonDialog2 = this.mDialog;
            if (commonDialog2 != null) {
                commonDialog2.showIfNeed(getSupportFragmentManager());
            }
        }
    }

    private final void showLoginDialogIfNeed() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() || !MainExtKt.getShowLoginDialog()) {
            return;
        }
        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(this);
        MainExtKt.setShowLoginDialog(false);
    }

    private final void showPrivacyDialog() {
        CheckerUserSettingManager.Companion companion = CheckerUserSettingManager.INSTANCE;
        CheckerUserSettingManagerExtKt.getInstance(companion).requestData(this);
        if (this.listener == null) {
            this.listener = new Function1() { // from class: i0f
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MainActivity.showPrivacyDialog$lambda$24(this.f20649a, ((Boolean) obj).booleanValue());
                }
            };
            CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(companion);
            Function1<? super Boolean, Unit> function1 = this.listener;
            Intrinsics.checkNotNull(function1);
            checkerUserSettingManagerExtKt.addPrivacyDialogFinishedListener(function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPrivacyDialog$lambda$24(MainActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).getPrivacyDialogFinished()) {
            Logger.i("MainActivity", "showPrivacySensitiveDialog finish ");
            this$0.showPrivacySensitiveDialog();
        }
        return Unit.INSTANCE;
    }

    private final void showPrivacySensitiveDialog() {
        if (this.listener != null) {
            CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
            Function1<? super Boolean, Unit> function1 = this.listener;
            Intrinsics.checkNotNull(function1);
            checkerUserSettingManagerExtKt.removePrivacyDialogFinishedListener(function1);
        }
        if (PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE).getKeyUserSetting()) {
            showUserInfoGuide();
            return;
        }
        if (AppUtil.INSTANCE.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            showUserInfoGuide();
            return;
        }
        DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
        if (companion.getInstance().getUserLastUpdateTime() != 0) {
            handlePrivacySensitiveDialog();
        } else {
            Logger.d("MainActivity", "showPrivacySensitiveDialog addUpdateListener");
            companion.getInstance().addUpdateListener(this.listenerDeviceManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRecognitionPermission$lambda$38(final FragmentActivity activity, final MainActivity this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: xze
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainActivity.showRecognitionPermission$lambda$38$lambda$36((String) obj);
            }
        });
        permission.denied(new Function1() { // from class: yze
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainActivity.showRecognitionPermission$lambda$38$lambda$37(activity, this$0, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRecognitionPermission$lambda$38$lambda$36(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessDataPreference.INSTANCE.setRecognitionPermission(PermissionsUtil.INSTANCE.checkPermission("android.permission.ACTIVITY_RECOGNITION"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRecognitionPermission$lambda$38$lambda$37(FragmentActivity activity, MainActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!a.z(activity, it) && !ActivityRecognitionPermissionUtil.INSTANCE.checkPermissionDialogEnable(activity)) {
            this$0.showRecognitionPermissionGuide(activity);
        }
        return Unit.INSTANCE;
    }

    private final void showRecognitionPermissionGuide(final FragmentActivity activity) {
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        final CommonDialog commonDialogCreate = new CommonDialog.c("activity_recognition_permission").setDialogTitle(h0j.t).setDialogDescription(h0j.s).setPositiveText(h0j.f19544r).setNegativeText(h0j.f19541a).setCancelable(false).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.main.MainActivity.showRecognitionPermissionGuide.1
            @Override // defpackage.av6
            @RequiresApi(29)
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    commonDialogCreate.dismiss();
                } else {
                    if (which != -1) {
                        return;
                    }
                    SystemSetting.INSTANCE.goToSetting(activity);
                    commonDialogCreate.dismiss();
                }
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        commonDialogCreate.showIfNeed(supportFragmentManager);
        FitnessLogUtils.i("MiuiFitnessFunction", " recognition permission guide show");
    }

    private final void showSyncWebDialog() {
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        if (regionPreference.getDefaultSyncWeb()) {
            dealWithMedal();
            return;
        }
        MainCommonAppUrlsKt.showSyncWebCommonDialog(this, new av6() { // from class: com.xiaomi.fitness.main.MainActivity.showSyncWebDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    dialog.dismiss();
                    RegionPreference regionPreference2 = RegionPreference.INSTANCE;
                    regionPreference2.setSyncWeb(which == -1);
                    regionPreference2.setSettingSyncWeb(true);
                    return;
                }
                if (which != -1) {
                    return;
                }
                dialog.dismiss();
                RegionPreference regionPreference3 = RegionPreference.INSTANCE;
                regionPreference3.setSyncWeb(which == -1);
                regionPreference3.setSettingSyncWeb(true);
                MainActivity.this.triggerSyncWithServer();
            }
        });
        if (this.mSyncWebListener == null) {
            this.mSyncWebListener = new Function1() { // from class: lze
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MainActivity.showSyncWebDialog$lambda$27(this.f25582a, ((Boolean) obj).booleanValue());
                }
            };
        }
        Function1<? super Boolean, Unit> function1 = this.mSyncWebListener;
        Intrinsics.checkNotNull(function1);
        regionPreference.addSyncWebListener(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSyncWebDialog$lambda$27(final MainActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (RegionPreference.INSTANCE.getDefaultSyncWeb()) {
            this$0.postDelayed(1000L, new Runnable() { // from class: a0f
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.showSyncWebDialog$lambda$27$lambda$26(this.f481a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSyncWebDialog$lambda$27$lambda$26(MainActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dealWithMedal();
    }

    private final void showUserInfoGuide() {
        if (!this.mCheckShowGuide) {
            showSyncWebDialog();
            return;
        }
        if (this.mGuideFinishListener == null) {
            this.mGuideFinishListener = new Function1() { // from class: f0f
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MainActivity.showUserInfoGuide$lambda$25(this.f17261a, ((Boolean) obj).booleanValue());
                }
            };
            SetPageManager setPageManageExtKt = SetPageManageExtKt.getInstance(SetPageManager.INSTANCE);
            Function1<? super Boolean, Unit> function1 = this.mGuideFinishListener;
            Intrinsics.checkNotNull(function1);
            setPageManageExtKt.addGuideFinishListener(function1);
        }
        syncLocalStatusToWeb(this.mShowGuide);
        this.mCheckShowGuide = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showUserInfoGuide$lambda$25(MainActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean showGuidePageFinish = SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).getShowGuidePageFinish();
        if (showGuidePageFinish) {
            this$0.showSyncWebDialog();
        }
        Logger.i("MainActivity", "showUserInfoGuide mFirstSetCommonProperties is " + this$0.mFirstSetCommonProperties + " SetPageManager.instance.getShowGuidePageFinish() is " + showGuidePageFinish);
        if (!this$0.mFirstSetCommonProperties) {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).setCommonProperty();
            this$0.mFirstSetCommonProperties = true;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimplifiedChineseModel simplifiedChineseModel_delegate$lambda$1() {
        return new SimplifiedChineseModel();
    }

    private final void syncLocalStatusToWeb(boolean isShowGuide) {
        Logger.d("MainActivity", "checkUserProfile start");
        CheckerUserSettingManager.Companion companion = CheckerUserSettingManager.INSTANCE;
        CheckerUserSettingManagerExtKt.getInstance(companion).checkUserProfile(isShowGuide);
        if (CheckerUserSettingManagerExtKt.getInstance(companion).getSelectMode() != -1) {
            Logger.d("MainActivity", "getSelectMode " + CheckerUserSettingManagerExtKt.getInstance(companion).getSelectMode());
            CheckerUserSettingManagerExtKt.getInstance(companion).setSelectModeToWeb(CheckerUserSettingManagerExtKt.getInstance(companion).getSelectMode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerSyncWithServer() {
        FitnessServerSyncer.DefaultImpls.syncWithServer$default(getServerSyncer(), true, "cloud_sync_switch", null, 4, null);
    }

    public final void attachModule(@Nullable String appName, @Nullable String module) {
        fur furVar = this.mDelegate;
        if (furVar != null) {
            Intrinsics.checkNotNull(furVar);
            furVar.a(appName, module);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final j1f j1fVar) {
        Intrinsics.checkNotNullParameter(j1fVar, "<this>");
        j1fVar.B.addOnTabSelectedListener(new TabLayout.d() { // from class: com.xiaomi.fitness.main.MainActivity.bindView.1
            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabReselected(TabLayout.g tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabSelected(TabLayout.g tab) {
                Object objI = tab != null ? tab.i() : null;
                Intrinsics.checkNotNull(objI, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                Fragment fragment = (Fragment) objI;
                if (MainActivity.this.getSimplifiedChineseModel().isPrivacyEasyMode()) {
                    MainActivity.this.selectSportTab(j1fVar, fragment);
                    return;
                }
                MainActivity mainActivity = MainActivity.this;
                LaunchExtensionKt.showFragment(mainActivity, hri.c, fragment, mainActivity.mCurrentFragment);
                MainActivity.this.mCurrentFragment = fragment;
                MainActivity.this.shouldShowLoginWhenTokenInvalid();
                MainActivity.this.selected(tab, true);
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabUnselected(TabLayout.g tab) {
                if (tab != null) {
                    MainActivity.this.selected(tab, false);
                }
            }
        });
        int i = 0;
        for (Object obj : CollectionsKt___CollectionsKt.sortedWith(getMMainTabs(), new Comparator() { // from class: com.xiaomi.fitness.main.MainActivity$bindView$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((MainTab) t).getIndex()), Integer.valueOf(((MainTab) t2).getIndex()));
            }
        })) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            MainTab mainTab = (MainTab) obj;
            TabLayout.g gVarA = ((j1f) getMBinding()).B.A();
            Intrinsics.checkNotNullExpressionValue(gVarA, "newTab(...)");
            u2f u2fVarA0 = u2f.A0(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(u2fVarA0, "inflate(...)");
            gVarA.p(u2fVarA0.getRoot());
            u2fVarA0.A.setImageDrawable(ResourceExtKt.getResourceDrawable(this, mainTab.getIcon()));
            u2fVarA0.B.setText(mainTab.getName());
            gVarA.t(mainTab.getFragment());
            getSimplifiedChineseModel().setTabClickListener(this, gVarA, i);
            j1fVar.B.d(gVarA, i);
            i = i2;
        }
        SimplifiedChineseModel simplifiedChineseModel = getSimplifiedChineseModel();
        TabLayout mainTlBottom = ((j1f) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(mainTlBottom, "mainTlBottom");
        simplifiedChineseModel.selectDefaultTab(mainTlBottom);
    }

    public final void doFastPairing() {
        Bundle fastPairExtras;
        BluetoothDevice bluetoothDevice;
        if (!AppUtil.INSTANCE.isPlayChannel() || (fastPairExtras = WearOsExtKt.getInstance(FastPairManager.INSTANCE).getFastPairExtras()) == null || !fastPairExtras.containsKey("android.bluetooth.device.extra.DEVICE") || (bluetoothDevice = (BluetoothDevice) fastPairExtras.getParcelable("android.bluetooth.device.extra.DEVICE")) == null) {
            return;
        }
        String string = fastPairExtras.getString(WearOsExtKt.EXTRA_MODEL_ID);
        Logger.i("MainActivity", "fast pair modelId " + string);
        ServiceConnector.Companion companion = ServiceConnector.INSTANCE;
        if (ServiceConnector.isConnected$default(companion.getInstance(), 0, 1, null)) {
            doFastPairProductListener(string, bluetoothDevice, fastPairExtras);
        } else {
            ServiceConnector.addServiceConnectListener$default(companion.getInstance(), this.mServiceConnection, 0, 2, null);
        }
    }

    public final void foundDeviceByScanBluetooth() {
        if (ni4.a(ApplicationExtKt.getApplication(), "android.permission.BLUETOOTH_CONNECT") != 0) {
            Logger.i("MainActivity", "initEarPhone BLUETOOTH_CONNECT permission not granted");
            return;
        }
        List<WearableProduct> productList$default = ProductManager.DefaultImpls.getProductList$default(DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE), null, 1, null);
        if (productList$default.isEmpty()) {
            Logger.i("MainActivity", "initEarPhone product list is empty");
            return;
        }
        Function1<? super FoundDeviceCallback, Unit> function1 = new Function1() { // from class: o0f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainActivity.foundDeviceByScanBluetooth$lambda$21(this.f28612a, (FoundDeviceCallback) obj);
            }
        };
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (WearableProduct wearableProduct : productList$default) {
            if (wearableProduct.getType() == 1 || wearableProduct.getType() == 5) {
                if (wearableProduct.getBltNamePrefix() != null) {
                    ListExtKt.add(arrayList, wearableProduct.getBltNamePrefix());
                }
            } else if (isWearProduct(wearableProduct.getType())) {
                arrayList2.add(Integer.valueOf(wearableProduct.getProductId()));
            } else {
                arrayList3.add(Integer.valueOf(wearableProduct.getProductId()));
            }
        }
        DeviceManagerExtKt.getInstance(DeviceTool.INSTANCE).foundDeviceByScanBluetooth(arrayList, arrayList2, arrayList3, function1);
    }

    @Override // defpackage.b1d
    @Nullable
    public a1d getActivityDelegate() {
        return this.mDelegate;
    }

    @NotNull
    public final AppUpgradeHelper getAppUpgradeHelper() {
        AppUpgradeHelper appUpgradeHelper = this.appUpgradeHelper;
        if (appUpgradeHelper != null) {
            return appUpgradeHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appUpgradeHelper");
        return null;
    }

    @NotNull
    public final CheckUpdateManager getCheckUpdate() {
        CheckUpdateManager checkUpdateManager = this.checkUpdate;
        if (checkUpdateManager != null) {
            return checkUpdateManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkUpdate");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public boolean getEnableAutoSetLayoutUiMode() {
        return this.enableAutoSetLayoutUiMode;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nui.f28379a;
    }

    @NotNull
    public final Set<MainTab> getMMainTabs() {
        Set<MainTab> set = this.mMainTabs;
        if (set != null) {
            return set;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mMainTabs");
        return null;
    }

    @NotNull
    public final Function1<Boolean, Unit> getMNetworkListener() {
        return this.mNetworkListener;
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        UserInfoManager userInfoManager = this.mUserInfoManager;
        if (userInfoManager != null) {
            return userInfoManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserInfoManager");
        return null;
    }

    @NotNull
    public final TabLayout getMainTlBottom() {
        TabLayout tabLayout = this.mainTlBottom;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainTlBottom");
        return null;
    }

    @NotNull
    public final PushManager getPushManager() {
        PushManager pushManager = this.pushManager;
        if (pushManager != null) {
            return pushManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pushManager");
        return null;
    }

    public final int getSportPageIndex() {
        return this.sportPageIndex;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ev1.f17088a;
    }

    @Override // defpackage.fv5
    public void invokeDefaultOnBackPressed() {
        super.lambda$onCreate$0();
    }

    /* JADX INFO: renamed from: isInBackground, reason: from getter */
    public final boolean getIsInBackground() {
        return this.isInBackground;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public boolean isNeedRestore() {
        return false;
    }

    /* JADX INFO: renamed from: isShowKeepAliveDialog, reason: from getter */
    public final boolean getIsShowKeepAliveDialog() {
        return this.isShowKeepAliveDialog;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        String stringExtra;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != -1) {
            return;
        }
        if (requestCode == 666) {
            if (data == null || (stringExtra = data.getStringExtra("scan_result")) == null) {
                return;
            } else {
                handleQRScanResult(stringExtra);
            }
        }
        fur furVar = this.mDelegate;
        if (furVar != null) {
            Intrinsics.checkNotNull(furVar);
            furVar.d(requestCode, resultCode, data);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        ReactContext reactContextC;
        fur furVar = this.mDelegate;
        if (furVar != null) {
            Intrinsics.checkNotNull(furVar);
            com.facebook.react.a aVarC = furVar.c();
            Activity currentActivity = (aVarC == null || (reactContextC = aVarC.C()) == null) ? null : reactContextC.getCurrentActivity();
            fur furVar2 = this.mDelegate;
            Intrinsics.checkNotNull(furVar2);
            if (!furVar2.e() || currentActivity != this) {
                super.lambda$onCreate$0();
            }
        }
        finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        setRequestedOrientation(UIUtils.INSTANCE.isTabletOrLandscape(this) ? -1 : 1);
        super.onConfigurationChanged(newConfig);
        fur furVar = this.mDelegate;
        if (furVar != null) {
            Intrinsics.checkNotNull(furVar);
            furVar.f(newConfig);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.main.Hilt_MainActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UIUtils uIUtils = UIUtils.INSTANCE;
        if (!uIUtils.isTabletOrLandscape(this) && getRequestedOrientation() != 1) {
            setRequestedOrientation(1);
        }
        this.mDelegate = createReactActivityDelegate();
        Logger.i("MainActivity", "MainActivity onCreate");
        initBundleParams(getIntent());
        setActionBarDisplayable(false);
        uIUtils.setNavigationBarColor(this, mji.f26932b);
        AccountManager.Companion companion = AccountManager.INSTANCE;
        if (AccountManagerExtKt.getInstance(companion).isLogin()) {
            this.mShowGuide = false;
            handleAutoLogin();
        }
        if (this.mAccountListener == null) {
            this.mAccountListener = new Function1() { // from class: nze
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MainActivity.onCreate$lambda$2(this.f28587a, ((Boolean) obj).booleanValue());
                }
            };
            AccountManager accountManagerExtKt = AccountManagerExtKt.getInstance(companion);
            Function1<? super Boolean, Unit> function1 = this.mAccountListener;
            Intrinsics.checkNotNull(function1);
            accountManagerExtKt.addAccountListener(function1);
        }
        NetworkExtKt.registerConnectChangeListener(this.mNetworkListener);
        registerDataChangedBroadcast();
        getPushManager().processPendingMessage();
        Trace.endSection();
        setMainTlBottom(((j1f) getMBinding()).B);
        doFastPairing();
        showLoginDialogIfNeed();
        DeviceManager.DefaultImpls.requestDeviceList$default(com.xiaomi.fitness.device.manager.DeviceManagerExtKt.getInstance(DeviceManager.INSTANCE), null, null, 3, null);
        if (ActivityRecognitionPermissionUtil.INSTANCE.isHyperOSNAndroidV(this) && !PrivacyEasyModePreference.INSTANCE.isEasyMode()) {
            showRecognitionPermission(this);
        }
        requestDeviceTabRedPoint();
        fur furVar = this.mDelegate;
        if (furVar != null) {
            Intrinsics.checkNotNull(furVar);
            furVar.g(savedInstanceState);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    @Override // com.xiaomi.fitness.main.Hilt_MainActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        NetworkExtKt.unregisterConnectChangeListener(this.mNetworkListener);
        super.onDestroy();
        unregisterReceiver(this.mDataChangedReceiver);
        if (this.listener != null) {
            CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
            Function1<? super Boolean, Unit> function1 = this.listener;
            Intrinsics.checkNotNull(function1);
            checkerUserSettingManagerExtKt.removePrivacyDialogFinishedListener(function1);
        }
        if (this.mGuideFinishListener != null) {
            SetPageManager setPageManageExtKt = SetPageManageExtKt.getInstance(SetPageManager.INSTANCE);
            Function1<? super Boolean, Unit> function2 = this.mGuideFinishListener;
            Intrinsics.checkNotNull(function2);
            setPageManageExtKt.removeGuideFinishListener(function2);
            this.mGuideFinishListener = null;
        }
        DeviceSettingManager.INSTANCE.getInstance().removeUpdateListener(this.listenerDeviceManager);
        Handler handler = this.mTimerHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Function1<? super Boolean, Unit> function3 = this.mSyncWebListener;
        if (function3 != null) {
            RegionPreference regionPreference = RegionPreference.INSTANCE;
            Intrinsics.checkNotNull(function3);
            regionPreference.removeSyncWebListener(function3);
            this.mSyncWebListener = null;
        }
        if (this.mAccountListener != null) {
            AccountManager accountManagerExtKt = AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
            Function1<? super Boolean, Unit> function4 = this.mAccountListener;
            Intrinsics.checkNotNull(function4);
            accountManagerExtKt.removeAccountListener(function4);
        }
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceChangeListener(this.deviceChangeListener);
        fur furVar = this.mDelegate;
        if (furVar != null) {
            Intrinsics.checkNotNull(furVar);
            furVar.h();
        }
    }

    @Override // miuix.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, @Nullable KeyEvent event) {
        fur furVar = this.mDelegate;
        Intrinsics.checkNotNull(furVar);
        return furVar.i(keyCode, event) || super.onKeyUp(keyCode, event);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Logger.d("MainActivity", "MainActivity onNewIntent");
        initBundleParams(intent);
        processIntent();
        int intExtra = intent.getIntExtra(ACTION_CHOICE_APP, -1);
        long longExtra = intent.getLongExtra(ACTION_CHOICE_APP_TIME, 0L);
        Logger.i("MainActivity", "checkCommonApplication onNewIntent after is " + intExtra + " commonAPPTime is " + longExtra);
        if (intExtra != -1 && longExtra != 0) {
            ChooseAppPreference chooseAppPreference = ChooseAppPreference.INSTANCE;
            chooseAppPreference.setChooseApp(intExtra);
            chooseAppPreference.setChooseAppLastTime(longExtra);
            Logger.i("MainActivity", "checkCommonApplication SET INTENT START APP TRUE 1");
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).setIntentStartApp(true);
        }
        doFastPairing();
        checkCommonApplication();
        showLoginDialogIfNeed();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.isInBackground = true;
        fur furVar = this.mDelegate;
        if (furVar != null) {
            Intrinsics.checkNotNull(furVar);
            furVar.k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public void onRelease() {
        ((j1f) getMBinding()).B.n();
        this.mCurrentFragment = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    @RequiresApi(24)
    public void onResume() {
        super.onResume();
        fur furVar = this.mDelegate;
        if (furVar != null) {
            Intrinsics.checkNotNull(furVar);
            furVar.m();
        }
        refreshDeviceTabIcon();
        this.isInBackground = false;
        AccountManager.Companion companion = AccountManager.INSTANCE;
        if (AccountManagerExtKt.getInstance(companion).isLogin()) {
            showPrivacyDialog();
            if (!AppUtil.INSTANCE.isPlayChannel()) {
                DeviceShareManagerExtKt.getInstance(DeviceShareManager.INSTANCE).checkDeviceShareDialog(this);
            }
        }
        Intent intent = getIntent();
        int index_sport = -1;
        Logger.i("MainActivity", "checkCommonApplication onResume commonApp is" + (intent != null ? Integer.valueOf(intent.getIntExtra(ACTION_CHOICE_APP, -1)) : null));
        checkCommonApplication();
        getCheckUpdate().checkHasPendingCheckUpdate();
        int i = this.mCurrentTab;
        if (i > -1 && i < ((j1f) getMBinding()).B.getTabCount()) {
            if (getSimplifiedChineseModel().isPrivacyEasyMode()) {
                TabLayout tabLayout = ((j1f) getMBinding()).B;
                MainTab.Companion companion2 = MainTab.INSTANCE;
                TabLayout.g gVarX = tabLayout.x(companion2.getINDEX_SPORT());
                if (gVarX != null) {
                    gVarX.m();
                }
                index_sport = companion2.getINDEX_SPORT();
            } else {
                if (this.mCurrentTab == MainTab.INSTANCE.getINDEX_SPORT()) {
                    TabLayout.g gVarX2 = getMainTlBottom().x(this.mCurrentTab);
                    Object objI = gVarX2 != null ? gVarX2.i() : null;
                    Intrinsics.checkNotNull(objI, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                    Bundle bundle = new Bundle();
                    bundle.putInt(SPORT_TAB_INDEX, this.sportPageIndex);
                    Unit unit = Unit.INSTANCE;
                    ((Fragment) objI).setArguments(bundle);
                    this.sportPageIndex = 0;
                }
                TabLayout.g gVarX3 = ((j1f) getMBinding()).B.x(this.mCurrentTab);
                if (gVarX3 != null) {
                    gVarX3.m();
                }
            }
            this.mCurrentTab = index_sport;
        }
        if (AccountManagerExtKt.getInstance(companion).isLogin() && !this.mLoginOnetrack) {
            HashMap map = new HashMap();
            String strMD5 = MD5Util.MD5(getMUserInfoManager().getUserId());
            if (strMD5 != null) {
                AccountType accountType = AccountType.XIAOMI;
                Logger.d("MainActivity", "onLoginSuccess ontrack userid is " + strMD5 + " AccountType.XIAOMI is " + accountType + " mMap is " + map);
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).login(strMD5, accountType, map, false);
            }
            this.mLoginOnetrack = true;
        }
        NotificationPermission.INSTANCE.checkNotifyAndAlarmPermissionForAll(this);
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).checkBbLocationPermission();
        showConnectNewPhoneIfNeed();
        if (Build.VERSION.SDK_INT < 29 || PrivacyEasyModePreference.INSTANCE.isEasyMode()) {
            return;
        }
        boolean zCheckPermission = PermissionsUtil.INSTANCE.checkPermission("android.permission.ACTIVITY_RECOGNITION");
        FitnessDataPreference fitnessDataPreference = FitnessDataPreference.INSTANCE;
        if (zCheckPermission != fitnessDataPreference.getGetRecognitionPermission()) {
            fitnessDataPreference.setRecognitionPermission(zCheckPermission);
        }
    }

    @Override // defpackage.prh
    public void requestPermissions(@Nullable String[] permissions, int requestCode, @Nullable gsh listener) {
        Intrinsics.checkNotNull(permissions);
        super.requestPermissions(permissions, requestCode);
        fur furVar = this.mDelegate;
        if (furVar != null) {
            Intrinsics.checkNotNull(furVar);
            furVar.n(permissions, requestCode, listener);
        }
    }

    public final void setAppUpgradeHelper(@NotNull AppUpgradeHelper appUpgradeHelper) {
        Intrinsics.checkNotNullParameter(appUpgradeHelper, "<set-?>");
        this.appUpgradeHelper = appUpgradeHelper;
    }

    public final void setCheckUpdate(@NotNull CheckUpdateManager checkUpdateManager) {
        Intrinsics.checkNotNullParameter(checkUpdateManager, "<set-?>");
        this.checkUpdate = checkUpdateManager;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public void setEnableAutoSetLayoutUiMode(boolean z) {
        this.enableAutoSetLayoutUiMode = z;
    }

    public final void setInBackground(boolean z) {
        this.isInBackground = z;
    }

    public final void setMMainTabs(@NotNull Set<MainTab> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.mMainTabs = set;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setMainTlBottom(@NotNull TabLayout tabLayout) {
        Intrinsics.checkNotNullParameter(tabLayout, "<set-?>");
        this.mainTlBottom = tabLayout;
    }

    public final void setPushManager(@NotNull PushManager pushManager) {
        Intrinsics.checkNotNullParameter(pushManager, "<set-?>");
        this.pushManager = pushManager;
    }

    public final void setShowKeepAliveDialog(boolean z) {
        this.isShowKeepAliveDialog = z;
    }

    public final void setSportPageIndex(int i) {
        this.sportPageIndex = i;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity
    public void setWindowFeature(int featureId) {
    }

    public final void showRecognitionPermission(@NotNull final FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        PermissionExtKt.permission(activity, "android.permission.ACTIVITY_RECOGNITION", getString(h0j.q), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: q0f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainActivity.showRecognitionPermission$lambda$38(activity, this, (PermissionBuilder) obj);
            }
        });
    }
}
