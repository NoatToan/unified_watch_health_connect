package com.huami.sleep.daysleep.sleepstagechart.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepOverlayMenu;
import com.huami.sleep.model.DataConstant;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(21)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 G2\u00020\u0001:\u0003GHIB'\b\u0007\u0012\u0006\u0010A\u001a\u00020@\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B\u0012\b\b\u0002\u0010D\u001a\u00020\u0019¢\u0006\u0004\bE\u0010FJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J$\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0014\u0010\u001e\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001cJ\u000e\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010,\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010+R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00104R\u0016\u00107\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010&R\u0016\u00108\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0016\u00109\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0016\u0010:\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0016\u0010;\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010+R\u0016\u0010<\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00104R\u0016\u0010=\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0018\u0010?\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010>¨\u0006J"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SleepOverlayMenu;", "Landroid/widget/FrameLayout;", "", "z", "o", "Landroid/view/View;", "main", z.j, "l", "it", "m", "i", "", "curType", "t", "Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SleepOverlayMenu$OverLayType;", "overLayType", "y", "w", "u", GoogleApiAvailabilityLight.b, hl.k, "layout", "Landroid/widget/ImageView;", "iv", "", "resource", "g", "", "typeListParam", "setOverLayType", "Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SleepOverlayMenu$OnTypeSelectedListener;", "lis", "setOnTypeSelectListener", "a", "Ljava/util/List;", "typeList", "b", "Landroid/view/View;", "container", "c", "mainLayout", GoogleApiAvailabilityLight.a, "Landroid/widget/ImageView;", "mainIv", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "mainTv", "f", "dropArrow", "", "Z", "dropShow", "h", "hrLayout", "hrIv", "hrSelected", "respLayout", "respIv", "respSelected", "closeLayout", "Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SleepOverlayMenu$OnTypeSelectedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "OnTypeSelectedListener", "OverLayType", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepOverlayMenu extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int p = 102;
    private static final int q = 26;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<String> typeList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private View container;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private View mainLayout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private ImageView mainIv;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private TextView mainTv;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private ImageView dropArrow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean dropShow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private View hrLayout;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private ImageView hrIv;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean hrSelected;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private View respLayout;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private ImageView respIv;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean respSelected;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private View closeLayout;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private OnTypeSelectedListener listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SleepOverlayMenu$Companion;", "", "", "alpha_40", LogUtil.I, "getAlpha_40", "()I", "alpha_10", "getAlpha_10", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getAlpha_10() {
            return SleepOverlayMenu.q;
        }

        public final int getAlpha_40() {
            return SleepOverlayMenu.p;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SleepOverlayMenu$OnTypeSelectedListener;", "", "", "type", "", "onTypeSelected", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public interface OnTypeSelectedListener {
        void onTypeSelected(@NotNull String type);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019¨\u0006 "}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SleepOverlayMenu$OverLayType;", "", "", "component1", "", "component2", "component3", "component4", "type", "iamge", "color", "text", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", LogUtil.I, "getIamge", "()I", "c", "getColor", GoogleApiAvailabilityLight.a, "getText", "<init>", "(Ljava/lang/String;III)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class OverLayType {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int iamge;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final int color;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private final int text;

        public OverLayType(@NotNull String str, int i, int i2, int i3) {
            this.type = str;
            this.iamge = i;
            this.color = i2;
            this.text = i3;
        }

        public static /* synthetic */ OverLayType copy$default(OverLayType overLayType, String str, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = overLayType.type;
            }
            if ((i4 & 2) != 0) {
                i = overLayType.iamge;
            }
            if ((i4 & 4) != 0) {
                i2 = overLayType.color;
            }
            if ((i4 & 8) != 0) {
                i3 = overLayType.text;
            }
            return overLayType.copy(str, i, i2, i3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getIamge() {
            return this.iamge;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getText() {
            return this.text;
        }

        @NotNull
        public final OverLayType copy(@NotNull String type, int iamge, int color, int text) {
            return new OverLayType(type, iamge, color, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OverLayType)) {
                return false;
            }
            OverLayType overLayType = (OverLayType) other;
            return Intrinsics.areEqual(this.type, overLayType.type) && this.iamge == overLayType.iamge && this.color == overLayType.color && this.text == overLayType.text;
        }

        public final int getColor() {
            return this.color;
        }

        public final int getIamge() {
            return this.iamge;
        }

        public final int getText() {
            return this.text;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((this.type.hashCode() * 31) + this.iamge) * 31) + this.color) * 31) + this.text;
        }

        @NotNull
        public String toString() {
            return "OverLayType(type=" + this.type + ", iamge=" + this.iamge + ", color=" + this.color + ", text=" + this.text + ")";
        }
    }

    @JvmOverloads
    public SleepOverlayMenu(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SleepOverlayMenu(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SleepOverlayMenu(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void g(View layout, ImageView iv, int resource) {
        layout.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.bg_sleep_overlay_unselected));
        layout.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), R.color.s10)));
        layout.getBackground().setAlpha(p);
        if (iv != null) {
            iv.setImageDrawable(ContextCompat.getDrawable(getContext(), resource));
        }
        if (iv == null) {
            return;
        }
        iv.setColorFilter(ContextCompat.getColor(getContext(), R.color.s1));
    }

    public static /* synthetic */ void h(SleepOverlayMenu sleepOverlayMenu, View view, ImageView imageView, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            imageView = null;
        }
        sleepOverlayMenu.g(view, imageView, i);
    }

    private final void i() {
        this.hrLayout.setVisibility(8);
        this.respLayout.setVisibility(8);
        this.closeLayout.setVisibility(8);
        this.dropArrow.setImageResource(R.drawable.ic_expand_more_20);
    }

    private final void j(View main) {
        Object tag = main.getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepOverlayMenu.OverLayType");
        y((OverLayType) tag);
    }

    private final void k() {
        View view = this.hrLayout;
        Context context = getContext();
        int i = R.color.p3;
        view.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context, i)));
        this.hrLayout.getBackground().setAlpha(q);
        this.hrIv.setColorFilter(ContextCompat.getColor(getContext(), i));
    }

    private final void l(View main) {
        Object tag = main.getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepOverlayMenu.OverLayType");
        OverLayType overLayType = (OverLayType) tag;
        main.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), R.color.s10)));
        main.getBackground().setAlpha(255);
        if (!Intrinsics.areEqual(overLayType.getType(), "sleep")) {
            this.mainIv.setImageDrawable(ContextCompat.getDrawable(getContext(), overLayType.getIamge()));
            this.mainIv.setColorFilter(ContextCompat.getColor(getContext(), R.color.s1));
        }
        t(overLayType.getType());
    }

    private final void m(View it2) {
        Object tag = it2.getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepOverlayMenu.OverLayType");
        OverLayType overLayType = (OverLayType) tag;
        OnTypeSelectedListener onTypeSelectedListener = this.listener;
        if (onTypeSelectedListener != null) {
            onTypeSelectedListener.onTypeSelected(overLayType.getType());
        }
        y(overLayType);
        this.mainLayout.setTag(overLayType);
        this.dropShow = false;
        i();
    }

    private final void n() {
        View view = this.respLayout;
        Context context = getContext();
        int i = R.color.s20;
        view.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context, i)));
        this.respLayout.getBackground().setAlpha(q);
        this.respIv.setColorFilter(ContextCompat.getColor(getContext(), i));
    }

    private final void o() {
        this.mainLayout.setVisibility(0);
        OverLayType overLayType = new OverLayType("sleep", -1, R.color.s10, R.string.slp_no_select_overlay);
        this.mainLayout.setTag(overLayType);
        this.closeLayout.setTag(overLayType);
        Drawable background = this.closeLayout.getBackground();
        int i = p;
        background.setAlpha(i);
        this.respLayout.getBackground().setAlpha(i);
        this.hrLayout.getBackground().setAlpha(i);
        y(overLayType);
        this.respLayout.setTag(new OverLayType(DataConstant.ID_DATA_OVERLAY_RESP_RATE, R.drawable.ic_sleep_breathing_24, R.color.s20, R.string.slp_resp_rate_overlay));
        this.hrLayout.setTag(new OverLayType("heart_rate", R.drawable.ic_heart_rate_24, R.color.p3, R.string.slp_heart_rate_overlay));
        i();
        this.mainLayout.setOnClickListener(new View.OnClickListener() { // from class: v07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepOverlayMenu.p(this.a, view);
            }
        });
        this.respLayout.setOnClickListener(new View.OnClickListener() { // from class: z07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepOverlayMenu.q(this.a, view);
            }
        });
        this.hrLayout.setOnClickListener(new View.OnClickListener() { // from class: y07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepOverlayMenu.r(this.a, view);
            }
        });
        this.closeLayout.setOnClickListener(new View.OnClickListener() { // from class: a17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepOverlayMenu.s(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(SleepOverlayMenu sleepOverlayMenu, View view) {
        if (sleepOverlayMenu.dropShow) {
            sleepOverlayMenu.j(view);
            sleepOverlayMenu.i();
        } else {
            sleepOverlayMenu.l(view);
        }
        sleepOverlayMenu.dropShow = !sleepOverlayMenu.dropShow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SleepOverlayMenu sleepOverlayMenu, View view) {
        sleepOverlayMenu.m(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SleepOverlayMenu sleepOverlayMenu, View view) {
        sleepOverlayMenu.m(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(SleepOverlayMenu sleepOverlayMenu, View view) {
        sleepOverlayMenu.m(view);
    }

    private final void t(String curType) {
        this.dropArrow.setImageResource(R.drawable.ic_expand_less_20);
        if (Intrinsics.areEqual(curType, DataConstant.ID_DATA_OVERLAY_RESP_RATE)) {
            this.hrLayout.setVisibility(0);
            this.respLayout.setVisibility(8);
            this.closeLayout.setVisibility(0);
        } else if (Intrinsics.areEqual(curType, "heart_rate")) {
            this.hrLayout.setVisibility(8);
            this.respLayout.setVisibility(0);
            this.closeLayout.setVisibility(0);
        } else {
            this.hrLayout.setVisibility(0);
            this.respLayout.setVisibility(0);
            this.closeLayout.setVisibility(8);
        }
    }

    private final void u() {
        this.mainLayout.setVisibility(8);
        this.hrLayout.setVisibility(0);
        this.respLayout.setVisibility(8);
        this.closeLayout.setVisibility(8);
        this.hrSelected = false;
        g(this.hrLayout, this.hrIv, R.drawable.ic_heart_rate_24);
        this.hrLayout.setOnClickListener(new View.OnClickListener() { // from class: x07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepOverlayMenu.v(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SleepOverlayMenu sleepOverlayMenu, View view) {
        OnTypeSelectedListener onTypeSelectedListener = sleepOverlayMenu.listener;
        if (onTypeSelectedListener != null) {
            onTypeSelectedListener.onTypeSelected(sleepOverlayMenu.hrSelected ? "sleep" : "heart_rate");
        }
        boolean z = !sleepOverlayMenu.hrSelected;
        sleepOverlayMenu.hrSelected = z;
        if (z) {
            sleepOverlayMenu.k();
        } else {
            sleepOverlayMenu.g(sleepOverlayMenu.hrLayout, sleepOverlayMenu.hrIv, R.drawable.ic_heart_rate_24);
        }
    }

    private final void w() {
        this.mainLayout.setVisibility(8);
        this.hrLayout.setVisibility(8);
        this.respLayout.setVisibility(0);
        this.closeLayout.setVisibility(8);
        this.respSelected = false;
        g(this.respLayout, this.respIv, R.drawable.ic_sleep_breathing_24);
        this.respLayout.setOnClickListener(new View.OnClickListener() { // from class: w07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepOverlayMenu.x(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(SleepOverlayMenu sleepOverlayMenu, View view) {
        OnTypeSelectedListener onTypeSelectedListener = sleepOverlayMenu.listener;
        if (onTypeSelectedListener != null) {
            onTypeSelectedListener.onTypeSelected(sleepOverlayMenu.respSelected ? "sleep" : DataConstant.ID_DATA_OVERLAY_RESP_RATE);
        }
        boolean z = !sleepOverlayMenu.respSelected;
        sleepOverlayMenu.respSelected = z;
        if (z) {
            sleepOverlayMenu.n();
        } else {
            sleepOverlayMenu.g(sleepOverlayMenu.respLayout, sleepOverlayMenu.respIv, R.drawable.ic_sleep_breathing_24);
        }
    }

    private final void y(OverLayType overLayType) {
        this.mainLayout.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), overLayType.getColor())));
        if (Intrinsics.areEqual(overLayType.getType(), "sleep")) {
            this.mainIv.setVisibility(8);
            this.mainLayout.getBackground().setAlpha(p);
        } else {
            this.mainIv.setVisibility(0);
            this.mainIv.setImageDrawable(ContextCompat.getDrawable(getContext(), overLayType.getIamge()));
            this.mainLayout.getBackground().setAlpha(q);
        }
        this.mainIv.setColorFilter(ContextCompat.getColor(getContext(), overLayType.getColor()));
        this.mainTv.setText(getResources().getString(overLayType.getText()));
        g(this.respLayout, this.respIv, R.drawable.ic_sleep_breathing_24);
        g(this.hrLayout, this.hrIv, R.drawable.ic_heart_rate_24);
    }

    private final void z() {
        List<String> list = this.typeList;
        if (list == null || list.isEmpty()) {
            this.container.setVisibility(8);
            return;
        }
        if (this.typeList.size() >= 2) {
            o();
        } else if (Intrinsics.areEqual(this.typeList.get(0), "heart_rate")) {
            u();
        } else if (Intrinsics.areEqual(this.typeList.get(0), DataConstant.ID_DATA_OVERLAY_RESP_RATE)) {
            w();
        }
        this.container.setVisibility(0);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void setOnTypeSelectListener(@NotNull OnTypeSelectedListener lis) {
        this.listener = lis;
    }

    public final void setOverLayType(@NotNull List<String> typeListParam) {
        this.typeList = typeListParam;
        z();
    }

    @JvmOverloads
    public SleepOverlayMenu(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.typeList = CollectionsKt__CollectionsKt.emptyList();
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_sleep_overlay_menu, (ViewGroup) this, true);
        this.container = viewInflate;
        this.mainLayout = viewInflate.findViewById(R.id.main);
        this.mainIv = (ImageView) this.container.findViewById(R.id.iv_main);
        this.mainTv = (TextView) this.container.findViewById(R.id.tv_main);
        this.dropArrow = (ImageView) this.container.findViewById(R.id.iv_arrow);
        this.hrLayout = this.container.findViewById(R.id.hr_layout);
        this.hrIv = (ImageView) this.container.findViewById(R.id.iv_hr);
        this.respLayout = this.container.findViewById(R.id.resp_layout);
        this.respIv = (ImageView) this.container.findViewById(R.id.iv_resp);
        this.closeLayout = this.container.findViewById(R.id.close_layout);
        this.container.setVisibility(8);
    }
}
