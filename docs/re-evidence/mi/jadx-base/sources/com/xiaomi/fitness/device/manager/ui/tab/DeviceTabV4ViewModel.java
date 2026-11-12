package com.xiaomi.fitness.device.manager.ui.tab;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.NestRecyclerViewItemEffectiveExposeBiz;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerRequestParamV2;
import com.fitness.banner.export.IBanner;
import com.fitness.banner.export.v2.BannerItemV2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.config.preference.ChooseAppPreference;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.DeviceBasicStatusDataHandler;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.DevicePreference;
import com.xiaomi.fitness.device.manager.DeviceStatus;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.a;
import com.xiaomi.fitness.device.manager.bean.BatteryInfo;
import com.xiaomi.fitness.device.manager.bean.DeviceParameter;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.export.bean.TabDeviceBannerSettingsItem;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.extensions.BluetoothExtKt;
import com.xiaomi.fitness.device.manager.extensions.DeviceExtKt;
import com.xiaomi.fitness.device.manager.extensions.OhterExtKt;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel;
import com.xiaomi.fitness.device.manager.utils.BluetoothPermissionUtil;
import com.xiaomi.fitness.device.model.api.WearableDeviceManagerWrapper;
import com.xiaomi.fitness.devicesettings.export.N62SVersionPreference;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelperExtKt;
import com.xiaomi.fitness.devicesettings.export.wearmode.WearModeHelper;
import com.xiaomi.fitness.devicesettings.export.wearmode.WearModeHelperExtKt;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.medal.export.IPopMedalListRepo;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.notify.export.INotifyRemindListener;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.ChooseCommonApp;
import com.xiaomi.fitness.watch.face.data.FaceEntranceRespV4;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.watch.face.export.FaceWearOsHelper;
import com.xiaomi.fitness.watch.face.export.FaceWearOsHelperExtKt;
import com.xiaomi.fitness.watch.face.export.IFaceListener;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceSizeConstant;
import com.xiaomi.fitness.wearos.export.WearOSUtil;
import com.xiaomi.fitness.wearos.export.WearOsExtKt;
import com.xiaomi.hm.health.bt.sdk.data.DeviceBatteryInfo;
import com.xiaomi.wearable.ProxyManagerKt;
import com.xiaomi.wearable.hm.g;
import defpackage.clb;
import defpackage.d2m;
import defpackage.eu6;
import defpackage.hni;
import defpackage.ht6;
import defpackage.k02;
import defpackage.owo;
import defpackage.s33;
import defpackage.s7r;
import defpackage.txo;
import defpackage.uzi;
import defpackage.vxo;
import defpackage.xqi;
import defpackage.zv1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\n*\b\u0094\u0002\u009f\u0002¢\u0002¥\u0002\b\u0007\u0018\u0000 Å\u00022\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002Å\u0002B\u001f\b\u0007\u0012\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001\u0012\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001¢\u0006\u0006\bÃ\u0002\u0010Ä\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J7\u0010\u000e\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0019\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010!\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b#\u0010\u0005J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b(\u0010\u0005J#\u0010*\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010)\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010+J#\u0010-\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010,\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010.J#\u0010/\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010,\u001a\u00020\u000bH\u0002¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u000bH\u0002¢\u0006\u0004\b0\u0010\u0011J\u000f\u00101\u001a\u00020\u000bH\u0002¢\u0006\u0004\b1\u0010\u0011J#\u00102\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010,\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u0010.J\u000f\u00103\u001a\u00020\u0003H\u0002¢\u0006\u0004\b3\u0010\u0005J\u0015\u00105\u001a\b\u0012\u0004\u0012\u00020\u001604H\u0002¢\u0006\u0004\b5\u00106J\u001f\u0010:\u001a\u0002092\u0006\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u0016H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0003H\u0002¢\u0006\u0004\b<\u0010\u0005J\u000f\u0010=\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010\u0005J-\u0010D\u001a\u00020\u00032\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000bH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010I\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00162\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0003H\u0002¢\u0006\u0004\bK\u0010\u0005J\u000f\u0010L\u001a\u00020\u000bH\u0002¢\u0006\u0004\bL\u0010\u0011J\u0011\u0010N\u001a\u0004\u0018\u00010MH\u0002¢\u0006\u0004\bN\u0010OJ\u0019\u0010R\u001a\u00020\u00032\b\u0010Q\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0003H\u0014¢\u0006\u0004\bT\u0010\u0005J\u0017\u0010W\u001a\u00020\u00032\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u001d\u0010]\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u0015\u0010_\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b_\u0010\u001cJ\r\u0010`\u001a\u00020\u0003¢\u0006\u0004\b`\u0010\u0005J\u0017\u0010a\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u00020\u0003¢\u0006\u0004\bc\u0010\u0005J\r\u0010d\u001a\u00020\u0003¢\u0006\u0004\bd\u0010\u0005J\r\u0010e\u001a\u00020\u0003¢\u0006\u0004\be\u0010\u0005J\r\u0010f\u001a\u00020\u0003¢\u0006\u0004\bf\u0010\u0005J!\u0010g\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\u00032\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bi\u0010XJ-\u0010m\u001a\u00020\u00032\u001e\u0010l\u001a\u001a\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020\u00030j¢\u0006\u0004\bm\u0010nJ9\u0010t\u001a\u00020\u00032\u0006\u0010o\u001a\u00020\u00162\u0006\u0010p\u001a\u00020\u00072\u0006\u0010q\u001a\u00020\u000b2\u0012\u0010s\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030r¢\u0006\u0004\bt\u0010uJ\u001d\u0010w\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\\\u001a\u00020v¢\u0006\u0004\bw\u0010xJ\u0015\u0010y\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\by\u0010\u001cJ\r\u0010z\u001a\u00020\u0003¢\u0006\u0004\bz\u0010\u0005J\u001f\u0010{\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020\u0016¢\u0006\u0004\b{\u0010\"J\u0015\u0010}\u001a\u00020\u00032\u0006\u0010|\u001a\u00020\u0016¢\u0006\u0004\b}\u0010~J\r\u0010\u007f\u001a\u00020\u0003¢\u0006\u0004\b\u007f\u0010\u0005J\u001d\u0010\u0081\u0001\u001a\u00020\u00032\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000b¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0013\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u000f\u0010\u0086\u0001\u001a\u00020\u000b¢\u0006\u0005\b\u0086\u0001\u0010\u0011J\u000f\u0010\u0087\u0001\u001a\u00020\u0003¢\u0006\u0005\b\u0087\u0001\u0010\u0005J\u000f\u0010\u0088\u0001\u001a\u00020\u000b¢\u0006\u0005\b\u0088\u0001\u0010\u0011J\u000f\u0010\u0089\u0001\u001a\u00020\u0003¢\u0006\u0005\b\u0089\u0001\u0010\u0005J\u000f\u0010\u008a\u0001\u001a\u00020\u0003¢\u0006\u0005\b\u008a\u0001\u0010\u0005J \u0010\u008c\u0001\u001a\u00020\u00032\u000e\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u000104¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u000f\u0010\u008e\u0001\u001a\u00020\u000b¢\u0006\u0005\b\u008e\u0001\u0010\u0011R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001b\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R1\u0010\u0099\u0001\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R!\u0010¤\u0001\u001a\u00030\u009f\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R'\u0010©\u0001\u001a\t\u0012\u0004\u0012\u0002090¥\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0001\u0010¡\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R#\u0010«\u0001\u001a\t\u0012\u0004\u0012\u0002090ª\u00018\u0006¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R#\u0010¯\u0001\u001a\t\u0012\u0004\u0012\u0002090ª\u00018\u0006¢\u0006\u0010\n\u0006\b¯\u0001\u0010¬\u0001\u001a\u0006\b°\u0001\u0010®\u0001R'\u0010³\u0001\u001a\t\u0012\u0004\u0012\u0002090¥\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b±\u0001\u0010¡\u0001\u001a\u0006\b²\u0001\u0010¨\u0001R!\u0010¸\u0001\u001a\u00030´\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bµ\u0001\u0010¡\u0001\u001a\u0006\b¶\u0001\u0010·\u0001Rg\u0010À\u0001\u001aM\u0012\u0018\u0012\u0016\u0018\u00010k¢\u0006\u000f\bº\u0001\u0012\n\b»\u0001\u0012\u0005\b\b(¼\u0001\u0012\u0016\u0012\u00140\u0016¢\u0006\u000f\bº\u0001\u0012\n\b»\u0001\u0012\u0005\b\b(½\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002090¾\u00010¹\u0001j\t\u0012\u0004\u0012\u000209`¿\u00018\u0006¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R!\u0010È\u0001\u001a\u00030Ä\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÅ\u0001\u0010¡\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R'\u0010Ë\u0001\u001a\t\u0012\u0004\u0012\u00020?0¥\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÉ\u0001\u0010¡\u0001\u001a\u0006\bÊ\u0001\u0010¨\u0001R#\u0010Ì\u0001\u001a\t\u0012\u0004\u0012\u00020?0ª\u00018\u0006¢\u0006\u0010\n\u0006\bÌ\u0001\u0010¬\u0001\u001a\u0006\bÍ\u0001\u0010®\u0001R%\u0010Ð\u0001\u001a\b\u0012\u0004\u0012\u00020\u0016048FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\bÎ\u0001\u0010¡\u0001\u001a\u0005\bÏ\u0001\u00106R\u001c\u0010Ò\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u001c\u0010Õ\u0001\u001a\u0005\u0018\u00010Ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R\u001c\u0010Ø\u0001\u001a\u0005\u0018\u00010×\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001c\u0010Û\u0001\u001a\u0005\u0018\u00010Ú\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u0019\u0010Ý\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R?\u0010à\u0001\u001a\u0018\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070ß\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bà\u0001\u0010\u009a\u0001\u001a\u0006\bá\u0001\u0010\u009c\u0001\"\u0006\bâ\u0001\u0010\u009e\u0001R9\u0010ä\u0001\u001a\u0012\u0012\r\u0012\u000b ã\u0001*\u0004\u0018\u00010\u000b0\u000b0\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bä\u0001\u0010\u009a\u0001\u001a\u0006\bå\u0001\u0010\u009c\u0001\"\u0006\bæ\u0001\u0010\u009e\u0001R0\u0010ç\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bç\u0001\u0010\u009a\u0001\u001a\u0006\bè\u0001\u0010\u009c\u0001\"\u0006\bé\u0001\u0010\u009e\u0001R0\u0010ê\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bê\u0001\u0010\u009a\u0001\u001a\u0006\bë\u0001\u0010\u009c\u0001\"\u0006\bì\u0001\u0010\u009e\u0001R%\u0010ï\u0001\u001a\b\u0012\u0004\u0012\u00020?0>8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bí\u0001\u0010¡\u0001\u001a\u0005\bî\u0001\u00106R%\u0010ò\u0001\u001a\b\u0012\u0004\u0012\u00020?0>8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bð\u0001\u0010¡\u0001\u001a\u0005\bñ\u0001\u00106R=\u0010ó\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070ß\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bó\u0001\u0010\u009a\u0001\u001a\u0006\bô\u0001\u0010\u009c\u0001\"\u0006\bõ\u0001\u0010\u009e\u0001R0\u0010ö\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bö\u0001\u0010\u009a\u0001\u001a\u0006\b÷\u0001\u0010\u009c\u0001\"\u0006\bø\u0001\u0010\u009e\u0001R=\u0010ù\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0ß\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bù\u0001\u0010\u009a\u0001\u001a\u0006\bú\u0001\u0010\u009c\u0001\"\u0006\bû\u0001\u0010\u009e\u0001R=\u0010ü\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160ß\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bü\u0001\u0010\u009a\u0001\u001a\u0006\bý\u0001\u0010\u009c\u0001\"\u0006\bþ\u0001\u0010\u009e\u0001R0\u0010ÿ\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÿ\u0001\u0010\u009a\u0001\u001a\u0006\b\u0080\u0002\u0010\u009c\u0001\"\u0006\b\u0081\u0002\u0010\u009e\u0001R=\u0010\u0082\u0002\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160ß\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u009a\u0001\u001a\u0006\b\u0083\u0002\u0010\u009c\u0001\"\u0006\b\u0084\u0002\u0010\u009e\u0001R'\u0010\u0085\u0002\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0085\u0002\u0010Þ\u0001\u001a\u0005\b\u0086\u0002\u0010\u0011\"\u0005\b\u0087\u0002\u0010bR\u0019\u0010\u0088\u0002\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0089\u0002R\u0019\u0010\u008a\u0002\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R!\u0010\u0090\u0002\u001a\u00030\u008c\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008d\u0002\u0010¡\u0001\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u001b\u0010\u0091\u0002\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0019\u0010\u0093\u0002\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u0096\u0001R\u0018\u0010\u0095\u0002\u001a\u00030\u0094\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u0096\u0002R\u0018\u0010\u0098\u0002\u001a\u00030\u0097\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0099\u0002R6\u0010\u009a\u0002\u001a!\u0012\u0017\u0012\u0015\u0018\u00010\t¢\u0006\u000e\bº\u0001\u0012\t\b»\u0001\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0018\u0010\u009d\u0002\u001a\u00030\u009c\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0018\u0010 \u0002\u001a\u00030\u009f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0002\u0010¡\u0002R\u0018\u0010£\u0002\u001a\u00030¢\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0002\u0010¤\u0002R\u0018\u0010¦\u0002\u001a\u00030¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R9\u0010¨\u0002\u001a\u0012\u0012\r\u0012\u000b ã\u0001*\u0004\u0018\u00010\u000b0\u000b0\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0002\u0010\u009a\u0001\u001a\u0006\b©\u0002\u0010\u009c\u0001\"\u0006\bª\u0002\u0010\u009e\u0001R9\u0010«\u0002\u001a\u0012\u0012\r\u0012\u000b ã\u0001*\u0004\u0018\u00010\u000b0\u000b0\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0002\u0010\u009a\u0001\u001a\u0006\b¬\u0002\u0010\u009c\u0001\"\u0006\b\u00ad\u0002\u0010\u009e\u0001R9\u0010®\u0002\u001a\u0012\u0012\r\u0012\u000b ã\u0001*\u0004\u0018\u00010\u000b0\u000b0\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b®\u0002\u0010\u009a\u0001\u001a\u0006\b¯\u0002\u0010\u009c\u0001\"\u0006\b°\u0002\u0010\u009e\u0001R\u0019\u0010±\u0002\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0002\u0010\u0089\u0002R*\u0010³\u0002\u001a\u00030²\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b³\u0002\u0010´\u0002\u001a\u0006\bµ\u0002\u0010¶\u0002\"\u0006\b·\u0002\u0010¸\u0002R1\u0010¹\u0002\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¹\u0002\u0010\u009a\u0001\u001a\u0006\bº\u0002\u0010\u009c\u0001\"\u0006\b»\u0002\u0010\u009e\u0001R!\u0010¿\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u0002090¼\u00028F¢\u0006\b\u001a\u0006\b½\u0002\u0010¾\u0002R\u0017\u0010Â\u0002\u001a\u00020\u00078VX\u0096\u0004¢\u0006\b\u001a\u0006\bÀ\u0002\u0010Á\u0002¨\u0006Æ\u0002"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabModel;", "", "providerTabDeviceBannerSettingsItem", "()V", "readN62SWatchInfo", "", "did", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "isNeedSync", "needShowDevice", "onConnectSuccess", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ZZ)V", "isStatusEquals", "()Z", "Lcom/xiaomi/hm/health/bt/sdk/data/DeviceBatteryInfo;", "Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "buildBatteryInfo", "(Lcom/xiaomi/hm/health/bt/sdk/data/DeviceBatteryInfo;Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "", "errorCode", "retryTimes", "onConnectFailure", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;II)V", "onDisconnect", "(Ljava/lang/String;)V", "showRecoveryConnect", "(Ljava/lang/String;)Z", "isActiveDeviceModel", "status", "updateDialStatus", "(Ljava/lang/String;I)V", "showDevice", "currentModel", "addFaceEntranceItem", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "loadWearOsWatch", "addAccessoryDeviceItem", "isAuto", "syncDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Z)V", "force", "requestLocationSwitch", "(Ljava/lang/String;Z)V", "requestPermissionIfNeed", "needLocationDevice", "hasLocationPermission", "realConnect", "refreshAccessoryWearMode", "", "createAllFeatureCardIds", "()Ljava/util/List;", "itemType", "type", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "createNormalContentItem", "(II)Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "addBannerItemWhenHasDevice", "addBannerItemWhenNoDevice", "", "Lcom/fitness/banner/export/v2/BannerItemV2;", "observableList", "Lcom/fitness/banner/export/BannerRequestParamV2;", "bannerRequestParam", "hasDevice", "fillBannerList", "(Ljava/util/List;Lcom/fitness/banner/export/BannerRequestParamV2;Z)V", "app", "", "time", "recordChosenAppCloud", "(IJ)V", "checkAndUpdateChosenApp", "hasSupportDevice", "Lcom/xiaomi/fitness/settingitem/settingitem/ChooseCommonApp;", "getCloudChosenItem", "()Lcom/xiaomi/fitness/settingitem/settingitem/ChooseCommonApp;", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "onCleared", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, "onCreate", "(Landroidx/lifecycle/LifecycleOwner;)V", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "deviceInfo", "Lcom/xiaomi/fitness/device/manager/a;", "callback", "bindDevice", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;Lcom/xiaomi/fitness/device/manager/a;)V", "loadBattery", "switchRegin", "loadDevice", "(Z)V", "updateBatteryIfNeed", "syncDeviceIfNeed", "showSystemRedPoint", "refreshFaceEntranceRedPoint", "connectDevice", "(ZLjava/lang/String;)V", LifecycleConstantKt.ON_DESTROY, "Lkotlin/Function3;", "Landroid/view/View;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lkotlin/jvm/functions/Function3;)V", "mode", "accessoryDid", Constants.EXTRA_FROM_APP, "Lkotlin/Function1;", "block", "switchAccessoryMode", "(ILjava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/device/manager/l;", "removeDelete", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/device/manager/l;)V", "unbind", "connectDeviceIfNeed", "updateAccessoryStatus", "currentChosen", "onAppChosen", "(I)V", "recordChosenApp", "showChooseAppDialog", "checkChosenApp", "(Ljava/lang/Boolean;)V", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "getFirstMedalFromPopMedalDataSP", "()Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "popMedalListFromSpIsEmpty", "removeMedalAlreadyPoppedFromSp", "shouldPullPopMedalDataFromNetwork", "setPopMedalDataAlreadyPulled", "setShouldPullPopMedalDataFromNetwork", "list", "savePopMedalListToSp", "(Ljava/util/List;)V", "getComeFromMedalDetailPageFromSP", "Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "mDeviceManager", "Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "mDeviceContact", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "mCurrentDeviceDid", "Ljava/lang/String;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/device/manager/ui/tab/ConnectStatus;", "bleReconnect", "Landroidx/lifecycle/MutableLiveData;", "getBleReconnect", "()Landroidx/lifecycle/MutableLiveData;", "setBleReconnect", "(Landroidx/lifecycle/MutableLiveData;)V", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabItemAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabItemAdapter;", "adapter", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "itemBindings$delegate", "getItemBindings", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "itemBindings", "Landroidx/databinding/ObservableArrayList;", "tabItems", "Landroidx/databinding/ObservableArrayList;", "getTabItems", "()Landroidx/databinding/ObservableArrayList;", "settingTabItems", "getSettingTabItems", "settingItemBindings$delegate", "getSettingItemBindings", "settingItemBindings", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceSettingsItemAdapter;", "settingAdapter$delegate", "getSettingAdapter", "()Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceSettingsItemAdapter;", "settingAdapter", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "view", "viewType", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/ViewHolderFactory;", "settingViewHolder", "Lkotlin/jvm/functions/Function2;", "getSettingViewHolder", "()Lkotlin/jvm/functions/Function2;", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceBannerAdapter;", "bannerAdapter$delegate", "getBannerAdapter", "()Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceBannerAdapter;", "bannerAdapter", "bannerItemBinding$delegate", "getBannerItemBinding", "bannerItemBinding", "bannerItems", "getBannerItems", "mAllFeatureCardIds$delegate", "getMAllFeatureCardIds", "mAllFeatureCardIds", "Lcom/xiaomi/fitness/device/manager/ui/tab/TabDeviceContentItem;", "mDialStatusItem", "Lcom/xiaomi/fitness/device/manager/ui/tab/TabDeviceContentItem;", "Lcom/xiaomi/fitness/device/manager/export/bean/TabDeviceBannerSettingsItem;", "mTabDeviceBannerSettingsItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabDeviceBannerSettingsItem;", "Lcom/xiaomi/fitness/device/manager/ui/tab/TabFaceEntranceItem;", "mFaceEntranceItem", "Lcom/xiaomi/fitness/device/manager/ui/tab/TabFaceEntranceItem;", "Lcom/xiaomi/fitness/device/manager/ui/tab/TabAccessoryDeviceContentItem;", "mAccessoryDeviceContentItem", "Lcom/xiaomi/fitness/device/manager/ui/tab/TabAccessoryDeviceContentItem;", "connectedOnBackgroundNeedSync", "Z", "Lkotlin/Pair;", "showConnectPermission", "getShowConnectPermission", "setShowConnectPermission", "kotlin.jvm.PlatformType", "showOpenLocationSwitch", "getShowOpenLocationSwitch", "setShowOpenLocationSwitch", "mLoadingFlag", "getMLoadingFlag", "setMLoadingFlag", "showDisableConnect", "getShowDisableConnect", "setShowDisableConnect", "hasDeviceBannerList$delegate", "getHasDeviceBannerList", "hasDeviceBannerList", "noDeviceBannerList$delegate", "getNoDeviceBannerList", "noDeviceBannerList", "exitAccessory", "getExitAccessory", "setExitAccessory", "manageAccessory", "getManageAccessory", "setManageAccessory", "existAccessoryMode", "getExistAccessoryMode", "setExistAccessoryMode", "wearModeSwitchSuccess", "getWearModeSwitchSuccess", "setWearModeSwitchSuccess", "wearModeSwitchSuccessFromApp", "getWearModeSwitchSuccessFromApp", "setWearModeSwitchSuccessFromApp", "exitAccessoryModeFromDevice", "getExitAccessoryModeFromDevice", "setExitAccessoryModeFromDevice", "hasShownRecoverConnect", "getHasShownRecoverConnect", "setHasShownRecoverConnect", "mRetryConnectCount", "I", "mOwner", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "effectiveExposeBiz$delegate", "getEffectiveExposeBiz", "()Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "effectiveExposeBiz", "systemTabItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "currentFaceId", "com/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel$faceEventListener$1", "faceEventListener", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel$faceEventListener$1;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "mDeviceStatusListener", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "mDeviceChangeListener", "Lkotlin/jvm/functions/Function1;", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", "mSyncStateListener", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", "com/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel$mOnAccessoryDeviceStateListener$1", "mOnAccessoryDeviceStateListener", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel$mOnAccessoryDeviceStateListener$1;", "com/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel$updateSettingInfoListener$1", "updateSettingInfoListener", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel$updateSettingInfoListener$1;", "com/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel$deviceChargeStatusDataHandler$1", "deviceChargeStatusDataHandler", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel$deviceChargeStatusDataHandler$1;", "mGoUncommonUsedAppFlag", "getMGoUncommonUsedAppFlag", "setMGoUncommonUsedAppFlag", "mUpdateAppSuccessFlag", "getMUpdateAppSuccessFlag", "setMUpdateAppSuccessFlag", "mChoiceAppFlag", "getMChoiceAppFlag", "setMChoiceAppFlag", "mChosenApp", "Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo;", "mPopMedalRepo", "Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo;", "getMPopMedalRepo", "()Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo;", "setMPopMedalRepo", "(Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo;)V", "medalToPopLiveData", "getMedalToPopLiveData", "setMedalToPopLiveData", "", "getContentItems", "()Ljava/util/Map;", "contentItems", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "(Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;Lcom/xiaomi/fitness/device/contact/export/DeviceContact;)V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceTabViewModelV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceTabViewModelV4.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1574:1\n774#2:1575\n865#2,2:1576\n1863#2,2:1578\n1863#2,2:1580\n1755#2,3:1582\n1863#2,2:1585\n1755#2,3:1587\n1755#2,3:1590\n1872#2,3:1593\n1755#2,3:1596\n360#2,7:1599\n360#2,7:1606\n*S KotlinDebug\n*F\n+ 1 DeviceTabViewModelV4.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel\n*L\n832#1:1575\n832#1:1576,2\n834#1:1578,2\n840#1:1580,2\n856#1:1582,3\n1157#1:1585,2\n1220#1:1587,3\n1235#1:1590,3\n883#1:1593,3\n1269#1:1596,3\n1276#1:1599,7\n1278#1:1606,7\n*E\n"})
public final class DeviceTabV4ViewModel extends BaseViewModel<DeviceTabModel> {
    public static final int CHOISE_COMMON_APP_DEFAULT = 1;
    public static final int CHOISE_COMMON_APP_SPORT_HEALTH = 3;
    public static final int CHOISE_COMMON_APP_WEARABLE = 2;

    @NotNull
    public static final String PACKAGE_NAME_WEARABLE = "com.xiaomi.wearable";
    public static final int REQUEST_PERMISSION_INTERVAL = 172800000;

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    /* JADX INFO: renamed from: bannerAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bannerAdapter;

    /* JADX INFO: renamed from: bannerItemBinding$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bannerItemBinding;

    @NotNull
    private final ObservableArrayList<BannerItemV2> bannerItems;

    @NotNull
    private MutableLiveData<ConnectStatus> bleReconnect;
    private boolean connectedOnBackgroundNeedSync;

    @NotNull
    private String currentFaceId;

    @NotNull
    private final DeviceTabV4ViewModel$deviceChargeStatusDataHandler$1 deviceChargeStatusDataHandler;

    /* JADX INFO: renamed from: effectiveExposeBiz$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy effectiveExposeBiz;

    @NotNull
    private MutableLiveData<Pair<Integer, Boolean>> existAccessoryMode;

    @NotNull
    private MutableLiveData<Pair<String, String>> exitAccessory;

    @NotNull
    private MutableLiveData<Pair<String, Integer>> exitAccessoryModeFromDevice;

    @NotNull
    private final DeviceTabV4ViewModel$faceEventListener$1 faceEventListener;

    /* JADX INFO: renamed from: hasDeviceBannerList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hasDeviceBannerList;
    private boolean hasShownRecoverConnect;

    /* JADX INFO: renamed from: itemBindings$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy itemBindings;

    @Nullable
    private TabAccessoryDeviceContentItem mAccessoryDeviceContentItem;

    /* JADX INFO: renamed from: mAllFeatureCardIds$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAllFeatureCardIds;

    @NotNull
    private MutableLiveData<Boolean> mChoiceAppFlag;
    private int mChosenApp;

    @Nullable
    private String mCurrentDeviceDid;

    @NotNull
    private final Function1<WearableDeviceModel, Unit> mDeviceChangeListener;

    @NotNull
    private final DeviceContact mDeviceContact;

    @NotNull
    private final WearableDeviceManagerWrapper mDeviceManager;

    @NotNull
    private final OnDeviceStatusListener mDeviceStatusListener;

    @Nullable
    private TabDeviceContentItem mDialStatusItem;

    @Nullable
    private TabFaceEntranceItem mFaceEntranceItem;

    @NotNull
    private MutableLiveData<Boolean> mGoUncommonUsedAppFlag;

    @NotNull
    private MutableLiveData<Boolean> mLoadingFlag;

    @NotNull
    private final DeviceTabV4ViewModel$mOnAccessoryDeviceStateListener$1 mOnAccessoryDeviceStateListener;
    private LifecycleOwner mOwner;
    public IPopMedalListRepo mPopMedalRepo;
    private int mRetryConnectCount;

    @NotNull
    private final SyncStateListener mSyncStateListener;

    @Nullable
    private TabDeviceBannerSettingsItem mTabDeviceBannerSettingsItem;

    @NotNull
    private MutableLiveData<Boolean> mUpdateAppSuccessFlag;

    @NotNull
    private MutableLiveData<String> manageAccessory;

    @NotNull
    private MutableLiveData<PopMedalData> medalToPopLiveData;

    /* JADX INFO: renamed from: noDeviceBannerList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy noDeviceBannerList;

    /* JADX INFO: renamed from: settingAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingAdapter;

    /* JADX INFO: renamed from: settingItemBindings$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingItemBindings;

    @NotNull
    private final ObservableArrayList<TabContentItem> settingTabItems;

    @NotNull
    private final Function2<View, Integer, BaseViewHolder<TabContentItem>> settingViewHolder;

    @NotNull
    private MutableLiveData<Pair<Boolean, String>> showConnectPermission;

    @NotNull
    private MutableLiveData<Boolean> showDisableConnect;

    @NotNull
    private MutableLiveData<Boolean> showOpenLocationSwitch;

    @Nullable
    private TabContentItem systemTabItem;

    @NotNull
    private final ObservableArrayList<TabContentItem> tabItems;

    @NotNull
    private final DeviceTabV4ViewModel$updateSettingInfoListener$1 updateSettingInfoListener;

    @NotNull
    private MutableLiveData<Pair<String, Integer>> wearModeSwitchSuccess;

    @NotNull
    private MutableLiveData<Boolean> wearModeSwitchSuccessFromApp;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel$recordChosenApp$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel$recordChosenApp$2", f = "DeviceTabViewModelV4.kt", i = {}, l = {1397}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19902 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C19902(Continuation<? super C19902> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceTabV4ViewModel.this.new C19902(continuation);
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
            DeviceTabV4ViewModel.connectDevice$default(DeviceTabV4ViewModel.this, true, null, 2, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19902) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r2v37, types: [com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel$faceEventListener$1] */
    /* JADX WARN: Type inference failed for: r2v42, types: [com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel$updateSettingInfoListener$1] */
    /* JADX WARN: Type inference failed for: r2v43, types: [com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel$deviceChargeStatusDataHandler$1] */
    public DeviceTabV4ViewModel(@NotNull WearableDeviceManagerWrapper mDeviceManager, @NotNull DeviceContact mDeviceContact) {
        Intrinsics.checkNotNullParameter(mDeviceManager, "mDeviceManager");
        Intrinsics.checkNotNullParameter(mDeviceContact, "mDeviceContact");
        this.mDeviceManager = mDeviceManager;
        this.mDeviceContact = mDeviceContact;
        this.bleReconnect = new MutableLiveData<>();
        this.adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: st6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabV4ViewModel.adapter_delegate$lambda$0();
            }
        });
        this.itemBindings = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vt6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabV4ViewModel.itemBindings_delegate$lambda$1(this.f37202a);
            }
        });
        this.tabItems = new ObservableArrayList<>();
        this.settingTabItems = new ObservableArrayList<>();
        this.settingItemBindings = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ys6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabV4ViewModel.settingItemBindings_delegate$lambda$2(this.f40485a);
            }
        });
        this.settingAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zs6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabV4ViewModel.settingAdapter_delegate$lambda$3();
            }
        });
        this.settingViewHolder = new Function2() { // from class: at6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceTabV4ViewModel.settingViewHolder$lambda$4((View) obj, ((Integer) obj2).intValue());
            }
        };
        this.bannerAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bt6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabV4ViewModel.bannerAdapter_delegate$lambda$5();
            }
        });
        this.bannerItemBinding = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ct6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabV4ViewModel.bannerItemBinding_delegate$lambda$6(this.f14693a);
            }
        });
        this.bannerItems = new ObservableArrayList<>();
        this.mAllFeatureCardIds = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dt6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabV4ViewModel.mAllFeatureCardIds_delegate$lambda$7(this.f15909a);
            }
        });
        this.showConnectPermission = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        this.showOpenLocationSwitch = new MutableLiveData<>(bool);
        this.mLoadingFlag = new MutableLiveData<>();
        this.showDisableConnect = new MutableLiveData<>();
        this.hasDeviceBannerList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: et6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabV4ViewModel.hasDeviceBannerList_delegate$lambda$8();
            }
        });
        this.noDeviceBannerList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ft6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabV4ViewModel.noDeviceBannerList_delegate$lambda$9();
            }
        });
        this.exitAccessory = new MutableLiveData<>();
        this.manageAccessory = new MutableLiveData<>();
        this.existAccessoryMode = new MutableLiveData<>();
        this.wearModeSwitchSuccess = new MutableLiveData<>();
        this.wearModeSwitchSuccessFromApp = new MutableLiveData<>();
        this.exitAccessoryModeFromDevice = new MutableLiveData<>();
        this.effectiveExposeBiz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tt6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabV4ViewModel.effectiveExposeBiz_delegate$lambda$10();
            }
        });
        this.currentFaceId = "";
        this.faceEventListener = new IFaceListener() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel$faceEventListener$1
            @Override // com.xiaomi.fitness.watch.face.export.IFaceListener
            public void onFaceChanged(String faceId) {
                MutableLiveData<String> faceUrl;
                Intrinsics.checkNotNullParameter(faceId, "faceId");
                Logger.i(this.this$0.getTAG(), "faceId " + faceId + " currentFaceId " + this.this$0.currentFaceId);
                if (Intrinsics.areEqual(this.this$0.currentFaceId, faceId)) {
                    return;
                }
                TabDeviceContentItem tabDeviceContentItem = this.this$0.mDialStatusItem;
                if (tabDeviceContentItem != null && (faceUrl = tabDeviceContentItem.getFaceUrl()) != null) {
                    faceUrl.postValue(DeviceStatusView.URL_LOAD_WATCH_FACE);
                }
                this.this$0.currentFaceId = faceId;
            }
        };
        this.mDeviceStatusListener = new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel$mDeviceStatusListener$1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
                Logger.i(this.this$0.getTAG(), "onConnectFailure did = " + did + ", errorCode = " + errorCode);
                this.this$0.updateAccessoryStatus(did, 1);
                this.this$0.connectedOnBackgroundNeedSync = false;
                DeviceTabV4ViewModel deviceTabV4ViewModel = this.this$0;
                WearableDeviceManagerWrapper wearableDeviceManagerWrapper = deviceTabV4ViewModel.mDeviceManager;
                if (did == null) {
                    did = "";
                }
                deviceTabV4ViewModel.onConnectFailure((WearableDeviceModel) wearableDeviceManagerWrapper.getDeviceModel(did), errorCode, retryTimes);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
                Logger.i(this.this$0.getTAG(), "onConnectStart did = " + did);
                this.this$0.updateAccessoryStatus(did, 2);
                this.this$0.updateDialStatus(did, 2);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                Logger.i(this.this$0.getTAG(), "onConnectSuccess did = " + did);
                this.this$0.mRetryConnectCount = 0;
                this.this$0.updateAccessoryStatus(did, 3);
                DeviceTabV4ViewModel deviceTabV4ViewModel = this.this$0;
                AppManager.Companion companion = AppManager.INSTANCE;
                deviceTabV4ViewModel.connectedOnBackgroundNeedSync = !companion.getInstance().isAppForeground();
                Logger.i(this.this$0.getTAG(), "current device(" + this.this$0.mCurrentDeviceDid + ") onConnectSuccess");
                this.this$0.readN62SWatchInfo();
                DeviceTabV4ViewModel deviceTabV4ViewModel2 = this.this$0;
                DeviceTabV4ViewModel.onConnectSuccess$default(deviceTabV4ViewModel2, did, (WearableDeviceModel) deviceTabV4ViewModel2.mDeviceManager.getDeviceModel(did == null ? "" : did), companion.getInstance().isAppForeground(), false, 8, null);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
                Logger.i(this.this$0.getTAG(), "onDisconnect did = " + did);
                this.this$0.currentFaceId = "";
                this.this$0.updateAccessoryStatus(did, 4);
                this.this$0.connectedOnBackgroundNeedSync = false;
                this.this$0.currentFaceId = "";
                this.this$0.onDisconnect(did);
            }
        };
        this.mDeviceChangeListener = new Function1() { // from class: ut6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabV4ViewModel.mDeviceChangeListener$lambda$13(this.f36110a, (WearableDeviceModel) obj);
            }
        };
        this.mSyncStateListener = new DeviceTabV4ViewModel$mSyncStateListener$1(this);
        this.mOnAccessoryDeviceStateListener = new DeviceTabV4ViewModel$mOnAccessoryDeviceStateListener$1(this);
        this.updateSettingInfoListener = new DeviceSettingManager.UpdateSettingInfoListener() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel$updateSettingInfoListener$1
            @Override // com.xiaomi.fitness.settingitem.DeviceSettingManager.UpdateSettingInfoListener
            public void onSettingValueUpdate(String did, HashMap<String, String> settingMap) {
                Intrinsics.checkNotNullParameter(settingMap, "settingMap");
                if (Intrinsics.areEqual("xiaomiwear_app", did)) {
                    this.this$0.checkAndUpdateChosenApp();
                }
            }
        };
        this.deviceChargeStatusDataHandler = new DataHandlerWrapper() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel$deviceChargeStatusDataHandler$1
            private int lastChargeStatus;

            public final int getLastChargeStatus() {
                return this.lastChargeStatus;
            }

            @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
            public boolean handlePacket(String did, int type, s7r packet) {
                Intrinsics.checkNotNullParameter(did, "did");
                if (packet == null) {
                    return false;
                }
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (Intrinsics.areEqual(did, wearableDeviceModel != null ? wearableDeviceModel.getDid() : null) && packet.f == 79) {
                    owo owoVarC = packet.E().C();
                    String tag = this.this$0.getTAG();
                    DeviceBasicStatusDataHandler deviceBasicStatusDataHandler = DeviceBasicStatusDataHandler.INSTANCE;
                    Logger.i(tag, "REPORT_BASIC_STATUS = " + owoVarC + "，lastChargeStatus = " + deviceBasicStatusDataHandler.getLastChargeStatus());
                    if (owoVarC.c != this.lastChargeStatus) {
                        final DeviceTabV4ViewModel deviceTabV4ViewModel = this.this$0;
                        deviceBasicStatusDataHandler.syncBattery(did, new DeviceSyncCallback() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel$deviceChargeStatusDataHandler$1$handlePacket$1
                            @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
                            public void onSyncError(String did2, int type2, String errorInfo) {
                                Intrinsics.checkNotNullParameter(did2, "did");
                                Logger.i(deviceTabV4ViewModel.getTAG(), "sync battery failure");
                                if (AppManager.INSTANCE.getInstance().isAppForeground()) {
                                    deviceTabV4ViewModel.updateBatteryIfNeed();
                                }
                            }

                            @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
                            public void onSyncSuccess(String did2, int type2, Object result) {
                                Intrinsics.checkNotNullParameter(did2, "did");
                                Logger.i(deviceTabV4ViewModel.getTAG(), "sync battery success");
                                if (AppManager.INSTANCE.getInstance().isAppForeground()) {
                                    deviceTabV4ViewModel.updateBatteryIfNeed();
                                }
                            }
                        });
                        this.lastChargeStatus = owoVarC.c;
                    }
                }
                return false;
            }

            public final void setLastChargeStatus(int i) {
                this.lastChargeStatus = i;
            }
        };
        this.mGoUncommonUsedAppFlag = new MutableLiveData<>(bool);
        this.mUpdateAppSuccessFlag = new MutableLiveData<>(bool);
        this.mChoiceAppFlag = new MutableLiveData<>(bool);
        this.mChosenApp = 1;
        this.medalToPopLiveData = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceTabItemAdapter adapter_delegate$lambda$0() {
        return new DeviceTabItemAdapter();
    }

    private final void addAccessoryDeviceItem() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) CollectionsKt___CollectionsKt.getOrNull(this.mDeviceManager.getAccessoryDeviceModels(), 0);
        if (wearableDeviceModel == null) {
            return;
        }
        TabAccessoryDeviceContentItem tabAccessoryDeviceContentItem = new TabAccessoryDeviceContentItem(wearableDeviceModel.getDid(), DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryMode(wearableDeviceModel.getDid()), 203, 203, hni.o, StringExtKt.toLiveData(DeviceModelExtKt.getBeanPreviewUrl(wearableDeviceModel)), StringExtKt.toLiveData(DeviceModelExtKt.getName(wearableDeviceModel)), null, false, null, null, 1920, null);
        this.mAccessoryDeviceContentItem = tabAccessoryDeviceContentItem;
        tabAccessoryDeviceContentItem.setStatus(wearableDeviceModel.getDeviceStatus());
        Logger.i(getTAG(), "AccessoryInfo", wearableDeviceModel.getDeviceInfo() + " isAccessory = " + com.xiaomi.fit.device.extensions.DeviceModelExtKt.isAccessory(wearableDeviceModel) + ",isConnected = " + wearableDeviceModel.getIsDeviceConnected() + ",deviceStatus=" + wearableDeviceModel.getDeviceStatus() + ",isCurrent" + wearableDeviceModel.getIsCurrent() + ",mode=" + this.mDeviceManager.getAccessoryMode(wearableDeviceModel.getDid()), new Object[0]);
        ObservableArrayList<TabContentItem> observableArrayList = this.tabItems;
        TabAccessoryDeviceContentItem tabAccessoryDeviceContentItem2 = this.mAccessoryDeviceContentItem;
        Intrinsics.checkNotNull(tabAccessoryDeviceContentItem2);
        observableArrayList.add(tabAccessoryDeviceContentItem2);
    }

    private final void addBannerItemWhenHasDevice() {
        ObservableArrayList<TabContentItem> observableArrayList = this.tabItems;
        if (!(observableArrayList instanceof Collection) || !observableArrayList.isEmpty()) {
            Iterator<TabContentItem> it = observableArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().getType() == 3) {
                    return;
                }
            }
        }
        getHasDeviceBannerList().clear();
        getNoDeviceBannerList().clear();
        List<BannerItemV2> hasDeviceBannerList = getHasDeviceBannerList();
        List listListOf = CollectionsKt__CollectionsJVMKt.listOf(12);
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        fillBannerList(hasDeviceBannerList, new BannerRequestParamV2(listListOf, lowerCase, null, null, 12, null), true);
    }

    private final void addBannerItemWhenNoDevice() {
        ObservableArrayList<TabContentItem> observableArrayList = this.tabItems;
        if (!(observableArrayList instanceof Collection) || !observableArrayList.isEmpty()) {
            Iterator<TabContentItem> it = observableArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().getType() == 3) {
                    return;
                }
            }
        }
        getHasDeviceBannerList().clear();
        getNoDeviceBannerList().clear();
        List<BannerItemV2> noDeviceBannerList = getNoDeviceBannerList();
        List listListOf = CollectionsKt__CollectionsJVMKt.listOf(11);
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        fillBannerList(noDeviceBannerList, new BannerRequestParamV2(listListOf, lowerCase, null, null, 12, null), false);
    }

    private final void addFaceEntranceItem(final WearableDeviceModel currentModel) {
        ObservableArrayList<TabContentItem> observableArrayList = this.tabItems;
        if (!(observableArrayList instanceof Collection) || !observableArrayList.isEmpty()) {
            for (TabContentItem tabContentItem : observableArrayList) {
                TabFaceEntranceItem tabFaceEntranceItem = this.mFaceEntranceItem;
                if (tabFaceEntranceItem != null && tabContentItem.getType() == tabFaceEntranceItem.getType()) {
                    return;
                }
            }
        }
        TabContentItem tabContentItem2 = getContentItems().get(102);
        if (tabContentItem2 != null) {
            TabFaceEntranceItem tabFaceEntranceItem2 = tabContentItem2 instanceof TabFaceEntranceItem ? (TabFaceEntranceItem) tabContentItem2 : new TabFaceEntranceItem();
            this.mFaceEntranceItem = tabFaceEntranceItem2;
            this.tabItems.add(tabFaceEntranceItem2);
            TabFaceEntranceItem tabFaceEntranceItem3 = this.mFaceEntranceItem;
            if (tabFaceEntranceItem3 != null) {
                tabFaceEntranceItem3.onDeviceChanged(currentModel.getDid());
            }
        }
        List<FaceData> faceEntranceItem = DevicePreference.INSTANCE.getFaceEntranceItem(currentModel.getDid());
        TabFaceEntranceItem tabFaceEntranceItem4 = this.mFaceEntranceItem;
        if (tabFaceEntranceItem4 != null) {
            tabFaceEntranceItem4.setDataList(faceEntranceItem);
        }
        TabFaceEntranceItem tabFaceEntranceItem5 = this.mFaceEntranceItem;
        if (tabFaceEntranceItem5 != null) {
            tabFaceEntranceItem5.setLoadTime(System.currentTimeMillis());
        }
        FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).requestLoadFaceEntranceV4(currentModel, new Function1() { // from class: mt6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabV4ViewModel.addFaceEntranceItem$lambda$26(this.f27177a, currentModel, (FaceEntranceRespV4) obj);
            }
        }, new Function1() { // from class: nt6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabV4ViewModel.addFaceEntranceItem$lambda$27(this.f28351a, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFaceEntranceItem$lambda$26(DeviceTabV4ViewModel this$0, WearableDeviceModel currentModel, FaceEntranceRespV4 it) {
        TabFaceEntranceItem tabFaceEntranceItem;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentModel, "$currentModel");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "requestLoadFaceEntrance success: " + it);
        FaceSizeConstant.INSTANCE.setCurrentType(it.getDeviceConfig().getShape());
        List<FaceData> faceList = it.getFaceList();
        if (faceList != null && !faceList.isEmpty()) {
            TabFaceEntranceItem tabFaceEntranceItem2 = this$0.mFaceEntranceItem;
            if (tabFaceEntranceItem2 != null) {
                tabFaceEntranceItem2.setDataList(it.getFaceList());
            }
            DevicePreference devicePreference = DevicePreference.INSTANCE;
            String did = currentModel.getDid();
            List<FaceData> faceList2 = it.getFaceList();
            Intrinsics.checkNotNull(faceList2);
            devicePreference.setFaceEntranceItem(did, faceList2);
        }
        if (!AppUtil.INSTANCE.isPlayChannel() && (tabFaceEntranceItem = this$0.mFaceEntranceItem) != null) {
            tabFaceEntranceItem.setRecentOnlineCount(it.getRecentOnlineData());
        }
        List<FaceData> faceList3 = it.getFaceList();
        if (faceList3 == null) {
            faceList3 = new ArrayList<>();
        }
        int i = 0;
        for (Object obj : faceList3) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String id = ((FaceData) obj).getId();
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append("-");
            sb.append(id);
            faceList3.size();
            i = i2;
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("expose_v3", "56.51.0.1.36389"), "name", "Device_page_Dialmarket", "type", "device_tab");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFaceEntranceItem$lambda$27(DeviceTabV4ViewModel this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.getTAG(), "requestLoadFaceEntrance fail: " + i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceBannerAdapter bannerAdapter_delegate$lambda$5() {
        return new DeviceBannerAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemBinding bannerItemBinding_delegate$lambda$6(DeviceTabV4ViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMModel().getBannerItemV4Bindings().bindExtra(zv1.f41707k, this$0);
    }

    private final BatteryInfo buildBatteryInfo(DeviceBatteryInfo deviceBatteryInfo, WearableDeviceModel wearableDeviceModel) {
        WearableDeviceInfo deviceInfo = wearableDeviceModel.getDeviceInfo();
        BatteryInfo batteryInfo = deviceInfo.getBatteryInfo();
        batteryInfo.setBattery(deviceBatteryInfo.getLevel());
        batteryInfo.setChargeFull(deviceBatteryInfo.isChargeFull());
        batteryInfo.setCharging(deviceBatteryInfo.isCharging());
        batteryInfo.setLastCharge(deviceBatteryInfo.getLastCharge());
        deviceInfo.setBatteryInfo(batteryInfo);
        wearableDeviceModel.setDeviceInfo(deviceInfo);
        return batteryInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkAndUpdateChosenApp() {
        ChooseCommonApp cloudChosenItem = getCloudChosenItem();
        if (cloudChosenItem == null) {
            ChooseAppPreference chooseAppPreference = ChooseAppPreference.INSTANCE;
            if (chooseAppPreference.getChooseAppLastTime() == 0 && chooseAppPreference.getChooseApp() == -1) {
                chooseAppPreference.setChooseApp(1);
            }
            DeviceSettingManager.INSTANCE.getInstance().addUpdateListener(this.updateSettingInfoListener);
            return;
        }
        String tag = getTAG();
        int chooseCommonApp = cloudChosenItem.getChooseCommonApp();
        long lastUpdateTime = cloudChosenItem.getLastUpdateTime();
        ChooseAppPreference chooseAppPreference2 = ChooseAppPreference.INSTANCE;
        Logger.i(tag, "checkAndUpdateChoiseCommonApp chosenCommonAppItem " + chooseCommonApp + " lastUpdateTime is " + lastUpdateTime + ", local chosen app is " + chooseAppPreference2.getChooseApp() + ", local chosen time is " + chooseAppPreference2.getChooseAppLastTime());
        if (cloudChosenItem.getChooseCommonApp() != 1 && cloudChosenItem.getChooseCommonApp() != 2 && cloudChosenItem.getChooseCommonApp() != 3) {
            chooseAppPreference2.setChooseApp(1);
            return;
        }
        if (chooseAppPreference2.getChooseAppLastTime() <= cloudChosenItem.getLastUpdateTime()) {
            if (chooseAppPreference2.getChooseAppLastTime() >= cloudChosenItem.getLastUpdateTime()) {
                Logger.i(getTAG(), "chosen no need update");
                return;
            }
            Logger.i(getTAG(), "chosen update web");
            chooseAppPreference2.setChooseAppLastTime(cloudChosenItem.getLastUpdateTime());
            chooseAppPreference2.setChooseApp(cloudChosenItem.getChooseCommonApp());
            return;
        }
        Logger.i(getTAG(), "chosen update local " + chooseAppPreference2.getChooseApp());
        recordChosenAppCloud(chooseAppPreference2.getChooseApp(), chooseAppPreference2.getChooseAppLastTime());
    }

    public static /* synthetic */ void checkChosenApp$default(DeviceTabV4ViewModel deviceTabV4ViewModel, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        deviceTabV4ViewModel.checkChosenApp(bool);
    }

    public static /* synthetic */ void connectDevice$default(DeviceTabV4ViewModel deviceTabV4ViewModel, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        deviceTabV4ViewModel.connectDevice(z, str);
    }

    private final List<Integer> createAllFeatureCardIds() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{19, 6, 7, 8, 9, 10, 18, 11, 12});
    }

    private final TabContentItem createNormalContentItem(int itemType, int type) {
        int iBuildTabTitle = getMModel().buildTabTitle(type);
        if (iBuildTabTitle == -1) {
            return new TabContentItem(itemType, type, 0, StringExtKt.toLiveData(""), null, false, null, null, null, null, null, null, null, 8180, null);
        }
        String string = ApplicationExtKt.getApplication().getString(iBuildTabTitle);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new TabContentItem(itemType, type, 0, StringExtKt.toLiveData(string), null, false, null, null, null, null, null, null, null, 8180, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestRecyclerViewItemEffectiveExposeBiz effectiveExposeBiz_delegate$lambda$10() {
        return new NestRecyclerViewItemEffectiveExposeBiz();
    }

    private final void fillBannerList(final List<BannerItemV2> observableList, final BannerRequestParamV2 bannerRequestParam, final boolean hasDevice) {
        BannerExtKt.getINSTANCE(IBanner.INSTANCE).getBannerListAsyncV2(bannerRequestParam, new Function1() { // from class: ot6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabV4ViewModel.fillBannerList$lambda$43(observableList, hasDevice, this, (List) obj);
            }
        }, new Function1() { // from class: pt6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabV4ViewModel.fillBannerList$lambda$44(bannerRequestParam, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fillBannerList$lambda$43(List observableList, boolean z, DeviceTabV4ViewModel this$0, List it) {
        boolean z2;
        int i;
        Intrinsics.checkNotNullParameter(observableList, "$observableList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        observableList.clear();
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            BannerItemV2 bannerItemV2 = (BannerItemV2) it2.next();
            if ((z && bannerItemV2.getResourceId() == 12) || (!z && bannerItemV2.getResourceId() == 11)) {
                observableList.add(bannerItemV2);
            }
            ObservableArrayList<TabContentItem> observableArrayList = this$0.tabItems;
            int i2 = 0;
            if (!(observableArrayList instanceof Collection) || !observableArrayList.isEmpty()) {
                Iterator<TabContentItem> it3 = observableArrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (it3.next().getType() == 3) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            List list = observableList;
            if ((!list.isEmpty()) && !z2) {
                TabContentItem tabContentItemCreateNormalContentItem = this$0.createNormalContentItem(18, 3);
                Iterator<TabContentItem> it4 = this$0.tabItems.iterator();
                int i3 = 0;
                while (true) {
                    i = -1;
                    if (!it4.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (it4.next().getType() == 102) {
                        break;
                    }
                    i3++;
                }
                Iterator<TabContentItem> it5 = this$0.tabItems.iterator();
                while (it5.hasNext()) {
                    if (it5.next().getType() == 1) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                Logger.i(this$0.getTAG(), "fillBannerList " + observableList.size() + " " + z);
                if (i3 >= 0) {
                    this$0.tabItems.add(i3 + 1, tabContentItemCreateNormalContentItem);
                } else if (i > 0) {
                    this$0.tabItems.add(i, tabContentItemCreateNormalContentItem);
                } else {
                    this$0.tabItems.add(tabContentItemCreateNormalContentItem);
                }
            }
            this$0.bannerItems.clear();
            this$0.bannerItems.addAll(list);
        }
        NestRecyclerViewItemEffectiveExposeBiz.trackOnDataChange$default(this$0.getEffectiveExposeBiz(), "device banner data change", null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fillBannerList$lambda$44(BannerRequestParamV2 bannerRequestParam, ApiException it) {
        Intrinsics.checkNotNullParameter(bannerRequestParam, "$bannerRequestParam");
        Intrinsics.checkNotNullParameter(it, "it");
        k02.a("DeviceTabViewModel fillBannerList " + bannerRequestParam, it);
        return Unit.INSTANCE;
    }

    private final ChooseCommonApp getCloudChosenItem() {
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem("xiaomiwear_app", DeviceSettingConfigKey.KEY_CHOOSE_COMMON_APP).valueToObject(ChooseCommonApp.class);
        if (objValueToObject instanceof ChooseCommonApp) {
            return (ChooseCommonApp) objValueToObject;
        }
        return null;
    }

    private final NestRecyclerViewItemEffectiveExposeBiz getEffectiveExposeBiz() {
        return (NestRecyclerViewItemEffectiveExposeBiz) this.effectiveExposeBiz.getValue();
    }

    private final List<BannerItemV2> getHasDeviceBannerList() {
        return (List) this.hasDeviceBannerList.getValue();
    }

    private final List<BannerItemV2> getNoDeviceBannerList() {
        return (List) this.noDeviceBannerList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List hasDeviceBannerList_delegate$lambda$8() {
        return new ArrayList();
    }

    private final boolean hasLocationPermission() {
        return PermissionsUtil.INSTANCE.checkPermission("android.permission.ACCESS_FINE_LOCATION");
    }

    private final boolean hasSupportDevice() {
        Iterator it = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels().iterator();
        while (it.hasNext()) {
            if (DeviceExtKt.isSupportDevice(((WearableDeviceModel) it.next()).getProduct())) {
                return true;
            }
        }
        return false;
    }

    private final boolean isActiveDeviceModel(String did) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        return wearableDeviceModel != null && wearableDeviceModel.getIsConnectActive();
    }

    private final boolean isStatusEquals() {
        ObservableInt status;
        TabDeviceContentItem tabDeviceContentItem = this.mDialStatusItem;
        return ((tabDeviceContentItem == null || (status = tabDeviceContentItem.getStatus()) == null) ? 1 : status.get()) == this.mDeviceManager.getDeviceStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemBinding itemBindings_delegate$lambda$1(DeviceTabV4ViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMModel().getTabItemBindings().bindExtra(zv1.f41707k, this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBattery$lambda$15$lambda$14(DeviceTabV4ViewModel this$0, WearableDeviceModel it, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        if (num == null) {
            Logger.i(this$0.getTAG(), "result battery is null");
            return Unit.INSTANCE;
        }
        Logger.i(this$0.getTAG(), "BatterySyncer syncData batteryLevel:" + num);
        AnyExtKt.main$default(null, new DeviceTabV4ViewModel$loadBattery$1$1$1(it, num, this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadDevice$default(DeviceTabV4ViewModel deviceTabV4ViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        deviceTabV4ViewModel.loadDevice(z);
    }

    private final void loadWearOsWatch(WearableDeviceModel currentModel) {
        FaceWearOsHelperExtKt.getInstance(FaceWearOsHelper.INSTANCE).loadWearOsWatch(currentModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mAllFeatureCardIds_delegate$lambda$7(DeviceTabV4ViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.createAllFeatureCardIds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mDeviceChangeListener$lambda$13(DeviceTabV4ViewModel this$0, WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.getTAG(), "current device(" + this$0.mCurrentDeviceDid + ") has been changed to " + wearableDeviceModel);
        if (wearableDeviceModel == null) {
            this$0.tabItems.clear();
            this$0.settingTabItems.clear();
        }
        Logger.i(this$0.getTAG(), "device change devices num = " + this$0.mDeviceManager.getDeviceSize());
        this$0.loadDevice(false);
        this$0.readN62SWatchInfo();
        return Unit.INSTANCE;
    }

    private final boolean needLocationDevice() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.mDeviceManager.getCurrentDeviceModel();
        if (wearableDeviceModel == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            return wearableDeviceModel != null && DeviceModelExtKt.isBle(wearableDeviceModel) && ProxyManagerKt.isBleOpen();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List noDeviceBannerList_delegate$lambda$9() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConnectFailure(WearableDeviceModel deviceModel, int errorCode, int retryTimes) {
        int i;
        if (deviceModel == null || !deviceModel.getIsCurrent()) {
            return;
        }
        if (DeviceModelExtKt.isBluetooth(deviceModel)) {
            if (retryTimes > 0) {
                i = retryTimes;
            } else {
                i = this.mRetryConnectCount;
                if (i <= 0) {
                    i = 0;
                }
            }
            this.bleReconnect.setValue(new ConnectStatus(errorCode, deviceModel, i));
        }
        Logger.i(getTAG(), "isActiveDeviceModel = " + isActiveDeviceModel(deviceModel.getDid()) + ", retryTimes = " + retryTimes);
        if (isActiveDeviceModel(deviceModel.getDid())) {
            updateDialStatus(deviceModel.getDid(), 1);
        } else {
            updateDialStatus(deviceModel.getDid(), 9);
        }
    }

    private final void onConnectSuccess(String did, final WearableDeviceModel deviceModel, boolean isNeedSync, boolean needShowDevice) {
        MutableLiveData<String> faceUrl;
        Logger.i(getTAG(), "onConnectSuccess  refresh ui " + deviceModel + " isAccessory = " + (deviceModel != null ? Boolean.valueOf(com.xiaomi.fit.device.extensions.DeviceModelExtKt.isAccessory(deviceModel)) : null));
        if (deviceModel == null || !Intrinsics.areEqual(did, this.mCurrentDeviceDid) || com.xiaomi.fit.device.extensions.DeviceModelExtKt.isAccessory(deviceModel)) {
            return;
        }
        if (needShowDevice) {
            showDevice();
        }
        NotifyHelperExtKt.getNotificationManagerExport().updateRemindWhenConnectDevice(did);
        DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE).oneTrackDeviceSetting();
        if (!isStatusEquals()) {
            updateDialStatus(did, 3);
            if (deviceModel.getDeviceStatus() != 3) {
                deviceModel.setDeviceStatus(3);
            }
        }
        if (isNeedSync) {
            syncDevice$default(this, deviceModel, false, 2, null);
        }
        this.bleReconnect.setValue(new ConnectStatus(2004, deviceModel, 0));
        TabDeviceContentItem tabDeviceContentItem = this.mDialStatusItem;
        if (tabDeviceContentItem != null && (faceUrl = tabDeviceContentItem.getFaceUrl()) != null) {
            faceUrl.postValue(DeviceStatusView.URL_LOAD_WATCH_FACE);
        }
        if (DeviceModelExtKt.isHuaMi(deviceModel)) {
            HuamiApiCaller huaMiApiCaller = this.mDeviceManager.getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
            if (huaMiApiCaller != null) {
                huaMiApiCaller.setBatteryChangedCallback(new ht6(this, deviceModel));
            }
            if (huaMiApiCaller != null) {
                huaMiApiCaller.registerBTExceptionListener(new g.a() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel.onConnectSuccess.2
                    @Override // com.xiaomi.wearable.hm.g
                    public void onException(int code) {
                        DeviceTabV4ViewModel.this.getBleReconnect().postValue(new ConnectStatus(code, deviceModel, 0));
                    }
                });
            }
        }
    }

    public static /* synthetic */ void onConnectSuccess$default(DeviceTabV4ViewModel deviceTabV4ViewModel, String str, WearableDeviceModel wearableDeviceModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        deviceTabV4ViewModel.onConnectSuccess(str, wearableDeviceModel, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConnectSuccess$lambda$16(DeviceTabV4ViewModel this$0, WearableDeviceModel wearableDeviceModel, DeviceBatteryInfo deviceBatteryInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(deviceBatteryInfo);
        this$0.buildBatteryInfo(deviceBatteryInfo, wearableDeviceModel);
        TabDeviceContentItem tabDeviceContentItem = this$0.mDialStatusItem;
        if (tabDeviceContentItem != null) {
            tabDeviceContentItem.setStatus(-100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDisconnect(String did) {
        Logger.i(getTAG(), "onDisconnect  refresh ui");
        if (did != null && Intrinsics.areEqual(did, this.mCurrentDeviceDid)) {
            if (OhterExtKt.isAppAbandon(ApplicationExtKt.getApplication())) {
                updateDialStatus(did, 8);
                return;
            } else if (isActiveDeviceModel(did)) {
                updateDialStatus(did, 4);
                return;
            } else {
                updateDialStatus(did, 9);
                return;
            }
        }
        Logger.i(getTAG(), did + " is not equal current device(" + this.mCurrentDeviceDid + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void providerTabDeviceBannerSettingsItem() {
        TabDeviceBannerSettingsItem tabDeviceBannerSettingsItem;
        TabContentItem tabContentItem = getContentItems().get(200);
        if (tabContentItem != null) {
            if (tabContentItem instanceof TabDeviceBannerSettingsItem) {
                tabDeviceBannerSettingsItem = (TabDeviceBannerSettingsItem) tabContentItem;
            } else {
                tabDeviceBannerSettingsItem = new TabDeviceBannerSettingsItem(16, 200, 0, StringExtKt.toLiveData(""), null, false, null, null, null, null, null, new Function1() { // from class: lt6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(DeviceTabV4ViewModel.providerTabDeviceBannerSettingsItem$lambda$12$lambda$11((WearableDeviceModel) obj));
                    }
                }, 2036, null);
            }
            this.mTabDeviceBannerSettingsItem = tabDeviceBannerSettingsItem;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean providerTabDeviceBannerSettingsItem$lambda$12$lambda$11(WearableDeviceModel TabDeviceBannerSettingsItem) {
        Intrinsics.checkNotNullParameter(TabDeviceBannerSettingsItem, "$this$TabDeviceBannerSettingsItem");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readN62SWatchInfo() {
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.i(getTAG(), "readN62SWatchInfo device model: " + (wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null));
        Set of = SetsKt__SetsKt.setOf((Object[]) new String[]{"mijia.watch.n62s", "miwear.watch.n67cn"});
        if (wearableDeviceModel == null || !of.contains(DeviceModelExtKt.getModel(wearableDeviceModel))) {
            return;
        }
        if (wearableDeviceModel.getIsDeviceConnected()) {
            wearableDeviceModel.readWatchInfo(new eu6<WatchInfo>() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel.readN62SWatchInfo.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    Logger.i(DeviceTabV4ViewModel.this.getTAG(), "readN62SWatchInfo  readWatchInfo error");
                }

                @Override // defpackage.eu6
                public void onResult(WatchInfo result) {
                    String firmwareVersion;
                    Logger.i(DeviceTabV4ViewModel.this.getTAG(), "readN62SWatchInfo onResult" + (result != null ? result.getFirmwareVersion() : null));
                    N62SVersionPreference n62SVersionPreference = N62SVersionPreference.INSTANCE;
                    String did = wearableDeviceModel.getDid();
                    if (result == null || (firmwareVersion = result.getFirmwareVersion()) == null) {
                        firmwareVersion = "";
                    }
                    n62SVersionPreference.setN62SVersion(did, firmwareVersion);
                }
            });
        } else {
            Logger.i(getTAG(), "readN62SWatchInfo isDeviceConnected");
        }
    }

    private final void realConnect(final String did, final boolean force) {
        Logger.i(getTAG(), "realConnect " + did);
        LifecycleOwner lifecycleOwner = this.mOwner;
        if (lifecycleOwner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOwner");
            lifecycleOwner = null;
        }
        BaseActivity baseActivity = (BaseActivity) ((BaseFragment) lifecycleOwner).getActivity();
        if (baseActivity == null) {
            Logger.i(getTAG(), "activity is null, return!");
        } else {
            BluetoothExtKt.openBluetooth(baseActivity, new Function0() { // from class: jt6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceTabV4ViewModel.realConnect$lambda$31(did, this, force);
                }
            }, new Function1() { // from class: kt6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceTabV4ViewModel.realConnect$lambda$32(this.f24275a, ((Integer) obj).intValue());
                }
            });
        }
    }

    public static /* synthetic */ void realConnect$default(DeviceTabV4ViewModel deviceTabV4ViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        deviceTabV4ViewModel.realConnect(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit realConnect$lambda$31(String str, DeviceTabV4ViewModel this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this$0.mDeviceManager.getDeviceModel(str);
            if (wearableDeviceModel == null) {
                return Unit.INSTANCE;
            }
            if (!wearableDeviceModel.getIsConnectActive() && !z) {
                Logger.i(this$0.getTAG(), "realConnect: [accessory] phone id not equal");
                this$0.updateAccessoryStatus(str, 9);
                return Unit.INSTANCE;
            }
            this$0.mDeviceManager.connectDevice(str);
        } else {
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) this$0.mDeviceManager.getCurrentDeviceModel();
            if (wearableDeviceModel2 == null) {
                return Unit.INSTANCE;
            }
            if (!wearableDeviceModel2.getIsConnectActive() && !z) {
                Logger.i(this$0.getTAG(), "realConnect: phone id not equal");
                this$0.updateDialStatus(wearableDeviceModel2.getDid(), 9);
                return Unit.INSTANCE;
            }
            DevicePreference.INSTANCE.setIN_BIND_NEW_MODE(false);
            DeviceManager.DefaultImpls.connectDevice$default(this$0.mDeviceManager, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit realConnect$lambda$32(DeviceTabV4ViewModel this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.getTAG(), "Cannot open bluetooth");
        return Unit.INSTANCE;
    }

    private final void recordChosenAppCloud(int app, long time) {
        Logger.i(getTAG(), "recordChosenApp upload to cloud app = " + app + " , time = " + time);
        ChooseCommonApp chooseCommonApp = new ChooseCommonApp();
        chooseCommonApp.setLastUpdateTime(time);
        chooseCommonApp.setChooseCommonApp(app);
        DeviceSettingManager.INSTANCE.getInstance().sendUserSettingItem(DeviceSettingConfigKey.KEY_CHOOSE_COMMON_APP, chooseCommonApp, false);
    }

    private final void refreshAccessoryWearMode() {
        Logger.i(getTAG(), "refreshAccessoryMode ");
        for (WearableDeviceModel wearableDeviceModel : DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryDeviceModels()) {
            if (wearableDeviceModel.getIsDeviceConnected()) {
                updateAccessoryStatus(wearableDeviceModel.getDid(), 3);
            } else {
                connectDevice(true, wearableDeviceModel.getDid());
            }
        }
    }

    private final void requestLocationSwitch(String did, boolean force) {
        long last_request_location_switch = DevicePreference.INSTANCE.getLAST_REQUEST_LOCATION_SWITCH();
        if (force || System.currentTimeMillis() - last_request_location_switch >= 172800000) {
            this.showOpenLocationSwitch.postValue(Boolean.TRUE);
        }
    }

    public static /* synthetic */ void requestLocationSwitch$default(DeviceTabV4ViewModel deviceTabV4ViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        deviceTabV4ViewModel.requestLocationSwitch(str, z);
    }

    private final void requestPermissionIfNeed(String did, boolean force) {
        DevicePreference devicePreference = DevicePreference.INSTANCE;
        long last_request_permission_time = devicePreference.getLAST_REQUEST_PERMISSION_TIME();
        long last_show_blue_data_dialog_time = devicePreference.getLAST_SHOW_BLUE_DATA_DIALOG_TIME();
        if (!force) {
            if (last_request_permission_time > 0 || devicePreference.getAGREE_BLUE_DATA_ENABLE()) {
                if (System.currentTimeMillis() - last_request_permission_time < 172800000) {
                    return;
                }
            } else if (System.currentTimeMillis() - last_show_blue_data_dialog_time < 172800000) {
                return;
            }
        }
        this.showConnectPermission.postValue(new Pair<>(Boolean.TRUE, did));
    }

    public static /* synthetic */ void requestPermissionIfNeed$default(DeviceTabV4ViewModel deviceTabV4ViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        deviceTabV4ViewModel.requestPermissionIfNeed(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnItemClickListener$lambda$36(DeviceTabV4ViewModel this$0, Function3 listener, TabContentItem tabContentItem, int i, View itemView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(tabContentItem, "tabContentItem");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        int id = itemView.getId();
        if (id != xqi.X) {
            if (id == xqi.f39366a) {
                if (!(tabContentItem instanceof TabAccessoryDeviceContentItem)) {
                    return Unit.INSTANCE;
                }
                TabAccessoryDeviceContentItem tabAccessoryDeviceContentItem = (TabAccessoryDeviceContentItem) tabContentItem;
                int i2 = tabAccessoryDeviceContentItem.getStatus().get();
                final String did = tabAccessoryDeviceContentItem.getDid();
                switch (i2) {
                    case 1:
                    case 4:
                    case 8:
                    case 9:
                        this$0.manageAccessory.postValue(did);
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                        Logger.i(this$0.getTAG(), "currentdid " + this$0.mCurrentDeviceDid);
                        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this$0.mDeviceManager.getCurrentDeviceModel();
                        if (wearableDeviceModel == null) {
                            this$0.switchAccessoryMode(0, did, true, new Function1() { // from class: it6
                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: invoke */
                                public final Object invoke2(Object obj) {
                                    return DeviceTabV4ViewModel.setOnItemClickListener$lambda$36$lambda$35$lambda$34(did, ((Boolean) obj).booleanValue());
                                }
                            });
                        } else {
                            this$0.exitAccessory.postValue(new Pair<>(did, wearableDeviceModel.getDid()));
                        }
                        break;
                }
            } else {
                listener.invoke(tabContentItem, Integer.valueOf(i), itemView);
            }
        } else {
            Logger.i(this$0.getTAG(), "OnChildClickListener  isConnectd:" + this$0.mDeviceManager.isConnected() + "  status:" + DeviceStatus.INSTANCE.statusToString(this$0.mDeviceManager.getDeviceStatus()));
            if (this$0.mDeviceManager.isConnected()) {
                clb.a(ApplicationExtKt.getApplication());
                syncDevice$default(this$0, (WearableDeviceModel) this$0.mDeviceManager.getCurrentDeviceModel(), false, 2, null);
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.51.0.1.36388"), "name", "Device_page_Connect", "status", 1);
            } else if (this$0.mDeviceManager.getDeviceStatus() == 4 || this$0.mDeviceManager.getDeviceStatus() == 1 || this$0.mDeviceManager.getDeviceStatus() == 9) {
                Logger.i(this$0.getTAG(), "OnChildClickListener  connectDevice");
                this$0.mRetryConnectCount++;
                DevicePreference.INSTANCE.setIN_BIND_NEW_MODE(false);
                connectDevice$default(this$0, true, null, 2, null);
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.51.0.1.36388"), "name", "Device_page_Connect", "status", 0);
            } else if (this$0.mDeviceManager.getDeviceStatus() == 8) {
                this$0.mChoiceAppFlag.postValue(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnItemClickListener$lambda$36$lambda$35$lambda$34(String did, boolean z) {
        Intrinsics.checkNotNullParameter(did, "$did");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        DeviceManagerExtKt.getInstance(companion).switchDevice(DeviceManagerExtKt.getInstance(companion).getDeviceModel(did));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceSettingsItemAdapter settingAdapter_delegate$lambda$3() {
        return new DeviceSettingsItemAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemBinding settingItemBindings_delegate$lambda$2(DeviceTabV4ViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMModel().getSettingTabItemBindings().bindExtra(zv1.f41707k, this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceSettingsItemViewHolder settingViewHolder$lambda$4(View view, int i) {
        Intrinsics.checkNotNull(view);
        return new DeviceSettingsItemViewHolder(view);
    }

    private final void showDevice() {
        TabDeviceContentItem tabDeviceContentItem;
        Logger.i(getTAG(), "showDevice() called");
        this.tabItems.clear();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.mDeviceManager.getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        if (!DeviceModelExtKt.isLocalDevice(wearableDeviceModel)) {
            String name = DeviceModelExtKt.getName(wearableDeviceModel);
            String bigIcon = DeviceModelExtKt.getBigIcon(wearableDeviceModel);
            TabContentItem tabContentItem = getContentItems().get(101);
            if (tabContentItem != null) {
                if (tabContentItem instanceof TabDeviceContentItem) {
                    tabDeviceContentItem = (TabDeviceContentItem) tabContentItem;
                    tabDeviceContentItem.setIconUrl(bigIcon != null ? StringExtKt.toLiveData(bigIcon) : null);
                    tabContentItem.getTitle().setValue(name);
                } else {
                    Logger.e(getTAG(), "getDeviceContentItem 101 error");
                    tabDeviceContentItem = new TabDeviceContentItem(101, 5, 0, bigIcon != null ? StringExtKt.toLiveData(bigIcon) : null, StringExtKt.toLiveData(name), null, false, null, null, 484, null);
                }
                this.mDialStatusItem = tabDeviceContentItem;
                tabDeviceContentItem.setSupportSwitchWearMode((DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(wearableDeviceModel.getDid()) & 1024) != 0);
                this.tabItems.add(this.mDialStatusItem);
            }
            addAccessoryDeviceItem();
            providerTabDeviceBannerSettingsItem();
            this.tabItems.add(this.mTabDeviceBannerSettingsItem);
            if (!DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
                addFaceEntranceItem(wearableDeviceModel);
            }
            addBannerItemWhenHasDevice();
            Logger.i(getTAG(), "ChoiseCommonAppPreference.getChoiseCommonApp() " + ChooseAppPreference.INSTANCE.getChooseApp());
            if (OhterExtKt.isAppAbandon(ApplicationExtKt.getApplication())) {
                TabDeviceContentItem tabDeviceContentItem2 = this.mDialStatusItem;
                Intrinsics.checkNotNull(tabDeviceContentItem2);
                tabDeviceContentItem2.setStatus(8);
            } else if (!wearableDeviceModel.getIsConnectActive()) {
                TabDeviceContentItem tabDeviceContentItem3 = this.mDialStatusItem;
                Intrinsics.checkNotNull(tabDeviceContentItem3);
                tabDeviceContentItem3.setStatus(9);
            } else if (wearableDeviceModel.getIsDeviceConnected()) {
                TabDeviceContentItem tabDeviceContentItem4 = this.mDialStatusItem;
                Intrinsics.checkNotNull(tabDeviceContentItem4);
                int i = tabDeviceContentItem4.getStatus().get();
                if (i != 7 && i != 6 && i != 3) {
                    TabDeviceContentItem tabDeviceContentItem5 = this.mDialStatusItem;
                    Intrinsics.checkNotNull(tabDeviceContentItem5);
                    tabDeviceContentItem5.setStatus(3);
                }
            } else {
                TabDeviceContentItem tabDeviceContentItem6 = this.mDialStatusItem;
                Intrinsics.checkNotNull(tabDeviceContentItem6);
                tabDeviceContentItem6.setStatus(4);
            }
            this.tabItems.add(createNormalContentItem(11, 1));
            this.settingTabItems.clear();
            List<Integer> mAllFeatureCardIds = getMAllFeatureCardIds();
            ArrayList arrayList = new ArrayList();
            for (Object obj : mAllFeatureCardIds) {
                if (com.xiaomi.fitness.device.manager.extensions.DeviceModelExtKt.isSupportFeatureCardV4(wearableDeviceModel, ((Number) obj).intValue())) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TabContentItem deviceNormalTabList = getMModel().getDeviceNormalTabList(wearableDeviceModel, ((Number) it.next()).intValue());
                if (deviceNormalTabList != null) {
                    this.settingTabItems.add(deviceNormalTabList);
                }
            }
            for (TabContentItem tabContentItem2 : this.settingTabItems) {
                if (tabContentItem2.getType() == 9) {
                    this.systemTabItem = tabContentItem2;
                }
            }
        }
        loadWearOsWatch(wearableDeviceModel);
    }

    private final boolean showRecoveryConnect(String did) {
        WearableDeviceModel wearableDeviceModel;
        return (did == null || (wearableDeviceModel = (WearableDeviceModel) this.mDeviceManager.getDeviceModel(did)) == null || !wearableDeviceModel.getIsCurrent() || DeviceModelExtKt.isWearOS(wearableDeviceModel)) ? false : true;
    }

    private final void syncDevice(WearableDeviceModel deviceModel, boolean isAuto) {
        if (deviceModel != null) {
            this.mDeviceContact.addSyncStateListener(this.mSyncStateListener);
            this.mDeviceContact.syncData(deviceModel.getDid(), isAuto);
            WearableDeviceModel.DefaultImpls.readWatchInfo$default(deviceModel, null, 1, null);
        }
    }

    public static /* synthetic */ void syncDevice$default(DeviceTabV4ViewModel deviceTabV4ViewModel, WearableDeviceModel wearableDeviceModel, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        deviceTabV4ViewModel.syncDevice(wearableDeviceModel, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateAccessoryStatus$lambda$47$lambda$46(final DeviceTabV4ViewModel this$0, final String str, final int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String tag = this$0.getTAG();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(str);
        Logger.i(tag, "isAccessory = " + (wearableDeviceModel != null ? Boolean.valueOf(com.xiaomi.fit.device.extensions.DeviceModelExtKt.isAccessory(wearableDeviceModel)) : null) + ",mode = " + i);
        if (i == 0 || i == 2) {
            this$0.switchAccessoryMode(i, str, false, new Function1() { // from class: xs6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceTabV4ViewModel.updateAccessoryStatus$lambda$47$lambda$46$lambda$45(str, i, this$0, ((Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateAccessoryStatus$lambda$47$lambda$46$lambda$45(String str, int i, DeviceTabV4ViewModel this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        DeviceManagerExtKt.getInstance(companion).switchDeviceWearMode(str, i, false);
        if (DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel() != 0) {
            DeviceManagerExtKt.getInstance(companion).disconnectDevice(str);
            this$0.loadDevice(false);
        } else {
            DeviceManagerExtKt.getInstance(companion).switchDevice(DeviceManagerExtKt.getInstance(companion).getDeviceModel(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDialStatus(String did, int status) {
        if (Intrinsics.areEqual(did, this.mCurrentDeviceDid)) {
            TabDeviceContentItem tabDeviceContentItem = this.mDialStatusItem;
            if (tabDeviceContentItem != null) {
                tabDeviceContentItem.setStatus(status);
            }
            if (status != 9 || this.hasShownRecoverConnect || DevicePreference.INSTANCE.getCONNECT_NEW_PHONE() || !showRecoveryConnect(did)) {
                return;
            }
            this.showDisableConnect.postValue(Boolean.TRUE);
            this.hasShownRecoverConnect = true;
            return;
        }
        Logger.i(getTAG(), "Cannot update status to " + status + ", because " + did + " is not equal current device(" + this.mCurrentDeviceDid + ")");
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).addFaceEventListener(this.faceEventListener);
        NotifyHelperExtKt.getNotificationManagerExport().addNotifyRemindListener(new INotifyRemindListener() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel.attach.1
            @Override // com.xiaomi.fitness.notify.export.INotifyRemindListener
            public void onHideRemindBannerItemView() {
                Iterator<TabContentItem> it = DeviceTabV4ViewModel.this.getTabItems().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (it.next().getType() == 200) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    DeviceTabV4ViewModel.this.getTabItems().remove(i);
                }
            }

            @Override // com.xiaomi.fitness.notify.export.INotifyRemindListener
            public void onShowRemindBannerItemView(int remindType) {
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("expose_v3", "56.51.0.1.36385"), "name", "Device_page_PermissionApplication");
                AnyExtKt.main$default(null, new DeviceTabV4ViewModel$attach$1$onShowRemindBannerItemView$1(DeviceTabV4ViewModel.this, remindType, null), 1, null);
            }
        });
    }

    public final void bindDevice(@NotNull WearableDeviceInfo deviceInfo, @NotNull a callback) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (deviceInfo.getMac() == null) {
            return;
        }
        WearableDeviceManagerWrapper wearableDeviceManagerWrapper = this.mDeviceManager;
        String model = deviceInfo.getModel();
        String mac = deviceInfo.getMac();
        Intrinsics.checkNotNull(mac);
        wearableDeviceManagerWrapper.bindDevice(new DeviceParameter(model, mac, deviceInfo.getBleName(), deviceInfo.getNodeID(), null, false, deviceInfo.getDid(), 11, 32, null), callback);
    }

    public final void checkChosenApp(@Nullable Boolean showChooseAppDialog) {
        checkAndUpdateChosenApp();
        if (!AppUtil.hasPackage(ApplicationExtKt.getApplication(), "com.xiaomi.wearable")) {
            if (this.mDeviceManager.getDeviceStatus() == 8) {
                connectDevice$default(this, false, null, 2, null);
                return;
            }
            return;
        }
        if (hasSupportDevice()) {
            int chooseApp = ChooseAppPreference.INSTANCE.getChooseApp();
            Logger.i(getTAG(), "chosenApp is " + chooseApp + " showChooseAppDialog is " + showChooseAppDialog);
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(showChooseAppDialog, bool)) {
                this.mChoiceAppFlag.postValue(bool);
                return;
            }
            if (chooseApp == 1) {
                this.mChoiceAppFlag.postValue(bool);
                return;
            }
            if (chooseApp != 2) {
                if (chooseApp == 3 && !this.mDeviceManager.isConnected() && s33.e() && BluetoothPermissionUtil.INSTANCE.hasConnectPermission()) {
                    connectDevice$default(this, false, null, 2, null);
                    return;
                }
                return;
            }
            String str = this.mCurrentDeviceDid;
            if (str != null) {
                updateDialStatus(str, 8);
                this.mDeviceManager.disconnectDevice(str);
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.mDeviceManager.getCurrentDeviceModel();
                if (wearableDeviceModel != null) {
                    wearableDeviceModel.setDeviceStatus(8);
                }
            }
        }
    }

    public final void connectDevice(boolean force, @Nullable String did) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (PermissionsUtil.INSTANCE.checkPermission("android.permission.BLUETOOTH_CONNECT")) {
                realConnect(did, force);
                return;
            } else {
                requestPermissionIfNeed(did, force);
                return;
            }
        }
        if (!needLocationDevice()) {
            realConnect(did, force);
            return;
        }
        if (!hasLocationPermission()) {
            requestPermissionIfNeed(did, force);
        } else if (LocationExtKt.isGpsEnable(ApplicationExtKt.getApplication())) {
            realConnect(did, force);
        } else {
            requestLocationSwitch(did, force);
        }
    }

    public final void connectDeviceIfNeed() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.mDeviceManager.getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            this.mCurrentDeviceDid = wearableDeviceModel.getDid();
            if (wearableDeviceModel.getIsDeviceConnected()) {
                onConnectSuccess$default(this, this.mCurrentDeviceDid, wearableDeviceModel, false, false, 12, null);
            } else {
                connectDevice$default(this, false, null, 2, null);
            }
        }
    }

    @NotNull
    public final DeviceTabItemAdapter getAdapter() {
        return (DeviceTabItemAdapter) this.adapter.getValue();
    }

    @NotNull
    public final DeviceBannerAdapter getBannerAdapter() {
        return (DeviceBannerAdapter) this.bannerAdapter.getValue();
    }

    @NotNull
    public final ItemBinding<BannerItemV2> getBannerItemBinding() {
        return (ItemBinding) this.bannerItemBinding.getValue();
    }

    @NotNull
    public final ObservableArrayList<BannerItemV2> getBannerItems() {
        return this.bannerItems;
    }

    @NotNull
    public final MutableLiveData<ConnectStatus> getBleReconnect() {
        return this.bleReconnect;
    }

    public final boolean getComeFromMedalDetailPageFromSP() {
        return getMPopMedalRepo().cameFromMedalDetailPage();
    }

    @NotNull
    public final Map<Integer, TabContentItem> getContentItems() {
        return getMModel().getContentItems();
    }

    @NotNull
    public final MutableLiveData<Pair<Integer, Boolean>> getExistAccessoryMode() {
        return this.existAccessoryMode;
    }

    @NotNull
    public final MutableLiveData<Pair<String, String>> getExitAccessory() {
        return this.exitAccessory;
    }

    @NotNull
    public final MutableLiveData<Pair<String, Integer>> getExitAccessoryModeFromDevice() {
        return this.exitAccessoryModeFromDevice;
    }

    @Nullable
    public final PopMedalData getFirstMedalFromPopMedalDataSP() {
        return getMPopMedalRepo().getFirstMedal();
    }

    public final boolean getHasShownRecoverConnect() {
        return this.hasShownRecoverConnect;
    }

    @NotNull
    public final ItemBinding<TabContentItem> getItemBindings() {
        return (ItemBinding) this.itemBindings.getValue();
    }

    @NotNull
    public final List<Integer> getMAllFeatureCardIds() {
        return (List) this.mAllFeatureCardIds.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getMChoiceAppFlag() {
        return this.mChoiceAppFlag;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMGoUncommonUsedAppFlag() {
        return this.mGoUncommonUsedAppFlag;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMLoadingFlag() {
        return this.mLoadingFlag;
    }

    @NotNull
    public final IPopMedalListRepo getMPopMedalRepo() {
        IPopMedalListRepo iPopMedalListRepo = this.mPopMedalRepo;
        if (iPopMedalListRepo != null) {
            return iPopMedalListRepo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPopMedalRepo");
        return null;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMUpdateAppSuccessFlag() {
        return this.mUpdateAppSuccessFlag;
    }

    @NotNull
    public final MutableLiveData<String> getManageAccessory() {
        return this.manageAccessory;
    }

    @NotNull
    public final MutableLiveData<PopMedalData> getMedalToPopLiveData() {
        return this.medalToPopLiveData;
    }

    @NotNull
    public final DeviceSettingsItemAdapter getSettingAdapter() {
        return (DeviceSettingsItemAdapter) this.settingAdapter.getValue();
    }

    @NotNull
    public final ItemBinding<TabContentItem> getSettingItemBindings() {
        return (ItemBinding) this.settingItemBindings.getValue();
    }

    @NotNull
    public final ObservableArrayList<TabContentItem> getSettingTabItems() {
        return this.settingTabItems;
    }

    @NotNull
    public final Function2<View, Integer, BaseViewHolder<TabContentItem>> getSettingViewHolder() {
        return this.settingViewHolder;
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getShowConnectPermission() {
        return this.showConnectPermission;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowDisableConnect() {
        return this.showDisableConnect;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowOpenLocationSwitch() {
        return this.showOpenLocationSwitch;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "DeviceTabViewModelV4";
    }

    @NotNull
    public final ObservableArrayList<TabContentItem> getTabItems() {
        return this.tabItems;
    }

    @NotNull
    public final MutableLiveData<Pair<String, Integer>> getWearModeSwitchSuccess() {
        return this.wearModeSwitchSuccess;
    }

    @NotNull
    public final MutableLiveData<Boolean> getWearModeSwitchSuccessFromApp() {
        return this.wearModeSwitchSuccessFromApp;
    }

    public final void loadBattery(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null || !DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            return;
        }
        WearOsExtKt.getInstance(WearOSUtil.INSTANCE).readBatteryInfo(new Function1() { // from class: qt6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabV4ViewModel.loadBattery$lambda$15$lambda$14(this.f31823a, wearableDeviceModel, (Integer) obj);
            }
        });
    }

    public final void loadDevice(boolean isNeedSync) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.mDeviceManager.getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            if (!DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryDeviceModels().isEmpty()) {
                this.tabItems.clear();
                addAccessoryDeviceItem();
                refreshAccessoryWearMode();
                return;
            } else {
                this.tabItems.clear();
                this.tabItems.add(createNormalContentItem(11, 4));
                IOnetrack.Companion companion = IOnetrack.INSTANCE;
                OneTrackExtKt.getInstance(companion).reportData(new OneTrackStatBean("expose_v3", "56.51.0.1.36380"), "name", "Device_page_Adddevice", "status", 0, "position_name", "Device_Card_Add");
                OneTrackExtKt.getInstance(companion).reportData(new OneTrackStatBean("expose_v3", "56.51.0.1.36380"), "name", "Device_page_Adddevice", "status", 0, "position_name", "Device_Card_Scan");
                addBannerItemWhenNoDevice();
                return;
            }
        }
        this.mCurrentDeviceDid = wearableDeviceModel.getDid();
        showDevice();
        Logger.i(getTAG(), "loadDevice: " + wearableDeviceModel.getIsDeviceConnected());
        if (wearableDeviceModel.getIsDeviceConnected()) {
            onConnectSuccess(this.mCurrentDeviceDid, wearableDeviceModel, isNeedSync, false);
        } else {
            connectDevice$default(this, false, null, 2, null);
        }
        refreshAccessoryWearMode();
    }

    public final void onAppChosen(int currentChosen) {
        this.mChosenApp = currentChosen;
        int chooseApp = ChooseAppPreference.INSTANCE.getChooseApp();
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(getTAG(), "onAppChosen() called with: currentChosen = " + currentChosen + ", oldChosen = " + chooseApp);
        if (chooseApp == currentChosen) {
            return;
        }
        if (chooseApp != 1) {
            if (chooseApp == 2 && currentChosen == 3) {
                this.mGoUncommonUsedAppFlag.postValue(Boolean.TRUE);
                return;
            }
            return;
        }
        if (currentChosen == 2) {
            this.mUpdateAppSuccessFlag.postValue(Boolean.TRUE);
        } else {
            if (currentChosen != 3) {
                return;
            }
            this.mGoUncommonUsedAppFlag.postValue(Boolean.TRUE);
        }
    }

    @Override // defpackage.dvq
    public void onCleared() {
        FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).removeFaceEventListener(this.faceEventListener);
        super.onCleared();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        this.mOwner = owner;
        this.mDeviceManager.addDeviceStatusListener(this.mDeviceStatusListener);
        this.mDeviceManager.addDeviceChangeListener(this.mDeviceChangeListener);
        this.mDeviceManager.addAccessoryDeviceStateListener(this.mOnAccessoryDeviceStateListener);
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(2, this.deviceChargeStatusDataHandler);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.mDeviceManager.removeDeviceStatusListener(this.mDeviceStatusListener);
        this.mDeviceManager.removeDeviceChangeListener(this.mDeviceChangeListener);
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(2, this.deviceChargeStatusDataHandler);
        this.mDeviceManager.removeAccessoryDeviceStateListener(this.mOnAccessoryDeviceStateListener);
        this.mDeviceContact.removeSyncStateListener(this.mSyncStateListener);
        NotifyHelperExtKt.getNotificationManagerExport().removeNotifyRemindListener();
        DeviceSettingManager.INSTANCE.getInstance().removeUpdateListener(this.updateSettingInfoListener);
        FaceWearOsHelperExtKt.getInstance(FaceWearOsHelper.INSTANCE).dispose();
    }

    public final boolean popMedalListFromSpIsEmpty() {
        return getMPopMedalRepo().isMedalListEmpty();
    }

    public final void recordChosenApp() {
        int i = this.mChosenApp;
        if (i != 2 && i != 3) {
            com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("recordChosenApp chosen app is error (" + i + ")");
            return;
        }
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("recordChosenApp is " + i);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ChooseAppPreference chooseAppPreference = ChooseAppPreference.INSTANCE;
        chooseAppPreference.setChooseApp(this.mChosenApp);
        chooseAppPreference.setChooseAppLastTime(jCurrentTimeMillis);
        recordChosenAppCloud(this.mChosenApp, jCurrentTimeMillis);
        String str = this.mCurrentDeviceDid;
        if (str != null) {
            DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).disconnectDevice(str);
        }
        OhterExtKt.startWearableApp(ApplicationExtKt.getApplication(), this.mChosenApp, jCurrentTimeMillis);
        int i2 = this.mChosenApp;
        if (i2 == 3) {
            AnyExtKt.main$default(null, new C19902(null), 1, null);
        } else if (i2 == 2) {
            updateDialStatus(this.mCurrentDeviceDid, 8);
        }
    }

    public final void refreshFaceEntranceRedPoint() {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        FaceHelper faceHelperExtKt = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE);
        String str = this.mCurrentDeviceDid;
        if (str == null) {
            str = "";
        }
        boolean faceEntranceRedPoint = faceHelperExtKt.getFaceEntranceRedPoint(str);
        TabFaceEntranceItem tabFaceEntranceItem = this.mFaceEntranceItem;
        if (tabFaceEntranceItem != null) {
            tabFaceEntranceItem.setRedPoint(faceEntranceRedPoint);
        }
    }

    public final void removeDelete(@NotNull WearableDeviceModel deviceModel, @NotNull l callback) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mDeviceManager.unbindDevice(deviceModel.getDid(), callback);
    }

    public final void removeMedalAlreadyPoppedFromSp() {
        getMPopMedalRepo().removePoppedMedalFromSp();
    }

    public final void savePopMedalListToSp(@NotNull List<PopMedalData> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        getMPopMedalRepo().savePopMedalList(list);
    }

    public final void setBleReconnect(@NotNull MutableLiveData<ConnectStatus> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.bleReconnect = mutableLiveData;
    }

    public final void setExistAccessoryMode(@NotNull MutableLiveData<Pair<Integer, Boolean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.existAccessoryMode = mutableLiveData;
    }

    public final void setExitAccessory(@NotNull MutableLiveData<Pair<String, String>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.exitAccessory = mutableLiveData;
    }

    public final void setExitAccessoryModeFromDevice(@NotNull MutableLiveData<Pair<String, Integer>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.exitAccessoryModeFromDevice = mutableLiveData;
    }

    public final void setHasShownRecoverConnect(boolean z) {
        this.hasShownRecoverConnect = z;
    }

    public final void setMChoiceAppFlag(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mChoiceAppFlag = mutableLiveData;
    }

    public final void setMGoUncommonUsedAppFlag(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mGoUncommonUsedAppFlag = mutableLiveData;
    }

    public final void setMLoadingFlag(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mLoadingFlag = mutableLiveData;
    }

    public final void setMPopMedalRepo(@NotNull IPopMedalListRepo iPopMedalListRepo) {
        Intrinsics.checkNotNullParameter(iPopMedalListRepo, "<set-?>");
        this.mPopMedalRepo = iPopMedalListRepo;
    }

    public final void setMUpdateAppSuccessFlag(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mUpdateAppSuccessFlag = mutableLiveData;
    }

    public final void setManageAccessory(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.manageAccessory = mutableLiveData;
    }

    public final void setMedalToPopLiveData(@NotNull MutableLiveData<PopMedalData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.medalToPopLiveData = mutableLiveData;
    }

    public final void setOnItemClickListener(@NotNull final Function3<? super TabContentItem, ? super Integer, ? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getAdapter().setOnItemClickListener(listener);
        getAdapter().setOnChildClickListener(new Function3() { // from class: rt6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DeviceTabV4ViewModel.setOnItemClickListener$lambda$36(this.f32884a, listener, (TabContentItem) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
        getSettingAdapter().setOnItemClickListener(listener);
    }

    public final void setPopMedalDataAlreadyPulled() {
        getMPopMedalRepo().setShouldPullPopMedalData(false);
    }

    public final void setShouldPullPopMedalDataFromNetwork() {
        getMPopMedalRepo().setShouldPullPopMedalData(true);
    }

    public final void setShowConnectPermission(@NotNull MutableLiveData<Pair<Boolean, String>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showConnectPermission = mutableLiveData;
    }

    public final void setShowDisableConnect(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showDisableConnect = mutableLiveData;
    }

    public final void setShowOpenLocationSwitch(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showOpenLocationSwitch = mutableLiveData;
    }

    public final void setWearModeSwitchSuccess(@NotNull MutableLiveData<Pair<String, Integer>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.wearModeSwitchSuccess = mutableLiveData;
    }

    public final void setWearModeSwitchSuccessFromApp(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.wearModeSwitchSuccessFromApp = mutableLiveData;
    }

    public final boolean shouldPullPopMedalDataFromNetwork() {
        return getMPopMedalRepo().getShouldPullPopMedalData();
    }

    public final void showSystemRedPoint() {
        MutableLiveData<String> rightTextWithDot;
        Logger.i("showSystemRedPoint", "systemTabItem " + this.systemTabItem + "  isKeepAliveSetTrue = " + d2m.y(ApplicationExtKt.getApplication()));
        TabContentItem tabContentItem = this.systemTabItem;
        if (tabContentItem == null || (rightTextWithDot = tabContentItem.getRightTextWithDot()) == null) {
            return;
        }
        rightTextWithDot.postValue(!d2m.y(ApplicationExtKt.getApplication()) ? " " : "");
    }

    public final void switchAccessoryMode(final int mode, @NotNull String accessoryDid, boolean fromApp, @NotNull final Function1<? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(accessoryDid, "accessoryDid");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!fromApp) {
            block.invoke2(Boolean.TRUE);
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 15;
        vxo.j jVar = new vxo.j();
        jVar.c = mode;
        txo txoVar = new txo();
        vxo vxoVar = new vxo();
        vxoVar.e = jVar;
        txoVar.m0(vxoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), accessoryDid, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel.switchAccessoryMode.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(this.getTAG(), "setWearMode fail: " + code);
                block.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null || !result.isSuccess()) {
                    onError(did, type, 255);
                    return;
                }
                if (did != null) {
                    int i = mode;
                    DeviceTabV4ViewModel deviceTabV4ViewModel = this;
                    if (i == 1) {
                        deviceTabV4ViewModel.getWearModeSwitchSuccessFromApp().postValue(Boolean.TRUE);
                    }
                    DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).switchDeviceWearMode(did, 0, true);
                }
                block.invoke2(Boolean.TRUE);
            }
        }, 0, 16, (Object) null);
    }

    public final void switchRegin() {
        Logger.i(getTAG(), "switchRegin devices num = " + this.mDeviceManager.getDeviceSize());
        loadDevice(false);
    }

    public final void syncDeviceIfNeed() {
        Logger.i(getTAG(), "syncDeviceIfNeed = " + this.connectedOnBackgroundNeedSync);
        if (this.connectedOnBackgroundNeedSync) {
            syncDevice$default(this, (WearableDeviceModel) this.mDeviceManager.getCurrentDeviceModel(), false, 2, null);
            this.connectedOnBackgroundNeedSync = false;
        }
    }

    public final void unbind(@NotNull final String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.mLoadingFlag.postValue(Boolean.TRUE);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.mDeviceManager.getDeviceModel(did);
        final boolean z = false;
        if (wearableDeviceModel != null && DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            z = true;
        }
        this.mDeviceManager.unbindDevice(did, new l.a() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel.unbind.1
            @Override // com.xiaomi.fitness.device.manager.l
            public void onFail(int code) {
                DeviceTabV4ViewModel.this.getMLoadingFlag().postValue(Boolean.FALSE);
                if (code == 604) {
                    ToastUtil.INSTANCE.showToast(uzi.common_network_error_retry_later);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.l
            public void onSuccess() {
                DeviceTabV4ViewModel.this.getMLoadingFlag().postValue(Boolean.FALSE);
                Logger.i(DeviceTabV4ViewModel.this.getTAG(), "unbinddevice success devices num = " + DeviceTabV4ViewModel.this.mDeviceManager.getDeviceSize());
                AnyExtKt.main$default(null, new DeviceTabV4ViewModel$unbind$1$onSuccess$1(DeviceTabV4ViewModel.this, z, did, null), 1, null);
            }
        });
    }

    public final void updateAccessoryStatus(@Nullable final String did, int status) {
        WearableDeviceModel wearableDeviceModel;
        TabAccessoryDeviceContentItem tabAccessoryDeviceContentItem;
        if (did != null) {
            TabAccessoryDeviceContentItem tabAccessoryDeviceContentItem2 = this.mAccessoryDeviceContentItem;
            if (Intrinsics.areEqual(did, tabAccessoryDeviceContentItem2 != null ? tabAccessoryDeviceContentItem2.getDid() : null) && (tabAccessoryDeviceContentItem = this.mAccessoryDeviceContentItem) != null) {
                tabAccessoryDeviceContentItem.setStatus(status);
            }
            if (status == 3 && (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did)) != null && com.xiaomi.fit.device.extensions.DeviceModelExtKt.isAccessory(wearableDeviceModel)) {
                WearModeHelperExtKt.getInstance(WearModeHelper.INSTANCE).refreshWearMode(did, new Function1() { // from class: gt6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DeviceTabV4ViewModel.updateAccessoryStatus$lambda$47$lambda$46(this.f19312a, did, ((Integer) obj).intValue());
                    }
                });
            }
        }
    }

    public final void updateBatteryIfNeed() {
        Logger.i(getTAG(), "updateBatteryIfNeed isConnected=" + this.mDeviceManager.isConnected() + ",deviceStatus=" + this.mDeviceManager.getDeviceStatus());
        if (this.mDeviceManager.isConnected() && this.mDeviceManager.getDeviceStatus() == 7) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.mDeviceManager.getCurrentDeviceModel();
            updateDialStatus(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, 7);
        }
    }
}
