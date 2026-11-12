package com.huami.femalehealth.uilib.widget.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.DialogParams;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.RTLHelper;
import com.huami.femalehealth.uilib.helper.SupportAppHelper;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.femalehealth.uilib.widget.dialog.SingleWheelDialog;
import com.huami.tools.log.HMLog;
import com.huami.widget.typeface.TypefaceTextView;
import com.huami.widget.wheelview.OnWheelChangedListener;
import com.huami.widget.wheelview.WheelView;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b<\b\u0016\u0018\u0000 l*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001lB\u0096\u0001\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0017\u0012S\b\u0002\u00100\u001aM\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u000f\u0018\u00010(¢\u0006\u0004\bi\u0010jB\t\b\u0016¢\u0006\u0004\bi\u0010kJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J&\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J2\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0018\u001a\u00020\u0017J2\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000bR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&Ra\u00100\u001aM\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u000f\u0018\u00010(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00103R\u0018\u00107\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00103R\u0016\u0010:\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010>\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010\u001eR\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010\u001eR\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010\"R\u0016\u0010D\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010$R\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010\u001eR\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010\u001eR\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\"R\u0016\u0010L\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010$R$\u0010Q\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u00178F@BX\u0086\u000e¢\u0006\f\n\u0004\bN\u0010$\u001a\u0004\bO\u0010PR$\u0010T\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u00178F@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u0010$\u001a\u0004\bS\u0010PR$\u0010W\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u00178F@BX\u0086\u000e¢\u0006\f\n\u0004\bU\u0010$\u001a\u0004\bV\u0010PR<\u0010]\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010/\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010c\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u00109\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010h\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010$\u001a\u0004\be\u0010P\"\u0004\bf\u0010g¨\u0006m"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/dialog/SingleWheelDialog;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/android/design/dialog/AlertDialogFragment;", "Landroid/view/View;", "getContentView", "", "list", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", hl.k, "", b.r, "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onStart", "startNameWith", "endNameWith", "showNames", "", "defaultSelectIndex", "showDoubleWheel", "showThirdWheel", "visible", "showEndName", "h", "Ljava/lang/String;", "title", "i", z.j, "Ljava/util/List;", "l", LogUtil.I, "m", "Ljava/lang/Integer;", "nextBtnTextRes", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "position", "position2", "position3", GoogleApiAvailabilityLight.b, "Lkotlin/jvm/functions/Function3;", "onChangeListener", "Lcom/huami/widget/wheelview/WheelView;", "o", "Lcom/huami/widget/wheelview/WheelView;", "wheelViewYear", "wheelViewMonth", DTransferConstants.SEARCH_KEY, "wheelViewDay", "r", "Z", "showMonth", SOAP.XMLNS, "showDay", "t", "startNameWithMonth", "u", "endNameWithMonth", "v", "showNamesMonth", "w", "defaultSelectIndexMonth", "x", "startNameWithDay", "y", "endNameWithDay", "z", "showNamesDay", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "defaultSelectIndexDay", "<set-?>", "B", "getYearPos", "()I", "yearPos", "C", "getMonthPos", "monthPos", LogUtil.D, "getDayPos", "dayPos", "E", "getOnScrollListener", "()Lkotlin/jvm/functions/Function3;", "setOnScrollListener", "(Lkotlin/jvm/functions/Function3;)V", "onScrollListener", "F", "getInitShowEndName", "()Z", "setInitShowEndName", "(Z)V", "initShowEndName", "G", "getReverse", "setReverse", "(I)V", "reverse", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Integer;Lkotlin/jvm/functions/Function3;)V", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public class SingleWheelDialog<T> extends AlertDialogFragment {

    @NotNull
    private static final String H = "SingleWheelDialog";
    private static final int I = 0;
    private static final int J = 1;
    private static final int K = 2;
    private static final int L = -1;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int defaultSelectIndexDay;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int yearPos;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int monthPos;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int dayPos;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    private Function3<? super Boolean, ? super Boolean, ? super Boolean, Unit> onScrollListener;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean initShowEndName;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private int reverse;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final String startNameWith;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final String endNameWith;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final List<T> showNames;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int defaultSelectIndex;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private final Integer nextBtnTextRes;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private final Function3<Integer, Integer, Integer, Unit> onChangeListener;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private WheelView wheelViewYear;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private WheelView wheelViewMonth;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private WheelView wheelViewDay;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean showMonth;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean showDay;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private String startNameWithMonth;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private String endNameWithMonth;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    private List<? extends T> showNamesMonth;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int defaultSelectIndexMonth;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private String startNameWithDay;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private String endNameWithDay;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private List<? extends T> showNamesDay;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ SingleWheelDialog<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SingleWheelDialog<T> singleWheelDialog) {
            super(0);
            this.a = singleWheelDialog;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("reverse:", Integer.valueOf(this.a.getReverse()));
        }
    }

    public /* synthetic */ SingleWheelDialog(String str, String str2, String str3, List list, int i, Integer num, Function3 function3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, i, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : function3);
    }

    private final View getContentView() {
        final View viewInflate = View.inflate(getContext(), R.layout.fh_single_wheel_dialog_fragment, null);
        if (RTLHelper.INSTANCE.isRTL(viewInflate.getContext())) {
            ViewGroup.LayoutParams layoutParams = ((TypefaceTextView) viewInflate.findViewById(R.id.tv_subfix_year)).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart((int) ExtKt.dpToPx(viewInflate, 50.0f));
        }
        ((AppCompatTextView) viewInflate.findViewById(R.id.tv_title)).setText(this.title);
        WheelView wheelView = (WheelView) viewInflate.findViewById(R.id.wv_verify_year);
        int i = R.id.tv_prefix_year;
        ((TypefaceTextView) viewInflate.findViewById(i)).setText(this.startNameWith);
        int i2 = R.id.tv_subfix_year;
        ((TypefaceTextView) viewInflate.findViewById(i2)).setText(this.endNameWith);
        if (!getInitShowEndName()) {
            ExtKt.setVisible$default((TypefaceTextView) viewInflate.findViewById(i2), false, false, 2, null);
        }
        int i3 = R.drawable.fh_bg_rect_white;
        wheelView.setCenterDrawable(i3);
        wheelView.setViewAdapter(new com.huami.femalehealth.uilib.widget.dialog.a(viewInflate.getContext(), wheelView, k(this.showNames)));
        wheelView.setCurrentItem(this.defaultSelectIndex);
        this.wheelViewYear = wheelView;
        wheelView.addChangingListener(new OnWheelChangedListener() { // from class: nv6
            @Override // com.huami.widget.wheelview.OnWheelChangedListener
            public final void onChanged(WheelView wheelView2, int i4, int i5) {
                SingleWheelDialog.m(this.a, wheelView2, i4, i5);
            }
        });
        if (this.showMonth) {
            ((ConstraintLayout) viewInflate.findViewById(R.id.cl_month)).setVisibility(0);
            WheelView wheelView2 = (WheelView) viewInflate.findViewById(R.id.wv_verify_month);
            float f = ExtKt.findScreenWH(viewInflate).x * 0.08f;
            ((TypefaceTextView) viewInflate.findViewById(i)).setTranslationX(-f);
            ((TypefaceTextView) viewInflate.findViewById(i2)).setTranslationX(f);
            ((TypefaceTextView) viewInflate.findViewById(R.id.tv_prefix_month)).setText(this.startNameWithMonth);
            ((TypefaceTextView) viewInflate.findViewById(R.id.tv_subfix_month)).setText(this.endNameWithMonth);
            wheelView2.setCenterDrawable(i3);
            wheelView2.setViewAdapter(new com.huami.femalehealth.uilib.widget.dialog.a(viewInflate.getContext(), wheelView2, k(this.showNamesMonth)));
            wheelView2.setCurrentItem(this.defaultSelectIndexMonth);
            this.wheelViewMonth = wheelView2;
            wheelView2.addChangingListener(new OnWheelChangedListener() { // from class: pv6
                @Override // com.huami.widget.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView3, int i4, int i5) {
                    SingleWheelDialog.n(this.a, wheelView3, i4, i5);
                }
            });
        }
        if (this.showDay) {
            ((ConstraintLayout) viewInflate.findViewById(R.id.cl_day)).setVisibility(0);
            WheelView wheelView3 = (WheelView) viewInflate.findViewById(R.id.wv_verify_day);
            float f2 = ExtKt.findScreenWH(viewInflate).x * 0.07f;
            ((TypefaceTextView) viewInflate.findViewById(i)).setTranslationX(-f2);
            ((TypefaceTextView) viewInflate.findViewById(i2)).setTranslationX(f2);
            ((TypefaceTextView) viewInflate.findViewById(R.id.tv_prefix_day)).setText(this.startNameWithDay);
            ((TypefaceTextView) viewInflate.findViewById(R.id.tv_subfix_day)).setText(this.endNameWithDay);
            wheelView3.setCenterDrawable(i3);
            wheelView3.setViewAdapter(new com.huami.femalehealth.uilib.widget.dialog.a(viewInflate.getContext(), wheelView3, k(this.showNamesDay)));
            wheelView3.setCurrentItem(this.defaultSelectIndexDay);
            this.wheelViewDay = wheelView3;
            wheelView3.addChangingListener(new OnWheelChangedListener() { // from class: ov6
                @Override // com.huami.widget.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView4, int i4, int i5) {
                    SingleWheelDialog.o(this.a, wheelView4, i4, i5);
                }
            });
        }
        HMLog.info("xys_SingleWheelDialog", new a(this));
        ((ConstraintLayout) viewInflate.findViewById(R.id.cons_root)).post(new Runnable() { // from class: qv6
            @Override // java.lang.Runnable
            public final void run() {
                SingleWheelDialog.l(this.a, viewInflate);
            }
        });
        return viewInflate;
    }

    private final ArrayList<String> k(List<? extends T> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<? extends T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(it2.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SingleWheelDialog singleWheelDialog, View view) {
        if (singleWheelDialog.getReverse() == 1) {
            ConstraintSet constraintSet = new ConstraintSet();
            int i = R.id.cl_year;
            int id = ((ConstraintLayout) view.findViewById(i)).getId();
            int i2 = R.id.cl_month;
            constraintSet.connect(id, 6, ((ConstraintLayout) view.findViewById(i2)).getId(), 7);
            constraintSet.connect(((ConstraintLayout) view.findViewById(i)).getId(), 7, 0, 7);
            constraintSet.constrainWidth(((ConstraintLayout) view.findViewById(i)).getId(), ((ConstraintLayout) view.findViewById(i)).getMeasuredWidth());
            constraintSet.constrainHeight(((ConstraintLayout) view.findViewById(i)).getId(), ((ConstraintLayout) view.findViewById(i)).getMeasuredHeight());
            int id2 = ((ConstraintLayout) view.findViewById(i2)).getId();
            int i3 = R.id.cl_day;
            constraintSet.connect(id2, 6, ((ConstraintLayout) view.findViewById(i3)).getId(), 7);
            constraintSet.connect(((ConstraintLayout) view.findViewById(i2)).getId(), 7, ((ConstraintLayout) view.findViewById(i)).getId(), 6);
            constraintSet.constrainWidth(((ConstraintLayout) view.findViewById(i2)).getId(), ((ConstraintLayout) view.findViewById(i2)).getMeasuredWidth());
            constraintSet.constrainHeight(((ConstraintLayout) view.findViewById(i2)).getId(), ((ConstraintLayout) view.findViewById(i2)).getMeasuredHeight());
            constraintSet.connect(((ConstraintLayout) view.findViewById(i3)).getId(), 6, 0, 6);
            constraintSet.connect(((ConstraintLayout) view.findViewById(i3)).getId(), 7, ((ConstraintLayout) view.findViewById(i2)).getId(), 6);
            constraintSet.constrainWidth(((ConstraintLayout) view.findViewById(i3)).getId(), ((ConstraintLayout) view.findViewById(i3)).getMeasuredWidth());
            constraintSet.constrainHeight(((ConstraintLayout) view.findViewById(i3)).getId(), ((ConstraintLayout) view.findViewById(i3)).getMeasuredHeight());
            constraintSet.applyTo((ConstraintLayout) view.findViewById(R.id.cons_root));
            return;
        }
        if (singleWheelDialog.getReverse() == 2) {
            ConstraintSet constraintSet2 = new ConstraintSet();
            int i4 = R.id.cl_year;
            int id3 = ((ConstraintLayout) view.findViewById(i4)).getId();
            int i5 = R.id.cl_day;
            constraintSet2.connect(id3, 6, ((ConstraintLayout) view.findViewById(i5)).getId(), 7);
            constraintSet2.connect(((ConstraintLayout) view.findViewById(i4)).getId(), 7, 0, 7);
            constraintSet2.constrainWidth(((ConstraintLayout) view.findViewById(i4)).getId(), ((ConstraintLayout) view.findViewById(i4)).getMeasuredWidth());
            constraintSet2.constrainHeight(((ConstraintLayout) view.findViewById(i4)).getId(), ((ConstraintLayout) view.findViewById(i4)).getMeasuredHeight());
            int i6 = R.id.cl_month;
            constraintSet2.connect(((ConstraintLayout) view.findViewById(i6)).getId(), 6, 0, 6);
            constraintSet2.connect(((ConstraintLayout) view.findViewById(i6)).getId(), 7, ((ConstraintLayout) view.findViewById(i5)).getId(), 6);
            constraintSet2.constrainWidth(((ConstraintLayout) view.findViewById(i6)).getId(), ((ConstraintLayout) view.findViewById(i6)).getMeasuredWidth());
            constraintSet2.constrainHeight(((ConstraintLayout) view.findViewById(i6)).getId(), ((ConstraintLayout) view.findViewById(i6)).getMeasuredHeight());
            constraintSet2.connect(((ConstraintLayout) view.findViewById(i5)).getId(), 6, ((ConstraintLayout) view.findViewById(i6)).getId(), 7);
            constraintSet2.connect(((ConstraintLayout) view.findViewById(i5)).getId(), 7, ((ConstraintLayout) view.findViewById(i4)).getId(), 6);
            constraintSet2.constrainWidth(((ConstraintLayout) view.findViewById(i5)).getId(), ((ConstraintLayout) view.findViewById(i5)).getMeasuredWidth());
            constraintSet2.constrainHeight(((ConstraintLayout) view.findViewById(i5)).getId(), ((ConstraintLayout) view.findViewById(i5)).getMeasuredHeight());
            constraintSet2.applyTo((ConstraintLayout) view.findViewById(R.id.cons_root));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SingleWheelDialog singleWheelDialog, WheelView wheelView, int i, int i2) {
        Function3<Boolean, Boolean, Boolean, Unit> onScrollListener = singleWheelDialog.getOnScrollListener();
        if (onScrollListener == null) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        onScrollListener.invoke(bool, bool2, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(SingleWheelDialog singleWheelDialog, WheelView wheelView, int i, int i2) {
        Function3<Boolean, Boolean, Boolean, Unit> onScrollListener = singleWheelDialog.getOnScrollListener();
        if (onScrollListener == null) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        onScrollListener.invoke(bool, Boolean.TRUE, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SingleWheelDialog singleWheelDialog, WheelView wheelView, int i, int i2) {
        Function3<Boolean, Boolean, Boolean, Unit> onScrollListener = singleWheelDialog.getOnScrollListener();
        if (onScrollListener == null) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        onScrollListener.invoke(bool, bool, Boolean.TRUE);
    }

    private final boolean p() {
        return this.defaultSelectIndex == -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SingleWheelDialog singleWheelDialog, DialogInterface dialogInterface, int i) {
        singleWheelDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SingleWheelDialog singleWheelDialog, DialogInterface dialogInterface, int i) {
        WheelView wheelView = singleWheelDialog.wheelViewYear;
        if (wheelView != null) {
            int iIntValue = Integer.valueOf(wheelView.getCurrentItem()).intValue();
            Function3<Integer, Integer, Integer, Unit> function3 = singleWheelDialog.onChangeListener;
            if (function3 != null) {
                Integer numValueOf = Integer.valueOf(iIntValue);
                WheelView wheelView2 = singleWheelDialog.wheelViewMonth;
                Integer numValueOf2 = wheelView2 == null ? null : Integer.valueOf(wheelView2.getCurrentItem());
                WheelView wheelView3 = singleWheelDialog.wheelViewDay;
                function3.invoke(numValueOf, numValueOf2, wheelView3 != null ? Integer.valueOf(wheelView3.getCurrentItem()) : null);
            }
        }
        singleWheelDialog.dismissAllowingStateLoss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getDayPos() {
        WheelView wheelView = this.wheelViewDay;
        if (wheelView == null) {
            return -1;
        }
        return wheelView.getCurrentItem();
    }

    public final boolean getInitShowEndName() {
        return this.initShowEndName;
    }

    public final int getMonthPos() {
        WheelView wheelView = this.wheelViewMonth;
        if (wheelView == null) {
            return -1;
        }
        return wheelView.getCurrentItem();
    }

    @Nullable
    public final Function3<Boolean, Boolean, Boolean, Unit> getOnScrollListener() {
        return this.onScrollListener;
    }

    public final int getReverse() {
        return this.reverse;
    }

    public final int getYearPos() {
        WheelView wheelView = this.wheelViewYear;
        if (wheelView == null) {
            return -1;
        }
        return wheelView.getCurrentItem();
    }

    @Override // com.huami.android.design.dialog.AlertDialogFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DialogParams dialogParams = new DialogParams();
        dialogParams.title = "";
        dialogParams.contentView = getContentView();
        dialogParams.negativeButtonText = getString(R.string.fh_cancel);
        Integer num = this.nextBtnTextRes;
        if (num == null) {
            dialogParams.positiveButtonText = getString(R.string.fh_sure);
        } else {
            dialogParams.positiveButtonText = getString(num.intValue());
        }
        dialogParams.cancelable = false;
        dialogParams.negativeListener = new DialogInterface.OnClickListener() { // from class: mv6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SingleWheelDialog.q(this.a, dialogInterface, i);
            }
        };
        dialogParams.positiveListener = new DialogInterface.OnClickListener() { // from class: lv6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SingleWheelDialog.r(this.a, dialogInterface, i);
            }
        };
        setParams(dialogParams);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (p()) {
            dismiss();
        }
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (SupportAppHelper.INSTANCE.isAmazfit()) {
            view.setPadding((int) ExtKt.dpToPx(view, 10.0f), 0, (int) ExtKt.dpToPx(view, 10.0f), (int) ExtKt.dpToPx(view, 54.0f));
        }
    }

    public final void setInitShowEndName(boolean z) {
        this.initShowEndName = z;
    }

    public final void setOnScrollListener(@Nullable Function3<? super Boolean, ? super Boolean, ? super Boolean, Unit> function3) {
        this.onScrollListener = function3;
    }

    public final void setReverse(int i) {
        this.reverse = i;
    }

    @NotNull
    public final SingleWheelDialog<T> showDoubleWheel(@NotNull String startNameWith, @NotNull String endNameWith, @NotNull List<? extends T> showNames, int defaultSelectIndex) {
        this.showMonth = true;
        this.startNameWithMonth = startNameWith;
        this.endNameWithMonth = endNameWith;
        this.showNamesMonth = showNames;
        this.defaultSelectIndexMonth = defaultSelectIndex;
        WheelView wheelView = this.wheelViewMonth;
        if (wheelView != null) {
            wheelView.setViewAdapter(new com.huami.femalehealth.uilib.widget.dialog.a(wheelView.getContext(), wheelView, k(this.showNamesMonth)));
            wheelView.setCurrentItem(this.defaultSelectIndexMonth);
        }
        return this;
    }

    public final void showEndName(boolean visible) {
        View viewFindViewById;
        View view = getView();
        if (view == null || (viewFindViewById = view.findViewById(R.id.tv_subfix_year)) == null) {
            return;
        }
        ExtKt.setVisible$default(viewFindViewById, visible, false, 2, null);
    }

    @NotNull
    public final SingleWheelDialog<T> showThirdWheel(@NotNull String startNameWith, @NotNull String endNameWith, @NotNull List<? extends T> showNames, int defaultSelectIndex) {
        this.showDay = true;
        this.startNameWithDay = startNameWith;
        this.endNameWithDay = endNameWith;
        this.showNamesDay = showNames;
        this.defaultSelectIndexDay = defaultSelectIndex;
        WheelView wheelView = this.wheelViewDay;
        if (wheelView != null) {
            wheelView.setViewAdapter(new com.huami.femalehealth.uilib.widget.dialog.a(wheelView.getContext(), wheelView, k(this.showNamesDay)));
            wheelView.setCurrentItem(this.defaultSelectIndexDay);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleWheelDialog(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<? extends T> list, int i, @StringRes @Nullable Integer num, @Nullable Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3) {
        this.title = str;
        this.startNameWith = str2;
        this.endNameWith = str3;
        this.showNames = list;
        this.defaultSelectIndex = i;
        this.nextBtnTextRes = num;
        this.onChangeListener = function3;
        this.startNameWithMonth = "";
        this.endNameWithMonth = "";
        this.startNameWithDay = "";
        this.endNameWithDay = "";
        this.yearPos = -1;
        this.monthPos = -1;
        this.dayPos = -1;
        this.initShowEndName = true;
    }

    public SingleWheelDialog() {
        this("", "", "", CollectionsKt__CollectionsKt.emptyList(), -1, null, null);
    }
}
