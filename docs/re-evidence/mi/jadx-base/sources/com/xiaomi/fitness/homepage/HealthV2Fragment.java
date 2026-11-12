package com.xiaomi.fitness.homepage;

import android.app.ActivityOptions;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.example.statistics.export.ScrollViewEffectiveExposeBiz;
import com.fitness.banner.export.v2.BannerItemV2;
import com.fitness.banner.export.view.AnnouncementBannerView;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer;
import com.xiaomi.fit.fitness.sync.export.di.FitnessSyncExtKt;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.OnUserInfoChange;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ItemDecorationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.GridItemDecoration;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.DailyFemaleHealthReport;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.homepage.HealthV2Fragment;
import com.xiaomi.fitness.homepage.banner.OperationalBannerAdapter;
import com.xiaomi.fitness.homepage.view.DataHeaderV2View;
import com.xiaomi.fitness.homepage.view.refresh.LoadAction;
import com.xiaomi.fitness.login.NeedLoginAspect;
import com.xiaomi.fitness.login.annotation.NeedLogin;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.main.export.BaseMainFragment;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.medal.export.IPopMedalListRepo;
import com.xiaomi.fitness.medal.export.PopMedalExtKt;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.res.preload.export.PreloadManagerExtKt;
import com.xiaomi.fitness.res.preload.export.ResPreloadManager;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.v2.HealthAdapterV2;
import com.xiaomi.fitness.v2.HealthDataTypeUtilsV2;
import com.xiaomi.fitness.widget.view.HomeHeaderTabTitleView;
import defpackage.b3c;
import defpackage.c0j;
import defpackage.fai;
import defpackage.gak;
import defpackage.i5a;
import defpackage.iji;
import defpackage.ili;
import defpackage.jui;
import defpackage.km5;
import defpackage.lp5;
import defpackage.ni4;
import defpackage.nrd;
import defpackage.s69;
import defpackage.stb;
import defpackage.xj4;
import defpackage.ze2;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import miuix.springback.view.SpringBackLayout;
import okhttp3.internal.http.StatusLine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0004\u0093\u0001\u0096\u0001\b\u0007\u0018\u0000 ¦\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0002¦\u0001B\n\b\u0007¢\u0006\u0005\b¥\u0001\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ!\u0010\u0019\u001a\u00020\u00062\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\bJ%\u0010&\u001a\u00020\u00062\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\bJ\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\u0016H\u0002¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020\u00172\u0006\u0010+\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b-\u0010.J!\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00172\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\bJ\u000f\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010\bJ\u0017\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0017H\u0003¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b9\u0010\u001aJ'\u0010=\u001a\u0002002\u0006\u0010;\u001a\u00020:2\u0006\u00106\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u0017H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010\bJ\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020\u0017H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u0017H\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0006H\u0014¢\u0006\u0004\bF\u0010\bJ\u000f\u0010G\u001a\u00020\u0006H\u0014¢\u0006\u0004\bG\u0010\bJ!\u0010K\u001a\u00020\u00062\u0006\u0010I\u001a\u00020H2\b\u0010J\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0006H\u0016¢\u0006\u0004\bM\u0010\bJ\u000f\u0010N\u001a\u00020\u0006H\u0016¢\u0006\u0004\bN\u0010\bJ\u000f\u0010O\u001a\u00020\u0006H\u0016¢\u0006\u0004\bO\u0010\bJ)\u0010T\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020P2\u0006\u0010@\u001a\u00020\u00172\b\u0010S\u001a\u0004\u0018\u00010RH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020\u00062\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\u0011\u0010Z\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bZ\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u0002000h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR \u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002000k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010n\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001e\u0010w\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010y\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010^R\u001b\u0010\u007f\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0083\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010\u0085\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0005\b\u0087\u0001\u0010\fR(\u0010\u0088\u0001\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0005\b\u008c\u0001\u00108R\u0019\u0010\u008d\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0084\u0001R \u0010\u0092\u0001\u001a\u00030\u008e\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008f\u0001\u0010|\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R'\u0010\u009b\u0001\u001a\u0012\u0012\u0007\u0012\u0005\u0018\u00010\u009a\u0001\u0012\u0004\u0012\u00020\u00060\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010 \u0001\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0005\b¤\u0001\u0010 ¨\u0006§\u0001"}, d2 = {"Lcom/xiaomi/fitness/homepage/HealthV2Fragment;", "Lcom/xiaomi/fitness/main/export/BaseMainFragment;", "Lcom/xiaomi/fitness/homepage/HealthViewModel;", "Li5a;", "Lcom/xiaomi/fitness/v2/HealthAdapterV2$OnGoPageClickListener;", "Lcom/xiaomi/fitness/health/curse/CurseManager$OnConfigChange;", "", "refreshPage", "()V", "", "manualRefresh", "triggerDataSync", "(Z)V", "registerDataChangedBroadcast", "unregisterDataChangedBroadcast", "forbiddenRecyclerItemAnimation", "requestBannersV4", "requestOperationalBanners", "initRefreshLayout", "requestHealthTabBanner", "initUserGenderChange", "initTitleView", "", "", "displayList", "initDataItemCard", "(Ljava/util/List;)V", "checkLoginInfoAndNotifyChange", "bindFemaleHealthReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "report", "bindGoalReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;)V", "getAndDrawHomeData", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "", "dataMap", "startDrawWithFitnessData", "(Ljava/util/Map;)V", "upDateTodayHealth", "getSupportTodayHealthList", "()Ljava/util/List;", "homeType", "obj", "bindReportInner", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;Ljava/lang/Object;)I", DailyRecordKey.sportType, "Lkm5;", "dataModelInsert", "notifyInsert", "(ILkm5;)V", "setLayoutManager", "initResource", "type", "goCheckLoginUserInfo", "(I)V", "initDataSortMap", "", "time", "sortId", "refreshDataModelSortId", "(JII)Lkm5;", "changedDataModelSortId", "position", "Landroid/os/Bundle;", "createBundle", "(I)Landroid/os/Bundle;", "needCheckUserInfo", "(I)Z", "onVisible", "onInvisible", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "onDataChange", "onDestroyView", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "Landroid/app/ActivityOptions;", "activityOptions", "onGoPage", "(Landroidx/recyclerview/widget/RecyclerView$d0;ILandroid/app/ActivityOptions;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "getContentView", "()Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/homepage/view/DataHeaderV2View;", "dataHeaderView", "Lcom/xiaomi/fitness/homepage/view/DataHeaderV2View;", "Lcom/xiaomi/fitness/widget/view/HomeHeaderTabTitleView;", "header", "Lcom/xiaomi/fitness/widget/view/HomeHeaderTabTitleView;", "Lcom/xiaomi/fitness/v2/HealthAdapterV2;", "mAdapter", "Lcom/xiaomi/fitness/v2/HealthAdapterV2;", "", "mDataList", "Ljava/util/List;", "", "mDataModelMap", "Ljava/util/Map;", "oneTrackStartTime", "J", "Lmiuix/springback/view/SpringBackLayout;", "swipeContainer", "Lmiuix/springback/view/SpringBackLayout;", "Lcom/fitness/banner/export/view/AnnouncementBannerView;", "announcementBannerView", "Lcom/fitness/banner/export/view/AnnouncementBannerView;", "Landroidx/lifecycle/LiveData;", "mGoalReportLivaData", "Landroidx/lifecycle/LiveData;", "heathBannerRecyclerView", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "fitnessSyncer$delegate", "Lkotlin/Lazy;", "getFitnessSyncer", "()Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "fitnessSyncer", "Lcom/xiaomi/fitness/account/extensions/OnUserInfoChange;", "mUserInfoChangeListener", "Lcom/xiaomi/fitness/account/extensions/OnUserInfoChange;", "shouldRefreshBanners", "Z", "isFemale", "()Z", "setFemale", "accountStatus", "I", "getAccountStatus", "()I", "setAccountStatus", "mDataChangedReceiverRegistered", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "healthCheckViewModel$delegate", "getHealthCheckViewModel", "()Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "healthCheckViewModel", "com/xiaomi/fitness/homepage/HealthV2Fragment$mDataChangedReceiver$1", "mDataChangedReceiver", "Lcom/xiaomi/fitness/homepage/HealthV2Fragment$mDataChangedReceiver$1;", "com/xiaomi/fitness/homepage/HealthV2Fragment$settingInfoListener$1", "settingInfoListener", "Lcom/xiaomi/fitness/homepage/HealthV2Fragment$settingInfoListener$1;", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceChangedListener", "Lkotlin/jvm/functions/Function1;", "Lstb;", "mTrigger", "Lstb;", "mDailyGoalReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "getMDailyGoalReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "setMDailyGoalReport", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHealthV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthV2Fragment.kt\ncom/xiaomi/fitness/homepage/HealthV2Fragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,741:1\n106#2,15:742\n216#3,2:757\n1485#4:759\n1510#4,3:760\n1513#4,3:770\n381#5,7:763\n*S KotlinDebug\n*F\n+ 1 HealthV2Fragment.kt\ncom/xiaomi/fitness/homepage/HealthV2Fragment\n*L\n123#1:742,15\n635#1:757,2\n366#1:759\n366#1:760,3\n366#1:770,3\n366#1:763,7\n*E\n"})
public final class HealthV2Fragment extends Hilt_HealthV2Fragment<HealthViewModel, i5a> implements HealthAdapterV2.OnGoPageClickListener, CurseManager.OnConfigChange {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String TAG = "HealthFragmentV2";
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ nrd.a ajc$tjp_0;
    private int accountStatus;

    @Nullable
    private AnnouncementBannerView announcementBannerView;

    @Nullable
    private DataHeaderV2View dataHeaderView;

    @NotNull
    private final Function1<WearableDeviceModel, Unit> deviceChangedListener;

    /* JADX INFO: renamed from: fitnessSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fitnessSyncer;

    @Nullable
    private HomeHeaderTabTitleView header;

    /* JADX INFO: renamed from: healthCheckViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy healthCheckViewModel;

    @Nullable
    private RecyclerView heathBannerRecyclerView;
    private boolean isFemale;

    @Nullable
    private HealthAdapterV2 mAdapter;

    @Nullable
    private DailyGoalReport mDailyGoalReport;

    @NotNull
    private final HealthV2Fragment$mDataChangedReceiver$1 mDataChangedReceiver;
    private boolean mDataChangedReceiverRegistered;

    @NotNull
    private final List<km5> mDataList;

    @NotNull
    private final Map<Integer, km5> mDataModelMap;

    @Nullable
    private LiveData<DailyGoalReport> mGoalReportLivaData;

    @Nullable
    private stb mTrigger;

    @Nullable
    private OnUserInfoChange mUserInfoChangeListener;
    private long oneTrackStartTime;

    @Nullable
    private RecyclerView recycler;

    @NotNull
    private final HealthV2Fragment$settingInfoListener$1 settingInfoListener;
    private boolean shouldRefreshBanners;

    @Nullable
    private SpringBackLayout swipeContainer;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/homepage/HealthV2Fragment$Companion;", "", "<init>", "()V", "TAG", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.homepage.HealthV2Fragment$initDataItemCard$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.homepage.HealthV2Fragment$initDataItemCard$1", f = "HealthV2Fragment.kt", i = {}, l = {StatusLine.HTTP_MISDIRECTED_REQUEST}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Integer> $displayList;
        int label;
        final /* synthetic */ HealthV2Fragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<Integer> list, HealthV2Fragment healthV2Fragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$displayList = list;
            this.this$0 = healthV2Fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$displayList, this.this$0, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<Integer> list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<Integer> list2 = this.$displayList;
                Logger.d(HealthV2Fragment.TAG, "initDataItemCard invoke size(" + (list2 != null ? Boxing.boxInt(list2.size()) : null) + ")");
                list = this.$displayList;
                if (list == null) {
                    HealthDataTypeUtilsV2 healthDataTypeUtilsV2 = HealthDataTypeUtilsV2.INSTANCE;
                    this.label = 1;
                    obj = healthDataTypeUtilsV2.getHomeDisplayTypeList(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.this$0.initDataSortMap(list);
                this.this$0.changedDataModelSortId();
                if (CurseManager.INSTANCE.getInstance().getSetting() != null) {
                    this.this$0.bindFemaleHealthReport();
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            list = (List) obj;
            this.this$0.initDataSortMap(list);
            this.this$0.changedDataModelSortId();
            if (CurseManager.INSTANCE.getInstance().getSetting() != null) {
                this.this$0.bindFemaleHealthReport();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.homepage.HealthV2Fragment$triggerDataSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.homepage.HealthV2Fragment$triggerDataSync$1", f = "HealthV2Fragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $manualRefresh;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25761(boolean z, Continuation<? super C25761> continuation) {
            super(2, continuation);
            this.$manualRefresh = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HealthV2Fragment.this.new C25761(this.$manualRefresh, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HealthV2Fragment.this.getFitnessSyncer().triggerDataSync(this.$manualRefresh);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        ajc$preClinit();
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.xiaomi.fitness.homepage.HealthV2Fragment$mDataChangedReceiver$1] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.xiaomi.fitness.homepage.HealthV2Fragment$settingInfoListener$1] */
    public HealthV2Fragment() {
        super(jui.S, 0, true);
        this.mDataList = new ArrayList();
        this.mDataModelMap = new LinkedHashMap();
        this.fitnessSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: z2c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HealthV2Fragment.fitnessSyncer_delegate$lambda$0();
            }
        });
        this.isFemale = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).isFemale();
        this.accountStatus = HealthUtil.INSTANCE.checkLoginAccountStatusInfo();
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.xiaomi.fitness.homepage.HealthV2Fragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.xiaomi.fitness.homepage.HealthV2Fragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function1 = null;
        this.healthCheckViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HealthCheckViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.fitness.homepage.HealthV2Fragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "owner.viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.xiaomi.fitness.homepage.HealthV2Fragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM39viewModels$lambda1 = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM39viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM39viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.fitness.homepage.HealthV2Fragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM39viewModels$lambda1 = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM39viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM39viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.mDataChangedReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.homepage.HealthV2Fragment$mDataChangedReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AnyExtKt.main$default(null, new HealthV2Fragment$mDataChangedReceiver$1$onReceive$1(intent, this.this$0, null), 1, null);
            }
        };
        this.settingInfoListener = new DeviceSettingManager.UpdateSettingInfoListener() { // from class: com.xiaomi.fitness.homepage.HealthV2Fragment$settingInfoListener$1
            @Override // com.xiaomi.fitness.settingitem.DeviceSettingManager.UpdateSettingInfoListener
            public void onSettingValueUpdate(String did, HashMap<String, String> settingMap) {
                Intrinsics.checkNotNullParameter(settingMap, "settingMap");
                FitnessLogUtils.i(HealthV2Fragment.TAG, "settingInfoListener(" + did + ")");
                HealthV2Fragment.initDataItemCard$default(this.this$0, null, 1, null);
            }
        };
        this.deviceChangedListener = new Function1() { // from class: a3c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthV2Fragment.deviceChangedListener$lambda$1(this.f570a, (WearableDeviceModel) obj);
            }
        };
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("HealthV2Fragment.kt", HealthV2Fragment.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g("12", "goCheckLoginUserInfo", "com.xiaomi.fitness.homepage.HealthV2Fragment", "int", "type", "", "void"), 627);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindFemaleHealthReport() {
        Logger.d(TAG, "Female Health CurseManager bindFemaleHealthReport!");
        DailyFemaleHealthReport dailyFemaleHealthReportCreateDailyFemaleHealthReport = DailyFemaleHealthReport.INSTANCE.createDailyFemaleHealthReport(System.currentTimeMillis() / ((long) 1000), "home", "");
        Logger.i(TAG, "bindFemaleHealthReport " + dailyFemaleHealthReportCreateDailyFemaleHealthReport);
        dailyFemaleHealthReportCreateDailyFemaleHealthReport.setFemale(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).isFemale());
        bindReportInner(HomeDataType.WOMEN_HEALTH, dailyFemaleHealthReportCreateDailyFemaleHealthReport);
    }

    private final void bindGoalReport(DailyGoalReport report) {
        DataHeaderV2View dataHeaderV2View = this.dataHeaderView;
        if (dataHeaderV2View != null) {
            dataHeaderV2View.bindGoalReport(report);
        }
    }

    private final int bindReportInner(HomeDataType homeType, Object obj) {
        if (obj != null) {
            Integer numConvertToHealthTypeInt = HealthDataTypeUtilsV2.INSTANCE.convertToHealthTypeInt(homeType);
            if (numConvertToHealthTypeInt == null) {
                Logger.i(TAG, "(" + homeType + ") convertToHealthTypeInt is null");
                return -1;
            }
            Logger.d(TAG, "bindReportInner sportType=" + numConvertToHealthTypeInt);
            km5 km5Var = this.mDataModelMap.get(numConvertToHealthTypeInt);
            if (km5Var != null) {
                if (obj instanceof DailyBasicReport) {
                    DailyBasicReport dailyBasicReport = (DailyBasicReport) obj;
                    km5Var.f23978a = dailyBasicReport.getTime();
                    km5Var.d = dailyBasicReport.getSid();
                    km5Var.h = dailyBasicReport;
                    notifyInsert(numConvertToHealthTypeInt.intValue(), km5Var);
                } else if (obj instanceof SportBasicReport) {
                    SportBasicReport sportBasicReport = (SportBasicReport) obj;
                    km5Var.c = lp5.a(sportBasicReport);
                    km5Var.d = sportBasicReport.getSid();
                    km5Var.f23978a = sportBasicReport.getTimeStamp();
                    km5Var.i = sportBasicReport;
                    notifyInsert(numConvertToHealthTypeInt.intValue(), km5Var);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changedDataModelSortId() {
        if (!this.mDataModelMap.isEmpty()) {
            this.mDataList.clear();
            Iterator<Map.Entry<Integer, km5>> it = this.mDataModelMap.entrySet().iterator();
            while (it.hasNext()) {
                km5 value = it.next().getValue();
                if (value.e >= 0) {
                    this.mDataList.add(value);
                }
            }
            CollectionsKt__MutableCollectionsJVMKt.sort(this.mDataList);
        }
        HealthAdapterV2 healthAdapterV2 = this.mAdapter;
        if (healthAdapterV2 != null) {
            healthAdapterV2.setBottomCount(1);
        }
        HealthAdapterV2 healthAdapterV3 = this.mAdapter;
        Intrinsics.checkNotNull(healthAdapterV3);
        healthAdapterV3.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkLoginInfoAndNotifyChange() {
        int iCheckLoginAccountStatusInfo;
        if (this.mDataModelMap.get(1) == null || (iCheckLoginAccountStatusInfo = HealthUtil.INSTANCE.checkLoginAccountStatusInfo()) == this.accountStatus) {
            return;
        }
        this.accountStatus = iCheckLoginAccountStatusInfo;
        initDataItemCard$default(this, null, 1, null);
    }

    private final Bundle createBundle(int position) {
        Bundle bundle = new Bundle();
        HealthAdapterV2 healthAdapterV2 = this.mAdapter;
        Intrinsics.checkNotNull(healthAdapterV2);
        km5 itemAsPosition = healthAdapterV2.getItemAsPosition(position);
        if (itemAsPosition != null) {
            if (!TextUtils.isEmpty(itemAsPosition.d)) {
                bundle.putString("did", itemAsPosition.d);
            }
            bundle.putSerializable("local_date", TimeDateUtil.timestampToLocalDate(itemAsPosition.f23978a));
        }
        HealthAdapterV2 healthAdapterV3 = this.mAdapter;
        Intrinsics.checkNotNull(healthAdapterV3);
        bundle.putInt("sport_type", healthAdapterV3.getItemType(position));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deviceChangedListener$lambda$1(HealthV2Fragment this$0, WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(TAG, "deviceChangedListener(" + (wearableDeviceModel != null ? wearableDeviceModel.getDid() : null) + ")");
        CurseManager.INSTANCE.getInstance().refreshDeviceSupportAlgoPredict(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null);
        initDataItemCard$default(this$0, null, 1, null);
        this$0.shouldRefreshBanners = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessSyncer fitnessSyncer_delegate$lambda$0() {
        return FitnessSyncExtKt.getInstance(FitnessSyncer.INSTANCE);
    }

    private final void forbiddenRecyclerItemAnimation() {
        RecyclerView recyclerView = this.recycler;
        RecyclerView.l itemAnimator = recyclerView != null ? recyclerView.getItemAnimator() : null;
        if (itemAnimator == null || !(itemAnimator instanceof w)) {
            return;
        }
        ((w) itemAnimator).V(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getAndDrawHomeData() {
        if (isInvalid()) {
            return;
        }
        List<HomeDataType> requestHomeTypeList = HealthDataTypeUtilsV2.INSTANCE.getRequestHomeTypeList();
        FitnessLogUtils.i(TAG, "getAndDrawHomeData，" + requestHomeTypeList);
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateNow);
        LiveData<DailyGoalReport> liveData = this.mGoalReportLivaData;
        if (liveData != null) {
            liveData.removeObservers(getViewLifecycleOwner());
        }
        LiveData<DailyGoalReport> liveDataTriggerFetchRainbowReport = ((HealthViewModel) getMViewModel()).triggerFetchRainbowReport(jChangZeroOfTheDay, false);
        this.mGoalReportLivaData = liveDataTriggerFetchRainbowReport;
        if (liveDataTriggerFetchRainbowReport != null) {
            liveDataTriggerFetchRainbowReport.observe(getViewLifecycleOwner(), new HealthV2Fragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: q2c
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HealthV2Fragment.getAndDrawHomeData$lambda$16(this.f31014a, (DailyGoalReport) obj);
                }
            }));
        }
        HealthViewModel healthViewModel = (HealthViewModel) getMViewModel();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        healthViewModel.loadOtherType(viewLifecycleOwner, new Function1() { // from class: r2c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthV2Fragment.getAndDrawHomeData$lambda$17(this.f32108a, (DailyBasicReport) obj);
            }
        });
        FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getHomeDataRepository().triggerGetHomeData(requestHomeTypeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAndDrawHomeData$lambda$16(HealthV2Fragment this$0, DailyGoalReport dailyGoalReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "RainbowReport, mDailyGoalReport = " + dailyGoalReport);
        if (dailyGoalReport != null && TimeDateUtil.isToday(dailyGoalReport.getTime())) {
            DailyGoalReport dailyGoalReport2 = this$0.mDailyGoalReport;
            if (dailyGoalReport2 == null) {
                this$0.mDailyGoalReport = dailyGoalReport;
                this$0.bindGoalReport(dailyGoalReport);
                DataHeaderV2View dataHeaderV2View = this$0.dataHeaderView;
                if (dataHeaderV2View != null) {
                    dataHeaderV2View.refreshAnimation();
                }
            } else {
                Intrinsics.checkNotNull(dailyGoalReport2);
                if (!Intrinsics.areEqual(dailyGoalReport2, dailyGoalReport)) {
                    this$0.mDailyGoalReport = dailyGoalReport;
                    this$0.bindGoalReport(dailyGoalReport);
                    DataHeaderV2View dataHeaderV2View2 = this$0.dataHeaderView;
                    if (dataHeaderV2View2 != null) {
                        dataHeaderV2View2.refreshAnimation();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAndDrawHomeData$lambda$17(HealthV2Fragment this$0, DailyBasicReport it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        DataHeaderV2View dataHeaderV2View = this$0.dataHeaderView;
        if (dataHeaderV2View != null) {
            dataHeaderV2View.bindOtherGoalReport(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FitnessSyncer getFitnessSyncer() {
        return (FitnessSyncer) this.fitnessSyncer.getValue();
    }

    private final HealthCheckViewModel getHealthCheckViewModel() {
        return (HealthCheckViewModel) this.healthCheckViewModel.getValue();
    }

    private final List<HomeDataType> getSupportTodayHealthList() {
        HealthDataTypeUtilsV2 healthDataTypeUtilsV2 = HealthDataTypeUtilsV2.INSTANCE;
        HomeDataType homeDataType = HomeDataType.TODAY_HEALTH;
        return this.mDataModelMap.containsKey(healthDataTypeUtilsV2.convertToHealthTypeInt(homeDataType)) ? CollectionsKt__CollectionsKt.listOf((Object[]) new HomeDataType[]{HomeDataType.HR, HomeDataType.SLEEP, HomeDataType.SPO2, HomeDataType.STRESS, homeDataType}) : CollectionsKt__CollectionsKt.emptyList();
    }

    @NeedLogin(needCompleteUserInfo = true, needLogin = true, needLoginDialogGuide = false)
    private final void goCheckLoginUserInfo(int type) throws Throwable {
        nrd nrdVarC = s69.c(ajc$tjp_0, this, this, xj4.c(type));
        NeedLoginAspect needLoginAspectAspectOf = NeedLoginAspect.aspectOf();
        fai faiVarC = new b3c(new Object[]{this, xj4.c(type), nrdVarC}).c(69648);
        Annotation annotation = ajc$anno$0;
        if (annotation == null) {
            annotation = HealthV2Fragment.class.getDeclaredMethod("goCheckLoginUserInfo", Integer.TYPE).getAnnotation(NeedLogin.class);
            ajc$anno$0 = annotation;
        }
        needLoginAspectAspectOf.aroundNeedLogin(faiVarC, (NeedLogin) annotation);
    }

    public static final /* synthetic */ void goCheckLoginUserInfo_aroundBody0(HealthV2Fragment healthV2Fragment, int i, nrd nrdVar) {
        if (i == 1) {
            healthV2Fragment.checkLoginInfoAndNotifyChange();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDataItemCard(List<Integer> displayList) {
        ScopeExtKt.scopeLife$default((Fragment) this, (Lifecycle.Event) null, (CoroutineDispatcher) null, (Function2) new AnonymousClass1(displayList, this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initDataItemCard$default(HealthV2Fragment healthV2Fragment, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        healthV2Fragment.initDataItemCard(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDataSortMap(List<Integer> displayList) {
        for (Map.Entry<Integer, km5> entry : this.mDataModelMap.entrySet()) {
            int i = entry.getValue().f23979b;
            if (i != 1 && i != 19 && !displayList.contains(Integer.valueOf(i))) {
                entry.getValue().e = -1;
            }
        }
        long todayZeroTimeInSec = FitnessDateUtils.getTodayZeroTimeInSec();
        int iCheckLoginAccountStatusInfo = HealthUtil.INSTANCE.checkLoginAccountStatusInfo();
        int i2 = 0;
        if (iCheckLoginAccountStatusInfo == 0) {
            km5 km5Var = this.mDataModelMap.get(1);
            if (km5Var != null) {
                km5Var.e = -1;
            }
        } else {
            refreshDataModelSortId(todayZeroTimeInSec, 1, 0).f23980k = iCheckLoginAccountStatusInfo;
        }
        Iterator<T> it = displayList.iterator();
        while (it.hasNext()) {
            refreshDataModelSortId(todayZeroTimeInSec, ((Number) it.next()).intValue(), i2 + 2);
            i2++;
        }
        if (displayList.contains(30000)) {
            upDateTodayHealth();
        }
    }

    private final void initRefreshLayout() {
        this.mTrigger = new stb(getContext());
        int i = c0j.gq;
        int i2 = c0j.Yn;
        LoadAction loadAction = new LoadAction(ExtUtilsKt.getDp(34), new int[]{i, i2, i2, c0j.hq}, new Function0() { // from class: o2c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HealthV2Fragment.initRefreshLayout$lambda$9(this.f28667a);
            }
        });
        stb stbVar = this.mTrigger;
        if (stbVar != null) {
            stbVar.d(loadAction);
        }
        stb stbVar2 = this.mTrigger;
        if (stbVar2 != null) {
            stbVar2.M(this.swipeContainer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRefreshLayout$lambda$9(HealthV2Fragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.triggerDataSync(true);
        return Unit.INSTANCE;
    }

    private final void initResource() {
        setLayoutManager();
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        HealthAdapterV2 healthAdapterV2 = new HealthAdapterV2(mActivity, this.mDataList, getViewLifecycleOwner(), getHealthCheckViewModel());
        this.mAdapter = healthAdapterV2;
        Intrinsics.checkNotNull(healthAdapterV2);
        healthAdapterV2.setOnGoPageClickListener(this);
        RecyclerView recyclerView = this.recycler;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setAdapter(this.mAdapter);
        RecyclerView recyclerView2 = this.recycler;
        if (recyclerView2 != null) {
            recyclerView2.setItemViewCacheSize(16);
        }
    }

    private final void initTitleView() {
        HomeHeaderTabTitleView homeHeaderTabTitleView = this.header;
        if (homeHeaderTabTitleView != null) {
            String string = getString(c0j.I9);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            HomeHeaderTabTitleView.setTitle$default(homeHeaderTabTitleView, string, 0, 2, (Object) null);
        }
        HomeHeaderTabTitleView homeHeaderTabTitleView2 = this.header;
        if (homeHeaderTabTitleView2 != null) {
            homeHeaderTabTitleView2.setMenuClickListener(new View.OnClickListener() { // from class: p2c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HealthV2Fragment.initTitleView$lambda$14(this.f29932a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitleView$lambda$14(HealthV2Fragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        BaseMainFragment.showPopupMenu$default(this$0, view, null, 2, null);
    }

    private final void initUserGenderChange() {
        OnUserInfoChange onUserInfoChange = new OnUserInfoChange() { // from class: com.xiaomi.fitness.homepage.HealthV2Fragment.initUserGenderChange.1
            @Override // com.xiaomi.fitness.account.extensions.OnUserInfoChange
            public void userInfoChange(UserProfile userProfile) {
                Intrinsics.checkNotNullParameter(userProfile, "userProfile");
                if (HealthV2Fragment.this.isInvalid()) {
                    return;
                }
                Logger.d(HealthV2Fragment.TAG, "userInfoChange" + userProfile);
                boolean zAreEqual = Intrinsics.areEqual(userProfile.getSex(), "female");
                boolean z = HealthV2Fragment.this.getIsFemale() != zAreEqual;
                HealthV2Fragment.this.setFemale(zAreEqual);
                if (!z) {
                    HealthV2Fragment.this.checkLoginInfoAndNotifyChange();
                } else {
                    Logger.i(HealthV2Fragment.TAG, "isFemale status changed, and initDataItemCard");
                    HealthV2Fragment.initDataItemCard$default(HealthV2Fragment.this, null, 1, null);
                }
            }
        };
        this.mUserInfoChangeListener = onUserInfoChange;
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).addUserInfoChangeListener(onUserInfoChange);
    }

    private final boolean needCheckUserInfo(int sportType) {
        return sportType == 3 || sportType == 2 || sportType == 15 || sportType == 4 || sportType == 1;
    }

    private final void notifyInsert(int sportType, km5 dataModelInsert) {
        if (dataModelInsert == null) {
            return;
        }
        int size = this.mDataList.size();
        for (int i = 0; i < size; i++) {
            if (this.mDataList.get(i).f23979b == sportType) {
                this.mDataList.set(i, dataModelInsert);
                HealthAdapterV2 healthAdapterV2 = this.mAdapter;
                if (healthAdapterV2 != null) {
                    int itemPosition = healthAdapterV2.getItemPosition(i);
                    HealthAdapterV2 healthAdapterV3 = this.mAdapter;
                    if (healthAdapterV3 != null) {
                        healthAdapterV3.notifyItemChanged(itemPosition);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(HealthV2Fragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getAndDrawHomeData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(HealthV2Fragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BaseMainFragment.showPopupMenu$default(this$0, it, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(Function1 tmp0, View view) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$5(HealthV2Fragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((HealthViewModel) this$0.getMViewModel()).checkSportRecover(this$0.getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(HealthV2Fragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, ">>>> HomeData map = " + map);
        this$0.startDrawWithFitnessData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(HealthV2Fragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestBannersV4();
        return Unit.INSTANCE;
    }

    private final km5 refreshDataModelSortId(long time, int type, int sortId) {
        km5 km5VarCreateDefaultDataModel = this.mDataModelMap.get(Integer.valueOf(type));
        if (km5VarCreateDefaultDataModel == null) {
            km5VarCreateDefaultDataModel = HealthUtil.INSTANCE.createDefaultDataModel(time, type, sortId);
        }
        km5VarCreateDefaultDataModel.e = sortId;
        this.mDataModelMap.put(Integer.valueOf(type), km5VarCreateDefaultDataModel);
        return km5VarCreateDefaultDataModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshPage() {
        ze2.b bVarF;
        stb stbVar = this.mTrigger;
        if (stbVar != null && (bVarF = stbVar.f()) != null) {
            bVarF.notifyLoadComplete();
        }
        getAndDrawHomeData();
    }

    private final void registerDataChangedBroadcast() {
        if (this.mDataChangedReceiverRegistered) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("recent_data_changed_broadcast");
        intentFilter.addAction(FitnessDataConstants.ACTION_DATA_LIST_CHANGED_BROADCAST);
        if (Build.VERSION.SDK_INT >= 33) {
            requireActivity().registerReceiver(this.mDataChangedReceiver, intentFilter, 2);
        } else {
            ni4.k(requireActivity(), this.mDataChangedReceiver, intentFilter, 2);
        }
        this.mDataChangedReceiverRegistered = true;
    }

    private final void requestBannersV4() {
        requestHealthTabBanner();
        requestOperationalBanners();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestHealthTabBanner() {
        if (getView() == null) {
            return;
        }
        ((HealthViewModel) getMViewModel()).queryHealthTabBannerList().observe(getViewLifecycleOwner(), new HealthV2Fragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: y2c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthV2Fragment.requestHealthTabBanner$lambda$11(this.f39710a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestHealthTabBanner$lambda$11(HealthV2Fragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Integer numValueOf = Integer.valueOf(((BannerItemV2) obj).getResourceId());
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        List<BannerItemV2> list2 = (List) linkedHashMap.get(1);
        List<BannerItemV2> list3 = list2;
        if (list3 == null || list3.isEmpty()) {
            AnnouncementBannerView announcementBannerView = this$0.announcementBannerView;
            if (announcementBannerView != null) {
                ViewExtKt.setVisible(announcementBannerView, false);
            }
        } else {
            AnnouncementBannerView announcementBannerView2 = this$0.announcementBannerView;
            if (announcementBannerView2 != null) {
                ViewExtKt.setVisible(announcementBannerView2, true);
            }
            AnnouncementBannerView announcementBannerView3 = this$0.announcementBannerView;
            if (announcementBannerView3 != null) {
                announcementBannerView3.updateAnnounceBannerList(list2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestOperationalBanners() {
        if (getView() == null) {
            return;
        }
        ((HealthViewModel) getMViewModel()).queryOperationalBannerList().observe(getViewLifecycleOwner(), new HealthV2Fragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: n2c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthV2Fragment.requestOperationalBanners$lambda$8(this.f27472a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestOperationalBanners$lambda$8(HealthV2Fragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OperationalBannerAdapter operationalBannerAdapter = new OperationalBannerAdapter();
        ((i5a) this$0.getMBinding()).E.setAdapter(operationalBannerAdapter);
        RecyclerView healthBannerRecyclerView = ((i5a) this$0.getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(healthBannerRecyclerView, "healthBannerRecyclerView");
        ItemDecorationExtKt.clearAllItemDecorations(healthBannerRecyclerView);
        ((i5a) this$0.getMBinding()).E.addItemDecoration(new gak(ExtUtilsKt.getDp(12)));
        Intrinsics.checkNotNull(list);
        operationalBannerAdapter.bindData(list);
        return Unit.INSTANCE;
    }

    private final void setLayoutManager() {
        int i;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            i = 3;
        } else {
            Context context = getContext();
            i = (context == null || !UIUtils.INSTANCE.isTabletAndLandscape(context)) ? 2 : 4;
        }
        final int i2 = i;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), i2);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.homepage.HealthV2Fragment.setLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                HealthAdapterV2 healthAdapterV2 = HealthV2Fragment.this.mAdapter;
                Intrinsics.checkNotNull(healthAdapterV2);
                if (!healthAdapterV2.isHeaderView(position)) {
                    HealthAdapterV2 healthAdapterV3 = HealthV2Fragment.this.mAdapter;
                    Intrinsics.checkNotNull(healthAdapterV3);
                    if (!healthAdapterV3.isBottomView(position)) {
                        HealthAdapterV2 healthAdapterV4 = HealthV2Fragment.this.mAdapter;
                        Intrinsics.checkNotNull(healthAdapterV4);
                        km5 itemAsPosition = healthAdapterV4.getItemAsPosition(position);
                        int i3 = itemAsPosition != null ? itemAsPosition.g : 1;
                        if (itemAsPosition != null && itemAsPosition.f23979b == 19) {
                            Context context2 = HealthV2Fragment.this.getContext();
                            i3 = (context2 == null || !UIUtils.INSTANCE.isTabletAndLandscape(context2)) ? 2 : 4;
                        }
                        if (itemAsPosition != null && itemAsPosition.f23979b == 1) {
                            i3 = i2;
                        }
                        int i4 = i2;
                        return i3 > i4 ? i4 : i3;
                    }
                }
                return i2;
            }
        });
        RecyclerView recyclerView = this.recycler;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView2 = this.recycler;
        Intrinsics.checkNotNull(recyclerView2);
        ItemDecorationExtKt.clearAllItemDecorations(recyclerView2);
        Logger.i(TAG, "mDataList.size=" + this.mDataList.size());
        GridItemDecoration gridItemDecoration = new GridItemDecoration(this.mDataList.size(), i2, 0, ExtUtilsKt.getDp(10), 0, ExtUtilsKt.getDp(10));
        RecyclerView recyclerView3 = this.recycler;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.addItemDecoration(gridItemDecoration);
        RecyclerView recyclerView4 = this.recycler;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.requestLayout();
        RecyclerView recyclerView5 = this.recycler;
        Intrinsics.checkNotNull(recyclerView5);
        recyclerView5.invalidate();
    }

    private final void startDrawWithFitnessData(Map<HomeDataType, ? extends Object> dataMap) {
        if (dataMap == null || dataMap.isEmpty()) {
            return;
        }
        for (HomeDataType homeDataType : dataMap.keySet()) {
            Object obj = dataMap.get(homeDataType);
            Logger.i(TAG, "dataMap size:" + dataMap.size() + " " + homeDataType);
            bindReportInner(homeDataType, obj);
        }
        upDateTodayHealth();
    }

    private final void triggerDataSync(boolean manualRefresh) {
        FitnessLogUtils.i(TAG, "triggerDataSync: manual = " + manualRefresh);
        if (manualRefresh) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).getUserInfoFromWeb();
        }
        ScopeExtKt.scope(Dispatchers.getIO(), new C25761(manualRefresh, null));
    }

    private final void unregisterDataChangedBroadcast() {
        if (this.mDataChangedReceiverRegistered) {
            requireActivity().unregisterReceiver(this.mDataChangedReceiver);
            this.mDataChangedReceiverRegistered = false;
        }
    }

    private final void upDateTodayHealth() {
        notifyInsert(30000, this.mDataModelMap.get(30000));
    }

    public final int getAccountStatus() {
        return this.accountStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.main.export.BaseMainFragment
    @Nullable
    public View getContentView() {
        return ((i5a) getMBinding()).B;
    }

    @Nullable
    public final DailyGoalReport getMDailyGoalReport() {
        return this.mDailyGoalReport;
    }

    /* JADX INFO: renamed from: isFemale, reason: from getter */
    public final boolean getIsFemale() {
        return this.isFemale;
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        requestBannersV4();
        setLayoutManager();
    }

    @Override // com.xiaomi.fitness.health.curse.CurseManager.OnConfigChange
    public void onDataChange() {
        Logger.d(TAG, "CurseManager observer onDataChange!");
        bindFemaleHealthReport();
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        CurseManager.INSTANCE.getInstance().removeObserver(this);
        DeviceSettingManager.INSTANCE.getInstance().removeUpdateListener(this.settingInfoListener);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceChangeListener(this.deviceChangedListener);
        OnUserInfoChange onUserInfoChange = this.mUserInfoChangeListener;
        if (onUserInfoChange != null) {
            AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).removeUserInfoChangeListener(onUserInfoChange);
        }
        super.onDestroy();
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        unregisterDataChangedBroadcast();
        super.onDestroyView();
    }

    @Override // com.xiaomi.fitness.v2.HealthAdapterV2.OnGoPageClickListener
    public void onGoPage(@NotNull RecyclerView.d0 viewHolder, int position, @Nullable ActivityOptions activityOptions) throws Throwable {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (position == -1) {
            return;
        }
        Bundle bundleCreateBundle = createBundle(position);
        HealthAdapterV2 healthAdapterV2 = this.mAdapter;
        Intrinsics.checkNotNull(healthAdapterV2);
        int itemType = healthAdapterV2.getItemType(position);
        if (itemType == 1) {
            goCheckLoginUserInfo(itemType);
        } else if (needCheckUserInfo(itemType)) {
            HealthUtil.INSTANCE.goDataPageCheckUserInfo(getContext(), itemType, bundleCreateBundle, activityOptions, HealthUtil.ORIGIN_HOME_CARD);
        } else {
            HealthUtil.INSTANCE.goDataPage(requireActivity(), getContext(), itemType, bundleCreateBundle, activityOptions, HealthUtil.ORIGIN_HOME_CARD);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.oneTrackStartTime) / ((long) 1000);
        MainHelper mainExtKt = MainExtKt.getInstance(MainHelper.INSTANCE);
        String string = getString(c0j.I9);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        mainExtKt.onetrackRecordTabShowTime(jCurrentTimeMillis, "status_tab_page", string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.main.export.BaseMainFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.recycler = ((i5a) getMBinding()).F;
        forbiddenRecyclerItemAnimation();
        this.dataHeaderView = ((i5a) getMBinding()).C;
        this.swipeContainer = ((i5a) getMBinding()).H;
        this.header = ((i5a) getMBinding()).D;
        this.announcementBannerView = ((i5a) getMBinding()).A;
        this.heathBannerRecyclerView = ((i5a) getMBinding()).E;
        initResource();
        initTitleView();
        initDataItemCard$default(this, null, 1, null);
        initRefreshLayout();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: s2c
            @Override // java.lang.Runnable
            public final void run() {
                HealthV2Fragment.onViewCreated$lambda$2(this.f33205a);
            }
        }, 300L);
        registerDataChangedBroadcast();
        DeviceSettingManager.INSTANCE.getInstance().addUpdateListener(this.settingInfoListener);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceChangeListener(this.deviceChangedListener);
        CurseManager.INSTANCE.getInstance().addDataObserver(this);
        final Function1 function1 = new Function1() { // from class: t2c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthV2Fragment.onViewCreated$lambda$3(this.f34229a, (View) obj);
            }
        };
        DataHeaderV2View dataHeaderV2View = this.dataHeaderView;
        if (dataHeaderV2View != null) {
            dataHeaderV2View.setAddDevListener(new View.OnClickListener() { // from class: u2c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HealthV2Fragment.onViewCreated$lambda$4(function1, view2);
                }
            });
        }
        initUserGenderChange();
        getRootView().postDelayed(new Runnable() { // from class: v2c
            @Override // java.lang.Runnable
            public final void run() {
                HealthV2Fragment.onViewCreated$lambda$5(this.f36411a);
            }
        }, 1000L);
        FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getHomeDataRepository().getHomeLiveData().observe(getViewLifecycleOwner(), new HealthV2Fragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: w2c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthV2Fragment.onViewCreated$lambda$6(this.f37476a, (Map) obj);
            }
        }));
        IPopMedalListRepo popMedalExtKt = PopMedalExtKt.getInstance(IPopMedalListRepo.INSTANCE);
        MutableLiveData<PopMedalData> medalToPopLiveData = ((HealthViewModel) getMViewModel()).getMedalToPopLiveData();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        popMedalExtKt.startObservingPopupMedalData(medalToPopLiveData, fragmentActivityRequireActivity);
        int dimen = (int) BaseFragmentExtKt.getDimen(this, ili.i);
        ScrollViewEffectiveExposeBiz scrollViewEffectiveExposeBiz = new ScrollViewEffectiveExposeBiz();
        NestedScrollView scrollView = ((i5a) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
        scrollViewEffectiveExposeBiz.startTrackItemExpose(scrollView, new LinkedHashSet(), dimen);
        HealthUtil.INSTANCE.listenOnLogInAndProceed(new WeakReference<>(new Function0() { // from class: x2c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HealthV2Fragment.onViewCreated$lambda$7(this.f38605a);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        BaseFragmentExtKt.setStatusBarColor(this, iji.A3);
        this.oneTrackStartTime = System.currentTimeMillis();
        triggerDataSync(false);
        ((HealthViewModel) getMViewModel()).getSchema();
        PopMedalExtKt.getInstance(IPopMedalListRepo.INSTANCE).showPopupDialogIfNeed(((HealthViewModel) getMViewModel()).getMedalToPopLiveData());
        if (this.shouldRefreshBanners) {
            requestBannersV4();
            this.shouldRefreshBanners = false;
        }
        PreloadManagerExtKt.getInstance(ResPreloadManager.INSTANCE).preloadIfNeed();
    }

    public final void setAccountStatus(int i) {
        this.accountStatus = i;
    }

    public final void setFemale(boolean z) {
        this.isFemale = z;
    }

    public final void setMDailyGoalReport(@Nullable DailyGoalReport dailyGoalReport) {
        this.mDailyGoalReport = dailyGoalReport;
    }
}
