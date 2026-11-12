package com.huami.moving.ui.animator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.model.bean.Update;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b6\u0018\u0000 t2\u00020\u0001:\u0003tuvB\u0097\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001b\u0012\u0006\u0010$\u001a\u00020\u001b\u0012\u0006\u0010&\u001a\u00020\u001b\u0012\u0006\u0010(\u001a\u00020\u001b\u0012\u0006\u0010*\u001a\u00020\u001b\u0012\u0006\u0010,\u001a\u00020\u001b\u0012\u0006\u0010.\u001a\u00020\u001b\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00104\u001a\u00020/\u0012\u0006\u00106\u001a\u00020/\u0012\u0006\u00108\u001a\u00020/\u0012\u0006\u0010:\u001a\u00020/\u0012\u0006\u0010<\u001a\u00020/\u0012\u0006\u0010>\u001a\u00020/\u0012\u0006\u0010@\u001a\u00020/¢\u0006\u0004\br\u0010sJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010$\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0016\u0010&\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0016\u0010(\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u0016\u0010*\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001dR\u0016\u0010,\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001dR\u0016\u0010.\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001dR\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00106\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R\u0016\u00108\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00101R\u0016\u0010:\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00101R\u0016\u0010<\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00101R\u0016\u0010>\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00101R\u0016\u0010@\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00101R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR\u001d\u0010N\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\b\u001c\u0010ER\u001d\u0010P\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010M\u001a\u0004\b\u001f\u0010ER\u001d\u0010R\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\b7\u0010ER\u001d\u0010T\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bI\u0010ER\u001d\u0010V\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010M\u001a\u0004\b-\u0010ER\u001d\u0010X\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010M\u001a\u0004\b=\u0010ER\u001d\u0010Z\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010M\u001a\u0004\b'\u0010ER\u001d\u0010\\\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010M\u001a\u0004\b5\u0010ER\u001d\u0010^\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010M\u001a\u0004\b?\u0010ER\u001d\u0010`\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010M\u001a\u0004\bB\u0010ER\u001d\u0010b\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010M\u001a\u0004\b+\u0010ER\u001d\u0010d\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010M\u001a\u0004\b)\u0010ER\u001d\u0010f\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010M\u001a\u0004\b9\u0010ER\u001d\u0010h\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010M\u001a\u0004\b;\u0010ER\u001d\u0010i\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010M\u001a\u0004\b%\u0010ER\u001d\u0010k\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010M\u001a\u0004\b#\u0010ER\u001d\u0010m\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010M\u001a\u0004\b3\u0010ER\u001d\u0010o\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010M\u001a\u0004\b0\u0010ER\u001d\u0010q\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010M\u001a\u0004\b!\u0010E¨\u0006w"}, d2 = {"Lcom/huami/moving/ui/animator/SportingAnimationProvider;", "", "", "Landroid/animation/Animator;", "u", "()[Landroid/animation/Animator;", "", Constant.PAI_KEY_DAILY_PAI, "a", "Lcom/huami/moving/ui/animator/SportingAnimationProvider$Status;", "status", "", "resetView", "Lcom/huami/moving/ui/animator/SportingAnimationProvider$Mode;", "mode", "openMapAnimation", "closeMapAnimation", "pauseAnimation", "resumeAnimation", "lockAnimation", "", "isPaused", "unlockAnimation", "(Z)[Landroid/animation/Animator;", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/view/View;", "b", "Landroid/view/View;", "btnContainer", "c", "settingsBtn", GoogleApiAvailabilityLight.a, "pauseBtn", "e", "resumeBtn", "f", "doneBtn", "g", "lockBtn", "h", "dataContainer", "i", "dataDisplayContainer", z.j, "dataMarginView", "Landroid/widget/TextView;", hl.k, "Landroid/widget/TextView;", Update.COLUMN_DATA1, "l", "data2", "m", "data3", GoogleApiAvailabilityLight.b, "data4", "o", "dataUnit1", com.google.android.exoplayer2.text.ttml.b.r, "dataUnit2", DTransferConstants.SEARCH_KEY, "dataUnit3", "r", "dataUnit4", "", SOAP.XMLNS, LogUtil.I, "getMapContainerHeight", "()I", "setMapContainerHeight", "(I)V", "mapContainerHeight", "t", "getDataTopMargin", "setDataTopMargin", "dataTopMargin", "Lkotlin/Lazy;", "btnContainerWidth", "v", "btnContainerWidthHalf", "w", "pauseBtnWidth", "x", "settingsBtnWidth", "y", "lockBtnWidth", "z", "resumeBtnWidth", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "doneBtnWidth", "B", "pauseBtnSideWidth", "C", "settingsBtnLeftMargin", LogUtil.D, "settingsBtnOnCenterLeftMargin", "E", "lockBtnRightMargin", "F", "lockBtnOnCenterRightMargin", "G", "resumeBtnLeftMargin", "H", "resumeBtnOnCenterLeftMargin", "doneBtnRightMargin", "J", "doneBtnOnCenterRightMargin", "K", "mapModeDataTopMargin", "L", "mapModeDataMargin", "M", "dataMargin", "<init>", "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V", "Companion", "Mode", "Status", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportingAnimationProvider {

    @NotNull
    private static final String N = "textSize";

    @NotNull
    private static final String O = "alpha";

    @NotNull
    private static final String P = "height";
    private static final float Q = 30.0f;
    private static final float R = 5.0f;
    private static final float S = 10.0f;
    private static final float T = 96.7f;
    private static final float U = 42.0f;
    private static final float V = 26.7f;
    private static final float W = 18.2f;
    private static final float X = 15.4f;
    private static final float Y = 12.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final View btnContainer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final View settingsBtn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final View pauseBtn;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final View resumeBtn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final View doneBtn;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final View lockBtn;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final View dataContainer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final View dataDisplayContainer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final View dataMarginView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final TextView data1;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final TextView data2;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final TextView data3;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final TextView data4;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final TextView dataUnit1;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final TextView dataUnit2;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final TextView dataUnit3;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final TextView dataUnit4;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int mapContainerHeight;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int dataTopMargin;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnContainerWidth = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnContainerWidthHalf = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final Lazy pauseBtnWidth = LazyKt__LazyJVMKt.lazy(new m());

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingsBtnWidth = LazyKt__LazyJVMKt.lazy(new s());

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy lockBtnWidth = LazyKt__LazyJVMKt.lazy(new i());

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy resumeBtnWidth = LazyKt__LazyJVMKt.lazy(new p());

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy doneBtnWidth = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy pauseBtnSideWidth = LazyKt__LazyJVMKt.lazy(new l());

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingsBtnLeftMargin = LazyKt__LazyJVMKt.lazy(new q());

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingsBtnOnCenterLeftMargin = LazyKt__LazyJVMKt.lazy(new r());

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Lazy lockBtnRightMargin = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final Lazy lockBtnOnCenterRightMargin = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final Lazy resumeBtnLeftMargin = LazyKt__LazyJVMKt.lazy(new n());

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private final Lazy resumeBtnOnCenterLeftMargin = LazyKt__LazyJVMKt.lazy(new o());

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final Lazy doneBtnRightMargin = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final Lazy doneBtnOnCenterRightMargin = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final Lazy mapModeDataTopMargin = LazyKt__LazyJVMKt.lazy(new k());

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private final Lazy mapModeDataMargin = LazyKt__LazyJVMKt.lazy(new j());

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataMargin = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/animator/SportingAnimationProvider$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "DATA", "MAP", "moving_release"}, k = 1, mv = {1, 5, 1})
    public enum Mode {
        DATA,
        MAP
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/animator/SportingAnimationProvider$Status;", "", "<init>", "(Ljava/lang/String;I)V", "PAUSED", "RESUMED", "moving_release"}, k = 1, mv = {1, 5, 1})
    public enum Status {
        PAUSED,
        RESUMED
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.PAUSED.ordinal()] = 1;
            iArr[Status.RESUMED.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ViewUtils.getWidth(SportingAnimationProvider.this.btnContainer);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return SportingAnimationProvider.this.b() / 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Integer> {
        public c() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return (int) SportingAnimationProvider.this.a(30.0f);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Integer> {
        public d() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return (SportingAnimationProvider.this.b() - SportingAnimationProvider.this.g()) / 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Integer> {
        public e() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ((SportingAnimationProvider.this.c() - SportingAnimationProvider.this.g()) * 2) / 3;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Integer> {
        public f() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ViewUtils.getWidth(SportingAnimationProvider.this.doneBtn);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Integer> {
        public g() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return (SportingAnimationProvider.this.b() - SportingAnimationProvider.this.j()) / 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Integer> {
        public h() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return (SportingAnimationProvider.this.m() - SportingAnimationProvider.this.j()) / 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Integer> {
        public i() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ViewUtils.getWidth(SportingAnimationProvider.this.lockBtn);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Integer> {
        public j() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return (int) SportingAnimationProvider.this.a(10.0f);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Integer> {
        public k() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return (int) SportingAnimationProvider.this.a(5.0f);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<Integer> {
        public l() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return (SportingAnimationProvider.this.b() - SportingAnimationProvider.this.n()) / 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<Integer> {
        public m() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ViewUtils.getWidth(SportingAnimationProvider.this.pauseBtn);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<Integer> {
        public n() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ((SportingAnimationProvider.this.c() - SportingAnimationProvider.this.q()) * 2) / 3;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<Integer> {
        public o() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return (SportingAnimationProvider.this.b() - SportingAnimationProvider.this.q()) / 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<Integer> {
        public p() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ViewUtils.getWidth(SportingAnimationProvider.this.resumeBtn);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<Integer> {
        public q() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return (SportingAnimationProvider.this.m() - SportingAnimationProvider.this.t()) / 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<Integer> {
        public r() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return (SportingAnimationProvider.this.b() - SportingAnimationProvider.this.t()) / 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<Integer> {
        public s() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ViewUtils.getWidth(SportingAnimationProvider.this.settingsBtn);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    public SportingAnimationProvider(@NotNull Context context, @NotNull View view, @NotNull View view2, @NotNull View view3, @NotNull View view4, @NotNull View view5, @NotNull View view6, @NotNull View view7, @NotNull View view8, @NotNull View view9, @NotNull TextView textView, @NotNull TextView textView2, @NotNull TextView textView3, @NotNull TextView textView4, @NotNull TextView textView5, @NotNull TextView textView6, @NotNull TextView textView7, @NotNull TextView textView8) {
        this.context = context;
        this.btnContainer = view;
        this.settingsBtn = view2;
        this.pauseBtn = view3;
        this.resumeBtn = view4;
        this.doneBtn = view5;
        this.lockBtn = view6;
        this.dataContainer = view7;
        this.dataDisplayContainer = view8;
        this.dataMarginView = view9;
        this.data1 = textView;
        this.data2 = textView2;
        this.data3 = textView3;
        this.data4 = textView4;
        this.dataUnit1 = textView5;
        this.dataUnit2 = textView6;
        this.dataUnit3 = textView7;
        this.dataUnit4 = textView8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float a(float dp) {
        return ViewUtils.dp2px(this.context, dp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b() {
        return ((Number) this.btnContainerWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c() {
        return ((Number) this.btnContainerWidthHalf.getValue()).intValue();
    }

    private final int d() {
        return ((Number) this.dataMargin.getValue()).intValue();
    }

    private final int e() {
        return ((Number) this.doneBtnOnCenterRightMargin.getValue()).intValue();
    }

    private final int f() {
        return ((Number) this.doneBtnRightMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int g() {
        return ((Number) this.doneBtnWidth.getValue()).intValue();
    }

    private final int h() {
        return ((Number) this.lockBtnOnCenterRightMargin.getValue()).intValue();
    }

    private final int i() {
        return ((Number) this.lockBtnRightMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int j() {
        return ((Number) this.lockBtnWidth.getValue()).intValue();
    }

    private final int k() {
        return ((Number) this.mapModeDataMargin.getValue()).intValue();
    }

    private final int l() {
        return ((Number) this.mapModeDataTopMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m() {
        return ((Number) this.pauseBtnSideWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n() {
        return ((Number) this.pauseBtnWidth.getValue()).intValue();
    }

    private final int o() {
        return ((Number) this.resumeBtnLeftMargin.getValue()).intValue();
    }

    private final int p() {
        return ((Number) this.resumeBtnOnCenterLeftMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int q() {
        return ((Number) this.resumeBtnWidth.getValue()).intValue();
    }

    private final int r() {
        return ((Number) this.settingsBtnLeftMargin.getValue()).intValue();
    }

    private final int s() {
        return ((Number) this.settingsBtnOnCenterLeftMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int t() {
        return ((Number) this.settingsBtnWidth.getValue()).intValue();
    }

    private final Animator[] u() {
        return new Animator[]{ObjectAnimator.ofInt(new AnimatorViewWrapper(this.resumeBtn), AnimatorViewWrapper.LEFT_MARGIN, p(), o()), ObjectAnimator.ofInt(new AnimatorViewWrapper(this.doneBtn), AnimatorViewWrapper.RIGHT_MARGIN, e(), f())};
    }

    @NotNull
    public final Animator[] closeMapAnimation() {
        return new Animator[]{ObjectAnimator.ofInt(new AnimatorViewWrapper(this.dataContainer), AnimatorViewWrapper.TOP_MARGIN, this.mapContainerHeight, 0), ObjectAnimator.ofInt(new AnimatorViewWrapper(this.dataDisplayContainer), AnimatorViewWrapper.TOP_MARGIN, l(), this.dataTopMargin), ObjectAnimator.ofInt(new AnimatorViewWrapper(this.dataMarginView), "height", k(), d()), ObjectAnimator.ofFloat(this.data1, N, 42.0f, T), ObjectAnimator.ofFloat(this.data2, N, W, V), ObjectAnimator.ofFloat(this.data3, N, W, V), ObjectAnimator.ofFloat(this.data4, N, W, V), ObjectAnimator.ofFloat(this.dataUnit1, N, 12.0f, X), ObjectAnimator.ofFloat(this.dataUnit2, N, 12.0f, X), ObjectAnimator.ofFloat(this.dataUnit3, N, 12.0f, X), ObjectAnimator.ofFloat(this.dataUnit4, N, 12.0f, X)};
    }

    public final int getDataTopMargin() {
        return this.dataTopMargin;
    }

    public final int getMapContainerHeight() {
        return this.mapContainerHeight;
    }

    @NotNull
    public final Animator[] lockAnimation() {
        AnimatorViewWrapper animatorViewWrapper = new AnimatorViewWrapper(this.settingsBtn);
        return new Animator[]{ObjectAnimator.ofFloat(new AnimatorViewWrapper(this.pauseBtn), AnimatorViewWrapper.SCALE, 1.0f, 0.0f), ObjectAnimator.ofFloat(animatorViewWrapper, AnimatorViewWrapper.SCALE, 1.0f, 0.0f), ObjectAnimator.ofInt(animatorViewWrapper, AnimatorViewWrapper.LEFT_MARGIN, r(), s()), ObjectAnimator.ofInt(new AnimatorViewWrapper(this.lockBtn), AnimatorViewWrapper.RIGHT_MARGIN, i(), h())};
    }

    @NotNull
    public final Animator[] openMapAnimation() {
        return new Animator[]{ObjectAnimator.ofInt(new AnimatorViewWrapper(this.dataContainer), AnimatorViewWrapper.TOP_MARGIN, 0, this.mapContainerHeight), ObjectAnimator.ofInt(new AnimatorViewWrapper(this.dataDisplayContainer), AnimatorViewWrapper.TOP_MARGIN, this.dataTopMargin, l()), ObjectAnimator.ofInt(new AnimatorViewWrapper(this.dataMarginView), "height", d(), k()), ObjectAnimator.ofFloat(this.data1, N, T, 42.0f), ObjectAnimator.ofFloat(this.data2, N, V, W), ObjectAnimator.ofFloat(this.data3, N, V, W), ObjectAnimator.ofFloat(this.data4, N, V, W), ObjectAnimator.ofFloat(this.dataUnit1, N, X, 12.0f), ObjectAnimator.ofFloat(this.dataUnit2, N, X, 12.0f), ObjectAnimator.ofFloat(this.dataUnit3, N, X, 12.0f), ObjectAnimator.ofFloat(this.dataUnit4, N, X, 12.0f)};
    }

    @NotNull
    public final Animator[] pauseAnimation() {
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(ObjectAnimator.ofFloat(new AnimatorViewWrapper(this.settingsBtn), AnimatorViewWrapper.SCALE, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.settingsBtn, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(new AnimatorViewWrapper(this.lockBtn), AnimatorViewWrapper.SCALE, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.lockBtn, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(new AnimatorViewWrapper(this.pauseBtn), AnimatorViewWrapper.SCALE, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.pauseBtn, "alpha", 1.0f, 0.0f));
        kotlin.collections.h.addAll(listMutableListOf, u());
        Object[] array = listMutableListOf.toArray(new Animator[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (Animator[]) array;
    }

    public final void resetView(@NotNull Status status) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i2 == 1) {
            this.settingsBtn.setVisibility(8);
            this.pauseBtn.setVisibility(8);
            this.lockBtn.setVisibility(8);
            this.resumeBtn.setVisibility(0);
            this.resumeBtn.setAlpha(1.0f);
            new AnimatorViewWrapper(this.resumeBtn).setLeftMargin(o());
            this.doneBtn.setVisibility(0);
            this.doneBtn.setAlpha(1.0f);
            new AnimatorViewWrapper(this.doneBtn).setRightMargin(f());
            return;
        }
        if (i2 != 2) {
            return;
        }
        this.resumeBtn.setVisibility(8);
        this.doneBtn.setVisibility(8);
        this.settingsBtn.setVisibility(0);
        this.settingsBtn.setAlpha(1.0f);
        AnimatorViewWrapper animatorViewWrapper = new AnimatorViewWrapper(this.settingsBtn);
        animatorViewWrapper.setScale(1.0f);
        animatorViewWrapper.setLeftMargin(r());
        this.pauseBtn.setVisibility(0);
        this.pauseBtn.setAlpha(1.0f);
        new AnimatorViewWrapper(this.pauseBtn).setScale(1.0f);
        this.lockBtn.setVisibility(0);
        AnimatorViewWrapper animatorViewWrapper2 = new AnimatorViewWrapper(this.lockBtn);
        animatorViewWrapper2.setScale(1.0f);
        animatorViewWrapper2.setRightMargin(i());
    }

    @NotNull
    public final Animator[] resumeAnimation() {
        return new Animator[]{ObjectAnimator.ofInt(new AnimatorViewWrapper(this.resumeBtn), AnimatorViewWrapper.LEFT_MARGIN, o(), p()), ObjectAnimator.ofFloat(this.resumeBtn, "alpha", 1.0f, 0.5f), ObjectAnimator.ofInt(new AnimatorViewWrapper(this.doneBtn), AnimatorViewWrapper.RIGHT_MARGIN, f(), e()), ObjectAnimator.ofFloat(this.doneBtn, "alpha", 1.0f, 0.1f), ObjectAnimator.ofFloat(new AnimatorViewWrapper(this.settingsBtn), AnimatorViewWrapper.SCALE, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.settingsBtn, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(new AnimatorViewWrapper(this.lockBtn), AnimatorViewWrapper.SCALE, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.lockBtn, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(new AnimatorViewWrapper(this.pauseBtn), AnimatorViewWrapper.SCALE, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.pauseBtn, "alpha", 0.0f, 1.0f)};
    }

    public final void setDataTopMargin(int i2) {
        this.dataTopMargin = i2;
    }

    public final void setMapContainerHeight(int i2) {
        this.mapContainerHeight = i2;
    }

    @NotNull
    public final Animator[] unlockAnimation(boolean isPaused) {
        if (isPaused) {
            return u();
        }
        AnimatorViewWrapper animatorViewWrapper = new AnimatorViewWrapper(this.settingsBtn);
        return new Animator[]{ObjectAnimator.ofFloat(new AnimatorViewWrapper(this.pauseBtn), AnimatorViewWrapper.SCALE, 0.0f, 1.0f), ObjectAnimator.ofFloat(animatorViewWrapper, AnimatorViewWrapper.SCALE, 0.0f, 1.0f), ObjectAnimator.ofInt(animatorViewWrapper, AnimatorViewWrapper.LEFT_MARGIN, s(), r()), ObjectAnimator.ofInt(new AnimatorViewWrapper(this.lockBtn), AnimatorViewWrapper.RIGHT_MARGIN, h(), i())};
    }

    public final void resetView(@NotNull Mode mode) {
        int i2;
        float f2;
        float f3;
        float f4;
        int iL = this.dataTopMargin;
        int iD = d();
        if (mode == Mode.MAP) {
            i2 = this.mapContainerHeight;
            iL = l();
            iD = k();
            f2 = 42.0f;
            f3 = W;
            f4 = 12.0f;
        } else {
            i2 = 0;
            f2 = T;
            f3 = V;
            f4 = X;
        }
        new AnimatorViewWrapper(this.dataContainer).setTopMargin(i2);
        new AnimatorViewWrapper(this.dataDisplayContainer).setTopMargin(iL);
        new AnimatorViewWrapper(this.dataMarginView).setHeight(iD);
        this.data1.setTextSize(f2);
        this.data2.setTextSize(f3);
        this.data3.setTextSize(f3);
        this.data4.setTextSize(f3);
        this.dataUnit1.setTextSize(f4);
        this.dataUnit2.setTextSize(f4);
        this.dataUnit3.setTextSize(f4);
        this.dataUnit4.setTextSize(f4);
    }
}
