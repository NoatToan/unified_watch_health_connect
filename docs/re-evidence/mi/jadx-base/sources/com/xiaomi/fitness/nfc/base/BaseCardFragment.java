package com.xiaomi.fitness.nfc.base;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.entity.BulletinResponseInfo;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.cih;
import defpackage.mri;
import defpackage.nrf;
import defpackage.o0j;
import defpackage.o63;
import defpackage.sui;
import defpackage.uno;
import defpackage.vqg;
import defpackage.zl3;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001YB\u001f\u0012\u0006\u0010T\u001a\u00020$\u0012\u0006\u0010U\u001a\u00020$\u0012\u0006\u0010V\u001a\u00020\u0017¢\u0006\u0004\bW\u0010XJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J)\u0010 \u001a\u00020\b2\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b \u0010!J1\u0010 \u001a\u00020\b2\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b \u0010#J/\u0010&\u001a\u00020\b2\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020(H\u0014¢\u0006\u0004\b-\u0010+J\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\b¢\u0006\u0004\b4\u0010/R*\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010@\u001a\u00020?8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010G\u001a\u0004\u0018\u00010F8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010N\u001a\u0004\u0018\u00010M8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006Z"}, d2 = {"Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/miui/tsmclient/entity/BulletinResponseInfo$ButtonInfo;", "button", "", "onBulletBtnClick", "(Lcom/miui/tsmclient/entity/BulletinResponseInfo$ButtonInfo;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "openAnIntent", "(Landroid/content/Context;Landroid/content/Intent;)V", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "isNeedMessageEvent", "()Z", "isNeedCardInfo", "isFragmentValid", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "clazz", SdkContants.KEY_BUNDLE, "gotoPage", "(Ljava/lang/Class;Landroid/os/Bundle;)V", "isParcelable", "(Ljava/lang/Class;Landroid/os/Bundle;Z)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "gotoPageForResult", "(Ljava/lang/Class;Landroid/os/Bundle;I)V", "Lnrf;", "messageEvent", "onDataEvent", "(Lnrf;)V", "event", "onMessageEvent", "onDestroyView", "()V", "Landroid/os/Message;", "msg", "xhandleMessage", "(Landroid/os/Message;)V", "showBulletDialog", "", "Lcom/miui/tsmclient/entity/BulletinResponseInfo$BulletinInfo;", "bullterList", "Ljava/util/List;", "getBullterList", "()Ljava/util/List;", "setBullterList", "(Ljava/util/List;)V", "currentIndex", "I", "", "bulltetTag", "Ljava/lang/String;", "getBulltetTag", "()Ljava/lang/String;", "setBulltetTag", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "getCardWrapper", "()Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "setCardWrapper", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;)V", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "layoutId", "viewModle", "isShare", "<init>", "(IIZ)V", "CardHandler", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseCardFragment<VM extends AbsViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @Nullable
    private List<? extends BulletinResponseInfo.BulletinInfo> bullterList;

    @NotNull
    private String bulltetTag;

    @Nullable
    private CardWrapper cardWrapper;
    private int currentIndex;

    @Nullable
    private Handler mHandler;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/nfc/base/BaseCardFragment$CardHandler;", "Landroid/os/Handler;", "cardFragment", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "<init>", "(Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;)V", "cardFragmentWeakReference", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CardHandler extends Handler {

        @NotNull
        private final WeakReference<BaseCardFragment<?, ?>> cardFragmentWeakReference;

        public CardHandler(@NotNull BaseCardFragment<?, ?> cardFragment) {
            Intrinsics.checkNotNullParameter(cardFragment, "cardFragment");
            this.cardFragmentWeakReference = new WeakReference<>(cardFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            super.handleMessage(msg);
            BaseCardFragment<?, ?> baseCardFragment = this.cardFragmentWeakReference.get();
            if (baseCardFragment != null) {
                baseCardFragment.xhandleMessage(msg);
            }
        }
    }

    public BaseCardFragment(int i, int i2, boolean z) {
        super(i, i2, z);
        this.bulltetTag = "";
    }

    public static /* synthetic */ void gotoPage$default(BaseCardFragment baseCardFragment, Class cls, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoPage");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseCardFragment.gotoPage(cls, bundle);
    }

    private final void onBulletBtnClick(BulletinResponseInfo.ButtonInfo button) {
        int linkType = button.getLinkType();
        String link = button.getLink();
        Intrinsics.checkNotNullExpressionValue(link, "getLink(...)");
        Intent intent = new Intent();
        if (linkType == 0) {
            Unit unit = Unit.INSTANCE;
        } else if (linkType == 1) {
            WebViewUtilKt.startWebView$default(link, null, false, false, null, false, null, false, 254, null);
            Unit unit2 = Unit.INSTANCE;
        } else if (linkType == 2) {
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            Intrinsics.checkNotNullExpressionValue(intent.setClassName(mActivity, link), "setClassName(...)");
        } else if (linkType != 3) {
            vqg.b("onBulletBtnClick Invalidate linkType of buttonInfo");
            Unit unit3 = Unit.INSTANCE;
        } else {
            intent.setAction(link);
            Unit unit4 = Unit.INSTANCE;
        }
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        openAnIntent(mActivity2, intent);
    }

    private final void openAnIntent(Context context, Intent intent) {
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        vqg.b(intent.toUri(0) + " not exits");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showBulletDialog$lambda$0(BaseCardFragment this$0, BulletinResponseInfo.BulletinInfo bullet, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bullet, "$bullet");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        BulletinResponseInfo.ButtonInfo positiveButton = bullet.getPositiveButton();
        Intrinsics.checkNotNullExpressionValue(positiveButton, "getPositiveButton(...)");
        this$0.onBulletBtnClick(positiveButton);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showBulletDialog$lambda$1(BaseCardFragment this$0, BulletinResponseInfo.BulletinInfo bullet, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bullet, "$bullet");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        BulletinResponseInfo.ButtonInfo negativeButton = bullet.getNegativeButton();
        Intrinsics.checkNotNullExpressionValue(negativeButton, "getNegativeButton(...)");
        this$0.onBulletBtnClick(negativeButton);
        return Unit.INSTANCE;
    }

    @Nullable
    public List<BulletinResponseInfo.BulletinInfo> getBullterList() {
        return this.bullterList;
    }

    @NotNull
    public String getBulltetTag() {
        return this.bulltetTag;
    }

    @Nullable
    public CardWrapper getCardWrapper() {
        return this.cardWrapper;
    }

    @Nullable
    public Handler getMHandler() {
        return this.mHandler;
    }

    public final void gotoPage(@NotNull Class<? extends Fragment> clazz, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        gotoPage(clazz, bundle, true);
    }

    public final void gotoPageForResult(@NotNull Class<? extends Fragment> clazz, @Nullable Bundle bundle, int requestCode) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        cih.a().c(getActivity(), new FragmentParams.b().e(clazz).c(bundle).a(true).b(), requestCode);
    }

    public boolean isFragmentValid() {
        return !isInvalid();
    }

    public boolean isNeedCardInfo() {
        return true;
    }

    public boolean isNeedMessageEvent() {
        return false;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        setMHandler(new CardHandler(this));
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isNeedMessageEvent() && !o63.a(this)) {
            o63.c(this);
        }
        setCardWrapper(zl3.g().i());
        if (getCardWrapper() == null && isNeedCardInfo()) {
            ToastUtil.showShortToast(o0j.b1);
            finish();
        }
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onDataEvent(@NotNull nrf messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        onMessageEvent(messageEvent);
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (o63.a(this)) {
            o63.d(this);
        }
    }

    public void onMessageEvent(@NotNull nrf event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    public void setBullterList(@Nullable List<? extends BulletinResponseInfo.BulletinInfo> list) {
        this.bullterList = list;
    }

    public void setBulltetTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bulltetTag = str;
    }

    public void setCardWrapper(@Nullable CardWrapper cardWrapper) {
        this.cardWrapper = cardWrapper;
    }

    public void setMHandler(@Nullable Handler handler) {
        this.mHandler = handler;
    }

    public final void showBulletDialog() {
        String str;
        int i = this.currentIndex;
        List<BulletinResponseInfo.BulletinInfo> bullterList = getBullterList();
        Intrinsics.checkNotNull(bullterList);
        if (i >= bullterList.size()) {
            return;
        }
        List<BulletinResponseInfo.BulletinInfo> bullterList2 = getBullterList();
        Intrinsics.checkNotNull(bullterList2);
        int i2 = this.currentIndex;
        this.currentIndex = i2 + 1;
        final BulletinResponseInfo.BulletinInfo bulletinInfo = bullterList2.get(i2);
        String title = bulletinInfo.getTitle();
        String content = bulletinInfo.getContent();
        if ((title == null || StringsKt__StringsKt.isBlank(title)) && (content == null || StringsKt__StringsKt.isBlank(content))) {
            return;
        }
        if (getCardWrapper() != null) {
            CardWrapper cardWrapper = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper);
            str = cardWrapper.mAid;
        } else {
            str = "null_id";
        }
        String str2 = str + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + bulletinInfo.getId() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + getTag() + "_only_once_showed";
        boolean z = false;
        if (NfcPreference.getBoolean(str2, false)) {
            showBulletDialog();
            return;
        }
        View viewInflate = LayoutInflater.from(getMActivity()).inflate(sui.z0, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(mri.J2);
        if (TextUtils.isEmpty(content)) {
            content = getString(o0j.s2);
        }
        textView.setText(Html.fromHtml(content));
        BulletinResponseInfo.ButtonInfo negativeButton = bulletinInfo.getNegativeButton();
        String title2 = negativeButton != null ? negativeButton.getTitle() : null;
        BulletinResponseInfo.ButtonInfo positiveButton = bulletinInfo.getPositiveButton();
        String title3 = positiveButton != null ? positiveButton.getTitle() : null;
        Intrinsics.checkNotNull(title);
        Intrinsics.checkNotNull(viewInflate);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        UtilsKt.showCustomerDialog(title, viewInflate, title3, childFragmentManager, title2, false, new Function1() { // from class: y42
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCardFragment.showBulletDialog$lambda$0(this.f39769a, bulletinInfo, (DialogInterface) obj);
            }
        }, new Function1() { // from class: z42
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCardFragment.showBulletDialog$lambda$1(this.f40857a, bulletinInfo, (DialogInterface) obj);
            }
        }, true);
        if ((bulletinInfo.getPositiveButton() != null && !bulletinInfo.getPositiveButton().isNoMorePrompt()) || (bulletinInfo.getNegativeButton() != null && !bulletinInfo.getNegativeButton().isNoMorePrompt())) {
            z = true;
        }
        NfcPreference.putBoolean(str2, !z);
    }

    public void xhandleMessage(@Nullable Message msg) {
    }

    public static /* synthetic */ void gotoPage$default(BaseCardFragment baseCardFragment, Class cls, Bundle bundle, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoPage");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseCardFragment.gotoPage(cls, bundle, z);
    }

    public final void gotoPage(@NotNull Class<? extends Fragment> clazz, @Nullable Bundle bundle, boolean isParcelable) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        cih.a().b(getMActivity(), new FragmentParams.b().e(clazz).c(bundle).a(true).b(), isParcelable);
    }
}
