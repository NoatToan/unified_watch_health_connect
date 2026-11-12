package com.xiaomi.hm.health.relation;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.timepicker.TimeModel;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.relatives.FriendsAndFamilyInject;
import com.huami.relatives.event.EventCareSend;
import com.huami.relatives.event.EventFriendRemoved;
import com.huami.relatives.event.EventFriendSearch;
import com.huami.tools.log.HMLog;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.utils.easypermission.PermissionDialogFragmentCompat;
import com.huami.widget.share.ShareConfig;
import com.huami.widget.share.ShareContent;
import com.huami.widget.share.ShareDialog;
import com.huami.widget.share.ShareListener;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.databases.model.Friend;
import com.xiaomi.hm.health.databases.model.FriendMessage;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.push.MessageManager;
import com.xiaomi.hm.health.push.event.EventNewMessageReceived;
import com.xiaomi.hm.health.relation.FriendFrag;
import com.xiaomi.hm.health.relation.copy.AvatarManager;
import com.xiaomi.hm.health.relation.copy.FragmentTrackHelper;
import com.xiaomi.hm.health.relation.copy.SystemBarTintSupport;
import com.xiaomi.hm.health.relation.copy.UnitTextView;
import com.xiaomi.hm.health.relation.event.EventAcceptInvite;
import com.xiaomi.hm.health.relation.event.EventDetailLoad;
import com.xiaomi.hm.health.relation.event.EventFriendLoad;
import com.xiaomi.hm.health.relation.event.EventFriendShareInvite;
import com.xiaomi.hm.health.relation.message.CareMessage;
import com.xiaomi.hm.health.relation.message.FollowMessage;
import com.xiaomi.hm.health.relation.message.UnfollowMessage;
import com.xiaomi.hm.health.relation.utils.TimeUtils;
import com.xiaomi.hm.health.relation.utils.Utils;
import com.xiaomi.hm.health.relation.view.BaseFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.cybergarage.soap.SOAP;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u008e\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0006\u008e\u0001\u008f\u0001\u0090\u0001B\t¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016J0\u0010\u001b\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0012\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0006\u0010!\u001a\u00020\nJ\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\nH\u0016J\u0010\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\bH\u0016J\u0010\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020\bH\u0016J\b\u0010(\u001a\u00020\nH\u0016J&\u0010-\u001a\u0004\u0018\u00010\u00152\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u000e\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020.J\u0018\u00104\u001a\u00020\n2\u0006\u00102\u001a\u0002012\u0006\u0010*\u001a\u000203H\u0016J\u0010\u00107\u001a\u00020\b2\u0006\u00106\u001a\u000205H\u0016J\u000e\u00100\u001a\u00020\n2\u0006\u00109\u001a\u000208J\u000e\u00100\u001a\u00020\n2\u0006\u00109\u001a\u00020:J\u000e\u00100\u001a\u00020\n2\u0006\u00109\u001a\u00020;J\u000e\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020<J\u000e\u00100\u001a\u00020\n2\u0006\u0010>\u001a\u00020=J\u000e\u00100\u001a\u00020\n2\u0006\u0010@\u001a\u00020?J\u000e\u00100\u001a\u00020\n2\u0006\u00109\u001a\u00020AJ\u000e\u00100\u001a\u00020\n2\u0006\u0010C\u001a\u00020BJ\u000e\u00100\u001a\u00020\n2\u0006\u00109\u001a\u00020DJ\u000e\u00100\u001a\u00020\n2\u0006\u0010F\u001a\u00020EJ\b\u0010G\u001a\u00020\nH\u0016J\u001e\u0010L\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u00172\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0IH\u0016J\u001e\u0010M\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u00172\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0IH\u0016J/\u0010R\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u00172\u000e\u0010O\u001a\n\u0012\u0006\b\u0001\u0012\u00020J0N2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SR\u001d\u0010Y\u001a\u00020T8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0016\u0010H\u001a\u00020\u00178\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020J8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010f\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010j\u001a\u00020g8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010n\u001a\u00020k8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bl\u0010mR\u001a\u0010r\u001a\u00060oR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010u\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010w\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bv\u0010tR\u0016\u0010{\u001a\u00020x8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010|\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010tR\u0016\u0010~\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010tR\u0017\u0010\u0080\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u007fR\u0019\u0010\u0083\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0082\u0001R\u0017\u0010\u0084\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010\u007fR\u0017\u0010\u0085\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010tR\u0017\u0010\u0086\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010[R!\u0010\u008b\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u0087\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u0091\u0001"}, d2 = {"Lcom/xiaomi/hm/health/relation/FriendFrag;", "Lcom/xiaomi/hm/health/relation/view/BaseFragment;", "Landroid/view/View$OnClickListener;", "Landroid/widget/AdapterView$OnItemClickListener;", "Lcom/xiaomi/hm/health/relation/FriendMenuFragment$OnDialogDismissListener;", "Ljava/lang/Runnable;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/utils/easypermission/EasyPermissions$PermissionCallbacks;", "", "r", "", GoogleApiAvailabilityLight.b, "B", DTransferConstants.SEARCH_KEY, "C", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "l", "o", "onDismiss", "Landroid/widget/AdapterView;", "parent", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "position", "", "id", "onItemClick", "v", "onClick", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onSelect", "onResume", "onPause", "isVisibleToUser", "setUserVisibleHint", "hidden", "onHiddenChanged", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "Lcom/xiaomi/hm/health/relation/message/FollowMessage;", "message", "onEvent", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "Lcom/xiaomi/hm/health/push/event/EventNewMessageReceived;", "event", "Lcom/xiaomi/hm/health/relation/event/EventFriendShareInvite;", "Lcom/huami/relatives/event/EventFriendRemoved;", "Lcom/xiaomi/hm/health/relation/message/UnfollowMessage;", "Lcom/xiaomi/hm/health/relation/event/EventFriendLoad;", "loadEvent", "Lcom/xiaomi/hm/health/relation/message/CareMessage;", "careMessage", "Lcom/huami/relatives/event/EventCareSend;", "Lcom/xiaomi/hm/health/relation/event/EventAcceptInvite;", "acceptEvent", "Lcom/xiaomi/hm/health/relation/event/EventDetailLoad;", "Lcom/huami/relatives/event/EventFriendSearch;", "searchEvent", "run", "requestCode", "", "", "perms", "onPermissionsGranted", "onPermissionsDenied", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/huami/relatives/FriendsAndFamilyInject;", "a", "Lkotlin/Lazy;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/relatives/FriendsAndFamilyInject;", "friendsAndFamilyInject", "b", LogUtil.I, "c", "Ljava/lang/String;", "TAG", "Lcom/xiaomi/hm/health/relation/FriendManager;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/relation/FriendManager;", "mFriendManager", "Lcom/xiaomi/hm/health/relation/FriendMenuFragment;", "e", "Lcom/xiaomi/hm/health/relation/FriendMenuFragment;", "mMenuFragment", "Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "f", "Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "mRefreshView", "Landroid/widget/ListView;", "g", "Landroid/widget/ListView;", "mFriendsView", "Lcom/xiaomi/hm/health/relation/FriendFrag$FriedAdapter;", "h", "Lcom/xiaomi/hm/health/relation/FriendFrag$FriedAdapter;", "mFriendAdapter", "i", "Landroid/view/View;", "mEmptyView", z.j, RootDescription.ROOT_ELEMENT, "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", hl.k, "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "friendToolBar", "back", "m", "red", "Z", "userVisible", "Lcom/xiaomi/hm/health/relation/copy/FragmentTrackHelper;", "Lcom/xiaomi/hm/health/relation/copy/FragmentTrackHelper;", "trackHelper", "mShowed", "mNewMessgeFlag", "totalFriend", "Ljava/util/Comparator;", "Lcom/xiaomi/hm/health/databases/model/Friend;", SOAP.XMLNS, "Ljava/util/Comparator;", "comparator", "<init>", "()V", "Companion", "FriedAdapter", "ViewHolder", "relatives_release"}, k = 1, mv = {1, 5, 1})
public final class FriendFrag extends BaseFragment implements View.OnClickListener, AdapterView.OnItemClickListener, FriendMenuFragment.OnDialogDismissListener, Runnable, KoinComponent, EasyPermissions.PermissionCallbacks {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int PAGE_SIZE = 100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy friendsAndFamilyInject;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int requestCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private FriendManager mFriendManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private FriendMenuFragment mMenuFragment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private SmartRefreshLayout mRefreshView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private ListView mFriendsView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final FriedAdapter mFriendAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private View mEmptyView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private View root;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private RainbowTitleBar friendToolBar;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private View back;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private View red;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean userVisible;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final FragmentTrackHelper trackHelper;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean mShowed;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private View mNewMessgeFlag;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int totalFriend;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Comparator<Friend> comparator;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/relation/FriendFrag$Companion;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "nickname", "shareUrl", "", "popUpFriendShareInviteDialog", "", "PAGE_SIZE", LogUtil.I, "<init>", "()V", "relatives_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void popUpFriendShareInviteDialog(@NotNull final FragmentActivity activity, @NotNull final String nickname, @NotNull final String shareUrl) {
            if (TextUtils.isEmpty(nickname) || TextUtils.isEmpty(shareUrl)) {
                return;
            }
            ShareConfig shareConfig = new ShareConfig();
            shareConfig.isOnlyImage = false;
            shareConfig.title = activity.getString(R.string.relatives_share_to);
            shareConfig.shareItemType = 3;
            shareConfig.isFaceBookForbidden = DifferenceManager.INSTANCE.isFaceBookForbidden();
            ShareDialog shareDialogNewInstance = ShareDialog.newInstance(shareConfig);
            shareDialogNewInstance.setShareListener(new ShareListener() { // from class: com.xiaomi.hm.health.relation.FriendFrag$Companion$popUpFriendShareInviteDialog$1
                @Override // com.huami.widget.share.ShareListener
                public void onFailed(int shareType, @NotNull String message) {
                    HMLog.w(ConstantKt.TAG, message, new Object[0]);
                }

                @Override // com.huami.widget.share.ShareListener
                @NotNull
                public ShareContent onShareContentCreated(int shareType) {
                    ShareContent shareContent = new ShareContent();
                    FragmentActivity fragmentActivity = activity;
                    shareContent.title = fragmentActivity.getString(R.string.relatives_label_share_friend_invite_content, new Object[]{nickname, fragmentActivity.getString(R.string.relatives_app_name)});
                    shareContent.url = shareUrl;
                    shareContent.content = "";
                    shareContent.bitmapUrl = "";
                    shareContent.topic = "";
                    return shareContent;
                }

                @Override // com.huami.widget.share.ShareListener
                public void onStart(int shareType) {
                }

                @Override // com.huami.widget.share.ShareListener
                public void onSuccess(int shareType) {
                }
            });
            shareDialogNewInstance.show(activity.getSupportFragmentManager());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0007H\u0016J\"\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0012\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0003J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u0018\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u0015R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/relation/FriendFrag$FriedAdapter;", "Landroid/widget/BaseAdapter;", "", "Lcom/xiaomi/hm/health/databases/model/Friend;", "friends", "", "addAll", "", "getCount", "position", "getItem", "", "getItemId", "Landroid/view/View;", "pconvertView", "Landroid/view/ViewGroup;", "parent", "getView", "clear", RemarkActivity.INPUT_FRIEND, "addFriend", "", "uid", "removeFriend", "updateItem", "getItemByUid", "Ljava/util/ArrayList;", "a", "Ljava/util/ArrayList;", "<init>", "(Lcom/xiaomi/hm/health/relation/FriendFrag;)V", "relatives_release"}, k = 1, mv = {1, 5, 1})
    public final class FriedAdapter extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ArrayList<Friend> friends = new ArrayList<>();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Friend;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Friend, Boolean> {
            public final /* synthetic */ Friend a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Friend friend) {
                super(1);
                this.a = friend;
            }

            public final boolean a(@NotNull Friend friend) {
                return Intrinsics.areEqual(friend.uid, this.a.uid);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Friend friend) {
                return Boolean.valueOf(a(friend));
            }
        }

        public FriedAdapter() {
        }

        public final synchronized void addAll(@Nullable List<? extends Friend> friends) {
            if (friends == null) {
                return;
            }
            for (Friend friend : friends) {
                kotlin.collections.h.removeAll((List) this.friends, (Function1) new a(friend));
                this.friends.add(friend);
            }
            Collections.sort(this.friends, FriendFrag.this.comparator);
            notifyDataSetChanged();
        }

        public final void addFriend(int position, @NotNull Friend friend) {
            if (this.friends.contains(friend)) {
                this.friends.remove(friend);
            }
            this.friends.add(position, friend);
            notifyDataSetChanged();
        }

        public final void clear() {
            this.friends.clear();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.friends.size();
        }

        @Nullable
        public final Friend getItemByUid(@NotNull String uid) {
            int size = this.friends.size();
            if (size <= 0) {
                return null;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Friend friend = this.friends.get(i);
                if (Intrinsics.areEqual(friend.uid, uid) || i2 >= size) {
                    return friend;
                }
                i = i2;
            }
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return Long.valueOf(this.friends.get(position).uid).longValue();
        }

        @Override // android.widget.Adapter
        @NotNull
        public View getView(int position, @Nullable View pconvertView, @NotNull ViewGroup parent) {
            ViewHolder viewHolder;
            String dateTime_y;
            if (pconvertView == null) {
                pconvertView = View.inflate(FriendFrag.this.getContext(), R.layout.relatives_friend_list_item, null);
                viewHolder = FriendFrag.this.new ViewHolder();
                viewHolder.setIcon((ImageView) pconvertView.findViewById(R.id.icon));
                viewHolder.setSpace(pconvertView.findViewById(R.id.space_view));
                viewHolder.setName((TextView) pconvertView.findViewById(R.id.username));
                viewHolder.setLastUpdateTime((TextView) pconvertView.findViewById(R.id.last_update_time));
                viewHolder.setCareCountByMe((TextView) pconvertView.findViewById(R.id.careByMe));
                viewHolder.setStep((TextView) pconvertView.findViewById(R.id.step));
                viewHolder.setSleepTime((UnitTextView) pconvertView.findViewById(R.id.sleep));
                viewHolder.setWeight((TextView) pconvertView.findViewById(R.id.weight));
                viewHolder.setWeightTitle((TextView) pconvertView.findViewById(R.id.weight_title));
                viewHolder.setCareIcon((ImageView) pconvertView.findViewById(R.id.care_icon));
                viewHolder.setTz((TextView) pconvertView.findViewById(R.id.last_update_tz));
                pconvertView.setTag(viewHolder);
            } else {
                Object tag = pconvertView.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.xiaomi.hm.health.relation.FriendFrag.ViewHolder");
                viewHolder = (ViewHolder) tag;
            }
            Friend item = getItem(position);
            AvatarManager.updateAvatarUI(viewHolder.getIcon(), item.icon, true, item.getDisplayName());
            TextView name = viewHolder.getName();
            if (name != null) {
                name.setText(item.getDisplayName());
            }
            if (item.careCountByMe.intValue() <= 0) {
                TextView careCountByMe = viewHolder.getCareCountByMe();
                if (careCountByMe != null) {
                    careCountByMe.setText(R.string.relatives_label_no_care_time_by_me);
                }
                Drawable drawable = ContextCompat.getDrawable(FriendFrag.this.requireContext(), R.drawable.relatives_ic_grey_heart);
                FriendFrag friendFrag = FriendFrag.this;
                if (RainbowUtils.isDarkMode(friendFrag.requireContext())) {
                    drawable.setTint(ContextCompat.getColor(friendFrag.requireContext(), R.color.s5));
                }
                viewHolder.getCareIcon().setImageDrawable(drawable);
            } else {
                TextView careCountByMe2 = viewHolder.getCareCountByMe();
                if (careCountByMe2 != null) {
                    FriendFrag friendFrag2 = FriendFrag.this;
                    int i = R.string.relatives_label_care_time_by_me;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    careCountByMe2.setText(friendFrag2.getString(i, String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{item.careCountByMe}, 1))));
                }
                viewHolder.getCareIcon().setImageResource(R.drawable.relatives_ic_red_heart);
            }
            Long l = item.lastUpdateTime;
            if (l != null && l.longValue() == 0) {
                dateTime_y = FriendFrag.this.getString(R.string.relatives_label_no_update);
            } else {
                Integer num = item.tz;
                if (num == null || (num != null && num.intValue() == -100)) {
                    dateTime_y = TimeUtils.formatDateTime_y(RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getAppContext(), item.lastUpdateTime.longValue());
                } else {
                    Context appContext = RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getAppContext();
                    Date date = new Date(item.lastUpdateTime.longValue());
                    TimeZone timeZone = Calendar.getInstance().getTimeZone();
                    TimeZone timeZone2 = Calendar.getInstance().getTimeZone();
                    timeZone2.setRawOffset(item.tz.intValue() * 1000);
                    Unit unit = Unit.INSTANCE;
                    dateTime_y = TimeUtils.formatDateTime_y(appContext, TimeUtils.transformTime(date, timeZone, timeZone2));
                }
            }
            TextView lastUpdateTime = viewHolder.getLastUpdateTime();
            if (lastUpdateTime != null) {
                lastUpdateTime.setText(FriendFrag.this.getString(R.string.relatives_label_update_time, dateTime_y));
            }
            viewHolder.getStep().setText(FriendFragKt.getLocaleValue(item.step.intValue()));
            Integer num2 = item.sleepTime;
            if (num2 != null && num2.intValue() == 0) {
                UnitTextView sleepTime = viewHolder.getSleepTime();
                if (sleepTime != null) {
                    sleepTime.setValues("--", "");
                }
            } else {
                viewHolder.setSleepValue(item.sleepTime.intValue());
            }
            String[] weight = FriendUtils.formatWeight(pconvertView.getContext(), FriendUtils.transformWeight(item.weight.intValue()));
            viewHolder.getWeightTitle().setText(FriendFrag.this.getString(R.string.relatives_label_weight, weight[1]));
            viewHolder.getWeight().setText(FriendFragKt.getLocaleValue(weight[0]));
            Integer num3 = item.tz;
            if (num3 == null || (num3 != null && num3.intValue() == -100)) {
                viewHolder.getTz().setVisibility(8);
            } else {
                viewHolder.getTz().setText(FriendUtils.getUtcString(FriendFrag.this.getContext(), item.tz.intValue(), ""));
                viewHolder.getTz().setVisibility(0);
            }
            return pconvertView;
        }

        public final void removeFriend(@NotNull String uid) {
            Iterator<Friend> it2 = this.friends.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(it2.next().getUid(), uid)) {
                    it2.remove();
                }
            }
            notifyDataSetChanged();
        }

        public final void updateItem(@Nullable Friend friend) {
            if (friend == null) {
                return;
            }
            int i = -1;
            int size = this.friends.size();
            if (size > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (Intrinsics.areEqual(getItem(i2).uid, friend.uid)) {
                        i = i2;
                        break;
                    } else if (i3 >= size) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            if (i < 0) {
                this.friends.add(0, friend);
            } else {
                this.friends.remove(i);
                this.friends.add(i, friend);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        @NotNull
        public Friend getItem(int position) {
            return this.friends.get(position);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bB\u0010CJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR$\u0010)\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR$\u0010-\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR$\u00101\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0018\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010=\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0010\u001a\u0004\b;\u0010\u0012\"\u0004\b<\u0010\u0014R$\u0010A\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0018\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010\u001c¨\u0006D"}, d2 = {"Lcom/xiaomi/hm/health/relation/FriendFrag$ViewHolder;", "", "", "time", "", "setSleepValue", "Landroid/view/View;", "a", "Landroid/view/View;", "getSpace", "()Landroid/view/View;", "setSpace", "(Landroid/view/View;)V", "space", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "icon", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "setName", "(Landroid/widget/TextView;)V", "name", GoogleApiAvailabilityLight.a, "getLastUpdateTime", "setLastUpdateTime", "lastUpdateTime", "e", "getCareCountByMe", "setCareCountByMe", "careCountByMe", "f", "getStep", "setStep", "step", "g", "getWeight", "setWeight", "weight", "h", "getWeightTitle", "setWeightTitle", "weightTitle", "Lcom/xiaomi/hm/health/relation/copy/UnitTextView;", "i", "Lcom/xiaomi/hm/health/relation/copy/UnitTextView;", "getSleepTime", "()Lcom/xiaomi/hm/health/relation/copy/UnitTextView;", "setSleepTime", "(Lcom/xiaomi/hm/health/relation/copy/UnitTextView;)V", "sleepTime", z.j, "getCareIcon", "setCareIcon", "careIcon", hl.k, "getTz", "setTz", "tz", "<init>", "(Lcom/xiaomi/hm/health/relation/FriendFrag;)V", "relatives_release"}, k = 1, mv = {1, 5, 1})
    public final class ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private View space;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private ImageView icon;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private TextView name;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private TextView lastUpdateTime;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private TextView careCountByMe;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        private TextView step;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        private TextView weight;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        private TextView weightTitle;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        private UnitTextView sleepTime;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        private ImageView careIcon;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        private TextView tz;

        public ViewHolder() {
        }

        @Nullable
        public final TextView getCareCountByMe() {
            return this.careCountByMe;
        }

        @Nullable
        public final ImageView getCareIcon() {
            return this.careIcon;
        }

        @Nullable
        public final ImageView getIcon() {
            return this.icon;
        }

        @Nullable
        public final TextView getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        @Nullable
        public final TextView getName() {
            return this.name;
        }

        @Nullable
        public final UnitTextView getSleepTime() {
            return this.sleepTime;
        }

        @Nullable
        public final View getSpace() {
            return this.space;
        }

        @Nullable
        public final TextView getStep() {
            return this.step;
        }

        @Nullable
        public final TextView getTz() {
            return this.tz;
        }

        @Nullable
        public final TextView getWeight() {
            return this.weight;
        }

        @Nullable
        public final TextView getWeightTitle() {
            return this.weightTitle;
        }

        public final void setCareCountByMe(@Nullable TextView textView) {
            this.careCountByMe = textView;
        }

        public final void setCareIcon(@Nullable ImageView imageView) {
            this.careIcon = imageView;
        }

        public final void setIcon(@Nullable ImageView imageView) {
            this.icon = imageView;
        }

        public final void setLastUpdateTime(@Nullable TextView textView) {
            this.lastUpdateTime = textView;
        }

        public final void setName(@Nullable TextView textView) {
            this.name = textView;
        }

        public final void setSleepTime(@Nullable UnitTextView unitTextView) {
            this.sleepTime = unitTextView;
        }

        public final void setSleepValue(int time) {
            Context appContext = RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getAppContext();
            String localeValue = FriendFragKt.getLocaleValue(time / 60);
            String localeValue2 = FriendFragKt.getLocaleValue(time % 60);
            this.sleepTime.setValues(localeValue, appContext.getString(R.string.relatives_unit_hour), localeValue2, appContext.getString(R.string.relatives_unit_min));
        }

        public final void setSpace(@Nullable View view) {
            this.space = view;
        }

        public final void setStep(@Nullable TextView textView) {
            this.step = textView;
        }

        public final void setTz(@Nullable TextView textView) {
            this.tz = textView;
        }

        public final void setWeight(@Nullable TextView textView) {
            this.weight = textView;
        }

        public final void setWeightTitle(@Nullable TextView textView) {
            this.weightTitle = textView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "duration", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Long, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            Analytics.recordEvent(new CalculationEventBuilder(FriendFrag.this.p().getConstantExternal().getStatEventBaseTabT(), j).setAnonymous(!FriendFrag.this.r()).setIdentified(FriendFrag.this.r()).addExtra(FriendFrag.this.p().getConstantExternal().getStatEventMineKeyTp(), "friends").addExtra(FriendFrag.this.p().getConstantExternal().getStatEventKeyTime(), String.valueOf(j)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Analytics.recordEvent(new CountEventBuilder(FriendFrag.this.p().getConstantExternal().getStatEventBaseTabV()).addExtra(FriendFrag.this.p().getConstantExternal().getStatEventMineKeyTp(), "friends").setAnonymous(!AccountServiceExtKt.isInChinaRegion(RelationExternalsKt.getAccountService())).setIdentified(true));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendFrag() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.friendsAndFamilyInject = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<FriendsAndFamilyInject>() { // from class: com.xiaomi.hm.health.relation.FriendFrag$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.relatives.FriendsAndFamilyInject, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FriendsAndFamilyInject getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FriendsAndFamilyInject.class), qualifier, objArr);
            }
        });
        this.requestCode = 10;
        this.TAG = "FriendActivity";
        this.mMenuFragment = FriendMenuFragment.newInstance();
        this.mFriendAdapter = new FriedAdapter();
        this.trackHelper = new FragmentTrackHelper(this, new a(), new b());
        this.comparator = new Comparator() { // from class: fb2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return FriendFrag.m((Friend) obj, (Friend) obj2);
            }
        };
    }

    private final void A() {
        if (this.mShowed) {
            return;
        }
        this.mMenuFragment.show(requireActivity().getSupportFragmentManager(), this.TAG);
        this.mShowed = true;
        this.mMenuFragment.setOnDismissListener(this);
    }

    private final void B() {
        if (getActivity() == null) {
            return;
        }
        if (getActivity() instanceof FriendActivity) {
            RainbowTitleBar rainbowTitleBar = this.friendToolBar;
            Objects.requireNonNull(rainbowTitleBar);
            rainbowTitleBar.setNavigationIcon(R.drawable.ic_arrow_back_20_2x);
        } else {
            RainbowTitleBar rainbowTitleBar2 = this.friendToolBar;
            Objects.requireNonNull(rainbowTitleBar2);
            rainbowTitleBar2.setNavigationIcon((Drawable) null);
        }
    }

    private final void C() {
        this.mMenuFragment.setOnMenuItemClickListener(this);
        SmartRefreshLayout smartRefreshLayout = this.mRefreshView;
        Objects.requireNonNull(smartRefreshLayout);
        smartRefreshLayout.setOnRefreshListener(new OnRefreshListener() { // from class: ib2
            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public final void onRefresh(RefreshLayout refreshLayout) {
                FriendFrag.D(this.a, refreshLayout);
            }
        });
        SmartRefreshLayout smartRefreshLayout2 = this.mRefreshView;
        Objects.requireNonNull(smartRefreshLayout2);
        smartRefreshLayout2.setOnLoadmoreListener(new OnLoadmoreListener() { // from class: hb2
            @Override // com.scwang.smartrefresh.layout.listener.OnLoadmoreListener
            public final void onLoadmore(RefreshLayout refreshLayout) {
                FriendFrag.E(this.a, refreshLayout);
            }
        });
        SmartRefreshLayout smartRefreshLayout3 = this.mRefreshView;
        Objects.requireNonNull(smartRefreshLayout3);
        smartRefreshLayout3.setEnableRefresh(true);
        SmartRefreshLayout smartRefreshLayout4 = this.mRefreshView;
        Objects.requireNonNull(smartRefreshLayout4);
        smartRefreshLayout4.setEnableLoadmore(false);
        SmartRefreshLayout smartRefreshLayout5 = this.mRefreshView;
        Objects.requireNonNull(smartRefreshLayout5);
        smartRefreshLayout5.setEnableLoadmoreWhenContentNotFull(true);
        ListView listView = this.mFriendsView;
        Objects.requireNonNull(listView);
        listView.setFadingEdgeLength(0);
        ListView listView2 = this.mFriendsView;
        Objects.requireNonNull(listView2);
        listView2.setAdapter((ListAdapter) this.mFriendAdapter);
        ListView listView3 = this.mFriendsView;
        Objects.requireNonNull(listView3);
        listView3.setOnItemClickListener(this);
        FriendManager friendManager = this.mFriendManager;
        Objects.requireNonNull(friendManager);
        List<Friend> localFriendList = friendManager.getLocalFriendList(0, 100);
        this.mFriendAdapter.addAll(localFriendList);
        if (localFriendList == null || localFriendList.isEmpty()) {
            View view = this.mEmptyView;
            Objects.requireNonNull(view);
            view.setVisibility(0);
            ListView listView4 = this.mFriendsView;
            Objects.requireNonNull(listView4);
            listView4.setVisibility(8);
            FriendManager friendManager2 = this.mFriendManager;
            Objects.requireNonNull(friendManager2);
            friendManager2.loadFriendList(0, 100, true, false, false, false);
        } else {
            View view2 = this.mEmptyView;
            Objects.requireNonNull(view2);
            view2.setVisibility(8);
            ListView listView5 = this.mFriendsView;
            Objects.requireNonNull(listView5);
            listView5.setVisibility(0);
            FriendManager friendManager3 = this.mFriendManager;
            Objects.requireNonNull(friendManager3);
            friendManager3.loadFriendList(0, 100, true, false, false, false, true);
            SmartRefreshLayout smartRefreshLayout6 = this.mRefreshView;
            Objects.requireNonNull(smartRefreshLayout6);
            smartRefreshLayout6.setEnableLoadmore(true);
        }
        setHasOptionsMenu(true);
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(FriendFrag friendFrag, RefreshLayout refreshLayout) {
        refreshLayout.setLoadmoreFinished(false);
        FriendManager friendManager = friendFrag.mFriendManager;
        Objects.requireNonNull(friendManager);
        friendManager.loadFriendList(0, 100, true, false, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(FriendFrag friendFrag, RefreshLayout refreshLayout) {
        int count = friendFrag.mFriendAdapter.getCount();
        FriendManager friendManager = friendFrag.mFriendManager;
        Objects.requireNonNull(friendManager);
        friendManager.loadFriendList(count, 100, false, true, false, true);
    }

    private final void l() {
        FragmentActivity activity = getActivity();
        boolean zHasNewMessage = MessageManager.getDefault(activity == null ? null : activity.getApplicationContext()).hasNewMessage();
        View view = this.red;
        Objects.requireNonNull(view);
        view.setVisibility(zHasNewMessage ? 0 : 8);
        View view2 = this.red;
        Objects.requireNonNull(view2);
        view2.invalidate();
        this.mMenuFragment.setNewFlagShow(zHasNewMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(Friend friend, Friend friend2) {
        return friend.createTime.longValue() > friend2.createTime.longValue() ? -1 : 1;
    }

    private final void n() {
        B();
        C();
        q();
    }

    private final void o() {
        if (!NetUtil.isNetworkConnected(getContext())) {
            CustomToast.makeText(getContext(), R.string.relatives_network_error, 0).show();
        } else {
            HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
            FriendManager.getInstance().fetchFriendShareInviteLink(hMPersonInfo.getUserInfo().getAvatar(), String.valueOf(AccountServiceExtKt.getValidUid(RelationExternalsKt.getAccountService())), hMPersonInfo.getUserInfo().getNickname());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FriendsAndFamilyInject p() {
        return (FriendsAndFamilyInject) this.friendsAndFamilyInject.getValue();
    }

    private final void q() {
        FriendManager friendManager = this.mFriendManager;
        Objects.requireNonNull(friendManager);
        this.mFriendAdapter.addAll(friendManager.getLocalFriendList(0, 100));
        int count = this.mFriendAdapter.getCount();
        FriendManager friendManager2 = this.mFriendManager;
        Objects.requireNonNull(friendManager2);
        friendManager2.loadFriendList(count, 100, false, true, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r() {
        return AccountServiceExtKt.isCN(RelationExternalsKt.getAccountService()) || (AccountServiceExtKt.isUnknown(RelationExternalsKt.getAccountService()) && Country.isChina());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(FriendFrag friendFrag, View view, int i) {
        if (i == 0) {
            friendFrag.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(FriendFrag friendFrag, View view) {
        FragmentActivity activity = friendFrag.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(FriendFrag friendFrag) {
        friendFrag.mFriendAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(FriendFrag friendFrag) {
        friendFrag.mFriendAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(FriendFrag friendFrag) {
        View view = friendFrag.mEmptyView;
        Objects.requireNonNull(view);
        view.setVisibility(8);
        ListView listView = friendFrag.mFriendsView;
        Objects.requireNonNull(listView);
        listView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(FriendFrag friendFrag) {
        if (friendFrag.getActivity() instanceof FriendActivity) {
            friendFrag.l();
        } else if (RelationExternalsKt.getFriendsAndFamilyInjectDelegate().isMainTabActivityInTabOnCourse(friendFrag.getActivity())) {
            friendFrag.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(FriendFrag friendFrag, UnfollowMessage unfollowMessage) {
        friendFrag.mFriendAdapter.removeFriend(String.valueOf(unfollowMessage.fromUid));
        if (friendFrag.mFriendAdapter.getCount() == 0) {
            View view = friendFrag.mEmptyView;
            Objects.requireNonNull(view);
            view.setVisibility(0);
            ListView listView = friendFrag.mFriendsView;
            Objects.requireNonNull(listView);
            listView.setVisibility(8);
            return;
        }
        View view2 = friendFrag.mEmptyView;
        Objects.requireNonNull(view2);
        view2.setVisibility(8);
        ListView listView2 = friendFrag.mFriendsView;
        Objects.requireNonNull(listView2);
        listView2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(FriendFrag friendFrag, EventFriendLoad eventFriendLoad) {
        SmartRefreshLayout smartRefreshLayout = friendFrag.mRefreshView;
        Objects.requireNonNull(smartRefreshLayout);
        smartRefreshLayout.finishRefresh();
        SmartRefreshLayout smartRefreshLayout2 = friendFrag.mRefreshView;
        Objects.requireNonNull(smartRefreshLayout2);
        smartRefreshLayout2.finishLoadmore();
        if (eventFriendLoad.hasMore) {
            SmartRefreshLayout smartRefreshLayout3 = friendFrag.mRefreshView;
            Objects.requireNonNull(smartRefreshLayout3);
            smartRefreshLayout3.setEnableLoadmore(true);
        } else {
            SmartRefreshLayout smartRefreshLayout4 = friendFrag.mRefreshView;
            Objects.requireNonNull(smartRefreshLayout4);
            smartRefreshLayout4.setLoadmoreFinished(true);
            SmartRefreshLayout smartRefreshLayout5 = friendFrag.mRefreshView;
            Objects.requireNonNull(smartRefreshLayout5);
            smartRefreshLayout5.setEnableLoadmore(false);
        }
        if (eventFriendLoad.resultCode != 0 && eventFriendLoad.errorTips) {
            boolean z = eventFriendLoad.hasMore && eventFriendLoad.friends.size() <= 0;
            if (eventFriendLoad.isRefresh) {
                z = true;
            }
            if (z && friendFrag.getContext() != null) {
                if (eventFriendLoad.resultCode == -2) {
                    CustomToast.makeText(friendFrag.getContext(), R.string.relatives_no_network_connection, 1).show();
                } else {
                    CustomToast.makeText(friendFrag.getContext(), R.string.relatives_friend_list_get_error, 1).show();
                }
            }
        }
        Collections.sort(eventFriendLoad.friends, friendFrag.comparator);
        if (eventFriendLoad.isRefresh) {
            friendFrag.mFriendAdapter.clear();
        }
        friendFrag.mFriendAdapter.addAll(eventFriendLoad.friends);
        int count = friendFrag.mFriendAdapter.getCount();
        friendFrag.totalFriend = count;
        if (count == 0) {
            View view = friendFrag.mEmptyView;
            Objects.requireNonNull(view);
            view.setVisibility(0);
            ListView listView = friendFrag.mFriendsView;
            Objects.requireNonNull(listView);
            listView.setVisibility(8);
            return;
        }
        View view2 = friendFrag.mEmptyView;
        Objects.requireNonNull(view2);
        view2.setVisibility(8);
        ListView listView2 = friendFrag.mFriendsView;
        Objects.requireNonNull(listView2);
        listView2.setVisibility(0);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        int id = v.getId();
        if (id == R.id.message_button) {
            startActivity(MessageActivity.createIntent(getContext()));
            return;
        }
        if ((id == R.id.action_add_friend || id == R.id.add_button) || id == R.id.action_button) {
            EasyPermissions.requestPermissions(this, getString(R.string.relatives_permision_tip), this.requestCode, "relative_scan_qr_code", "android.permission.CAMERA");
            return;
        }
        if (id == R.id.action_add_friend_by_id) {
            startActivity(new Intent(getContext(), (Class<?>) AddFriendActivityNew.class));
            return;
        }
        if (id == R.id.action_button_qr || id == R.id.action_my_qrcode) {
            HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
            startActivity(UserQRCardActivity.createIntent(getContext(), AccountServiceExtKt.getValidUid(RelationExternalsKt.getAccountService()), hMPersonInfo.getUserInfo().getAvatar(), hMPersonInfo.getUserInfo().getNickname()));
        } else if (id == R.id.action_share_friend_invite) {
            o();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mFriendManager = FriendManager.getInstance();
        FragmentActivity activity = getActivity();
        MessageManager.getDefault(activity == null ? null : activity.getApplicationContext()).register(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(@NotNull Menu menu, @NotNull MenuInflater inflater) {
        inflater.inflate(R.menu.relatives_menu_friend, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.action_more);
        View viewInflate = View.inflate(getContext(), R.layout.relatives_view_friend_menu_view, null);
        this.mNewMessgeFlag = viewInflate.findViewById(R.id.menu_new_flag);
        viewInflate.setOnClickListener(this);
        menuItemFindItem.setActionView(viewInflate);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate = DifferenceManager.INSTANCE.isBuildMidong() ? inflater.inflate(R.layout.relatives_activity_friend_list, container, false) : inflater.inflate(R.layout.relatives_activity_friend_list_mifit, container, false);
        this.root = viewInflate;
        Objects.requireNonNull(viewInflate);
        this.mRefreshView = (SmartRefreshLayout) viewInflate.findViewById(R.id.refresh_layout);
        View view = this.root;
        Objects.requireNonNull(view);
        this.mFriendsView = (ListView) view.findViewById(R.id.list_view);
        View view2 = this.root;
        Objects.requireNonNull(view2);
        this.mEmptyView = view2.findViewById(R.id.empty_list);
        View view3 = this.root;
        Objects.requireNonNull(view3);
        view3.findViewById(R.id.action_button_qr).setOnClickListener(this);
        View view4 = this.root;
        Objects.requireNonNull(view4);
        view4.findViewById(R.id.action_button).setOnClickListener(this);
        View view5 = this.root;
        Objects.requireNonNull(view5);
        this.red = view5.findViewById(R.id.friend_red_dot);
        View view6 = this.root;
        Objects.requireNonNull(view6);
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) view6.findViewById(R.id.friend_toolbar);
        this.friendToolBar = rainbowTitleBar;
        Objects.requireNonNull(rainbowTitleBar);
        rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: gb2
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view7, int i) {
                FriendFrag.s(this.a, view7, i);
            }
        });
        RainbowTitleBar rainbowTitleBar2 = this.friendToolBar;
        Objects.requireNonNull(rainbowTitleBar2);
        rainbowTitleBar2.setNavigationOnClickListener(new View.OnClickListener() { // from class: eb2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                FriendFrag.t(this.a, view7);
            }
        });
        View view7 = this.root;
        Objects.requireNonNull(view7);
        return view7;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        FragmentActivity activity = getActivity();
        MessageManager.getDefault(activity == null ? null : activity.getApplicationContext()).unregister(this);
    }

    @Override // com.xiaomi.hm.health.relation.FriendMenuFragment.OnDialogDismissListener
    public void onDismiss() {
        View viewFindViewById;
        Window window;
        if (SystemBarTintSupport.isSupport(getContext())) {
            FragmentActivity activity = getActivity();
            View decorView = null;
            if (activity != null && (window = activity.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                decorView.destroyDrawingCache();
            }
        } else {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null && (viewFindViewById = activity2.findViewById(android.R.id.content)) != null) {
                viewFindViewById.destroyDrawingCache();
            }
        }
        this.mShowed = false;
    }

    public final void onEvent(@NotNull FollowMessage message) {
        if (message.type == 0) {
            FriendManager friendManager = this.mFriendManager;
            Objects.requireNonNull(friendManager);
            Friend friendByUid = friendManager.getFriendByUid(message.fromUid);
            if (friendByUid != null) {
                this.mFriendAdapter.updateItem(friendByUid);
                ListView listView = this.mFriendsView;
                Objects.requireNonNull(listView);
                listView.post(new Runnable() { // from class: mb2
                    @Override // java.lang.Runnable
                    public final void run() {
                        FriendFrag.w(this.a);
                    }
                });
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        this.trackHelper.trackOnHiddenChanged();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(@Nullable AdapterView<?> parent, @Nullable View view, int position, long id) {
        Object item = parent.getAdapter().getItem(position);
        Objects.requireNonNull(item, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Friend");
        startActivity(DetailActivity.createIntent(getContext(), (Friend) item));
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        if (item.getItemId() != R.id.action_more) {
            return super.onOptionsItemSelected(item);
        }
        A();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.trackHelper.trackOnPause();
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsDenied(int requestCode, @NotNull List<String> perms) {
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            new PermissionDialogFragmentCompat.Builder().setMessage(getString(R.string.relatives_permision_tip)).create().show(requireActivity().getSupportFragmentManager(), "");
        } else {
            HMLog.i(this.TAG, "Manifest.permission.CAMERA is deny.", new Object[0]);
        }
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsGranted(int requestCode, @NotNull List<String> perms) {
        HMLog.i(this.TAG, "Manifest.permission.CAMERA is granted.", new Object[0]);
        requireActivity().startActivityForResult(new Intent(requireContext(), (Class<?>) FriendQRCodeActivity.class), 49374);
    }

    @Override // androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.trackHelper.trackOnResume();
        if (getActivity() instanceof FriendActivity) {
            n();
        } else if (RelationExternalsKt.getFriendsAndFamilyInjectDelegate().isMainTabActivityInTabOnCourse(getActivity())) {
            n();
        }
    }

    public final void onSelect() {
        if (this.userVisible) {
            n();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        FriendManager friendManager = this.mFriendManager;
        Objects.requireNonNull(friendManager);
        List<Friend> localFriendAllList = friendManager.getLocalFriendAllList();
        if (localFriendAllList == null) {
            return;
        }
        int size = localFriendAllList.size();
        ArrayList arrayList = new ArrayList(size);
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList.add(localFriendAllList.get(i).uid);
                if (i2 >= size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        FriendManager friendManager2 = this.mFriendManager;
        Objects.requireNonNull(friendManager2);
        List<FriendMessage> messages = friendManager2.getMessages();
        if (messages != null) {
            for (FriendMessage friendMessage : messages) {
                Integer num = friendMessage.type;
                if (num != null && num.intValue() == 0 && !arrayList.contains(friendMessage.fromUid)) {
                    FriendManager friendManager3 = this.mFriendManager;
                    Objects.requireNonNull(friendManager3);
                    friendManager3.deleteMessagefromUid(friendMessage.fromUid);
                    HMLog.i(this.TAG, Intrinsics.stringPlus("Delete message from uid ", friendMessage.fromUid), new Object[0]);
                }
            }
        }
    }

    @Override // com.xiaomi.hm.health.relation.view.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.userVisible = isVisibleToUser;
        this.trackHelper.trackOnUserVisibleHint();
        if (isVisibleToUser) {
            Analytics.recordEvent(new CountEventBuilder("BASE_TAB_V").addExtra("tp", "friends"));
        }
    }

    public final void onEvent(@NotNull EventNewMessageReceived event) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: kb2
            @Override // java.lang.Runnable
            public final void run() {
                FriendFrag.x(this.a);
            }
        });
    }

    public final void onEvent(@NotNull EventFriendShareInvite event) {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        INSTANCE.popUpFriendShareInviteDialog(activity, hMPersonInfo.getUserInfo().getNickname(), event.friendInviteShareUrl);
    }

    public final void onEvent(@NotNull EventFriendRemoved event) {
        if (event.code != 1) {
            return;
        }
        this.mFriendAdapter.removeFriend(event.uid);
        if (this.mFriendAdapter.getCount() == 0) {
            View view = this.mEmptyView;
            Objects.requireNonNull(view);
            view.setVisibility(0);
            ListView listView = this.mFriendsView;
            Objects.requireNonNull(listView);
            listView.setVisibility(8);
            return;
        }
        View view2 = this.mEmptyView;
        Objects.requireNonNull(view2);
        view2.setVisibility(8);
        ListView listView2 = this.mFriendsView;
        Objects.requireNonNull(listView2);
        listView2.setVisibility(0);
    }

    public final void onEvent(@NotNull final UnfollowMessage message) {
        requireActivity().runOnUiThread(new Runnable() { // from class: ob2
            @Override // java.lang.Runnable
            public final void run() {
                FriendFrag.y(this.a, message);
            }
        });
    }

    public final void onEvent(@NotNull final EventFriendLoad loadEvent) {
        ListView listView = this.mFriendsView;
        Objects.requireNonNull(listView);
        listView.post(new Runnable() { // from class: nb2
            @Override // java.lang.Runnable
            public final void run() {
                FriendFrag.z(this.a, loadEvent);
            }
        });
    }

    public final void onEvent(@NotNull CareMessage careMessage) {
        if (this.mFriendAdapter.getItemByUid(careMessage.fromUid) == null) {
            return;
        }
        ListView listView = this.mFriendsView;
        Objects.requireNonNull(listView);
        listView.post(new Runnable() { // from class: lb2
            @Override // java.lang.Runnable
            public final void run() {
                FriendFrag.u(this.a);
            }
        });
    }

    public final void onEvent(@NotNull EventCareSend event) {
        Friend itemByUid;
        if (event.success && (itemByUid = this.mFriendAdapter.getItemByUid(event.uid)) != null) {
            itemByUid.careCountByMe = Integer.valueOf(itemByUid.careCountByMe.intValue() + 1);
            ListView listView = this.mFriendsView;
            Objects.requireNonNull(listView);
            listView.post(new Runnable() { // from class: jb2
                @Override // java.lang.Runnable
                public final void run() {
                    FriendFrag.v(this.a);
                }
            });
        }
    }

    public final void onEvent(@NotNull EventAcceptInvite acceptEvent) {
        if (acceptEvent.code == 1 && acceptEvent.accepted) {
            View view = this.mEmptyView;
            Objects.requireNonNull(view);
            view.setVisibility(8);
            ListView listView = this.mFriendsView;
            Objects.requireNonNull(listView);
            listView.setVisibility(0);
            this.mFriendAdapter.addFriend(0, acceptEvent.friend);
        }
    }

    public final void onEvent(@NotNull EventDetailLoad event) {
        Friend itemByUid;
        if (!event.success || (itemByUid = this.mFriendAdapter.getItemByUid(event.uid)) == null) {
            return;
        }
        itemByUid.lastDetailUpdateTime = Long.valueOf(System.currentTimeMillis());
        this.mFriendAdapter.notifyDataSetChanged();
    }

    public final void onEvent(@NotNull EventFriendSearch searchEvent) {
        Utils.hideProgressDialog(getActivity());
        if (searchEvent.type != 0) {
            return;
        }
        if (searchEvent.hasData()) {
            EventFriendSearch.Friend friend = searchEvent.friends.get(0);
            if (friend.uid > 0) {
                Intent intentCreateIntent = SearchResultActivity.createIntent(getContext(), friend.uid, friend.userName, friend.iconUrl, friend.token, friend.code == 1);
                startActivity(intentCreateIntent);
                startActivity(intentCreateIntent);
                return;
            }
            IconToast.showError(getContext(), R.string.relatives_friend_search_not_exist);
            return;
        }
        IconToast.showError(getContext(), R.string.relatives_friend_search_not_exist);
    }
}
