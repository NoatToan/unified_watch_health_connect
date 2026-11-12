package com.xiaomi.hm.health.device.setting.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.alipay.sdk.m.x.d;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.timepicker.TimeModel;
import com.huami.devicex.R;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.loc.z;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.device.setting.ui.dialog.WheelViewDialog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bF\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u001b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\u0017\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u000e0\u001dJ\u000e\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\bJ\u000e\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\bR\u001e\u0010+\u001a\n (*\u0004\u0018\u00010\u001f0\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00101R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0018\u00104\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00101R\u0016\u00106\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010*R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0016\u0010&\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010;\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010=\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R$\u0010E\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/dialog/WheelViewDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "", "initEvents", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", "h", "", "values", "c", "index", "e", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "Lkotlin/ranges/IntProgression;", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "onViewCreated", "onResume", "value", "setCurrentItem", "(Ljava/lang/Integer;)V", "Lkotlin/Pair;", "getCurrentItemAndRang", "", "titleString", d.o, "graininess", "setGraininess", "maxWheelValues", "setMaxWheelValues", "minWheelValues", "setMinWheelValues", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Lcom/huami/widget/wheelview/WheelView;", "b", "Lcom/huami/widget/wheelview/WheelView;", "wheelView", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "title", "yes", g.g, "f", "titleStr", "g", LogUtil.I, "i", z.j, "currentItem", hl.k, "defaultCurrentItem", "Landroid/view/View$OnClickListener;", "l", "Landroid/view/View$OnClickListener;", "getSureListener", "()Landroid/view/View$OnClickListener;", "setSureListener", "(Landroid/view/View$OnClickListener;)V", "sureListener", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WheelViewDialog extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private WheelView wheelView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private TextView title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TextView yes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private TextView cancel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener sureListener;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = WheelViewDialog.class.getSimpleName();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private String titleStr = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int graininess = 1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int maxWheelValues = 6;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int minWheelValues = 1;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int currentItem = 10;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int defaultCurrentItem = 10;

    private final int c(int values) {
        int i = this.minWheelValues;
        int i2 = this.graininess;
        int iIndexOf = CollectionsKt___CollectionsKt.indexOf(e.step(new IntRange(i * i2, this.maxWheelValues * i2), this.graininess), Integer.valueOf(values));
        return iIndexOf == -1 ? this.defaultCurrentItem : iIndexOf;
    }

    private final IntProgression d() {
        int i = this.minWheelValues;
        int i2 = this.graininess;
        return e.step(new IntRange(i * i2, this.maxWheelValues * i2), this.graininess);
    }

    private final Integer e(Integer index) {
        if (index == null) {
            return null;
        }
        int i = this.minWheelValues;
        int i2 = this.graininess;
        List list = CollectionsKt___CollectionsKt.toList(e.step(new IntRange(i * i2, this.maxWheelValues * i2), this.graininess));
        if (list.size() > index.intValue()) {
            return (Integer) list.get(index.intValue());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(WheelViewDialog wheelViewDialog, View view) {
        View.OnClickListener sureListener = wheelViewDialog.getSureListener();
        if (sureListener != null) {
            sureListener.onClick(view);
        }
        wheelViewDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(WheelViewDialog wheelViewDialog, View view) {
        wheelViewDialog.dismiss();
    }

    private final void h() {
        WheelView selectBgHeight;
        WheelView centerStyle;
        WheelView visibleItems;
        Context context = getContext();
        int i = this.minWheelValues;
        int i2 = this.maxWheelValues;
        WheelView wheelView = this.wheelView;
        Context contextRequireContext = requireContext();
        int i3 = R.color.p4;
        int color = ContextCompat.getColor(contextRequireContext, i3);
        Context contextRequireContext2 = requireContext();
        int i4 = R.color.s4;
        PickAdapter pickAdapter = new PickAdapter(context, i, i2, wheelView, color, ContextCompat.getColor(contextRequireContext2, i4), ContextCompat.getColor(requireContext(), i4), false, 46, 20, 20, 15, this.graininess, 0);
        pickAdapter.setFormatStr(TimeModel.NUMBER_FORMAT);
        pickAdapter.setEndValue(this.maxWheelValues);
        pickAdapter.setStartValue(this.minWheelValues);
        pickAdapter.setValueGap(this.graininess);
        WheelView wheelView2 = this.wheelView;
        if (wheelView2 != null) {
            wheelView2.setStyle(WheelView.Style.LINE_VARIATION);
        }
        WheelView wheelView3 = this.wheelView;
        WheelView centerBgColor = null;
        if (wheelView3 != null && (selectBgHeight = wheelView3.setSelectBgHeight(44.0f)) != null && (centerStyle = selectBgHeight.setCenterStyle("", i3, 12, 9.0f, 0.0f)) != null && (visibleItems = centerStyle.setVisibleItems(5)) != null) {
            centerBgColor = visibleItems.setCenterBgColor(-1);
        }
        if (centerBgColor != null) {
            centerBgColor.setViewAdapter(pickAdapter);
        }
        WheelView wheelView4 = this.wheelView;
        if (wheelView4 != null) {
            wheelView4.setLineColor(ContextCompat.getColor(requireContext(), i3));
        }
        WheelView wheelView5 = this.wheelView;
        if (wheelView5 != null) {
            wheelView5.setCurrentItem(c(this.currentItem));
        }
        WheelView wheelView6 = this.wheelView;
        if (wheelView6 == null) {
            return;
        }
        wheelView6.addScrollingListener(new OnWheelScrollListener() { // from class: com.xiaomi.hm.health.device.setting.ui.dialog.WheelViewDialog$initWheelView$1
            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingFinished(@NotNull WheelView wheel) {
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingStarted(@NotNull WheelView wheel) {
            }
        });
    }

    private final void initEvents() {
        TextView textView = this.yes;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: hu8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WheelViewDialog.f(this.a, view);
                }
            });
        }
        TextView textView2 = this.cancel;
        if (textView2 == null) {
            return;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: iu8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WheelViewDialog.g(this.a, view);
            }
        });
    }

    private final void initView(View view) {
        this.wheelView = (WheelView) view.findViewById(R.id.wheelView);
        this.title = (TextView) view.findViewById(R.id.title);
        this.yes = (TextView) view.findViewById(R.id.btn_yes);
        this.cancel = (TextView) view.findViewById(R.id.btn_cancel);
        TextView textView = this.title;
        if (textView != null) {
            textView.setText(this.titleStr);
        }
        h();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final Pair<Integer, IntProgression> getCurrentItemAndRang() {
        WheelView wheelView = this.wheelView;
        return new Pair<>(e(wheelView == null ? null : Integer.valueOf(wheelView.getCurrentItem())), d());
    }

    @Nullable
    public final View.OnClickListener getSureListener() {
        return this.sureListener;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R.style.CustomBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_wheel_fragment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        Dialog dialog = getDialog();
        WindowManager.LayoutParams attributes = (dialog == null || (window = dialog.getWindow()) == null) ? null : window.getAttributes();
        if (attributes != null) {
            attributes.width = -1;
        }
        if (attributes != null) {
            attributes.height = -1;
        }
        Dialog dialog2 = getDialog();
        Window window2 = dialog2 != null ? dialog2.getWindow() : null;
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        initEvents();
    }

    public final void setCurrentItem(@Nullable Integer value) {
        this.currentItem = value == null ? this.defaultCurrentItem : value.intValue();
    }

    public final void setGraininess(int graininess) {
        this.graininess = graininess;
    }

    public final void setMaxWheelValues(int maxWheelValues) {
        this.maxWheelValues = maxWheelValues;
    }

    public final void setMinWheelValues(int minWheelValues) {
        this.minWheelValues = minWheelValues;
    }

    public final void setSureListener(@Nullable View.OnClickListener onClickListener) {
        this.sureListener = onClickListener;
    }

    public final void setTitle(@NotNull String titleString) {
        this.titleStr = titleString;
    }
}
