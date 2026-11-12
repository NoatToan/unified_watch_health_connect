package com.xiaomi.hm.health.bodyfat.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.view.ViewUtils;
import com.huami.view.weightfigure.WeightFigureView;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.model.ScoreParamsObject;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.bodyfat.utils.WeightConstant;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u00106\u001a\u000202\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000307\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010@\u001a\u00020\u0007¢\u0006\u0004\bO\u0010PJ \u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J8\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J0\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J8\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J0\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J8\u0010\u0019\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J0\u0010\u001d\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J0\u0010\u001e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J0\u0010\u001f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010&\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0002J\u000e\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020'J\u0018\u0010-\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0007H\u0016J\b\u0010.\u001a\u00020\u0007H\u0016J\u0018\u00101\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0007H\u0016R\u0019\u00106\u001a\u0002028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\u001f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0003078\u0006@\u0006¢\u0006\f\n\u0004\b&\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010@\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010<\u001a\u0004\b?\u0010>R\u001c\u0010D\u001a\u00020\u001b8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010I\u001a\u00020E8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010HR\"\u0010K\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/adapter/BodyFatAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/bodyfat/adapter/BodyfatViewHolder;", "Lcom/xiaomi/hm/health/bodyfat/model/ScoreParamsObject;", "paramsObject", "Lcom/huami/view/weightfigure/WeightFigureView;", "paramsFigureV", "", "statusColor", "", "a", "mFigureView", "weightAge", "sex", "height", "", "bodyParamsStr", "f", "g", "weightKg", "e", "m", GoogleApiAvailabilityLight.b, z.j, "unit", "i", "weight", "", GoogleApiAvailabilityLight.a, "h", "l", hl.k, "index", "size", "", "c", "Landroid/widget/ImageView;", ViewHierarchyConstants.VIEW_KEY, "b", "", "isExpand", "setDefaultExpand", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "onBindViewHolder", "Landroid/content/Context;", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "ctx", "", "Ljava/util/List;", "getList", "()Ljava/util/List;", "list", LogUtil.I, "getStatusColor", "()I", "getScreenWidth", "screenWidth", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/view/LayoutInflater;", "Landroid/view/LayoutInflater;", "getInflater", "()Landroid/view/LayoutInflater;", "inflater", "Z", "isExpandDefault", "()Z", "setExpandDefault", "(Z)V", "<init>", "(Landroid/content/Context;Ljava/util/List;II)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyFatAdapter extends RecyclerView.Adapter<BodyfatViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context ctx;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<ScoreParamsObject> list;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int statusColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int screenWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "BodyFatAdapter";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LayoutInflater inflater;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isExpandDefault;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Float, String> {
        public a() {
            super(1);
        }

        @NotNull
        public final String a(float f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(Locale.getDefault(), "%,d%s", Arrays.copyOf(new Object[]{Integer.valueOf((int) f), BodyFatAdapter.this.getCtx().getResources().getString(R.string.kilo_cal)}, 2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Float f) {
            return a(f.floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Float, String> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @NotNull
        public final String a(float f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Float f) {
            return a(f.floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Float, String> {
        public c() {
            super(1);
        }

        @NotNull
        public final String a(float f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(Locale.getDefault(), "%.1f%s", Arrays.copyOf(new Object[]{Float.valueOf(f), BodyFatAdapter.this.getCtx().getResources().getString(R.string.percentage)}, 2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Float f) {
            return a(f.floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Float, String> {
        public d() {
            super(1);
        }

        @NotNull
        public final String a(float f) {
            return BodyFatAdapter.this.d(f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Float f) {
            return a(f.floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Float, String> {
        public e() {
            super(1);
        }

        @NotNull
        public final String a(float f) {
            return BodyFatAdapter.this.d(f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Float f) {
            return a(f.floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Float, String> {
        public f() {
            super(1);
        }

        @NotNull
        public final String a(float f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(Locale.getDefault(), "%.1f%s", Arrays.copyOf(new Object[]{Float.valueOf(f), BodyFatAdapter.this.getCtx().getResources().getString(R.string.percentage)}, 2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Float f) {
            return a(f.floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Float, String> {
        public g() {
            super(1);
        }

        @NotNull
        public final String a(float f) {
            return BodyFatAdapter.this.d(f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Float f) {
            return a(f.floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<Float, String> {
        public h() {
            super(1);
        }

        @NotNull
        public final String a(float f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(Locale.getDefault(), "%.1f%s", Arrays.copyOf(new Object[]{Float.valueOf(f), BodyFatAdapter.this.getCtx().getResources().getString(R.string.percentage)}, 2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Float f) {
            return a(f.floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<Float, String> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        @NotNull
        public final String a(float f) {
            return String.valueOf((int) f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Float f) {
            return a(f.floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<Float, String> {
        public j() {
            super(1);
        }

        @NotNull
        public final String a(float f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(Locale.getDefault(), "%.1f%s", Arrays.copyOf(new Object[]{Float.valueOf(f), BodyFatAdapter.this.getCtx().getResources().getString(R.string.percentage)}, 2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Float f) {
            return a(f.floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ ScoreParamsObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ScoreParamsObject scoreParamsObject) {
            super(1);
            this.a = scoreParamsObject;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            BFCallback.getInstance().startBodyIndexDetails(view.getContext(), this.a.getWfType());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BodyFatAdapter(@NotNull Context context, @NotNull List<? extends ScoreParamsObject> list, int i2, int i3) {
        this.ctx = context;
        this.list = list;
        this.statusColor = i2;
        this.screenWidth = i3;
        this.inflater = LayoutInflater.from(context);
    }

    private final void a(ScoreParamsObject paramsObject, WeightFigureView paramsFigureV, int statusColor) {
        paramsFigureV.setThumbDarkStyle(this.ctx);
        switch (paramsObject.getWfType()) {
            case 0:
                f(paramsFigureV, paramsObject.getAge(), paramsObject.getSex(), paramsObject.getHeight(), paramsObject.getWfValue(), statusColor);
                break;
            case 1:
                e(paramsFigureV, paramsObject.getSex(), paramsObject.getAge(), paramsObject.getWfValue(), paramsObject.getWeight(), statusColor);
                break;
            case 2:
                g(paramsFigureV, paramsObject.getSex(), paramsObject.getAge(), paramsObject.getWfValue(), statusColor);
                break;
            case 3:
                h(paramsFigureV, paramsObject.getSex(), paramsObject.getWfValue(), paramsObject.getWeight(), statusColor);
                break;
            case 4:
                m(paramsFigureV, paramsObject.getWfValue(), statusColor);
                break;
            case 5:
                n(paramsFigureV, paramsObject.getSex(), paramsObject.getAge(), paramsObject.getWfValue(), statusColor);
                break;
            case 6:
                i(paramsFigureV, paramsObject.getSex(), paramsObject.getUnit(), paramsObject.getHeight(), paramsObject.getWfValue(), statusColor);
                break;
            case 7:
                j(paramsFigureV, paramsObject.getAge(), paramsObject.getWfValue(), statusColor);
                break;
            case 10:
                l(paramsFigureV, paramsObject.getSex(), paramsObject.getAge(), paramsObject.getWfValue(), statusColor);
                break;
            case 11:
                k(paramsFigureV, paramsObject.getSex(), paramsObject.getAge(), paramsObject.getWfValue(), statusColor);
                break;
        }
    }

    private final void b(ScoreParamsObject paramsObject, ImageView view) {
        switch (paramsObject.getWfType()) {
            case 0:
                view.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.ctx, R.drawable.ic_bmi_24), ColorStateList.valueOf(this.statusColor)));
                break;
            case 1:
                view.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.ctx, R.drawable.ic_basal_metabolism_24), ColorStateList.valueOf(this.statusColor)));
                break;
            case 2:
                view.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.ctx, R.drawable.ic_body_fat_24), ColorStateList.valueOf(this.statusColor)));
                break;
            case 3:
                view.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.ctx, R.drawable.ic_bone_mass_24), ColorStateList.valueOf(this.statusColor)));
                break;
            case 4:
                view.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.ctx, R.drawable.ic_visceral_fat_24), ColorStateList.valueOf(this.statusColor)));
                break;
            case 5:
                view.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.ctx, R.drawable.ic_water_24), ColorStateList.valueOf(this.statusColor)));
                break;
            case 6:
                view.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.ctx, R.drawable.ic_muscle_mass_24), ColorStateList.valueOf(this.statusColor)));
                break;
            case 7:
                view.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.ctx, R.drawable.ic_protein_24), ColorStateList.valueOf(this.statusColor)));
                break;
            case 10:
                view.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.ctx, R.drawable.ic_sfp_24), ColorStateList.valueOf(this.statusColor)));
                break;
            case 11:
                view.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.ctx, R.drawable.ic_skeletal_muscle_24), ColorStateList.valueOf(this.statusColor)));
                break;
        }
    }

    private final int[] c(int index, int size, int statusColor) {
        int[] iArr = new int[size];
        if (size > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 == index) {
                    iArr[i2] = statusColor;
                } else {
                    iArr[i2] = ContextCompat.getColor(this.ctx, R.color.s3);
                }
                if (i3 >= size) {
                    break;
                }
                i2 = i3;
            }
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d(float weight) {
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        return HMWeightUtils.getWeightValueStringForDisplay(HMWeightUtils.convertToKg(weight, weightUnit), weightUnit);
    }

    private final void e(WeightFigureView mFigureView, int sex, int weightAge, float bodyParamsStr, float weightKg, int statusColor) {
        mFigureView.setLabelTextSize(12.0f);
        mFigureView.setScaleTextSize(11.0f);
        mFigureView.setScaleTextColor(ContextCompat.getColor(this.ctx, R.color.s2));
        mFigureView.setListener(new a());
        int bmrNormalValue = BodyParamsUtils.getBmrNormalValue(weightAge, sex, weightKg);
        String[] stringArray = this.ctx.getResources().getStringArray(R.array.brm_leval);
        int[] basalCalColor = HMWeightUtils.getBasalCalColor(this.ctx);
        int i2 = 0;
        float[] fArr = {10.0f, bmrNormalValue, 5000.0f};
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i2 != 2) {
                if ((bodyParamsStr >= fArr[i2] && bodyParamsStr < fArr[i4]) || (i2 == 0 && bodyParamsStr < fArr[i2])) {
                    break;
                }
            } else {
                i3 = i2 - 1;
            }
            if (i4 > 2) {
                i2 = i3;
                break;
            }
            i2 = i4;
        }
        if (!BFCallback.getInstance().enableMiDongFlavor()) {
            statusColor = basalCalColor[i2];
        }
        WeightFigureView.setValues$default(mFigureView, fArr, basalCalColor, stringArray, c(i2, 3, statusColor), false, 16, null);
        mFigureView.setInitValue(bodyParamsStr);
    }

    private final void f(WeightFigureView mFigureView, int weightAge, int sex, int height, float bodyParamsStr, int statusColor) {
        float[] fArr;
        int[] bmiColorForAdualt;
        String[] childBmiLables;
        mFigureView.setLabelTextSize(12.0f);
        mFigureView.setScaleTextSize(11.0f);
        mFigureView.setScaleTextColor(ContextCompat.getColor(this.ctx, R.color.s2));
        mFigureView.setListener(b.a);
        float fCalcuBMI = HMWeightUtils.calcuBMI(height, 3.0f);
        float fCalcuBMI2 = HMWeightUtils.calcuBMI(height, 120.0f);
        boolean zIsChineseLanguage = Utils.INSTANCE.isChineseLanguage();
        int i2 = 0;
        if (zIsChineseLanguage && weightAge >= 7 && weightAge < 18) {
            float[] childBmiSection = HMWeightUtils.getChildBmiSection(weightAge, sex);
            childBmiLables = BodyParamsUtils.getChildBmiLables(this.ctx);
            float[] fArr2 = {fCalcuBMI, childBmiSection[0], childBmiSection[1], fCalcuBMI2};
            bmiColorForAdualt = HMWeightUtils.getBmiColorFor7_18(this.ctx);
            fArr = fArr2;
        } else if (weightAge >= 18) {
            float[] fArr3 = zIsChineseLanguage ? new float[]{fCalcuBMI, 18.5f, 24.0f, 28.0f, fCalcuBMI2} : new float[]{fCalcuBMI, 18.5f, 25.0f, 30.0f, fCalcuBMI2};
            String[] adualtBmiLables = BodyParamsUtils.getAdualtBmiLables(this.ctx);
            bmiColorForAdualt = HMWeightUtils.getBmiColorForAdualt(this.ctx);
            fArr = fArr3;
            childBmiLables = adualtBmiLables;
        } else {
            fArr = null;
            bmiColorForAdualt = null;
            childBmiLables = null;
        }
        if (fArr != null && bmiColorForAdualt != null && childBmiLables != null) {
            int length = fArr.length - 1;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i2 + 1;
                    if (i2 != fArr.length - 1) {
                        if ((bodyParamsStr >= fArr[i2] && bodyParamsStr < fArr[i4]) || (i2 == 0 && bodyParamsStr < fArr[i2])) {
                            break;
                        }
                    } else {
                        i3 = i2 - 1;
                    }
                    if (i4 > length) {
                        i2 = i3;
                        break;
                    }
                    i2 = i4;
                }
            }
            WeightFigureView.setValues$default(mFigureView, fArr, bmiColorForAdualt, childBmiLables, c(i2, fArr.length, BFCallback.getInstance().enableMiDongFlavor() ? statusColor : bmiColorForAdualt[i2]), false, 16, null);
        }
        mFigureView.setInitValue(bodyParamsStr);
    }

    private final void g(WeightFigureView mFigureView, int sex, int weightAge, float bodyParamsStr, int statusColor) {
        mFigureView.setLabelTextSize(12.0f);
        mFigureView.setScaleTextSize(11.0f);
        mFigureView.setScaleTextColor(ContextCompat.getColor(this.ctx, R.color.s2));
        mFigureView.setListener(new c());
        float[] bodyFatAllSection = BodyParamsUtils.getBodyFatAllSection(weightAge, sex);
        String[] stringArray = this.ctx.getResources().getStringArray(R.array.bodyfat_content_leval);
        int[] bodyFatColor = HMWeightUtils.getBodyFatColor(this.ctx);
        if (bodyFatAllSection != null) {
            float[] fArr = {1.0f, bodyFatAllSection[0], bodyFatAllSection[1], bodyFatAllSection[2], bodyFatAllSection[3], 45.0f};
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2 + 1;
                if (i2 != 5) {
                    if ((bodyParamsStr >= fArr[i2] && bodyParamsStr < fArr[i4]) || (i2 == 0 && bodyParamsStr < fArr[i2])) {
                        break;
                    }
                } else {
                    i3 = i2 - 1;
                }
                if (i4 > 5) {
                    i2 = i3;
                    break;
                }
                i2 = i4;
            }
            mFigureView.setLanguageNormal(Language.isChinese() || Language.isEnglish());
            if (!BFCallback.getInstance().enableMiDongFlavor()) {
                statusColor = bodyFatColor[i2];
            }
            WeightFigureView.setValues$default(mFigureView, fArr, bodyFatColor, stringArray, c(i2, 6, statusColor), false, 16, null);
            mFigureView.setInitValue(bodyParamsStr);
        }
    }

    private final void h(WeightFigureView mFigureView, int sex, float bodyParamsStr, float weightKg, int statusColor) {
        mFigureView.setLabelTextSize(12.0f);
        mFigureView.setScaleTextSize(11.0f);
        mFigureView.setScaleTextColor(ContextCompat.getColor(this.ctx, R.color.s2));
        mFigureView.setListener(new d());
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        float fConvertTo = HMWeightUtils.convertTo(0.5f, 0, weightUnit);
        float fConvertTo2 = HMWeightUtils.convertTo(8.0f, 0, weightUnit);
        float fConvertFromKg = HMWeightUtils.convertFromKg(bodyParamsStr, weightUnit);
        float[] boneSection = BodyParamsUtils.getBoneSection(sex, weightKg);
        String[] stringArray = this.ctx.getResources().getStringArray(R.array.bone_leval);
        int[] muscleColor = HMWeightUtils.getMuscleColor(this.ctx);
        float[] fArr = {fConvertTo, HMWeightUtils.scaleFloatToDown(HMWeightUtils.convertTo(boneSection[0], 0, weightUnit), 1), HMWeightUtils.scaleFloatToDown(HMWeightUtils.convertTo(boneSection[1], 0, weightUnit), 1), fConvertTo2};
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i2 != 3) {
                if ((fConvertFromKg >= fArr[i2] && fConvertFromKg < fArr[i4]) || (i2 == 0 && fConvertFromKg < fArr[i2])) {
                    break;
                }
            } else {
                i3 = i2 - 1;
            }
            if (i4 > 3) {
                i2 = i3;
                break;
            }
            i2 = i4;
        }
        mFigureView.setLanguageNormal(Language.isChinese() || Language.isEnglish());
        WeightFigureView.setValues$default(mFigureView, fArr, muscleColor, stringArray, c(i2, 4, BFCallback.getInstance().enableMiDongFlavor() ? statusColor : muscleColor[i2]), false, 16, null);
        mFigureView.setInitValue(fConvertFromKg);
    }

    private final void i(WeightFigureView mFigureView, int sex, int unit, int height, float bodyParamsStr, int statusColor) {
        if (mFigureView.getVisibility() != 0) {
            return;
        }
        mFigureView.setLabelTextSize(12.0f);
        mFigureView.setScaleTextSize(11.0f);
        mFigureView.setScaleTextColor(ContextCompat.getColor(this.ctx, R.color.s2));
        mFigureView.setListener(new e());
        float fConvertFromKg = HMWeightUtils.convertFromKg(bodyParamsStr, unit);
        float[] muscleAllSection = BodyParamsUtils.getMuscleAllSection(height, sex);
        String[] stringArray = this.ctx.getResources().getStringArray(R.array.muscle_content_leval);
        int[] muscleColor = HMWeightUtils.getMuscleColor(this.ctx);
        boolean z = true;
        float[] fArr = {HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(10.0f, unit), 1), HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(muscleAllSection[0], unit), 1), HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(muscleAllSection[1], unit), 1), HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(120.0f, unit), 1)};
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i2 != 3) {
                if ((fConvertFromKg >= fArr[i2] && fConvertFromKg < fArr[i4]) || (i2 == 0 && fConvertFromKg < fArr[i2])) {
                    break;
                }
            } else {
                i3 = i2 - 1;
            }
            if (i4 > 3) {
                i2 = i3;
                break;
            }
            i2 = i4;
        }
        if (!Language.isChinese() && !Language.isEnglish()) {
            z = false;
        }
        mFigureView.setLanguageNormal(z);
        WeightFigureView.setValues$default(mFigureView, fArr, muscleColor, stringArray, c(i2, 4, BFCallback.getInstance().enableMiDongFlavor() ? statusColor : muscleColor[i2]), false, 16, null);
        mFigureView.setInitValue(fConvertFromKg);
    }

    private final void j(WeightFigureView mFigureView, int weightAge, float bodyParamsStr, int statusColor) {
        mFigureView.setLabelTextSize(12.0f);
        mFigureView.setScaleTextSize(11.0f);
        mFigureView.setScaleTextColor(ContextCompat.getColor(this.ctx, R.color.s2));
        mFigureView.setListener(new f());
        float[] proteinAllSection = BodyParamsUtils.getProteinAllSection(weightAge);
        if (proteinAllSection == null) {
            return;
        }
        String[] stringArray = this.ctx.getResources().getStringArray(R.array.common_level);
        int[] muscleColor = HMWeightUtils.getMuscleColor(this.ctx);
        float[] fArr = {5.0f, proteinAllSection[0], proteinAllSection[1], 32.0f};
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i2 != 3) {
                if (bodyParamsStr >= fArr[i2] && bodyParamsStr < fArr[i4]) {
                    break;
                }
                if (i2 == 0 && bodyParamsStr < fArr[i2]) {
                    i2 = 0;
                    break;
                }
            } else {
                i3 = i2 - 1;
            }
            if (i4 > 3) {
                i2 = i3;
                break;
            }
            i2 = i4;
        }
        mFigureView.setLanguageNormal(Language.isChinese() || Language.isEnglish());
        if (!BFCallback.getInstance().enableMiDongFlavor()) {
            statusColor = muscleColor[i2];
        }
        WeightFigureView.setValues$default(mFigureView, fArr, muscleColor, stringArray, c(i2, 4, statusColor), false, 16, null);
        mFigureView.setInitValue(bodyParamsStr);
    }

    private final void k(WeightFigureView mFigureView, int sex, int weightAge, float bodyParamsStr, int statusColor) {
        mFigureView.setLabelTextSize(12.0f);
        mFigureView.setScaleTextSize(11.0f);
        mFigureView.setScaleTextColor(ContextCompat.getColor(this.ctx, R.color.s2));
        mFigureView.setListener(new g());
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        float fConvertFromKg = HMWeightUtils.convertFromKg(8.0f, weightUnit);
        float fConvertFromKg2 = HMWeightUtils.convertFromKg(100.0f, weightUnit);
        float fConvertFromKg3 = HMWeightUtils.convertFromKg(bodyParamsStr, weightUnit);
        float[] skeletalMuscleAllSection = BodyParamsUtils.getSkeletalMuscleAllSection(weightAge, sex);
        if (skeletalMuscleAllSection == null) {
            return;
        }
        String[] stringArray = this.ctx.getResources().getStringArray(R.array.health_data_low_normal_high_level);
        int[] muscleColor = HMWeightUtils.getMuscleColor(this.ctx);
        float[] fArr = {fConvertFromKg, HMWeightUtils.convertFromKg(skeletalMuscleAllSection[0], weightUnit), HMWeightUtils.convertFromKg(skeletalMuscleAllSection[1], weightUnit), fConvertFromKg2};
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i2 != 3) {
                if (fConvertFromKg3 >= fArr[i2] && fConvertFromKg3 < fArr[i4]) {
                    break;
                }
                if (i2 == 0 && fConvertFromKg3 < fArr[i2]) {
                    i2 = 0;
                    break;
                }
            } else {
                i3 = i2 - 1;
            }
            if (i4 > 3) {
                i2 = i3;
                break;
            }
            i2 = i4;
        }
        mFigureView.setLanguageNormal(Language.isChinese() || Language.isEnglish());
        WeightFigureView.setValues$default(mFigureView, fArr, muscleColor, stringArray, c(i2, 4, BFCallback.getInstance().enableMiDongFlavor() ? statusColor : muscleColor[i2]), false, 16, null);
        mFigureView.setInitValue(fConvertFromKg3);
    }

    private final void l(WeightFigureView mFigureView, int sex, int weightAge, float bodyParamsStr, int statusColor) {
        mFigureView.setLabelTextSize(12.0f);
        mFigureView.setScaleTextSize(11.0f);
        mFigureView.setScaleTextColor(ContextCompat.getColor(this.ctx, R.color.s2));
        mFigureView.setListener(new h());
        float[] subcutaneousFatAllSection = BodyParamsUtils.getSubcutaneousFatAllSection(weightAge, sex);
        if (subcutaneousFatAllSection == null) {
            return;
        }
        String[] stringArray = this.ctx.getResources().getStringArray(R.array.common_low_normal_high_level);
        int[] muscleColor = HMWeightUtils.getMuscleColor(this.ctx);
        float[] fArr = {0.1f, subcutaneousFatAllSection[0], subcutaneousFatAllSection[1], 60.0f};
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i2 != 3) {
                if (bodyParamsStr >= fArr[i2] && bodyParamsStr < fArr[i4]) {
                    break;
                }
                if (i2 == 0 && bodyParamsStr < fArr[i2]) {
                    i2 = 0;
                    break;
                }
            } else {
                i3 = i2 - 1;
            }
            if (i4 > 3) {
                i2 = i3;
                break;
            }
            i2 = i4;
        }
        mFigureView.setLanguageNormal(Language.isChinese() || Language.isEnglish());
        if (!BFCallback.getInstance().enableMiDongFlavor()) {
            statusColor = muscleColor[i2];
        }
        WeightFigureView.setValues$default(mFigureView, fArr, muscleColor, stringArray, c(i2, 4, statusColor), false, 16, null);
        mFigureView.setInitValue(bodyParamsStr);
    }

    private final void m(WeightFigureView mFigureView, float bodyParamsStr, int statusColor) {
        mFigureView.setLabelTextSize(12.0f);
        mFigureView.setScaleTextSize(11.0f);
        mFigureView.setScaleTextColor(ContextCompat.getColor(this.ctx, R.color.s2));
        mFigureView.setListener(i.a);
        float[] fArr = WeightConstant.VISCERAL_FAT_SECTIONS;
        String[] stringArray = this.ctx.getResources().getStringArray(R.array.visceral_fat_leval);
        int[] bmiColorFor7_18 = HMWeightUtils.getBmiColorFor7_18(this.ctx);
        float[] fArr2 = {1.0f, fArr[0], fArr[1], 50.0f};
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i2 != 3) {
                if ((bodyParamsStr >= fArr2[i2] && bodyParamsStr < fArr2[i4]) || (i2 == 0 && bodyParamsStr < fArr2[i2])) {
                    break;
                }
            } else {
                i3 = i2 - 1;
            }
            if (i4 > 3) {
                i2 = i3;
                break;
            }
            i2 = i4;
        }
        mFigureView.setLanguageNormal(Language.isChinese() || Language.isEnglish());
        if (!BFCallback.getInstance().enableMiDongFlavor()) {
            statusColor = bmiColorFor7_18[i2];
        }
        WeightFigureView.setValues$default(mFigureView, fArr2, bmiColorFor7_18, stringArray, c(i2, 4, statusColor), false, 16, null);
        mFigureView.setInitValue(bodyParamsStr);
    }

    private final void n(WeightFigureView mFigureView, int sex, int weightAge, float bodyParamsStr, int statusColor) {
        mFigureView.setLabelTextSize(12.0f);
        mFigureView.setScaleTextSize(11.0f);
        mFigureView.setScaleTextColor(ContextCompat.getColor(this.ctx, R.color.s2));
        mFigureView.setListener(new j());
        float[] waterAllSection = BodyParamsUtils.getWaterAllSection(weightAge, sex);
        if (waterAllSection == null) {
            return;
        }
        String[] stringArray = this.ctx.getResources().getStringArray(R.array.water_leval);
        int[] muscleColor = HMWeightUtils.getMuscleColor(this.ctx);
        float[] fArr = {35.0f, waterAllSection[0], waterAllSection[1], 75.0f};
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i2 != 3) {
                if (bodyParamsStr >= fArr[i2] && bodyParamsStr < fArr[i4]) {
                    break;
                }
                if (i2 == 0 && bodyParamsStr < fArr[i2]) {
                    i2 = 0;
                    break;
                }
            } else {
                i3 = i2 - 1;
            }
            if (i4 > 3) {
                i2 = i3;
                break;
            }
            i2 = i4;
        }
        mFigureView.setLanguageNormal(Language.isChinese() || Language.isEnglish());
        if (!BFCallback.getInstance().enableMiDongFlavor()) {
            statusColor = muscleColor[i2];
        }
        WeightFigureView.setValues$default(mFigureView, fArr, muscleColor, stringArray, c(i2, 4, statusColor), false, 16, null);
        mFigureView.setInitValue(bodyParamsStr);
    }

    @NotNull
    public final Context getCtx() {
        return this.ctx;
    }

    @NotNull
    public final LayoutInflater getInflater() {
        return this.inflater;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.list.size();
    }

    @NotNull
    public final List<ScoreParamsObject> getList() {
        return this.list;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public final int getStatusColor() {
        return this.statusColor;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    /* JADX INFO: renamed from: isExpandDefault, reason: from getter */
    public final boolean getIsExpandDefault() {
        return this.isExpandDefault;
    }

    public final void setDefaultExpand(boolean isExpand) {
        this.isExpandDefault = isExpand;
    }

    public final void setExpandDefault(boolean z) {
        this.isExpandDefault = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BodyfatViewHolder holder, int position) {
        ScoreParamsObject scoreParamsObject = this.list.get(position);
        holder.getTitleTextView().setText(scoreParamsObject.getParamsName().toString());
        holder.getSubTitleTextView().setText(scoreParamsObject.getLevel());
        holder.getTipsTextView().setText(scoreParamsObject.getHintInfo());
        if (this.statusColor != ContextCompat.getColor(this.ctx, R.color.bf3_list_health)) {
            holder.getTipsTextView().measure(View.MeasureSpec.makeMeasureSpec((int) (this.screenWidth - ViewUtils.dp2px(this.ctx, 46.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = holder.getTipsTextView().getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = holder.getTipsTextView().getLayoutParams();
            layoutParams.height = (int) (measuredHeight + ViewUtils.dp2px(this.ctx, 20.0f));
            holder.getTipsTextView().setLayoutParams(layoutParams);
        }
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            ViewGroup.LayoutParams layoutParams2 = holder.getIconImg().getLayoutParams();
            int iDp2px = (int) ViewUtils.dp2px(holder.getIconImg().getContext(), 24.0f);
            layoutParams2.height = iDp2px;
            layoutParams2.width = iDp2px;
            holder.getIconImg().setLayoutParams(layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(ContextCompat.getColor(holder.getIconImg().getContext(), R.color.body_fat_icon_bg));
            gradientDrawable.setShape(1);
            holder.getIconImg().setPadding(8, 8, 8, 8);
            holder.getIconImg().setBackground(gradientDrawable);
        }
        b(scoreParamsObject, holder.getIconImg());
        if (TextUtils.isEmpty(scoreParamsObject.getUnitValue())) {
            holder.getUnitTextView().setValue(scoreParamsObject.getParamsValue(), "");
        } else {
            holder.getUnitTextView().setValue(scoreParamsObject.getParamsValue(), scoreParamsObject.getUnitValue());
        }
        a(scoreParamsObject, holder.getFigureView(), this.statusColor);
        scoreParamsObject.getWfType();
        if (!BFCallback.getInstance().enableMiDongFlavor() || !HMWeightUtils.isSelf(scoreParamsObject.getUid())) {
            holder.getTextViewDetails().setVisibility(8);
        } else {
            holder.getTextViewDetails().setVisibility(0);
            ExtentionUtilsKt.smartClick$default(holder.getTextViewDetails(), 0L, new k(scoreParamsObject), 1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public BodyfatViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new BodyfatViewHolder(this.inflater.inflate(R.layout.score_item, parent, false), this.isExpandDefault);
    }
}
