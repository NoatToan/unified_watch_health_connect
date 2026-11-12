package com.huami.watchfacesstore.ui.store.detail;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.databinding.WfActivityLargeWatchFaceBinding;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ui.base.BaseActivity;
import com.huami.watchfacesstore.ui.store.detail.LargeWatchFaceActivity;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000e\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/watchfacesstore/ui/store/detail/LargeWatchFaceActivity;", "Lcom/huami/watchfacesstore/ui/base/BaseActivity;", "", z.j, "initView", "Landroidx/viewbinding/ViewBinding;", "getBinding", "finish", "", "g", "Ljava/lang/String;", "mDeviceImage", "h", "mWatchFaceImage", "i", "mTransImage", "", LogUtil.I, "mTransColor", "Lcom/huami/watchfacesstore/databinding/WfActivityLargeWatchFaceBinding;", hl.k, "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "()Lcom/huami/watchfacesstore/databinding/WfActivityLargeWatchFaceBinding;", "mBinding", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "l", "Lkotlin/Lazy;", "()Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "mDeviceConfigManager", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class LargeWatchFaceActivity extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] m;

    @NotNull
    private static final String n = "device_image";

    @NotNull
    private static final String o = "watch_face_image";

    @NotNull
    private static final String p = "trans_image";

    @NotNull
    private static final String q = "trans_color";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private String mDeviceImage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String mWatchFaceImage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private String mTransImage;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mTransColor = -1;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty mBinding = ActivityViewBindingsKt.viewBinding(new LargeWatchFaceActivity$special$$inlined$viewBinding$1(new InflateViewBinder(WfActivityLargeWatchFaceBinding.class)));

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceConfigManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/detail/LargeWatchFaceActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "deviceImage", "watchFaceImage", "transparentImage", "", "color", "", "actionStart", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "DEVICE_IMAGE", "Ljava/lang/String;", "TRANSPARENT_COLOR", "TRANSPARENT_IMAGE", "WATCH_FACE_IMAGE", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void actionStart(@NotNull Context context, @Nullable String deviceImage, @Nullable String watchFaceImage, @Nullable String transparentImage, @Nullable Integer color) {
            context.startActivity(new Intent(context, (Class<?>) LargeWatchFaceActivity.class).putExtra(LargeWatchFaceActivity.n, deviceImage).putExtra(LargeWatchFaceActivity.o, watchFaceImage).putExtra(LargeWatchFaceActivity.p, transparentImage).putExtra(LargeWatchFaceActivity.q, color));
            ((Activity) context).overridePendingTransition(R.anim.scale_in, R.anim.scale_out);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LargeWatchFaceActivity.class), "mBinding", "getMBinding()Lcom/huami/watchfacesstore/databinding/WfActivityLargeWatchFaceBinding;"));
        m = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LargeWatchFaceActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mDeviceConfigManager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceConfigManager>() { // from class: com.huami.watchfacesstore.ui.store.detail.LargeWatchFaceActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.watchfacesstore.device.DeviceConfigManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceConfigManager invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceConfigManager.class), qualifier, objArr);
            }
        });
    }

    private final WfActivityLargeWatchFaceBinding h() {
        return (WfActivityLargeWatchFaceBinding) this.mBinding.getValue(this, m[0]);
    }

    private final DeviceConfigManager i() {
        return (DeviceConfigManager) this.mDeviceConfigManager.getValue();
    }

    private final void j() {
        i().setBigImageParamsByDevice(h().ivWatchFace);
        i().setBigImageParamsByDevice(h().ivWatchFaceTransparent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(LargeWatchFaceActivity largeWatchFaceActivity, View view) {
        largeWatchFaceActivity.finishAfterTransition();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.scale_in_disappear, R.anim.scale_out_disappear);
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    @NotNull
    public ViewBinding getBinding() {
        return h();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    public void initView() {
        StatusBarUtil.setStatusBarColor(this, ContextCompat.getColor(this, R.color.wf_home_background_color));
        j();
        Intent intent = getIntent();
        if (intent != null) {
            this.mDeviceImage = intent.getStringExtra(n);
            this.mWatchFaceImage = intent.getStringExtra(o);
            this.mTransImage = intent.getStringExtra(p);
            this.mTransColor = intent.getIntExtra(q, -1);
        }
        h().ivWatch.setImageResource(i().getCurrentDeviceConfig().getDefaultLargeDeviceImage());
        ExtensionsKt.loadUrl(h().ivWatch, this.mDeviceImage);
        ExtensionsKt.loadWithRadius(h().ivWatchFace, this.mWatchFaceImage, i().getCurrentDeviceConfig().getRadiusTwo());
        if (this.mTransImage != null) {
            ExtensionsKt.loadUrlAndHintColor(h().ivWatchFaceTransparent, this.mTransImage, Integer.valueOf(this.mTransColor));
        }
        h().largeContainer.setOnClickListener(new View.OnClickListener() { // from class: tl4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LargeWatchFaceActivity.k(this.a, view);
            }
        });
    }
}
