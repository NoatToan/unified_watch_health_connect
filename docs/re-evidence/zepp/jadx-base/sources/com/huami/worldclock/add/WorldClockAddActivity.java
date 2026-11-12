package com.huami.worldclock.add;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.statusbar.StatusBarCompat;
import com.huami.tools.log.HMLog;
import com.huami.worldclock.R;
import com.huami.worldclock.add.WorldClockAddActivity;
import com.huami.worldclock.add.alphabetic.SuspensionDecoration;
import com.huami.worldclock.bean.AppType;
import com.huami.worldclock.bean.WorldClockBean;
import com.huami.worldclock.bean.WorldClockCityBean;
import com.huami.worldclock.component.ClearEditText;
import com.huami.worldclock.component.IndexBar;
import com.huami.worldclock.koin.DeviceScopesAndQualifierKt;
import com.huami.worldclock.proxy.ScopeComponents;
import com.huami.worldclock.utils.DensityUtils;
import com.huami.worldclock.utils.InputUtils;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 Y2\u00020\u0001:\u0001YB\u0007¢\u0006\u0004\bW\u0010XJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0016\u0010\u0015\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014R%\u0010&\u001a\n !*\u0004\u0018\u00010 0 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R%\u0010+\u001a\n !*\u0004\u0018\u00010'0'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R%\u00100\u001a\n !*\u0004\u0018\u00010,0,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010/R%\u00105\u001a\n !*\u0004\u0018\u000101018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u00104R%\u00108\u001a\n !*\u0004\u0018\u00010 0 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u0010%R%\u0010;\u001a\n !*\u0004\u0018\u00010 0 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010#\u001a\u0004\b:\u0010%R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010AR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u001e\u0010G\u001a\n !*\u0004\u0018\u00010E0E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010LR\u001d\u0010Q\u001a\u00020N8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\bO\u0010PR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V¨\u0006Z"}, d2 = {"Lcom/huami/worldclock/add/WorldClockAddActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "i", "", "l", "v", "B", SOAP.XMLNS, "initView", "Lcom/huami/worldclock/bean/AppType;", "appType", "u", "C", "z", "", "searchKey", z.j, "", "Lcom/huami/worldclock/bean/WorldClockCityBean;", "list", com.google.android.exoplayer2.text.ttml.b.r, "initRecyclerView", LargeWatchSkinActivity.KEY_BEAN, "h", "msg", LogUtil.D, "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", hl.k, "()Landroid/widget/TextView;", com.twitter.sdk.android.tweetcomposer.g.g, "Lcom/huami/worldclock/component/IndexBar;", "b", "m", "()Lcom/huami/worldclock/component/IndexBar;", "indexBar", "Landroidx/recyclerview/widget/RecyclerView;", "c", GoogleApiAvailabilityLight.b, "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/huami/worldclock/component/ClearEditText;", GoogleApiAvailabilityLight.a, "o", "()Lcom/huami/worldclock/component/ClearEditText;", "searchEditText", "e", "r", "tvSideBarHint", "f", DTransferConstants.SEARCH_KEY, "tvSearchEmpty", "Lcom/huami/worldclock/add/AdapterWorldCity;", "g", "Lcom/huami/worldclock/add/AdapterWorldCity;", "mAdapter", "Lcom/huami/worldclock/add/alphabetic/SuspensionDecoration;", "Lcom/huami/worldclock/add/alphabetic/SuspensionDecoration;", "mDecoration", "Ljava/util/List;", "allSupportTimeZone", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "failedDialog", "Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", "Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", "builder", "Lcom/huami/worldclock/add/WorldClockAddViewModel;", "getViewModel", "()Lcom/huami/worldclock/add/WorldClockAddViewModel;", "viewModel", "Lcom/huami/worldclock/bean/AppType;", "getAppType", "()Lcom/huami/worldclock/bean/AppType;", "setAppType", "(Lcom/huami/worldclock/bean/AppType;)V", "<init>", "()V", "Companion", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class WorldClockAddActivity extends AppCompatActivity {

    @NotNull
    public static final String CHOOSECITY = "choose_city";

    @NotNull
    private static final String o = "WorldClockAddActivity";
    public static final int requestCode = 101;
    public static final int resultCode = 102;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private AdapterWorldCity mAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private SuspensionDecoration mDecoration;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private List<WorldClockCityBean> allSupportTimeZone;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment failedDialog;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment.Builder builder;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private AppType appType;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy cancel = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy indexBar = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy recyclerView = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy searchEditText = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvSideBarHint = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvSearchEmpty = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private HMDeviceType deviceType = HMDeviceSource.MILI.getType();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            iArr[AppType.MIDONG.ordinal()] = 1;
            iArr[AppType.MIFIT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<TextView> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) WorldClockAddActivity.this.findViewById(R.id.cancel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc, String str) {
            super(0);
            this.a = exc;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return ((Object) this.a.getMessage()) + ",searchKey:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/worldclock/component/IndexBar;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<IndexBar> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IndexBar getA() {
            return (IndexBar) WorldClockAddActivity.this.findViewById(R.id.indexBar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<RecyclerView> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclerView getA() {
            return (RecyclerView) WorldClockAddActivity.this.findViewById(R.id.recyclerView);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/worldclock/component/ClearEditText;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<ClearEditText> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClearEditText getA() {
            return (ClearEditText) WorldClockAddActivity.this.findViewById(R.id.search_edit_text);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<TextView> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) WorldClockAddActivity.this.findViewById(R.id.search_empty);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<TextView> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) WorldClockAddActivity.this.findViewById(R.id.tvSideBarHint);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorldClockAddActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.worldclock.add.WorldClockAddActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WorldClockAddViewModel>() { // from class: com.huami.worldclock.add.WorldClockAddActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.worldclock.add.WorldClockAddViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WorldClockAddViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr, Reflection.getOrCreateKotlinClass(WorldClockAddViewModel.class), function0, objArr2);
            }
        });
        ScopeComponents scopeComponents = DeviceScopesAndQualifierKt.getScopeComponents(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this));
        AppType appType = scopeComponents != null ? scopeComponents.getAppType() : null;
        this.appType = appType == null ? AppType.MIDONG : appType;
    }

    private final boolean A() {
        return Build.VERSION.SDK_INT >= 24;
    }

    private final void B() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("device_type");
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMDeviceType");
        this.deviceType = (HMDeviceType) serializableExtra;
    }

    private final void C(AppType appType) {
        int i;
        int i2;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i3 = iArr[appType.ordinal()];
        if (i3 != 1) {
            i = i3 != 2 ? R.color.cl_fff8f8f8 : R.color.cl_fff6f7f8;
        } else {
            i = R.color.s4;
        }
        int i4 = iArr[appType.ordinal()];
        if (i4 != 1) {
            i2 = i4 != 2 ? R.color.cl_66000000 : R.color.cl_ff4c4c4c;
        } else {
            i2 = R.color.s3;
        }
        float f2 = iArr[appType.ordinal()] != 1 ? 12.0f : 13.0f;
        SuspensionDecoration suspensionDecoration = this.mDecoration;
        if (suspensionDecoration != null) {
            suspensionDecoration.setTitleFontSize(f2);
        }
        SuspensionDecoration suspensionDecoration2 = this.mDecoration;
        if (suspensionDecoration2 != null) {
            suspensionDecoration2.setColorTitleBg(ContextCompat.getColor(this, i));
        }
        SuspensionDecoration suspensionDecoration3 = this.mDecoration;
        if (suspensionDecoration3 != null) {
            suspensionDecoration3.setColorTitleFont(ContextCompat.getColor(this, i2));
        }
        int iApplyDimension = (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics());
        float fApplyDimension = TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics());
        SuspensionDecoration suspensionDecoration4 = this.mDecoration;
        if (suspensionDecoration4 != null) {
            suspensionDecoration4.setmTitleHeight(iApplyDimension);
        }
        SuspensionDecoration suspensionDecoration5 = this.mDecoration;
        if (suspensionDecoration5 == null) {
            return;
        }
        suspensionDecoration5.setTitleFontSize(fApplyDimension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(String msg) {
        AlertDialogFragment alertDialogFragment;
        AlertDialogFragment.Builder neutralButton;
        boolean z = false;
        if (this.failedDialog == null) {
            AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
            this.builder = builder;
            AlertDialogFragment.Builder cancelable = builder.setCancelable(false);
            AlertDialogFragment alertDialogFragmentCreate = null;
            if (cancelable != null && (neutralButton = cancelable.setNeutralButton(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: bx8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    WorldClockAddActivity.E(dialogInterface, i);
                }
            })) != null) {
                alertDialogFragmentCreate = neutralButton.create();
            }
            this.failedDialog = alertDialogFragmentCreate;
        }
        AlertDialogFragment.Builder builder2 = this.builder;
        if (builder2 != null) {
            builder2.setMessage(msg);
        }
        AlertDialogFragment alertDialogFragment2 = this.failedDialog;
        if (alertDialogFragment2 != null && !alertDialogFragment2.isShowing()) {
            z = true;
        }
        if (!z || (alertDialogFragment = this.failedDialog) == null) {
            return;
        }
        alertDialogFragment.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private final void h(WorldClockCityBean bean) {
        getViewModel().addNewWorldClock(bean, new AddWorldClockCallback() { // from class: com.huami.worldclock.add.WorldClockAddActivity$addWorldClockCityToServer$1
            @Override // com.huami.worldclock.add.AddWorldClockCallback
            public void onAddable(@NotNull WorldClockBean bean2) {
                WorldClockAddActivity worldClockAddActivity = this.a;
                Intent intent = new Intent();
                intent.putExtra(WorldClockAddActivity.CHOOSECITY, bean2);
                Unit unit = Unit.INSTANCE;
                worldClockAddActivity.setResult(102, intent);
                this.a.finish();
            }

            @Override // com.huami.worldclock.add.AddWorldClockCallback
            public void onDuplicateData() {
                this.a.finish();
            }

            @Override // com.huami.worldclock.add.AddWorldClockCallback
            public void onExceedLimit() {
                WorldClockAddActivity worldClockAddActivity = this.a;
                worldClockAddActivity.D(worldClockAddActivity.getString(R.string.world_clock_support_limit));
            }
        });
    }

    private final void i() {
        AppType appType = this.appType;
        AppType appType2 = AppType.MIDONG;
        if (appType == appType2) {
            setTheme(R.style.Theme_App_Zepp);
        }
        StatusBarCompat.setColor(this, this.appType == appType2 ? ContextCompat.getColor(this, R.color.s38) : ContextCompat.getColor(this, R.color.cl_ffedeff0));
        StatusBarCompat.setMode(this, (getResources().getConfiguration().uiMode & 48) == 16);
    }

    private final void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        n().setLayoutManager(linearLayoutManager);
        AdapterWorldCity adapterWorldCity = new AdapterWorldCity();
        this.mAdapter = adapterWorldCity;
        adapterWorldCity.setListener(new View.OnClickListener() { // from class: dx8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WorldClockAddActivity.y(this.a, view);
            }
        });
        AdapterWorldCity adapterWorldCity2 = this.mAdapter;
        if (adapterWorldCity2 == null) {
            adapterWorldCity2 = null;
        }
        adapterWorldCity2.setAppType(this.appType);
        RecyclerView recyclerViewN = n();
        AdapterWorldCity adapterWorldCity3 = this.mAdapter;
        recyclerViewN.setAdapter(adapterWorldCity3 != null ? adapterWorldCity3 : null);
        this.mDecoration = new SuspensionDecoration(this, CollectionsKt__CollectionsKt.emptyList(), ContextCompat.getColor(this, R.color.s4), DensityUtils.INSTANCE.dip2px(this, 1.0f));
        n().addItemDecoration(this.mDecoration);
        n().addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huami.worldclock.add.WorldClockAddActivity.initRecyclerView.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
                View view;
                super.onScrolled(recyclerView, dx, dy);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition());
                if (viewHolderFindViewHolderForLayoutPosition == null || (view = viewHolderFindViewHolderForLayoutPosition.itemView) == null) {
                    return;
                }
                IndexBar indexBarM = WorldClockAddActivity.this.m();
                Object tag = view.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.worldclock.bean.WorldClockCityBean");
                IndexBar.setSelectIndex$default(indexBarM, ((WorldClockCityBean) tag).getBaseIndexTag(), false, 2, null);
            }
        });
    }

    private final void initView() {
        initRecyclerView();
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(String searchKey) {
        List<WorldClockCityBean> list = this.allSupportTimeZone;
        if (list == null) {
            return;
        }
        ArrayList<WorldClockCityBean> arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (true) {
            boolean zMatches = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Resources resources = getResources();
            String city = ((WorldClockCityBean) next).getCity();
            Locale locale = Locale.ENGLISH;
            Objects.requireNonNull(city, "null cannot be cast to non-null type java.lang.String");
            try {
                zMatches = Pattern.compile(".*" + searchKey + ".*", 2).matcher(getString(resources.getIdentifier(Intrinsics.stringPlus("city_", city.toLowerCase(locale)), "string", getPackageName()))).matches();
            } catch (Exception e2) {
                HMLog.info(o, new b(e2, searchKey));
            }
            if (zMatches) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (WorldClockCityBean worldClockCityBean : arrayList) {
            worldClockCityBean.setVisibleSuspension(A() ? TextUtils.isEmpty(searchKey) : false);
            arrayList2.add(worldClockCityBean);
        }
        List<WorldClockCityBean> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        if (mutableList == null) {
            return;
        }
        q().setVisibility((!mutableList.isEmpty() || TextUtils.isEmpty(searchKey)) ? 8 : 0);
        if (A()) {
            m().setVisibility(TextUtils.isEmpty(searchKey) ? 0 : 8);
        }
        if (m().getVisibility() == 0) {
            m().setSourceData(mutableList);
        }
        AdapterWorldCity adapterWorldCity = this.mAdapter;
        if (adapterWorldCity == null) {
            adapterWorldCity = null;
        }
        adapterWorldCity.setCitys(mutableList);
        SuspensionDecoration suspensionDecoration = this.mDecoration;
        if (suspensionDecoration == null) {
            return;
        }
        suspensionDecoration.setData(mutableList);
    }

    private final TextView k() {
        return (TextView) this.cancel.getValue();
    }

    private final int l() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i != 1) {
            return i != 2 ? R.layout.activity_world_clock_add : R.layout.activity_world_clock_add_mi;
        }
        return R.layout.activity_world_clock_add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IndexBar m() {
        return (IndexBar) this.indexBar.getValue();
    }

    private final RecyclerView n() {
        return (RecyclerView) this.recyclerView.getValue();
    }

    private final ClearEditText o() {
        return (ClearEditText) this.searchEditText.getValue();
    }

    private final void p(List<WorldClockCityBean> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (WorldClockCityBean worldClockCityBean : list) {
            Resources resources = getResources();
            String city = worldClockCityBean.getCity();
            Locale locale = Locale.ENGLISH;
            Objects.requireNonNull(city, "null cannot be cast to non-null type java.lang.String");
            String string = getString(resources.getIdentifier(Intrinsics.stringPlus("city_", city.toLowerCase(locale)), "string", getPackageName()));
            worldClockCityBean.setBaseAlphabeticString(string);
            worldClockCityBean.setCityLocal(string);
            if (!A()) {
                worldClockCityBean.setVisibleSuspension(false);
            }
            arrayList.add(worldClockCityBean);
        }
        List<WorldClockCityBean> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        m().setSourceData(mutableList).invalidate();
        AdapterWorldCity adapterWorldCity = this.mAdapter;
        if (adapterWorldCity == null) {
            adapterWorldCity = null;
        }
        adapterWorldCity.setCitys(mutableList);
        SuspensionDecoration suspensionDecoration = this.mDecoration;
        if (suspensionDecoration == null) {
            return;
        }
        suspensionDecoration.setData(mutableList);
    }

    private final TextView q() {
        return (TextView) this.tvSearchEmpty.getValue();
    }

    private final TextView r() {
        return (TextView) this.tvSideBarHint.getValue();
    }

    private final void s() {
        k().setOnClickListener(new View.OnClickListener() { // from class: cx8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WorldClockAddActivity.t(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(WorldClockAddActivity worldClockAddActivity, View view) {
        worldClockAddActivity.finish();
    }

    private final void u(AppType appType) {
        int i;
        m().setVisibility(A() ? 0 : 8);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[appType.ordinal()];
        int i3 = (i2 == 1 || i2 != 2) ? R.color.p4 : R.color.cl_FF9C2C;
        int i4 = iArr[appType.ordinal()];
        if (i4 != 1) {
            i = i4 != 2 ? R.color.cl_80000000 : R.color.cl_ff999999;
        } else {
            i = R.color.s2;
        }
        m().setSelectBgPaint(ContextCompat.getColor(this, i3));
        m().setNormalPaintColor(ContextCompat.getColor(this, i));
        int i5 = iArr[appType.ordinal()];
        TextView textViewR = (i5 == 1 || i5 != 2) ? r() : null;
        IndexBar needRealIndex = m().setPressedShowTextView(textViewR).setNeedRealIndex(false);
        RecyclerView.LayoutManager layoutManager = n().getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        needRealIndex.setLayoutManager((LinearLayoutManager) layoutManager);
    }

    private final void v() {
        getViewModel().getAppType().observe(this, new Observer() { // from class: ex8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WorldClockAddActivity.w(this.a, (AppType) obj);
            }
        });
        getViewModel().getWorldClockCity().observe(this, new Observer() { // from class: fx8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WorldClockAddActivity.x(this.a, (List) obj);
            }
        });
        getViewModel().setAppType(this.appType);
        getViewModel().getSupportTimeZones(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(WorldClockAddActivity worldClockAddActivity, AppType appType) {
        worldClockAddActivity.u(appType);
        worldClockAddActivity.C(appType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(WorldClockAddActivity worldClockAddActivity, List list) {
        worldClockAddActivity.allSupportTimeZone = list;
        worldClockAddActivity.p(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(WorldClockAddActivity worldClockAddActivity, View view) {
        if (view.getTag() instanceof WorldClockCityBean) {
            InputUtils inputUtils = InputUtils.INSTANCE;
            if (inputUtils.isKeyboardShown(view)) {
                inputUtils.dismissKeyboard(worldClockAddActivity, view.getWindowToken());
            }
            Object tag = view.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.worldclock.bean.WorldClockCityBean");
            worldClockAddActivity.h((WorldClockCityBean) tag);
        }
    }

    private final void z() {
        o().setMTextWatcher(new TextWatcher() { // from class: com.huami.worldclock.add.WorldClockAddActivity$initSearchEditText$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                if (s == null) {
                    return;
                }
                this.a.j(s.toString());
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final AppType getAppType() {
        return this.appType;
    }

    @NotNull
    public final WorldClockAddViewModel getViewModel() {
        return (WorldClockAddViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        i();
        setContentView(l());
        B();
        initView();
        s();
        v();
    }

    public final void setAppType(@NotNull AppType appType) {
        this.appType = appType;
    }
}
