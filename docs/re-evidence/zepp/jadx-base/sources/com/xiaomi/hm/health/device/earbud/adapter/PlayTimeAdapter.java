package com.xiaomi.hm.health.device.earbud.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000223B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b0\u00101J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0016J$\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001e\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0006\u0010\u0018\u001a\u00020\u0003R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001d\u0010*R\u001d\u0010/\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b \u0010.¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/adapter/PlayTimeAdapter;", "Lcom/huami/widget/wheelview/adapters/WheelViewAdapter;", "Lorg/koin/core/component/KoinComponent;", "", "minute", "", "a", "getItemsCount", "index", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getItem", "getEmptyItem", "Landroid/database/DataSetObserver;", "observer", "", "registerDataSetObserver", "unregisterDataSetObserver", "", "isNeedLoop", "getInitLoopBase", "getBASE_BUNDLE", "getCurrentValue", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/widget/wheelview/WheelView;", "b", "Lcom/huami/widget/wheelview/WheelView;", "mWheelView", "c", LogUtil.I, "mBaseBundle", "", GoogleApiAvailabilityLight.a, "F", "mItemHeight", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "e", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Landroid/view/LayoutInflater;", "f", "()Landroid/view/LayoutInflater;", "mInflater", "<init>", "(Landroid/content/Context;Lcom/huami/widget/wheelview/WheelView;)V", "Companion", "ViewHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PlayTimeAdapter implements WheelViewAdapter, KoinComponent {

    @NotNull
    private static final String g = "PlayTimeAdapter";
    private static final float h = 20.0f;
    private static final float i = 20.0f;
    private static final int l = 0;
    private static final int m;
    private static final int n;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WheelView mWheelView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mBaseBundle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float mItemHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mInflater;
    private static final int j = Color.parseColor("#ffff5353");
    private static final int k = Color.parseColor("#4d000000");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/adapter/PlayTimeAdapter$ViewHolder;", "", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getContent$devicex_zeppRelease", "()Landroid/widget/TextView;", "setContent$devicex_zeppRelease", "(Landroid/widget/TextView;)V", "content", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private TextView content;

        @Nullable
        /* JADX INFO: renamed from: getContent$devicex_zeppRelease, reason: from getter */
        public final TextView getContent() {
            return this.content;
        }

        public final void setContent$devicex_zeppRelease(@Nullable TextView textView) {
            this.content = textView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, int i3) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "index = " + this.a + ", realCurIndex =" + this.b + ", pos=" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LayoutInflater> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke() {
            return LayoutInflater.from(PlayTimeAdapter.this.context);
        }
    }

    static {
        m = DeviceXFunctionsKt.getBuildConfigApi().isSupportChopinSetTestTime() ? 240 : 16;
        n = DeviceXFunctionsKt.getBuildConfigApi().isSupportChopinSetTestTime() ? 1 : 15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayTimeAdapter(@NotNull Context context, @NotNull WheelView wheelView) {
        this.context = context;
        this.mWheelView = wheelView;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.earbud.adapter.PlayTimeAdapter$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        this.mInflater = LazyKt__LazyJVMKt.lazy(new b());
        this.mItemHeight = TypedValue.applyDimension(1, 46.0f, context.getResources().getDisplayMetrics());
        this.mBaseBundle = m + 0 + 1;
    }

    private final String a(int minute) {
        return minute <= 0 ? this.context.getString(R.string.earbud_play_time_no_limit) : b().formatMinute(minute);
    }

    private final DeviceUtilsApi b() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final LayoutInflater c() {
        return (LayoutInflater) this.mInflater.getValue();
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    /* JADX INFO: renamed from: getBASE_BUNDLE, reason: from getter */
    public int getMBaseBundle() {
        return this.mBaseBundle;
    }

    public final int getCurrentValue() {
        return (this.mWheelView.getCurrentItem() + 0) * n;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    @Nullable
    public View getEmptyItem(@Nullable View convertView, @Nullable ViewGroup parent) {
        return null;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    /* JADX INFO: renamed from: getInitLoopBase */
    public int getMInitLoopBase() {
        return 0;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    @NotNull
    public View getItem(int index, @Nullable View convertView, @Nullable ViewGroup parent) {
        RelativeLayout relativeLayout = convertView == null ? null : (RelativeLayout) convertView;
        int i2 = index % this.mBaseBundle;
        if (relativeLayout == null) {
            View viewInflate = c().inflate(R.layout.wheel_item_km, parent, false);
            Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
            relativeLayout = (RelativeLayout) viewInflate;
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.setContent$devicex_zeppRelease((TextView) relativeLayout.findViewById(R.id.content_txt));
            viewHolder.getContent().getLayoutParams().height = (int) this.mItemHeight;
            relativeLayout.setTag(viewHolder);
        }
        Object tag = relativeLayout.getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type com.xiaomi.hm.health.device.earbud.adapter.PlayTimeAdapter.ViewHolder");
        TextView content = ((ViewHolder) tag).getContent();
        String strA = a((i2 + 0) * n);
        int realCurrentItem = this.mWheelView.getRealCurrentItem();
        HMLog.debug(g, new a(index, realCurrentItem, i2));
        content.setText(strA);
        if (index == realCurrentItem) {
            content.setTextColor(j);
        } else {
            content.setTextColor(k);
        }
        content.setTextSize(20.0f);
        return relativeLayout;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getItemsCount() {
        return this.mBaseBundle;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    /* JADX INFO: renamed from: isNeedLoop */
    public boolean getMNeedLoop() {
        return false;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void registerDataSetObserver(@NotNull DataSetObserver observer) {
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void unregisterDataSetObserver(@NotNull DataSetObserver observer) {
    }
}
