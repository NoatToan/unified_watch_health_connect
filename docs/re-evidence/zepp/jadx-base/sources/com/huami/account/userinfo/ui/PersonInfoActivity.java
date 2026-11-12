package com.huami.account.userinfo.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.api.PersonInfoMapper;
import com.huami.account.api.entity.MinorAuthorizationEntity;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.Option;
import com.huami.account.ui.common.LoadingDialogContainer;
import com.huami.account.ui.common.LoadingDialogHelper;
import com.huami.account.ui.common.state.StateWrapper;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.UserinfoExternalsKt;
import com.huami.account.userinfo.bean.Birthday;
import com.huami.account.userinfo.bean.ItemValue;
import com.huami.account.userinfo.bean.PersonInfoItem;
import com.huami.account.userinfo.event.EventAgeHasConfirmed;
import com.huami.account.userinfo.event.EventPersonInfoUpdate;
import com.huami.account.userinfo.manager.AuditUserInfoManager;
import com.huami.account.userinfo.manager.MinorAuthorizationManager;
import com.huami.account.userinfo.ui.PersonInfoActivity;
import com.huami.account.userinfo.ui.state.PersonInfoUiState;
import com.huami.account.userinfo.usecase.DetectDefaultFieldUseCase;
import com.huami.account.userinfo.usecase.DisplayDefaultFieldUseCase;
import com.huami.account.userinfo.utils.Utils;
import com.huami.account.userinfo.utils.WeightUtil;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.wheelview.Constant;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.imageload.GlideRoundTransform;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import io.netty.util.internal.StringUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 X2\u00020\u0001:\u0002XYB\u0007¢\u0006\u0004\bV\u0010WJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0017\u001a\u00020\u0004H\u0014J\b\u0010\u0018\u001a\u00020\u0004H\u0014J\b\u0010\u0019\u001a\u00020\u0004H\u0014J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\"\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014R\u001d\u0010&\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010-R\u001c\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u00105R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010>R\u0016\u0010A\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010C\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010>R\u001d\u0010H\u001a\u00020D8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010#\u001a\u0004\bF\u0010GR\u001a\u0010L\u001a\u00060IR\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR&\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020\u001b0Mj\b\u0012\u0004\u0012\u00020\u001b`N8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006Z"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "y", "", "initTitle", DTransferConstants.SEARCH_KEY, "initView", "Lcom/huami/account/api/entity/MinorAuthorizationEntity;", "entity", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "personInfo", "C", "t", "z", "updateUI", "Lcom/huami/lib/rainbow/ListTile;", "listTile", LogUtil.D, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "onRestart", "onDestroy", "onLeftClicked", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "x", "Lkotlin/Lazy;", "r", "()Lcom/huami/account/ui/common/LoadingDialogContainer;", "dialogHelper", "Landroid/widget/ListView;", "Landroid/widget/ListView;", "mListView", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "mPersonInfo", "", "F", "lastWeight", "", "Lcom/huami/account/userinfo/bean/PersonInfoItem;", "B", "Ljava/util/List;", "extraItems", "Lcom/huami/account/userinfo/manager/MinorAuthorizationManager;", "Lcom/huami/account/userinfo/manager/MinorAuthorizationManager;", "minorAuthorizationManager", "Z", "hasChangedAge", "Landroid/widget/ImageView;", "E", "Landroid/widget/ImageView;", "mAvatar", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "mAuditAvatar", "G", "mId", "H", "btUnauthorized", "Lcom/huami/account/userinfo/ui/PersonInfoViewModel;", LogUtil.I, SOAP.XMLNS, "()Lcom/huami/account/userinfo/ui/PersonInfoViewModel;", "viewModel", "Lcom/huami/account/userinfo/ui/PersonInfoActivity$ListViewAdapter;", "J", "Lcom/huami/account/userinfo/ui/PersonInfoActivity$ListViewAdapter;", "mAdapter", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "K", "Ljava/util/ArrayList;", "keys", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment$OnDataChangeListener;", "L", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment$OnDataChangeListener;", "onDataChangeListener", "<init>", "()V", "Companion", "ListViewAdapter", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class PersonInfoActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String M = "PersonInfoActivity";

    @NotNull
    private static final String N = "isConfirmAge";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float lastWeight;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private List<PersonInfoItem> extraItems;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private MinorAuthorizationManager minorAuthorizationManager;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean hasChangedAge;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private ImageView mAvatar;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private TextView mAuditAvatar;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private TextView mId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private TextView btUnauthorized;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private ListViewAdapter mAdapter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Integer> keys;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private final PersonInfoSettingBaseFragment.OnDataChangeListener onDataChangeListener;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialogHelper = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private ListView mListView;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private HMPersonInfo mPersonInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/account/service/Option;", "option", "", "start", "", "EXTRA_IS_CONFIRM_AGE", "Ljava/lang/String;", "TAG", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context, @Nullable Option option) {
            Intent intent = new Intent(context, (Class<?>) PersonInfoActivity.class);
            intent.putExtra(PersonInfoActivity.N, option == null ? null : Boolean.valueOf(option.isConfirmAge()));
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001b\u0010\u0013\u001a\u00020\u0006*\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoActivity$ListViewAdapter;", "Landroid/widget/BaseAdapter;", "", "position", "Lcom/huami/lib/rainbow/ListTile;", "item", "", "e", "getCount", "c", "(I)Ljava/lang/Integer;", "", "getItemId", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/ViewGroup;", "parent", "getView", "avatarId", GoogleApiAvailabilityLight.a, "(Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;)V", "", "Lcom/huami/account/userinfo/bean/PersonInfoItem;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "extraItems", "", "Landroid/graphics/drawable/Drawable;", "Ljava/util/Map;", "iconCache", "<init>", "(Lcom/huami/account/userinfo/ui/PersonInfoActivity;Ljava/util/List;)V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public final class ListViewAdapter extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final List<PersonInfoItem> extraItems;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Map<Integer, Drawable> iconCache = new LinkedHashMap();

        public ListViewAdapter(List<PersonInfoItem> list) {
            this.extraItems = list;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private final void e(int position, ListTile item) {
            item.reset();
            int iIntValue = getItem(position).intValue();
            item.setTitle(iIntValue);
            Object obj = null;
            boolean z = true;
            if (iIntValue == R.string.user_info_ft_profile_edit_avatar) {
                item.setEnabled(true);
                item.setTrailing(R.drawable.ic_arrow_forward_20_2x);
                item.setTips((CharSequence) null);
                PersonInfoActivity.this.D(item);
                return;
            }
            if (iIntValue == R.string.user_info_ft_profile_edit_id) {
                item.setTips(PersonInfoActivity.this.mPersonInfo.getUserInfo().getUserid());
                item.setEnabled(true);
                return;
            }
            if (iIntValue == R.string.user_info_person_info_key_nickname) {
                item.setTips(PersonInfoActivity.this.mPersonInfo.getUserInfo().getNickname());
                item.setEnabled(true);
                item.setTrailing(R.drawable.ic_arrow_forward_20_2x);
                AuditUserInfoManager.displayNickname(PersonInfoActivity.this, item);
                return;
            }
            if (iIntValue == R.string.user_info_person_info_key_gender) {
                if (PersonInfoActivity.this.mPersonInfo.getUserInfo().getGender() == 1) {
                    item.setTips(R.string.user_info_person_info_set_gender_male);
                } else {
                    item.setTips(R.string.user_info_person_info_set_gender_female);
                }
                item.setEnabled(true);
                item.setTrailing(R.drawable.ic_arrow_forward_20_2x);
                DisplayDefaultFieldUseCase.execute(item, "gender");
                return;
            }
            if (iIntValue == R.string.user_info_person_info_key_birth) {
                Birthday birthdayFromStr = Birthday.fromStr(PersonInfoActivity.this.mPersonInfo.getUserInfo().getBirthday());
                if (birthdayFromStr != null && birthdayFromStr.isValid()) {
                    item.setTips(birthdayFromStr.toString());
                }
                if (!HMLoginManager.isAdultGlobal() && !PersonInfoActivity.this.y() && !PersonInfoActivity.this.s().isMainLandChildDefaultAge()) {
                    z = false;
                }
                item.setEnabled(z);
                item.setTrailing(R.drawable.ic_arrow_forward_20_2x);
                DisplayDefaultFieldUseCase.execute(item, "birthday");
                return;
            }
            if (iIntValue == R.string.user_info_person_info_key_height) {
                Utils utils = Utils.INSTANCE;
                PersonInfoActivity personInfoActivity = PersonInfoActivity.this;
                item.setTips(utils.lengthToString(personInfoActivity, personInfoActivity.mPersonInfo.getMiliConfig().getUnit(), PersonInfoActivity.this.mPersonInfo.getUserInfo().getHeight()));
                item.setEnabled(true);
                item.setTrailing(R.drawable.ic_arrow_forward_20_2x);
                DisplayDefaultFieldUseCase.execute(item, "height");
                return;
            }
            if (iIntValue == R.string.user_info_person_info_key_weight) {
                float weight = PersonInfoActivity.this.mPersonInfo.getUserInfo().getWeight();
                StringBuilder sb = new StringBuilder();
                WeightUtil weightUtil = WeightUtil.INSTANCE;
                sb.append((Object) weightUtil.getWeightValueStringForDisplay(weight, PersonInfoActivity.this.mPersonInfo.getMiliConfig().getWeightUnit()));
                sb.append(StringUtil.SPACE);
                sb.append((Object) weightUtil.toUnitStr(PersonInfoActivity.this.mPersonInfo.getMiliConfig().getWeightUnit()));
                item.setTips(sb.toString());
                item.setEnabled(true);
                item.setTrailing(R.drawable.ic_arrow_forward_20_2x);
                DisplayDefaultFieldUseCase.execute(item, "weight");
                return;
            }
            for (Object obj2 : this.extraItems) {
                int iIntValue2 = getItem(position).intValue();
                ItemValue value = ((PersonInfoItem) obj2).getItemValueProvider().invoke().getValue();
                if (value != null && iIntValue2 == value.getNameId()) {
                    obj = obj2;
                    break;
                }
            }
            PersonInfoItem personInfoItem = (PersonInfoItem) obj;
            if (personInfoItem == null) {
                return;
            }
            ItemValue value2 = personInfoItem.getItemValueProvider().invoke().getValue();
            item.setTips(value2.getTip());
            item.setEnabled(true);
            item.setTrailing(R.drawable.ic_arrow_forward_20_2x);
            d(item, value2.getIconId());
        }

        @NotNull
        public final List<PersonInfoItem> b() {
            return this.extraItems;
        }

        @Override // android.widget.Adapter
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer getItem(int position) {
            int iIntValue;
            if (position < PersonInfoActivity.this.keys.size()) {
                iIntValue = ((Number) PersonInfoActivity.this.keys.get(position)).intValue();
            } else {
                List<PersonInfoItem> list = this.extraItems;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    ItemValue value = ((PersonInfoItem) it2.next()).getItemValueProvider().invoke().getValue();
                    arrayList.add(value == null ? null : Integer.valueOf(value.getNameId()));
                }
                Integer num = (Integer) CollectionsKt.getOrNull(arrayList, position - PersonInfoActivity.this.keys.size());
                if (num == null) {
                    throw new IllegalStateException("获取设置项标题失败");
                }
                iIntValue = num.intValue();
            }
            return Integer.valueOf(iIntValue);
        }

        public final void d(@NotNull ListTile listTile, @Nullable final Integer num) {
            if (num == null) {
                return;
            }
            num.intValue();
            Drawable drawable = this.iconCache.get(num);
            if (drawable != null) {
                listTile.setIndicatorHeader(drawable);
            } else {
                HMImageLoader.with(listTile).transform(new GlideRoundTransform(5.0f)).load(num.intValue()).into(new HMLoadTarget<Drawable>() { // from class: com.huami.account.userinfo.ui.PersonInfoActivity$ListViewAdapter$loadIndicatorHeader$1
                    @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
                    public void onLoadFinish(@Nullable Drawable resource) {
                        this.a.iconCache.put(num, resource);
                        this.a.notifyDataSetChanged();
                    }
                });
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return PersonInfoActivity.this.keys.size() + this.extraItems.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        @NotNull
        public View getView(int position, @Nullable View view, @NotNull ViewGroup parent) {
            if (view == null) {
                view = new ListTile(PersonInfoActivity.this);
            }
            e(position, (ListTile) view);
            return view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/account/ui/common/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingDialogHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper invoke() {
            return new LoadingDialogHelper(PersonInfoActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Float, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ PersonInfoActivity a;
            public final /* synthetic */ float b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PersonInfoActivity personInfoActivity, float f) {
                super(0);
                this.a = personInfoActivity;
                this.b = f;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.mPersonInfo.getUserInfo().setWeight(this.b);
                this.a.onDataChangeListener.onChange();
            }
        }

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            invoke(f.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f) {
            PersonInfoSettingHelper personInfoSettingHelper = PersonInfoSettingHelper.INSTANCE;
            PersonInfoActivity personInfoActivity = PersonInfoActivity.this;
            personInfoSettingHelper.updatePersonInfoParam(personInfoActivity, personInfoActivity.r(), q.mapOf(TuplesKt.to("weight", String.valueOf(f))), new a(PersonInfoActivity.this, f));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("onActivityResult requst_code =", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onActivityResult requst_code =" + this.a + " task photo post evnetbus";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.userinfo.ui.PersonInfoActivity$onRestart$2", f = "PersonInfoActivity.kt", i = {}, l = {Constant.WEIGHT_DEFAULT_IMPERIAL}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PersonInfoActivity.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PersonInfoViewModel personInfoViewModelS = PersonInfoActivity.this.s();
                Map<String, String> mapMapOf = q.mapOf(TuplesKt.to("weight", String.valueOf(PersonInfoActivity.this.mPersonInfo.getUserInfo().getWeight())));
                this.a = 1;
                if (personInfoViewModelS.updatePartOfPersonInfo(mapMapOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "未成年授权状态加载失败";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PersonInfoActivity() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.mPersonInfo = hMPersonInfo;
        this.lastWeight = hMPersonInfo.getUserInfo().getWeight();
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.account.userinfo.ui.PersonInfoActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PersonInfoViewModel>() { // from class: com.huami.account.userinfo.ui.PersonInfoActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.account.userinfo.ui.PersonInfoViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PersonInfoViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PersonInfoViewModel.class), function0, objArr);
            }
        });
        this.keys = CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(R.string.user_info_ft_profile_edit_avatar), Integer.valueOf(R.string.user_info_person_info_key_nickname), Integer.valueOf(R.string.user_info_ft_profile_edit_id), Integer.valueOf(R.string.user_info_person_info_key_gender), Integer.valueOf(R.string.user_info_person_info_key_birth), Integer.valueOf(R.string.user_info_person_info_key_height), Integer.valueOf(R.string.user_info_person_info_key_weight));
        this.onDataChangeListener = new PersonInfoSettingBaseFragment.OnDataChangeListener() { // from class: com.huami.account.userinfo.ui.PersonInfoActivity$onDataChangeListener$1
            @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment.OnDataChangeListener
            public void onChange() {
                this.a.updateUI();
            }
        };
    }

    private final void A(final MinorAuthorizationEntity entity) {
        if (entity == null) {
            HMLog.error$default(null, null, null, f.a, 7, null);
            return;
        }
        TextView textView = this.btUnauthorized;
        Objects.requireNonNull(textView);
        textView.setVisibility(entity.needAuthorize() ? 0 : 4);
        if (entity.needAuthorize()) {
            TextView textView2 = this.btUnauthorized;
            Objects.requireNonNull(textView2);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: bt5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PersonInfoActivity.B(this.a, entity, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(PersonInfoActivity personInfoActivity, MinorAuthorizationEntity minorAuthorizationEntity, View view) {
        MinorAuthorizationManager minorAuthorizationManager = personInfoActivity.minorAuthorizationManager;
        Objects.requireNonNull(minorAuthorizationManager);
        minorAuthorizationManager.showMinorAuthorizationDialog(minorAuthorizationEntity);
    }

    private final void C(HMPersonInfo personInfo) {
        t();
        this.mPersonInfo = personInfo;
        ListViewAdapter listViewAdapter = this.mAdapter;
        Objects.requireNonNull(listViewAdapter);
        listViewAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(ListTile listTile) {
        AuditUserInfoManager.displayAvatar(getBaseContext(), listTile, this.mPersonInfo.getUserInfo().getAvatarPath(), this.mPersonInfo.getUserInfo().getAvatar(), this.mPersonInfo.getUserInfo().getNickname());
    }

    private final void initTitle() {
        if (GlobalConfig.get().isBuildMidong()) {
            setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE_TRANSPARENT, ContextCompat.getColor(this, R.color.user_info_trans), getString(R.string.user_info_person_info_title), true);
            StatusBarUtil.setStatusColor(this, true, !RainbowUtils.isDarkMode(this), 0);
            this.keys.remove(Integer.valueOf(R.string.user_info_ft_profile_edit_avatar));
            this.keys.remove(Integer.valueOf(R.string.user_info_ft_profile_edit_location));
            this.keys.remove(Integer.valueOf(R.string.user_info_ft_profile_edit_id));
        } else {
            setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.s36), getString(R.string.user_info_person_info_title), true);
        }
        TextView titleTextView = getTitleTextView();
        int i = R.color.s1;
        titleTextView.setTextColor(ContextCompat.getColor(this, i));
        getTitleTextView().setTextSize(16.0f);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ic_arrow_back_20_2x);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(ContextCompat.getColor(this, i));
        }
        DrawableCompat.setTint(DrawableCompat.wrap(drawable), ContextCompat.getColor(this, i));
        getLeft().setImageDrawable(drawable);
        getRightTitle().setVisibility(8);
    }

    private final void initView() {
        String strStringPlus = Intrinsics.stringPlus("ID: ", this.mPersonInfo.getUserInfo().getUserid());
        TextView textView = this.mId;
        Objects.requireNonNull(textView);
        textView.setText(strStringPlus);
        TextView textView2 = this.mId;
        Objects.requireNonNull(textView2);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: zs5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoActivity.v(this.a, view);
            }
        });
        ImageView imageView = this.mAvatar;
        Objects.requireNonNull(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: at5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoActivity.w(this.a, view);
            }
        });
        this.extraItems = UserinfoExternalsKt.getUserinfoDelegate().providePersonInfoExtraItems(this);
        s().getUiState().observe(this, new Observer() { // from class: dt5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PersonInfoActivity.x(this.a, (StateWrapper) obj);
            }
        });
    }

    private final void q() {
        this.mListView = (ListView) findViewById(R.id.person_info_list);
        this.mAvatar = (ImageView) findViewById(R.id.person_info_avatar);
        this.mAuditAvatar = (TextView) findViewById(R.id.tv_avatar_in_audit);
        this.mId = (TextView) findViewById(R.id.person_info_id);
        this.btUnauthorized = (TextView) findViewById(R.id.person_info_unauthorized);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingDialogContainer r() {
        return (LoadingDialogContainer) this.dialogHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PersonInfoViewModel s() {
        return (PersonInfoViewModel) this.viewModel.getValue();
    }

    private final void t() {
        List<PersonInfoItem> list = this.extraItems;
        Objects.requireNonNull(list);
        ListViewAdapter listViewAdapter = new ListViewAdapter(list);
        this.mAdapter = listViewAdapter;
        ListView listView = this.mListView;
        Objects.requireNonNull(listView);
        Objects.requireNonNull(listViewAdapter);
        listView.setAdapter((ListAdapter) listViewAdapter);
        ListView listView2 = this.mListView;
        Objects.requireNonNull(listView2);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ct5
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                PersonInfoActivity.u(this.a, adapterView, view, i, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final PersonInfoActivity personInfoActivity, AdapterView adapterView, View view, int i, long j) {
        ListViewAdapter listViewAdapter = personInfoActivity.mAdapter;
        Objects.requireNonNull(listViewAdapter);
        int iIntValue = listViewAdapter.getItem(i).intValue();
        Object obj = null;
        if (iIntValue == R.string.user_info_ft_profile_edit_avatar) {
            if (AuditUserInfoManager.interceptShowAuditTip(personInfoActivity, AuditUserInfoManager.InfoCheckType.Avatar)) {
                return;
            }
            SelectImageFragment.newInstanceWithLegalCheck().show(personInfoActivity.getSupportFragmentManager(), (String) null);
            Analytics.recordEvent(new CountEventBuilder("Profile_Out").setValue("Photo"));
            return;
        }
        if (iIntValue == R.string.user_info_ft_profile_edit_id) {
            Object systemService = personInfoActivity.getSystemService("clipboard");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("userId", personInfoActivity.mPersonInfo.getUserInfo().getUserid()));
            CustomToast.makeText(personInfoActivity, personInfoActivity.getString(R.string.user_info_id_copied), 0).show();
            Analytics.recordEvent(new CountEventBuilder("Profile_Out").setValue("CopyID"));
            return;
        }
        if (iIntValue == R.string.user_info_person_info_key_nickname) {
            if (AuditUserInfoManager.interceptShowAuditTip(personInfoActivity, AuditUserInfoManager.InfoCheckType.Nickname)) {
                return;
            }
            PersonInfoSettingBaseFragment.Companion.showSelf$default(PersonInfoSettingBaseFragment.INSTANCE, personInfoActivity, PersonInfoSettingNicknameFragment.INSTANCE.newInstanceWithLegalCheck(), personInfoActivity.onDataChangeListener, false, 8, null);
            Analytics.recordEvent(new CountEventBuilder("Profile_Out").setValue("Nickname"));
            return;
        }
        if (iIntValue == R.string.user_info_person_info_key_gender) {
            PersonInfoSettingBaseFragment.Companion.showSelf$default(PersonInfoSettingBaseFragment.INSTANCE, personInfoActivity, new PersonInfoSettingGenderFragment(), new PersonInfoSettingBaseFragment.OnDataChangeListener() { // from class: com.huami.account.userinfo.ui.PersonInfoActivity$initListView$1$1
                @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment.OnDataChangeListener
                public void onChange() {
                    this.a.onDataChangeListener.onChange();
                }
            }, false, 8, null);
            Analytics.recordEvent(new CountEventBuilder("Profile_Out").setValue("Gender"));
            return;
        }
        if (iIntValue == R.string.user_info_person_info_key_birth) {
            if (HMLoginManager.isAdultGlobal() || personInfoActivity.s().isMainLandChildDefaultAge() || personInfoActivity.y()) {
                PersonInfoSettingBaseFragment.Companion.showSelf$default(PersonInfoSettingBaseFragment.INSTANCE, personInfoActivity, personInfoActivity.y() ? new PersonInfoSettingBirthdayForRegisterFragment() : new PersonInfoSettingBirthdayFragment(), new PersonInfoSettingBaseFragment.OnDataChangeListener() { // from class: com.huami.account.userinfo.ui.PersonInfoActivity$initListView$1$2
                    @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment.OnDataChangeListener
                    public void onChange() {
                        this.a.hasChangedAge = true;
                        this.a.onDataChangeListener.onChange();
                    }
                }, false, 8, null);
                Analytics.recordEvent(new CountEventBuilder("Profile_Out").setValue("Born"));
                return;
            }
            return;
        }
        if (iIntValue == R.string.user_info_person_info_key_height) {
            PersonInfoSettingBaseFragment.Companion.showSelf$default(PersonInfoSettingBaseFragment.INSTANCE, personInfoActivity, new PersonInfoSettingHeightFragment(), new PersonInfoSettingBaseFragment.OnDataChangeListener() { // from class: com.huami.account.userinfo.ui.PersonInfoActivity$initListView$1$3
                @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment.OnDataChangeListener
                public void onChange() {
                    this.a.onDataChangeListener.onChange();
                }
            }, false, 8, null);
            Analytics.recordEvent(new CountEventBuilder("Profile_Out").setValue("Height"));
            return;
        }
        if (iIntValue == R.string.user_info_person_info_key_weight) {
            if (DetectDefaultFieldUseCase.execute("weight")) {
                UserinfoExternalsKt.getUserinfoDelegate().pickWeightValue(personInfoActivity, personInfoActivity.mPersonInfo.getUserInfo().getWeight(), personInfoActivity.new b());
                return;
            } else {
                UserinfoExternalsKt.getUserinfoDelegate().weightItemActionExceptDefault(personInfoActivity);
                Analytics.recordEvent(new CountEventBuilder("Profile_Out").setValue("Weight"));
                return;
            }
        }
        List<PersonInfoItem> list = personInfoActivity.extraItems;
        Objects.requireNonNull(list);
        for (Object obj2 : list) {
            ItemValue value = ((PersonInfoItem) obj2).getItemValueProvider().invoke().getValue();
            if (value != null && iIntValue == value.getNameId()) {
                obj = obj2;
                break;
            }
        }
        PersonInfoItem personInfoItem = (PersonInfoItem) obj;
        if (personInfoItem == null) {
            return;
        }
        personInfoItem.getClickAction().invoke(personInfoActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUI() {
        HMPersonInfo hMPersonInfo = this.mPersonInfo;
        TextView textView = this.mAuditAvatar;
        Objects.requireNonNull(textView);
        ImageView imageView = this.mAvatar;
        Objects.requireNonNull(imageView);
        AuditUserInfoManager.displayAvatar(this, hMPersonInfo, textView, imageView);
        ListViewAdapter listViewAdapter = this.mAdapter;
        if (listViewAdapter != null) {
            Objects.requireNonNull(listViewAdapter);
            listViewAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(PersonInfoActivity personInfoActivity, View view) {
        Object systemService = personInfoActivity.getSystemService("clipboard");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("userId", personInfoActivity.mPersonInfo.getUserInfo().getUserid()));
        CustomToast.makeText(personInfoActivity, personInfoActivity.getString(R.string.user_info_id_copied), 0).show();
        Analytics.recordEvent(new CountEventBuilder("Profile_Out").setValue("CopyID"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(PersonInfoActivity personInfoActivity, View view) {
        SelectImageFragment.newInstanceWithLegalCheck().show(personInfoActivity.getSupportFragmentManager(), (String) null);
        Analytics.recordEvent(new CountEventBuilder("Profile_Out").setValue("Photo"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(PersonInfoActivity personInfoActivity, StateWrapper stateWrapper) {
        if (stateWrapper instanceof StateWrapper.Loading) {
            personInfoActivity.r().showLoadingDialog(((StateWrapper.Loading) stateWrapper).getMessage());
            return;
        }
        if (stateWrapper instanceof StateWrapper.Failed) {
            personInfoActivity.r().hideDialog();
        } else if (stateWrapper instanceof StateWrapper.Success) {
            personInfoActivity.r().hideDialog();
            StateWrapper.Success success = (StateWrapper.Success) stateWrapper;
            personInfoActivity.C(((PersonInfoUiState) success.getData()).getPersonInfo());
            personInfoActivity.A(((PersonInfoUiState) success.getData()).getMinorState());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y() {
        return getIntent().getBooleanExtra(N, false);
    }

    private final void z() {
        if (y() && this.hasChangedAge) {
            EventBus.getDefault().post(new EventAgeHasConfirmed());
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 20) {
            SelectImageFragment.newInstanceWithLegalCheck().show(getSupportFragmentManager(), (String) null);
        }
        if (requestCode == 18 && data != null) {
            this.mPersonInfo.getUserInfo().setAvatarPath(data.getStringExtra("CROPPED_FILE_PATH"));
            updateUI();
            HMLog.debug(M, new c(requestCode));
            return;
        }
        if (requestCode != 19 || data == null || data.getExtras() == null) {
            return;
        }
        Bundle extras = data.getExtras();
        Bitmap bitmap = (Bitmap) (extras != null ? extras.get("data") : null);
        if (bitmap != null) {
            try {
                String str = getFilesDir().getAbsolutePath() + ((Object) File.separator) + com.xiaomi.hm.health.Constant.BRACELET_ICON;
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                this.mPersonInfo.getUserInfo().setAvatarPath(str);
                HMLog.debug(M, new d(requestCode));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info_activity_person_info);
        this.minorAuthorizationManager = new MinorAuthorizationManager(this);
        initTitle();
        if (Utils.INSTANCE.shouldHideDiscovery()) {
            this.keys.remove(Integer.valueOf(R.string.user_info_ft_profile_edit_location));
        }
        q();
        initView();
        s().fetchFreshPersonInfo();
        Analytics.recordEvent(new CountEventBuilder("Profile_ViewNum"));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        z();
        String json = HMHttpUtils.getGson().toJson(PersonInfoMapper.toProfileDataMap$default(this.mPersonInfo, null, 1, null));
        String lastSyncPersonInfo = HMAccountKeeper.INSTANCE.getLastSyncPersonInfo();
        if (this.mPersonInfo.getUserInfo() != null) {
            if (lastSyncPersonInfo != null && (lastSyncPersonInfo.equals(json) ^ true)) {
                EventBus.getDefault().post(new EventPersonInfoUpdate());
            }
        }
        UserinfoExternalsKt.getUserinfoDelegate().setUserInfoToDevice();
        MinorAuthorizationManager minorAuthorizationManager = this.minorAuthorizationManager;
        Objects.requireNonNull(minorAuthorizationManager);
        minorAuthorizationManager.release();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        onBackPressed();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        List<PersonInfoItem> list = this.extraItems;
        Objects.requireNonNull(list);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ((PersonInfoItem) it2.next()).getUpdateAction().invoke(this);
        }
        if (Float.valueOf(this.lastWeight).equals(Float.valueOf(this.mPersonInfo.getUserInfo().getWeight()))) {
            return;
        }
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        updateUI();
    }
}
