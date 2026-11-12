package com.xiaomi.hm.health.devicex.proxy.other;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsZeppApi;
import com.huami.lib.view.ItemView;
import com.huami.sky.service.SkyPlayFromEvent;
import com.huami.sky.ui.navigation.SkyNavigationImpl;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.model.HMWeightUnit;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMPaiData;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmAfData;
import com.xiaomi.hm.health.bt.profile.mili.model.MiLiHwConfig;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.PhoneEnvActivity;
import com.xiaomi.hm.health.device.callback.DeviceManualFaqCallback;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.service.HMCoreService;
import com.xiaomi.hm.health.device.setting.ui.dialog.ConnectFailureDialogFactory;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryModel;
import com.xiaomi.hm.health.receiver.UpdateAboutLanguageConfig;
import com.xiaomi.hm.health.sensorhub.SensorHubController;
import com.xiaomi.hm.health.speech.utils.CheckDeviceSupportAlexaKt;
import com.xiaomi.hm.health.speech.utils.EngineAccessCheckFucKt;
import com.xiaomi.hm.health.ui.information.HrRestingChartFragment;
import com.xiaomi.hm.health.ui.language.DeviceLanguageConfig;
import com.xiaomi.hm.health.ui.language.DeviceLanguageSettingActivity;
import com.xiaomi.hm.health.ui.language.HmLanguageUtil;
import com.xiaomi.hm.health.ui.playmiband2.webapi.DeviceManualFaqWebApi;
import com.xiaomi.hm.health.ui.smartplay.NotificationHelper;
import com.xiaomi.hm.health.ui.smartplay.meidacontrol.MediaUtil;
import com.xiaomi.hm.health.utils.RecordUtils;
import com.xiaomi.hm.health.utils.TimeFormatUtil;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.view.WarningManager;
import com.xiaomi.hm.health.webapi.PreLaunchApi;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¾\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001c\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\n\u0010%\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010(\u001a\u00020\"2\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\rH\u0016J\u0010\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u00100\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\"H\u0016J\u0010\u00102\u001a\u00020\"2\u0006\u00101\u001a\u00020\rH\u0016J\u0010\u00105\u001a\u00020\r2\u0006\u00104\u001a\u000203H\u0016J\u001a\u00108\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00107\u001a\u000206H\u0016J\u0012\u00108\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u00108\u001a\u00020\r2\u0006\u00104\u001a\u000203H\u0016J\u001a\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+H\u0016J\u001c\u0010=\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010\u00112\b\u0010<\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010@\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020>H\u0016J\u0018\u0010C\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\"2\u0006\u0010B\u001a\u00020\u0011H\u0016J\u0018\u0010F\u001a\u00020\r2\u0006\u0010D\u001a\u00020\r2\u0006\u0010E\u001a\u00020\rH\u0016J\u0010\u0010G\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010H\u001a\u00020\u001eH\u0016J\b\u0010I\u001a\u00020\u001eH\u0016J\b\u0010J\u001a\u00020\u001eH\u0016J\b\u0010K\u001a\u00020\u001eH\u0016J\u0010\u0010N\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010LH\u0016J\b\u0010O\u001a\u00020\u001eH\u0016J \u0010S\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+2\u0006\u0010P\u001a\u00020\r2\u0006\u0010R\u001a\u00020QH\u0016J\u0018\u0010W\u001a\u00020\u001e2\u0006\u0010T\u001a\u00020\r2\u0006\u0010V\u001a\u00020UH\u0016J\u0018\u0010Y\u001a\u00020\u001e2\u0006\u0010X\u001a\u00020\r2\u0006\u0010V\u001a\u00020UH\u0016J\b\u0010Z\u001a\u00020\rH\u0016J\"\u0010]\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010[\u001a\u00020\"2\u0006\u0010\\\u001a\u00020\"H\u0016J\b\u0010^\u001a\u00020\u001eH\u0016J\b\u0010_\u001a\u00020\u001eH\u0016J\u0018\u0010a\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+2\u0006\u0010`\u001a\u00020\u001eH\u0016J\u0010\u0010d\u001a\u00020c2\u0006\u0010b\u001a\u00020\rH\u0016J\u0010\u0010e\u001a\u00020\r2\u0006\u0010b\u001a\u00020cH\u0016J\u001a\u0010h\u001a\u00020\u001b2\u0010\u0010g\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010f\u0018\u00010\u0004H\u0016J\u0018\u0010l\u001a\u00020\u001b2\u000e\u0010k\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010iH\u0016J\u0010\u0010o\u001a\u00020m2\u0006\u0010n\u001a\u00020mH\u0016J\b\u0010p\u001a\u00020\"H\u0016J\u0012\u0010q\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010s\u001a\u00020\r2\u0006\u0010r\u001a\u00020\u001eH\u0016J\u0012\u0010u\u001a\u00020\u001e2\b\u0010t\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010v\u001a\u00020\r2\u0006\u0010r\u001a\u00020\u001eH\u0016J\u0010\u0010=\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010w\u001a\u00020\rH\u0016J\b\u0010x\u001a\u00020\rH\u0016J\b\u0010y\u001a\u00020\rH\u0016J\b\u0010z\u001a\u00020\rH\u0016J&\u0010~\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010|\u001a\u0004\u0018\u00010{2\b\u0010}\u001a\u0004\u0018\u00010\rH\u0016J&\u0010~\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010?\u001a\u0004\u0018\u00010>2\b\u0010}\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u007f\u001a\u00020\u001eH\u0016J\u0013\u0010\u0080\u0001\u001a\u0004\u0018\u00010\r2\u0006\u0010r\u001a\u00020\u001eH\u0016J\u001d\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0006\u0010r\u001a\u00020\u001e2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0084\u0001\u001a\u00020\r2\u0007\u0010b\u001a\u00030\u0082\u0001H\u0016J(\u0010\u0087\u0001\u001a\u00020\u000f2\u0014\u0010\u0086\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\r0\u0085\u0001\"\u00020\rH\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\t\u0010\u0089\u0001\u001a\u00020\u000fH\u0016J\t\u0010\u008a\u0001\u001a\u00020\u001eH\u0016J\u0011\u0010\u008b\u0001\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+H\u0016J\u001b\u0010\u008e\u0001\u001a\u00020\u000f2\b\u0010\u008d\u0001\u001a\u00030\u008c\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0011\u0010\u008f\u0001\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001b\u0010\u0092\u0001\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0016J\t\u0010\u0093\u0001\u001a\u00020\u001eH\u0016J\u0011\u0010\u0094\u0001\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J7\u0010\u0099\u0001\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010>2\u0007\u0010\u0095\u0001\u001a\u00020\"2\u0007\u0010\u0096\u0001\u001a\u00020\"2\u0007\u0010\u0097\u0001\u001a\u00020\"2\u0007\u0010\u0098\u0001\u001a\u00020\"H\u0016J\u0011\u0010\u009a\u0001\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>H\u0016J\u0011\u0010\u009b\u0001\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+H\u0016J\t\u0010\u009c\u0001\u001a\u00020\u000fH\u0016J\u0011\u0010\u009d\u0001\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0011\u0010\u009e\u0001\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+H\u0016J\t\u0010\u009f\u0001\u001a\u00020\u001eH\u0016J\u0013\u0010¢\u0001\u001a\u00020\u000f2\b\u0010¡\u0001\u001a\u00030 \u0001H\u0016J\u0011\u0010£\u0001\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H\u0016J\u0012\u0010¥\u0001\u001a\u00020\u001e2\u0007\u0010,\u001a\u00030¤\u0001H\u0016J\u0012\u0010¦\u0001\u001a\u00020\u001e2\u0007\u0010,\u001a\u00030¤\u0001H\u0016J\u001a\u0010¦\u0001\u001a\u00020\u001e2\u0007\u0010,\u001a\u00030¤\u00012\u0006\u0010'\u001a\u00020\"H\u0016J\u0015\u0010©\u0001\u001a\u0005\u0018\u00010¨\u00012\u0007\u0010§\u0001\u001a\u00020\"H\u0016J\u001b\u0010¬\u0001\u001a\u00020\u000f2\b\u0010«\u0001\u001a\u00030ª\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\t\u0010\u00ad\u0001\u001a\u00020\rH\u0016J\u0011\u0010®\u0001\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+H\u0016J\u0011\u0010¯\u0001\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H\u0016J\u0014\u0010±\u0001\u001a\u0004\u0018\u00010\u00112\u0007\u0010°\u0001\u001a\u00020\rH\u0016J\u0012\u0010³\u0001\u001a\u00020\u001b2\u0007\u0010²\u0001\u001a\u00020\"H\u0016J\u0013\u0010¶\u0001\u001a\u00030µ\u00012\u0007\u0010´\u0001\u001a\u00020\"H\u0016J\t\u0010·\u0001\u001a\u00020\"H\u0016J\u001f\u0010º\u0001\u001a\u00020\u000f2\t\u0010\f\u001a\u0005\u0018\u00010¸\u00012\t\u0010¹\u0001\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010¼\u0001\u001a\u00020\"2\u0007\u0010»\u0001\u001a\u00020\"H\u0016J\t\u0010½\u0001\u001a\u00020\u001eH\u0016J\u0017\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00012\t\u0010¾\u0001\u001a\u0004\u0018\u000103H\u0016J\u0011\u0010Á\u0001\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u0011H\u0016J\u001e\u0010Â\u0001\u001a\u0004\u0018\u00010\"2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0016¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0011\u0010Ä\u0001\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H\u0016J\n\u0010Å\u0001\u001a\u00030\u008c\u0001H\u0016J\u0013\u0010Æ\u0001\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016J\n\u0010Ç\u0001\u001a\u00030µ\u0001H\u0016J\u0013\u0010É\u0001\u001a\u00020\u001e2\b\u0010È\u0001\u001a\u00030µ\u0001H\u0016J\u001b\u0010Ê\u0001\u001a\u00020\u000f2\b\u0010È\u0001\u001a\u00030µ\u00012\u0006\u0010r\u001a\u00020\u001eH\u0016J\u0019\u0010Í\u0001\u001a\u00020\u000f2\u000e\u0010Ì\u0001\u001a\t\u0012\u0005\u0012\u00030Ë\u00010\u0004H\u0016¨\u0006Ð\u0001"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/other/DeviceUtilsImpl;", "Lcom/huami/devicex/injection/basic/DeviceUtilsZeppApi;", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "setting", "", "Lcom/xiaomi/hm/health/bt/profile/page/PageItem;", "transFromHMDisplaySetting", "Lcom/xiaomi/hm/health/model/account/HMUserInfo;", "userInfo", "Lcom/xiaomi/hm/health/bt/model/UserInfoExt;", "toUserInfoExt", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "msd", "", "showPermissionDenieDialog", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "deviceId", "getEarbudLogName", "getDeviceLogName", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "Lcom/xiaomi/hm/health/device/callback/DeviceManualFaqCallback;", "callback", "isDeviceManualFaqShow", "Ljava/util/Calendar;", "calendar1", "calendar2", "", "compareDateCalendar", "Lcom/google/gson/Gson;", "getGson", "", "minute", "formatMinute", "getEarbudDeviceDescription", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "getHelpType", PointCategory.PERMISSION, "checkPermission", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "closeSoftInput", "str", "maxLength", "substring", "text", "calculateLength", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "getHuamiDeviceDescription", "Lcom/xiaomi/hm/health/device/model/HMBrandType;", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_BRAND_TYPE, "getDeviceDescription", "Lcom/xiaomi/hm/health/bt/profile/mili/model/MiLiHwConfig;", "getInitMiliDeviceConfig", "miliSource", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_HARDWARE_VERSION, "getMiLiDeviceDescription", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "isFastDoubleClick", PhoneBindActivity.EXTRA_BIND_TYPE, "deviceSource", "testPhoneEnv", "key", "mode", "getAppSetting", "getImageForDevice", "shouldHideDiscovery", "isLocationServerOpen", "isUseClassicWatch", "isNotificationOn", "", "Lcom/xiaomi/hm/health/model/account/secondaryscreen/SecondaryModel;", "getDisplayDataNewList", "isSupportWuhanLanguage", "name", "Ljava/io/File;", "outF", "generateFileFromAssets", "path", "Landroid/graphics/Bitmap;", "bmp", "saveBitmapToFile", "imagePath", "saveBitmapToPngFile", "getStoragePath", "resId", "duration", "toast", "supprotContactDefault", "isSupportContactNameForSystemLanguage", "result", "showSetDeviceSettingResult", "config", "Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", "fromSedentaryConfig", "toSedentaryString", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmAfData;", "dataList", "getAfResultSyncTime", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pai/HMPaiData;", "dataArrayList", "getPaiSyncTime", "", "timestamp", "getDateTimestamp", "getSystemLang", "fromMsgPreviewStr", "enable", "toMsgPreviewStr", "jstr", "fromPropertyBoolStr", "toPropertyBoolStr", "getShoesDeviceDescription", "getBoundWatchDeviceDescription", "getWeightDeviceDescription", "getOtherDeviceDescription", "Lcom/huami/lib/view/ItemView;", "itemView", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "enableGetMacAddress", "fromAvoidSpiteBindingStr", "toAvoidSpiteBindingStr", "timeStr", "Lcom/xiaomi/hm/health/bt/model/HMLiftWristConfig;", "fromLiftWristConfig", "toLiftWristConfig", "", "tokenParams", "updateSpeechEngineThirdToken", "([Ljava/lang/String;)V", "updateSpeechEngineAuthorize", "xiaoAiReginAccess", "isDeviceSupportAlexa", "Lcom/xiaomi/hm/health/bt/model/HMLanguage;", UserLegalInfoManager.KEY_LANGUAGE, "saveDeviceLanguageProperty", "getCurrentDeviceLanguage", "Ljava/util/Locale;", "locale", "getLanguageStringResId", "supportSixPwd", "getDthBeatsChaohuTempoPlayUrl", "top", "bottom", "left", "right", "setViewTouchDelegate", "removeViewTouchDelegate", "isSupportSensorHub", "saveBaseStep", "shouldShowPlay", "isHK", "shouldInitMusic", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;", "command", "handleDeviceCommand", "initMedia", "Landroid/app/Activity;", "checkConnectedMiLiDevice", "checkConnectedWatchDevice", "unit", "Lcom/xiaomi/hm/health/bt/model/HMWeightUnit;", "convertToBtUnit", "Landroid/widget/ImageView;", "imageView", "updateDeviceImg", "getShoesDistanceDescription", "enableBluetooth", "startAppSettings", "localName", "nameToDeviceSource", "currentItem", "getSelectedMonthCalendar", "position", "Landroidx/fragment/app/Fragment;", "createHrRestingChartFragment", "getRestingHRMonthCount", "Landroidx/fragment/app/FragmentActivity;", "deviceType", "getStatisticInfo", FirebaseAnalytics.Param.LEVEL, "getNormandyBatteryDescriptionResId", "isPressureHrInDependent", "mifitDevice", "Lcom/huami/watch/companion/device/Device;", "toWatchDevice", "updateAboutLanguageConfig", "getHMLanguage", "(Ljava/util/Locale;)Ljava/lang/Integer;", "navigation2Sky", "fromSystemLanguage", "getVoiceRes", "showNfcEntranceFragment", "fragment", "hasItems", "updateEnabledForConnectStatus", "Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;", "items", "updateEventFromDevice", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceUtilsImpl implements DeviceUtilsZeppApi {
    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public int calculateLength(@NotNull String text) {
        return Utils.calculateLength(text);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean checkConnectedMiLiDevice(@NotNull Activity context) {
        return HMDeviceUtils.checkConnectedMiLiDevice(context);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean checkConnectedWatchDevice(@NotNull Activity context) {
        return HMDeviceUtils.checkConnectedWatchDevice(context);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean checkPermission(@NotNull String permission) {
        return Utils.checkPermission(DeviceXFunctionsKt.getContext(), permission);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void closeSoftInput(@NotNull Context context) {
        Utils.closeSoftInput(context);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean compareDateCalendar(@Nullable Calendar calendar1, @Nullable Calendar calendar2) {
        return Utils.compareDateCalendar(calendar1, calendar2);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @Nullable
    public HMWeightUnit convertToBtUnit(int unit) {
        HMWeightUnit hMWeightUnit = HMWeightUnit.KG;
        if (unit != 1) {
            return unit != 16 ? hMWeightUnit : HMWeightUnit.JIN;
        }
        return HMWeightUnit.POUND;
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public Fragment createHrRestingChartFragment(int position) {
        return HrRestingChartFragment.newInstance(position);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean enableBluetooth(@NotNull Context context) {
        return Utils.enableBluetooth(context);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void enableGetMacAddress(@Nullable Context context, @Nullable ItemView itemView, @Nullable String address) {
        Utils.enableGetMacAddress(context, itemView, address);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String formatMinute(int minute) {
        return TimeFormatUtil.INSTANCE.formatMinute(DeviceXFunctionsKt.getContext(), minute);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean fromAvoidSpiteBindingStr() {
        return HMDeviceUtils.fromAvoidSpiteBindingStr();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public HMLiftWristConfig fromLiftWristConfig(boolean enable, @Nullable String timeStr) {
        return HMDeviceUtils.fromLiftWristConfig(enable, timeStr);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean fromMsgPreviewStr(@Nullable String str) {
        return HMDeviceUtils.fromMsgPreviewStr(str);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean fromPropertyBoolStr(@Nullable String jstr) {
        return HMDeviceUtils.fromPropertyBoolStr(jstr);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public HMSedentaryConfig fromSedentaryConfig(@NotNull String config) {
        return HMDeviceUtils.fromSedentaryConfig(config);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public HMLanguage fromSystemLanguage() {
        return HMDeviceUtils.fromSystemLanguage();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean generateFileFromAssets(@NotNull Context context, @NotNull String name, @NotNull File outF) {
        return Utils.generateFileFromAssets(context, name, outF);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public Calendar getAfResultSyncTime(@Nullable List<? extends HmAfData> dataList) {
        return HMDeviceUtils.getAfResultSyncTime(dataList);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getAppSetting(@NotNull String key, @NotNull String mode) {
        return PreLaunchApi.INSTANCE.getAppSetting(key, mode);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getBoundWatchDeviceDescription() {
        String boundWatchDeviceDescription = HMDeviceUtils.getBoundWatchDeviceDescription();
        return boundWatchDeviceDescription == null ? "" : boundWatchDeviceDescription;
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public int getCurrentDeviceLanguage(@NotNull HMDeviceSource source) {
        return DeviceLanguageConfig.INSTANCE.getCurrentDeviceLanguage(source);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public long getDateTimestamp(long timestamp) {
        return HMDeviceUtils.getDateTimestamp(timestamp);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @Nullable
    public String getDeviceDescription(@NotNull HMDeviceSource source, @NotNull HMBrandType brandType) {
        return HMDeviceUtils.getDeviceDescription(source, brandType);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getDeviceLogName(@NotNull HMDeviceSource source) {
        return HMDeviceUtils.getDeviceLogName(source);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @Nullable
    public List<SecondaryModel> getDisplayDataNewList() {
        return HMDeviceUtils.getDisplayDataNewList();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getDthBeatsChaohuTempoPlayUrl(@NotNull HMDeviceSource source) {
        return WarningManager.getDthBeatsChaohuTempoPlayUrl(source);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @Nullable
    public String getEarbudDeviceDescription() {
        return HMDeviceUtils.getEarbudDeviceDescription();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getEarbudLogName(@NotNull HMDeviceSource source, @NotNull String deviceId) {
        return HMDeviceUtils.getEarbudLogName(source, deviceId);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public Gson getGson() {
        return Utils.getGson();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @Nullable
    public Integer getHMLanguage(@NotNull Locale locale) {
        return HmLanguageUtil.INSTANCE.parseLocaleToHmLanguageCode(locale);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public int getHelpType(@NotNull HMDeviceType type) {
        return ConnectFailureDialogFactory.INSTANCE.getHelpType(type);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getHuamiDeviceDescription(@NotNull Device device) {
        return HMDeviceUtils.getHuamiDeviceDescription(device);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public int getImageForDevice(@NotNull HMDeviceSource source) {
        return HMDeviceUtils.getImageForDevice(source);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @Nullable
    public MiLiHwConfig getInitMiliDeviceConfig(@NotNull DeviceInfo deviceInfo, @NotNull Context context) {
        return HMDeviceUtils.getInitMiliDeviceConfig(deviceInfo, context);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public int getLanguageStringResId(@NotNull Context context, @NotNull Locale locale) {
        return DeviceLanguageSettingActivity.INSTANCE.getLanguageStringResId(context, locale);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getMiLiDeviceDescription(@Nullable HMDeviceSource miliSource, @Nullable String hardwareVersion) {
        String miLiDeviceDescription = HMDeviceUtils.getMiLiDeviceDescription(miliSource, hardwareVersion);
        return miLiDeviceDescription == null ? "" : miLiDeviceDescription;
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public int getNormandyBatteryDescriptionResId(int level) {
        return HMDeviceUtils.getNormandyBatteryDescriptionResId(level);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getOtherDeviceDescription() {
        String otherDeviceDescription = HMDeviceUtils.getOtherDeviceDescription();
        return otherDeviceDescription == null ? "" : otherDeviceDescription;
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public Calendar getPaiSyncTime(@Nullable ArrayList<HMPaiData> dataArrayList) {
        return HMDeviceUtils.getPaiSyncTime(dataArrayList);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getParamSource() {
        return DeviceUtilsZeppApi.DefaultImpls.getParamSource(this);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public int getRestingHRMonthCount() {
        return HrRestingChartFragment.getMonthCount();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public Calendar getSelectedMonthCalendar(int currentItem) {
        return HrRestingChartFragment.getSelectedMonthCalendar(currentItem);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getShoesDeviceDescription() {
        String shoesDeviceDescription = HMDeviceUtils.getShoesDeviceDescription();
        return shoesDeviceDescription == null ? "" : shoesDeviceDescription;
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getShoesDistanceDescription() {
        String shoesDistanceDescription = Utils.getShoesDistanceDescription();
        return shoesDistanceDescription == null ? "" : shoesDistanceDescription;
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void getStatisticInfo(@Nullable FragmentActivity activity, @Nullable HMDeviceType deviceType) {
        Utils.getStatisticInfo(activity, deviceType);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getStoragePath() {
        return Utils.getStoragePath(DeviceXFunctionsKt.getContext());
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public int getSystemLang() {
        return Utils.getSystemLang();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getVoiceRes(@Nullable HMDeviceType type) {
        return HMDeviceUtils.getVoiceRes(type);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getWeightDeviceDescription() {
        String weightDeviceDescription = HMDeviceUtils.getWeightDeviceDescription();
        return weightDeviceDescription == null ? "" : weightDeviceDescription;
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void handleDeviceCommand(@NotNull HMMusicControl.DeviceCommand command) {
        MediaUtil.handleDeviceCommand(command);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean hasItems(@NotNull Fragment fragment) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented @吴生湖"));
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void initMedia(@NotNull Context context) {
        MediaUtil.initMedia(context);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void isDeviceManualFaqShow(@NotNull DeviceInfo deviceInfo, @NotNull DeviceManualFaqCallback callback) {
        DeviceManualFaqWebApi.isDeviceManualFaqShow(deviceInfo, callback);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean isDeviceSupportAlexa(@NotNull Context context) {
        return CheckDeviceSupportAlexaKt.isDeviceSupportAlexa(context);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean isFastDoubleClick(@NotNull View view) {
        return Utils.isFastDoubleClick(view);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean isHK(@NotNull Context context) {
        return Utils.isHK(context);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean isLocationServerOpen() {
        return Utils.isLocationServerOpen(DeviceXFunctionsKt.getContext());
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean isNotificationOn() {
        return NotificationHelper.INSTANCE.isNotificationOn();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean isPressureHrInDependent() {
        return HMDeviceUtils.isPressureHrInDependent();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean isSupportContactNameForSystemLanguage() {
        return HMDeviceUtils.isSupportContactNameForSystemLanguage();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean isSupportSensorHub(@NotNull Context context) {
        return SensorHubController.isSupportSensorHub(context);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean isSupportWuhanLanguage() {
        return HMDeviceUtils.isSupportWuhanLanguage();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean isUseClassicWatch() {
        return HMCoreService.isUseClassicWatch();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @Nullable
    public HMDeviceSource nameToDeviceSource(@NotNull String localName) {
        return HMDeviceUtils.nameToDeviceSource(localName);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void navigation2Sky(@NotNull Context context) {
        new SkyNavigationImpl().launchSkyMainPage(context, SkyPlayFromEvent.FROM_OTHER);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void removeViewTouchDelegate(@NotNull View view) {
        Utils.removeViewTouchDelegate(view);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void saveBaseStep() {
        HMDeviceUtils.saveBaseStep();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean saveBitmapToFile(@NotNull String path, @NotNull Bitmap bmp) {
        return Utils.saveBitmapToFile(path, bmp, 100);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean saveBitmapToPngFile(@NotNull String imagePath, @NotNull Bitmap bmp) {
        return Utils.saveBitmapToPngFile(imagePath, bmp);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void saveDeviceLanguageProperty(@NotNull HMLanguage language, @NotNull HMDeviceSource source) {
        DeviceLanguageConfig.INSTANCE.saveDeviceLanguageProperty(language, source);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void setViewTouchDelegate(@Nullable View view, int top, int bottom, int left, int right) {
        Utils.setViewTouchDelegate(view, top, bottom, left, right);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean shouldHideDiscovery() {
        return Utils.shouldHideDiscovery();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean shouldInitMusic() {
        return MediaUtil.shouldInitMusic();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean shouldShowPlay(@NotNull HMDeviceSource source) {
        return HMDeviceUtils.shouldShowPlay(source);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public Fragment showNfcEntranceFragment() {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented @吴生湖"));
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void showPermissionDenieDialog(@NotNull AppCompatActivity activity, @NotNull String msd) {
        Utils.showPermissionDenieDialog(activity, msd);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void showSetDeviceSettingResult(@NotNull Context context, boolean result) {
        Utils.showSetDeviceSettingResult(context, result);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void startAppSettings(@NotNull Context context) {
        Utils.startAppSettings(context);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String substring(@NotNull String str, int maxLength) {
        return Utils.substring(str, maxLength);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean supportSixPwd() {
        return HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(11);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean supprotContactDefault() {
        return HMDeviceUtils.supprotContactDefault().booleanValue();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void testPhoneEnv(int bindType, @NotNull HMDeviceSource deviceSource) {
        PhoneEnvActivity.testPhoneEnv(DeviceXFunctionsKt.getContext(), true, bindType, deviceSource);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @Nullable
    public String toAvoidSpiteBindingStr(boolean enable) {
        return HMDeviceUtils.toAvoidSpiteBindingStr(enable);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String toLiftWristConfig(@NotNull HMLiftWristConfig config) {
        return HMDeviceUtils.toLiftWristConfig(config);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String toMsgPreviewStr(boolean enable) {
        return HMDeviceUtils.toMsgPreviewStr(enable);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String toPropertyBoolStr(boolean enable) {
        return HMDeviceUtils.toPropertyBoolStr(enable);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String toSedentaryString(@NotNull HMSedentaryConfig config) {
        return HMDeviceUtils.toSedentaryString(config);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public UserInfoExt toUserInfoExt(@NotNull HMUserInfo userInfo) {
        return HMDeviceUtils.toUserInfoExt(userInfo);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsZeppApi
    @Nullable
    public com.huami.watch.companion.device.Device toWatchDevice(@Nullable Device mifitDevice) {
        return HMDeviceUtils.toWatchDevice(mifitDevice);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void toast(@Nullable Context context, int resId, int duration) {
        Utils.toast(context, resId, duration);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @Nullable
    public List<PageItem> transFromHMDisplaySetting(@NotNull SortableAppItems setting) {
        return HMDeviceUtils.transFromHMDisplaySetting(setting);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void updateAboutLanguageConfig(@NotNull HMDeviceSource deviceSource) {
        UpdateAboutLanguageConfig.INSTANCE.updateAboutLanguageConfig(deviceSource);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void updateDeviceImg(@NotNull ImageView imageView, @NotNull HMDeviceSource source) {
        HMDeviceUtils.updateDeviceImg(imageView, source);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void updateEnabledForConnectStatus(@NotNull Fragment fragment, boolean enable) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented @吴生湖"));
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void updateEventFromDevice(@NotNull List<? extends HMReminderInfo> items) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented @吴生湖"));
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void updateSpeechEngineAuthorize() {
        RecordUtils.getInstance(DeviceXFunctionsKt.getContext()).updateSpeechEngineAuthorize(new String[0]);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void updateSpeechEngineThirdToken(@NotNull String... tokenParams) {
        RecordUtils.updateSpeechEngineThirdToken((String[]) Arrays.copyOf(tokenParams, tokenParams.length));
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean xiaoAiReginAccess() {
        return EngineAccessCheckFucKt.miAiRegionAccess();
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public boolean checkConnectedWatchDevice(@NotNull Activity context, int type) {
        return HMDeviceUtils.checkConnectedWatchDevice(context, type);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    public void enableGetMacAddress(@Nullable Context context, @Nullable View view, @Nullable String address) {
        Utils.enableGetMacAddress(context, view, address);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @Nullable
    public String getDeviceDescription(@NotNull HMDeviceSource source) {
        return HMDeviceUtils.getDeviceDescription(source);
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getMiLiDeviceDescription(@NotNull HMDeviceSource source) {
        String miLiDeviceDescription = HMDeviceUtils.getMiLiDeviceDescription(source);
        return miLiDeviceDescription == null ? "" : miLiDeviceDescription;
    }

    @Override // com.huami.devicex.injection.basic.DeviceUtilsApi
    @NotNull
    public String getDeviceDescription(@NotNull Device device) {
        return HMDeviceUtils.getDeviceDescription(device);
    }
}
