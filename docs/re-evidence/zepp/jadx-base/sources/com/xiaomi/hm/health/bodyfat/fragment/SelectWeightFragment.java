package com.xiaomi.hm.health.bodyfat.fragment;

import android.content.DialogInterface;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.Constant;
import com.huami.widget.wheelview.OnWheelChangedListener;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.fragment.SelectWeightFragment;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.netty.util.internal.StringUtil;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u0000 ;2\u00020\u0001:\u0001;B#\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0006\u0010\u000e\u001a\u00020\u0002R\u0019\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010!R+\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R+\u00101\u001a\u00020#2\u0006\u0010$\u001a\u00020#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010&\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R+\u00103\u001a\u00020#2\u0006\u0010$\u001a\u00020#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010&\u001a\u0004\b,\u0010(\"\u0004\b2\u0010*R+\u00107\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b%\u00104\"\u0004\b5\u00106R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006<"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/SelectWeightFragment;", "", "", hl.k, "", "l", "t", "f", "e", "Lcom/huami/widget/wheelview/adapters/PickAdapter;", "m", "", GoogleApiAvailabilityLight.b, "o", "showWeightSelectDialog", "Landroidx/fragment/app/FragmentActivity;", "a", "Landroidx/fragment/app/FragmentActivity;", "getMContext", "()Landroidx/fragment/app/FragmentActivity;", "mContext", "b", "F", "mUserWeightKg", "Lcom/xiaomi/hm/health/bodyfat/fragment/IOnWeightSelectListener;", "c", "Lcom/xiaomi/hm/health/bodyfat/fragment/IOnWeightSelectListener;", "iOnWeightSelectListener", "Lcom/huami/widget/wheelview/WheelView;", GoogleApiAvailabilityLight.a, "Lcom/huami/widget/wheelview/WheelView;", "mWeightIntWheel", "mWeightDecimalWheel", "Lcom/huami/widget/wheelview/adapters/PickAdapter;", "mDecimalAdapter", "", "<set-?>", "g", "Lkotlin/properties/ReadWriteProperty;", z.j, "()I", SOAP.XMLNS, "(I)V", "mUnit", "h", "Ljava/lang/String;", "mUnitStr", "i", "r", "mMin", DTransferConstants.SEARCH_KEY, "mMax", "()F", com.google.android.exoplayer2.text.ttml.b.r, "(F)V", "mConvertWeight", "mWeightKg", "<init>", "(Landroidx/fragment/app/FragmentActivity;FLcom/xiaomi/hm/health/bodyfat/fragment/IOnWeightSelectListener;)V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class SelectWeightFragment {

    @NotNull
    private static final String n = "SelectWeightFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FragmentActivity mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float mUserWeightKg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final IOnWeightSelectListener iOnWeightSelectListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private WheelView mWeightIntWheel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private WheelView mWeightDecimalWheel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private PickAdapter mDecimalAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty mUnit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String mUnitStr;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty mMin;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty mMax;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty mConvertWeight;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float mWeightKg;
    public static final /* synthetic */ KProperty<Object>[] m = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SelectWeightFragment.class), "mUnit", "getMUnit()I")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SelectWeightFragment.class), "mMin", "getMMin()I")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SelectWeightFragment.class), "mMax", "getMMax()I")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SelectWeightFragment.class), "mConvertWeight", "getMConvertWeight()F"))};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append(" < max weight :");
            sb.append(SelectWeightFragment.this.h());
            sb.append(", unit is ");
            String str = SelectWeightFragment.this.mUnitStr;
            Objects.requireNonNull(str);
            sb.append(str);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "raw data: " + SelectWeightFragment.this.mWeightKg + ", convert to unit value:" + SelectWeightFragment.this.g();
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
            return "weight >= max";
        }
    }

    public SelectWeightFragment(@NotNull FragmentActivity fragmentActivity, float f, @Nullable IOnWeightSelectListener iOnWeightSelectListener) {
        this.mContext = fragmentActivity;
        this.mUserWeightKg = f;
        this.iOnWeightSelectListener = iOnWeightSelectListener;
        Delegates delegates = Delegates.INSTANCE;
        this.mUnit = delegates.notNull();
        this.mMin = delegates.notNull();
        this.mMax = delegates.notNull();
        this.mConvertWeight = delegates.notNull();
        this.mWeightKg = 60.0f;
    }

    private final void e() {
        int i = j() == 17 ? 13 : 9;
        FragmentActivity fragmentActivity = this.mContext;
        WheelView wheelView = this.mWeightDecimalWheel;
        Objects.requireNonNull(wheelView);
        this.mDecimalAdapter = new PickAdapter(fragmentActivity, 0, i, wheelView, ContextCompat.getColor(fragmentActivity, Constant.CENTER_TEXT_COLOR), ContextCompat.getColor(this.mContext, Constant.SECOND_TEXT_COLOR), ContextCompat.getColor(this.mContext, Constant.THIRD_TEXT_COLOR), false, 46, 20, 18, 16, 1, 0);
        if (j() == 17) {
            PickAdapter pickAdapter = this.mDecimalAdapter;
            Objects.requireNonNull(pickAdapter);
            pickAdapter.setMode(25);
        } else {
            PickAdapter pickAdapter2 = this.mDecimalAdapter;
            Objects.requireNonNull(pickAdapter2);
            pickAdapter2.setMode(19);
        }
        if ((j() != 1 || g() >= h() + 1) && g() >= h()) {
            HMLog.debug(n, c.a);
            WheelView wheelView2 = this.mWeightDecimalWheel;
            Objects.requireNonNull(wheelView2);
            wheelView2.setViewAdapter(m()).setCurrentItem(0);
            return;
        }
        HMLog.info(n, new a());
        int iScaleFloat = ((int) (HMWeightUtils.scaleFloat(g(), 1) * 10)) - (((int) g()) * 10);
        if (j() == 17) {
            iScaleFloat = ((int) (HMWeightUtils.convertFromKg(this.mWeightKg, 1) + 0.5f)) % 14;
        }
        WheelView wheelView3 = this.mWeightDecimalWheel;
        Objects.requireNonNull(wheelView3);
        PickAdapter pickAdapter3 = this.mDecimalAdapter;
        Objects.requireNonNull(pickAdapter3);
        wheelView3.setViewAdapter(pickAdapter3).setCurrentItem(iScaleFloat);
        HMLog.debug(n, new b());
    }

    private final void f() {
        FragmentActivity fragmentActivity = this.mContext;
        int i = i();
        int iH = h();
        WheelView wheelView = this.mWeightIntWheel;
        Objects.requireNonNull(wheelView);
        PickAdapter pickAdapter = new PickAdapter(fragmentActivity, i, iH, wheelView, ContextCompat.getColor(this.mContext, Constant.CENTER_TEXT_COLOR), ContextCompat.getColor(this.mContext, Constant.SECOND_TEXT_COLOR), ContextCompat.getColor(this.mContext, Constant.THIRD_TEXT_COLOR), false, 46, 20, 18, 16, 1, 0);
        WheelView wheelView2 = this.mWeightIntWheel;
        Objects.requireNonNull(wheelView2);
        wheelView2.setViewAdapter(pickAdapter);
        int iG = ((int) g()) - i();
        WheelView wheelView3 = this.mWeightIntWheel;
        Objects.requireNonNull(wheelView3);
        wheelView3.setCurrentItem(iG);
        WheelView wheelView4 = this.mWeightIntWheel;
        Objects.requireNonNull(wheelView4);
        wheelView4.addScrollingListener(new OnWheelScrollListener() { // from class: com.xiaomi.hm.health.bodyfat.fragment.SelectWeightFragment$decorateWeightIntWheel$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ WheelView a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(WheelView wheelView) {
                    super(0);
                    this.a = wheelView;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("item ", Integer.valueOf(this.a.getCurrentItem()));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return " should refresh when max";
                }
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingFinished(@NotNull WheelView wheel) {
                HMLog.debug("SelectWeightFragment", new a(wheel));
                if (wheel.getCurrentItem() == this.a.h() - this.a.i()) {
                    HMLog.debug("SelectWeightFragment", b.a);
                    WheelView wheelView5 = this.a.mWeightDecimalWheel;
                    Objects.requireNonNull(wheelView5);
                    wheelView5.setViewAdapter(this.a.m()).setCurrentItem(0);
                    return;
                }
                WheelView wheelView6 = this.a.mWeightDecimalWheel;
                Objects.requireNonNull(wheelView6);
                PickAdapter pickAdapter2 = this.a.mDecimalAdapter;
                Objects.requireNonNull(pickAdapter2);
                wheelView6.setViewAdapter(pickAdapter2);
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingStarted(@NotNull WheelView wheel) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float g() {
        return ((Number) this.mConvertWeight.getValue(this, m[3])).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int h() {
        return ((Number) this.mMax.getValue(this, m[2])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i() {
        return ((Number) this.mMin.getValue(this, m[1])).intValue();
    }

    private final int j() {
        return ((Number) this.mUnit.getValue(this, m[0])).intValue();
    }

    private final void k() {
        s(BFCallback.getUnitManager().getWeightUnit());
        this.mUnitStr = HMWeightUtils.toUnitStr(this.mContext.getApplicationContext(), j());
        r((int) HMWeightUtils.convertFromKg(3.0f, j()));
        float fL = l();
        this.mWeightKg = fL;
        p(HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(fL, j()), 1));
        q((int) HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(635.0f, j()), 1));
    }

    private final float l() {
        float weight = this.mUserWeightKg;
        if (weight < 0.0f) {
            HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
            weight = userInfo.getWeight() < 0.0f ? 60.0f : userInfo.getWeight();
        }
        if (weight < 3.0f) {
            weight = 3.0f;
        }
        if (weight > 635.0f) {
            return 635.0f;
        }
        return weight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PickAdapter m() {
        FragmentActivity fragmentActivity = this.mContext;
        int i = j() == 1 ? 9 : 0;
        WheelView wheelView = this.mWeightDecimalWheel;
        Objects.requireNonNull(wheelView);
        PickAdapter pickAdapter = new PickAdapter(fragmentActivity, 0, i, wheelView, ContextCompat.getColor(this.mContext, Constant.CENTER_TEXT_COLOR), ContextCompat.getColor(this.mContext, Constant.SECOND_TEXT_COLOR), ContextCompat.getColor(this.mContext, Constant.THIRD_TEXT_COLOR), false, 46, 20, 18, 16, 1);
        if (j() == 17) {
            pickAdapter.setMode(25);
        } else {
            pickAdapter.setMode(19);
        }
        return pickAdapter;
    }

    private final String n() {
        if (j() == 17) {
            StringBuilder sb = new StringBuilder();
            WheelView wheelView = this.mWeightIntWheel;
            Objects.requireNonNull(wheelView);
            sb.append(wheelView.getCurrentItem() + i());
            sb.append(JsonLexerKt.COLON);
            WheelView wheelView2 = this.mWeightDecimalWheel;
            Objects.requireNonNull(wheelView2);
            sb.append(wheelView2.getCurrentItem());
            sb.append(StringUtil.SPACE);
            String str = this.mUnitStr;
            Objects.requireNonNull(str);
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        WheelView wheelView3 = this.mWeightIntWheel;
        Objects.requireNonNull(wheelView3);
        sb2.append(wheelView3.getCurrentItem() + i());
        sb2.append('.');
        WheelView wheelView4 = this.mWeightDecimalWheel;
        Objects.requireNonNull(wheelView4);
        sb2.append(wheelView4.getCurrentItem());
        sb2.append(StringUtil.SPACE);
        String str2 = this.mUnitStr;
        Objects.requireNonNull(str2);
        sb2.append(str2);
        return sb2.toString();
    }

    private final void o() {
        float currentItem;
        float fI;
        if (j() == 17) {
            WheelView wheelView = this.mWeightIntWheel;
            Objects.requireNonNull(wheelView);
            currentItem = wheelView.getCurrentItem();
            WheelView wheelView2 = this.mWeightDecimalWheel;
            Objects.requireNonNull(wheelView2);
            fI = (wheelView2.getCurrentItem() * 1.0f) / 14;
        } else {
            WheelView wheelView3 = this.mWeightIntWheel;
            Objects.requireNonNull(wheelView3);
            float currentItem2 = wheelView3.getCurrentItem();
            WheelView wheelView4 = this.mWeightDecimalWheel;
            Objects.requireNonNull(wheelView4);
            currentItem = currentItem2 + (wheelView4.getCurrentItem() / 10);
            fI = i();
        }
        float fConvertToKg = HMWeightUtils.convertToKg(currentItem + fI, BFCallback.getUnitManager().getWeightUnit());
        IOnWeightSelectListener iOnWeightSelectListener = this.iOnWeightSelectListener;
        if (iOnWeightSelectListener == null) {
            return;
        }
        iOnWeightSelectListener.onWeightSelect(fConvertToKg);
    }

    private final void p(float f) {
        this.mConvertWeight.setValue(this, m[3], Float.valueOf(f));
    }

    private final void q(int i) {
        this.mMax.setValue(this, m[2], Integer.valueOf(i));
    }

    private final void r(int i) {
        this.mMin.setValue(this, m[1], Integer.valueOf(i));
    }

    private final void s(int i) {
        this.mUnit.setValue(this, m[0], Integer.valueOf(i));
    }

    private final void t() {
        this.mWeightIntWheel = new WheelView(this.mContext);
        f();
        this.mWeightDecimalWheel = new WheelView(this.mContext);
        e();
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        linearLayout.setOrientation(0);
        linearLayout.setMinimumHeight((int) getMContext().getResources().getDimension(R.dimen.item_height));
        linearLayout.measure(-1, (int) getMContext().getResources().getDimension(R.dimen.wheel_hight));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        WheelView wheelView = this.mWeightIntWheel;
        Objects.requireNonNull(wheelView);
        linearLayout.addView(wheelView, layoutParams);
        WheelView wheelView2 = this.mWeightDecimalWheel;
        Objects.requireNonNull(wheelView2);
        linearLayout.addView(wheelView2, layoutParams);
        final AlertDialogFragment alertDialogFragmentShow = new AlertDialogFragment.Builder(this.mContext).setTitle(n()).setContentView(linearLayout).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: ym6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SelectWeightFragment.u(this.a, dialogInterface, i);
            }
        }).setPositiveButton(R.string.save, new DialogInterface.OnClickListener() { // from class: xm6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SelectWeightFragment.v(this.a, dialogInterface, i);
            }
        }).show(this.mContext.getSupportFragmentManager());
        WheelView wheelView3 = this.mWeightIntWheel;
        Objects.requireNonNull(wheelView3);
        wheelView3.addChangingListener(new OnWheelChangedListener() { // from class: zm6
            @Override // com.huami.widget.wheelview.OnWheelChangedListener
            public final void onChanged(WheelView wheelView4, int i, int i2) {
                SelectWeightFragment.w(alertDialogFragmentShow, this, wheelView4, i, i2);
            }
        });
        WheelView wheelView4 = this.mWeightDecimalWheel;
        Objects.requireNonNull(wheelView4);
        wheelView4.addChangingListener(new OnWheelChangedListener() { // from class: an6
            @Override // com.huami.widget.wheelview.OnWheelChangedListener
            public final void onChanged(WheelView wheelView5, int i, int i2) {
                SelectWeightFragment.x(alertDialogFragmentShow, this, wheelView5, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(SelectWeightFragment selectWeightFragment, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        IOnWeightSelectListener iOnWeightSelectListener = selectWeightFragment.iOnWeightSelectListener;
        if (iOnWeightSelectListener == null) {
            return;
        }
        iOnWeightSelectListener.onWeightSelectCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SelectWeightFragment selectWeightFragment, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        selectWeightFragment.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(AlertDialogFragment alertDialogFragment, SelectWeightFragment selectWeightFragment, WheelView wheelView, int i, int i2) {
        alertDialogFragment.updateTitle(selectWeightFragment.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(AlertDialogFragment alertDialogFragment, SelectWeightFragment selectWeightFragment, WheelView wheelView, int i, int i2) {
        alertDialogFragment.updateTitle(selectWeightFragment.n());
    }

    @NotNull
    public final FragmentActivity getMContext() {
        return this.mContext;
    }

    public final void showWeightSelectDialog() {
        k();
        t();
    }

    public /* synthetic */ SelectWeightFragment(FragmentActivity fragmentActivity, float f, IOnWeightSelectListener iOnWeightSelectListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, (i & 2) != 0 ? -1.0f : f, iOnWeightSelectListener);
    }
}
