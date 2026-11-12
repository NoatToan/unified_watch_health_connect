package com.huami.core.device.wifi_settings.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.sdk.m.x.d;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.core.device.wifi_settings.R;
import com.huami.core.device.wifi_settings.ui.CenterDialogFragment;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.twitter.sdk.android.tweetcomposer.g;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 s2\u00020\u00012\u00020\u0002:\u0003stuB\u000f\u0012\u0006\u0010=\u001a\u00020\u0015¢\u0006\u0004\bq\u0010rJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J-\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0013J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0013J-\u0010$\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00132\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010&\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010%J\u0010\u0010(\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010'J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020)J\"\u0010.\u001a\u00020\u00002\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010)J\u0010\u00100\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0002H\u0016J\u0010\u00101\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0002H\u0016J\b\u00102\u001a\u00020\u0003H\u0016J\b\u00103\u001a\u00020\u0003H\u0016J\u000e\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u000204J\u001a\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u00010\u0013H\u0016J\u0006\u00108\u001a\u00020\u001dJ\u000e\u0010:\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u001dR\u0016\u0010=\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0016\u0010H\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010<R\u0016\u0010J\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010<R\u0018\u0010L\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010DR\u0018\u0010N\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010DR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010QR\u0016\u0010V\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010QR\u0016\u0010X\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010QR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010`\u001a\u00060]R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_R\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010?R\u0018\u0010g\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010AR\u0018\u0010j\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010m\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010p\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006v"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/content/DialogInterface;", "", "initData", "c", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", "f", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "onStart", "", "negativeStr", "", "negativeColor", "Landroid/content/DialogInterface$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setNegativeButton", "(Ljava/lang/String;Ljava/lang/Integer;Landroid/content/DialogInterface$OnClickListener;)Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment;", "messageStr", "setMessage", "", "cancelable", "setCancel", "titleStr", d.o, "positiveStr", "positiveColor", "setPositiveButton", "Landroid/content/DialogInterface$OnDismissListener;", "setOnDismissListener", "Landroid/content/DialogInterface$OnCancelListener;", "setOnCancelListener", "Lcom/huami/core/device/wifi_settings/ui/MenuClickListener;", "setOnMenuClickListener", "", "Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment$MenuBean;", "menuData", "setMenuData", "dialog", "onCancel", "onDismiss", "dismiss", g.g, "Landroidx/fragment/app/FragmentManager;", "manager", "show", "tag", "isShowing", "fullScreen", "setFullScreen", "a", LogUtil.I, "mStyle", "b", "Z", "mFullScreen", "Landroid/content/DialogInterface$OnClickListener;", "mNegativeListener", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "mNegativeButtonText", "e", "mPositiveButtonText", "mNegativeTextColor", "g", "mPositiveTextColor", "h", "mMessageText", "i", "mTitleText", "Landroid/widget/TextView;", z.j, "Landroid/widget/TextView;", "mTvNegative", hl.k, "mTvPositive", "l", "mTvTitle", "m", "mTvMessage", "Landroidx/recyclerview/widget/RecyclerView;", GoogleApiAvailabilityLight.b, "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment$MenuAdapter;", "o", "Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment$MenuAdapter;", "mAdapter", b.r, "Ljava/util/List;", "mData", DTransferConstants.SEARCH_KEY, "mShowBottomLine", "r", "mPositiveListener", SOAP.XMLNS, "Landroid/content/DialogInterface$OnDismissListener;", "mDismissListener", "t", "Landroid/content/DialogInterface$OnCancelListener;", "mCancelListener", "u", "Lcom/huami/core/device/wifi_settings/ui/MenuClickListener;", "mMenuClickListener", "<init>", "(I)V", "Companion", "MenuAdapter", "MenuBean", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class CenterDialogFragment extends DialogFragment implements DialogInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int STYLE_MENU = 1;
    public static final int STYLE_NORMAL = 0;

    @NotNull
    public static final String TAG = "CenterMenuDialog";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean mFullScreen;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private DialogInterface.OnClickListener mNegativeListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String mNegativeButtonText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String mPositiveButtonText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String mMessageText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private String mTitleText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private TextView mTvNegative;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private TextView mTvPositive;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private TextView mTvTitle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private TextView mTvMessage;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private MenuAdapter mAdapter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private List<MenuBean> mData;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private DialogInterface.OnClickListener mPositiveListener;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    private DialogInterface.OnDismissListener mDismissListener;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    private DialogInterface.OnCancelListener mCancelListener;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    private MenuClickListener mMenuClickListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mNegativeTextColor = R.color.color_black;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int mPositiveTextColor = R.color.color_FF5353;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean mShowBottomLine = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment$Companion;", "", "", "style", "Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment;", "newInstance", "STYLE_MENU", LogUtil.I, "STYLE_NORMAL", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CenterDialogFragment newInstance$default(Companion companion, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return companion.newInstance(i);
        }

        @NotNull
        public final CenterDialogFragment newInstance(int style) {
            return new CenterDialogFragment(style);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u001dB\u0017\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\b\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\f2\u000e\u0010\n\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment$MenuAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment$MenuAdapter$MenuViewHolder;", "Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment$MenuBean;", "a", "Ljava/util/List;", "mData", "Lcom/huami/core/device/wifi_settings/ui/MenuClickListener;", "b", "Lcom/huami/core/device/wifi_settings/ui/MenuClickListener;", "getMListener", "()Lcom/huami/core/device/wifi_settings/ui/MenuClickListener;", "setMListener", "(Lcom/huami/core/device/wifi_settings/ui/MenuClickListener;)V", "mListener", "<init>", "(Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment;Ljava/util/List;)V", "MenuViewHolder", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public final class MenuAdapter extends RecyclerView.Adapter<MenuViewHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private List<MenuBean> mData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private MenuClickListener mListener;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment$MenuAdapter$MenuViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment$MenuBean;", "menu", "", "position", "", "bindData", "Landroidx/appcompat/widget/AppCompatTextView;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Landroidx/appcompat/widget/AppCompatTextView;", "tvMenu", "Landroid/view/View;", "b", "c", "()Landroid/view/View;", "line", "itemView", "<init>", "(Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment$MenuAdapter;Landroid/view/View;)V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
        public final class MenuViewHolder extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final Lazy tvMenu;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private final Lazy line;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<View> {
                public final /* synthetic */ View a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(View view) {
                    super(0);
                    this.a = view;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final View invoke() {
                    return this.a.findViewById(R.id.line);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/appcompat/widget/AppCompatTextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<AppCompatTextView> {
                public final /* synthetic */ View a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(View view) {
                    super(0);
                    this.a = view;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final AppCompatTextView invoke() {
                    return (AppCompatTextView) this.a.findViewById(R.id.tv_menu);
                }
            }

            public MenuViewHolder(View view) {
                super(view);
                this.tvMenu = LazyKt__LazyJVMKt.lazy(new b(view));
                this.line = LazyKt__LazyJVMKt.lazy(new a(view));
                final CenterDialogFragment centerDialogFragment = CenterDialogFragment.this;
                view.setOnClickListener(new View.OnClickListener() { // from class: im0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CenterDialogFragment.MenuAdapter.MenuViewHolder.b(menuAdapter, centerDialogFragment, view2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(MenuAdapter menuAdapter, CenterDialogFragment centerDialogFragment, View view) {
                MenuClickListener mListener;
                Object tag = view.getTag();
                if (tag == null || !(tag instanceof MenuBean) || (mListener = menuAdapter.getMListener()) == null) {
                    return;
                }
                mListener.onClickMenu(centerDialogFragment, (MenuBean) tag);
            }

            private final View c() {
                return (View) this.line.getValue();
            }

            private final AppCompatTextView d() {
                return (AppCompatTextView) this.tvMenu.getValue();
            }

            public final void bindData(@NotNull MenuBean menu, int position) {
                menu.setMenuIndex(position);
                this.itemView.setTag(menu);
                d().setText(menu.getContent());
                int menuTextColor = menu.getMenuTextColor();
                if (menuTextColor != -1) {
                    d().setTextColor(menuTextColor);
                }
                int menuBgColor = menu.getMenuBgColor();
                if (menuBgColor != -1) {
                    this.itemView.setBackgroundColor(menuBgColor);
                }
                int i = position + 1;
                List list = MenuAdapter.this.mData;
                if (!(list != null && i == list.size()) || CenterDialogFragment.this.mShowBottomLine) {
                    c().setVisibility(0);
                } else {
                    c().setVisibility(8);
                }
            }
        }

        public MenuAdapter(List<MenuBean> list) {
            this.mData = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<MenuBean> list = this.mData;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Nullable
        public final MenuClickListener getMListener() {
            return this.mListener;
        }

        public final void setMListener(@Nullable MenuClickListener menuClickListener) {
            this.mListener = menuClickListener;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull MenuViewHolder holder, int position) {
            MenuBean menuBean;
            List<MenuBean> list = this.mData;
            if (list == null || (menuBean = list.get(position)) == null) {
                return;
            }
            holder.bindData(menuBean, position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public MenuViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            return new MenuViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.wifi_setting_menu_item, parent, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("BaseDialogFragment show Exception :", this.a.getMessage());
        }
    }

    public CenterDialogFragment(int i) {
        this.mStyle = i;
    }

    private final void c() {
        TextView textView = this.mTvNegative;
        if (textView == null) {
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: gm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CenterDialogFragment.d(this.a, view);
            }
        });
        TextView textView2 = this.mTvPositive;
        (textView2 != null ? textView2 : null).setOnClickListener(new View.OnClickListener() { // from class: hm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CenterDialogFragment.e(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CenterDialogFragment centerDialogFragment, View view) {
        DialogInterface.OnClickListener onClickListener = centerDialogFragment.mNegativeListener;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(centerDialogFragment, -2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CenterDialogFragment centerDialogFragment, View view) {
        DialogInterface.OnClickListener onClickListener = centerDialogFragment.mPositiveListener;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(centerDialogFragment, -1);
    }

    private final void f() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setHasFixedSize(true);
        MenuAdapter menuAdapter = new MenuAdapter(this.mData);
        this.mAdapter = menuAdapter;
        menuAdapter.setMListener(this.mMenuClickListener);
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        MenuAdapter menuAdapter2 = this.mAdapter;
        recyclerView3.setAdapter(menuAdapter2 != null ? menuAdapter2 : null);
    }

    private final void initData() {
        String str = this.mTitleText;
        if (str != null) {
            TextView textView = this.mTvTitle;
            if (textView == null) {
                textView = null;
            }
            textView.setVisibility(0);
            TextView textView2 = this.mTvTitle;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(str);
        }
        String str2 = this.mNegativeButtonText;
        if (str2 != null) {
            TextView textView3 = this.mTvNegative;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setVisibility(0);
            TextView textView4 = this.mTvNegative;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setText(str2);
            TextView textView5 = this.mTvNegative;
            if (textView5 == null) {
                textView5 = null;
            }
            TextView textView6 = this.mTvNegative;
            if (textView6 == null) {
                textView6 = null;
            }
            textView5.setTextColor(ContextCompat.getColor(textView6.getContext(), this.mNegativeTextColor));
        }
        String str3 = this.mPositiveButtonText;
        if (str3 != null) {
            TextView textView7 = this.mTvPositive;
            if (textView7 == null) {
                textView7 = null;
            }
            textView7.setVisibility(0);
            TextView textView8 = this.mTvPositive;
            if (textView8 == null) {
                textView8 = null;
            }
            textView8.setText(str3);
            TextView textView9 = this.mTvPositive;
            if (textView9 == null) {
                textView9 = null;
            }
            TextView textView10 = this.mTvPositive;
            if (textView10 == null) {
                textView10 = null;
            }
            textView9.setTextColor(ContextCompat.getColor(textView10.getContext(), this.mPositiveTextColor));
        }
        TextView textView11 = this.mTvMessage;
        if (textView11 == null) {
            textView11 = null;
        }
        textView11.setText(this.mMessageText);
        if (TextUtils.isEmpty(this.mPositiveButtonText) && TextUtils.isEmpty(this.mNegativeButtonText)) {
            View view = getView();
            ((LinearLayout) (view != null ? view.findViewById(R.id.layout_bottom) : null)).setVisibility(8);
            this.mShowBottomLine = false;
        } else {
            View view2 = getView();
            ((LinearLayout) (view2 != null ? view2.findViewById(R.id.layout_bottom) : null)).setVisibility(0);
            this.mShowBottomLine = true;
        }
    }

    private final void initView(View view) {
        this.mTvTitle = (TextView) view.findViewById(R.id.tv_title);
        this.mTvMessage = (TextView) view.findViewById(R.id.tv_message);
        this.mTvNegative = (TextView) view.findViewById(R.id.tv_negative);
        this.mTvPositive = (TextView) view.findViewById(R.id.tv_positive);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycle_menu);
        this.mRecyclerView = recyclerView;
        if (this.mStyle != 1) {
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView.setVisibility(8);
        } else {
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView.setVisibility(0);
            f();
        }
    }

    public static /* synthetic */ CenterDialogFragment setMenuData$default(CenterDialogFragment centerDialogFragment, List list, MenuClickListener menuClickListener, int i, Object obj) {
        if ((i & 2) != 0) {
            menuClickListener = null;
        }
        return centerDialogFragment.setMenuData(list, menuClickListener);
    }

    public static /* synthetic */ CenterDialogFragment setNegativeButton$default(CenterDialogFragment centerDialogFragment, String str, Integer num, DialogInterface.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            onClickListener = null;
        }
        return centerDialogFragment.setNegativeButton(str, num, onClickListener);
    }

    public static /* synthetic */ CenterDialogFragment setPositiveButton$default(CenterDialogFragment centerDialogFragment, String str, Integer num, DialogInterface.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            onClickListener = null;
        }
        return centerDialogFragment.setPositiveButton(str, num, onClickListener);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.content.DialogInterface
    public void cancel() {
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        Dialog dialog;
        if (!isAdded() || isDetached() || (dialog = getDialog()) == null || !dialog.isShowing()) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    public final boolean isShowing() {
        Dialog dialog = getDialog();
        if (dialog == null) {
            return false;
        }
        return dialog.isShowing();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialog) {
        super.onCancel(dialog);
        DialogInterface.OnCancelListener onCancelListener = this.mCancelListener;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialog);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.wifi_setting_dialog_menu, container);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = this.mDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 17;
        attributes.width = -1;
        if (this.mFullScreen) {
            attributes.height = -1;
            attributes.width = -1;
        } else {
            attributes.height = -2;
            attributes.width = -2;
        }
        window.setAttributes(attributes);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        initData();
        c();
    }

    @NotNull
    public final CenterDialogFragment setCancel(boolean cancelable) {
        setCancelable(cancelable);
        return this;
    }

    @NotNull
    public final CenterDialogFragment setFullScreen(boolean fullScreen) {
        this.mFullScreen = fullScreen;
        return this;
    }

    @NotNull
    public final CenterDialogFragment setMenuData(@Nullable List<MenuBean> menuData, @Nullable MenuClickListener listener) {
        this.mData = menuData;
        this.mMenuClickListener = listener;
        return this;
    }

    @NotNull
    public final CenterDialogFragment setMessage(@NotNull String messageStr) {
        this.mMessageText = messageStr;
        return this;
    }

    @NotNull
    public final CenterDialogFragment setNegativeButton(@NotNull String negativeStr, @Nullable Integer negativeColor, @Nullable DialogInterface.OnClickListener listener) {
        this.mNegativeButtonText = negativeStr;
        if (negativeColor != null) {
            this.mNegativeTextColor = negativeColor.intValue();
        }
        this.mNegativeListener = listener;
        return this;
    }

    @NotNull
    public final CenterDialogFragment setOnCancelListener(@Nullable DialogInterface.OnCancelListener listener) {
        this.mCancelListener = listener;
        return this;
    }

    public final void setOnDismissListener(@Nullable DialogInterface.OnDismissListener listener) {
        this.mDismissListener = listener;
    }

    @NotNull
    public final CenterDialogFragment setOnMenuClickListener(@NotNull MenuClickListener listener) {
        this.mMenuClickListener = listener;
        return this;
    }

    @NotNull
    public final CenterDialogFragment setPositiveButton(@NotNull String positiveStr, @Nullable Integer positiveColor, @Nullable DialogInterface.OnClickListener listener) {
        this.mPositiveButtonText = positiveStr;
        if (positiveColor != null) {
            this.mPositiveTextColor = positiveColor.intValue();
        }
        this.mPositiveListener = listener;
        return this;
    }

    @NotNull
    public final CenterDialogFragment setTitle(@NotNull String titleStr) {
        this.mTitleText = titleStr;
        return this;
    }

    public final void show(@NotNull FragmentManager manager) {
        show(manager, TAG);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull FragmentManager manager, @Nullable String tag) {
        try {
            FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
            fragmentTransactionBeginTransaction.remove(this).commitAllowingStateLoss();
            fragmentTransactionBeginTransaction.add(this, tag);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } catch (Exception e) {
            HMLog.error$default(TAG, null, null, new a(e), 6, null);
            e.printStackTrace();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001d¨\u0006&"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment$MenuBean;", "", "", "component1", "", "component2", "component3", "component4", "content", "menuTextColor", "menuBgColor", "menuIndex", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "b", LogUtil.I, "getMenuTextColor", "()I", "setMenuTextColor", "(I)V", "c", "getMenuBgColor", "setMenuBgColor", GoogleApiAvailabilityLight.a, "getMenuIndex", "setMenuIndex", "<init>", "(Ljava/lang/String;III)V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class MenuBean {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private String content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private int menuTextColor;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private int menuBgColor;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private int menuIndex;

        public MenuBean(@NotNull String str, int i, int i2, int i3) {
            this.content = str;
            this.menuTextColor = i;
            this.menuBgColor = i2;
            this.menuIndex = i3;
        }

        public static /* synthetic */ MenuBean copy$default(MenuBean menuBean, String str, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = menuBean.content;
            }
            if ((i4 & 2) != 0) {
                i = menuBean.menuTextColor;
            }
            if ((i4 & 4) != 0) {
                i2 = menuBean.menuBgColor;
            }
            if ((i4 & 8) != 0) {
                i3 = menuBean.menuIndex;
            }
            return menuBean.copy(str, i, i2, i3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMenuTextColor() {
            return this.menuTextColor;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getMenuBgColor() {
            return this.menuBgColor;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getMenuIndex() {
            return this.menuIndex;
        }

        @NotNull
        public final MenuBean copy(@NotNull String content, int menuTextColor, int menuBgColor, int menuIndex) {
            return new MenuBean(content, menuTextColor, menuBgColor, menuIndex);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MenuBean)) {
                return false;
            }
            MenuBean menuBean = (MenuBean) other;
            return Intrinsics.areEqual(this.content, menuBean.content) && this.menuTextColor == menuBean.menuTextColor && this.menuBgColor == menuBean.menuBgColor && this.menuIndex == menuBean.menuIndex;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public final int getMenuBgColor() {
            return this.menuBgColor;
        }

        public final int getMenuIndex() {
            return this.menuIndex;
        }

        public final int getMenuTextColor() {
            return this.menuTextColor;
        }

        public int hashCode() {
            return (((((this.content.hashCode() * 31) + this.menuTextColor) * 31) + this.menuBgColor) * 31) + this.menuIndex;
        }

        public final void setContent(@NotNull String str) {
            this.content = str;
        }

        public final void setMenuBgColor(int i) {
            this.menuBgColor = i;
        }

        public final void setMenuIndex(int i) {
            this.menuIndex = i;
        }

        public final void setMenuTextColor(int i) {
            this.menuTextColor = i;
        }

        @NotNull
        public String toString() {
            return "MenuBean(content=" + this.content + ", menuTextColor=" + this.menuTextColor + ", menuBgColor=" + this.menuBgColor + ", menuIndex=" + this.menuIndex + ')';
        }

        public /* synthetic */ MenuBean(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? -1 : i, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) != 0 ? 0 : i3);
        }
    }
}
