package com.xiaomi.fitness.nfc.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.SeCardStatus;
import com.xiaomi.fitness.baseui.dialog.CircleProgressDialog;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.bean.AutoSwitchCardBean;
import com.xiaomi.fitness.nfc.bean.CardManagerBean;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.di.NfcEventModule;
import com.xiaomi.fitness.nfc.ui.CardManagerActivity;
import com.xiaomi.fitness.nfc.ui.issued.CarDetailFragment;
import com.xiaomi.fitness.nfc.ui.issued.CarOutDetailFragment;
import com.xiaomi.fitness.nfc.ui.issued.DoorCardDetailFragment;
import com.xiaomi.fitness.nfc.ui.issued.TransitCardDetailFragment;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.nfc.utils.PageUtilsKt;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.nfc.widget.CardListView;
import com.xiaomi.fitness.nfc.widget.RecyclerViewSpacesItemDecoration;
import defpackage.av6;
import defpackage.jtk;
import defpackage.ltg;
import defpackage.lxf;
import defpackage.nrf;
import defpackage.o0j;
import defpackage.o63;
import defpackage.rlg;
import defpackage.sui;
import defpackage.uno;
import defpackage.vqg;
import defpackage.wm3;
import defpackage.wni;
import defpackage.yl3;
import defpackage.zl3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n*\u0001D\u0018\u0000 P2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001PB\u0007¢\u0006\u0004\bO\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ?\u0010\u0013\u001a\u00020\u00042\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001c\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J)\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0014¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010.\u001a\u00020\u0004H\u0014¢\u0006\u0004\b.\u0010\u0006J\u001d\u0010/\u001a\u0004\u0018\u00010\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b/\u0010\fJ\u0017\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010?R\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010K¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CardManagerActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/nfc/ui/CardManagerViewModel;", "Lrlg;", "", "setSettingListener", "()V", "loadCardList", "", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "carList", "findDeleteCarCard", "(Ljava/util/List;)Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "showDeleteCarDialog", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;)V", "deleteCarCard", "trasitList", "doorList", "showLoadErrorDilog", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "list", "findMierCardAndDelete", "(Ljava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "bindView", "(Lrlg;)V", "Lnrf;", "messageEvent", "onDataEvent", "(Lnrf;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "findMierCard", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/widget/ImageView;", "syncIconView", "Landroid/widget/ImageView;", "Lcom/xiaomi/fitness/nfc/ui/CardManaerListAdapter;", "adapter", "Lcom/xiaomi/fitness/nfc/ui/CardManaerListAdapter;", "", "Lcom/xiaomi/fitness/nfc/bean/CardManagerBean;", "dataList", "Ljava/util/List;", "type", "I", "", "isLoading", "Z", "mSpanSize", "com/xiaomi/fitness/nfc/ui/CardManagerActivity$loop$1", "loop", "Lcom/xiaomi/fitness/nfc/ui/CardManagerActivity$loop$1;", "", "mCardListFragmentVisibleTime", "J", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCardManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardManagerActivity.kt\ncom/xiaomi/fitness/nfc/ui/CardManagerActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,500:1\n1863#2:501\n1863#2,2:502\n1864#2:504\n*S KotlinDebug\n*F\n+ 1 CardManagerActivity.kt\ncom/xiaomi/fitness/nfc/ui/CardManagerActivity\n*L\n194#1:501\n195#1:502,2\n194#1:504\n*E\n"})
public final class CardManagerActivity extends BaseBindingActivity<CardManagerViewModel, rlg> {

    @NotNull
    public static final String sIsFromDevicePage = "sIsFromDevicePage";

    @NotNull
    public static final String sType = "sType";
    public static final int sTypeDelete = 1;

    @Nullable
    private CardManaerListAdapter adapter;
    private boolean isLoading;
    private long mCardListFragmentVisibleTime;
    private ImageView syncIconView;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int sRequestCodeDetail = 10;
    private static int sRequestCodeAdd = 20;

    @NotNull
    private List<CardManagerBean> dataList = new ArrayList();
    private int type = -1;
    private int mSpanSize = 1;

    @NotNull
    private CardManagerActivity$loop$1 loop = new GridLayoutManager.b() { // from class: com.xiaomi.fitness.nfc.ui.CardManagerActivity$loop$1
        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int getSpanSize(int position) {
            return this.this$0.mSpanSize;
        }
    };

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CardManagerActivity$Companion;", "", "<init>", "()V", CardManagerActivity.sIsFromDevicePage, "", "sType", "sTypeDelete", "", "sRequestCodeDetail", "getSRequestCodeDetail", "()I", "setSRequestCodeDetail", "(I)V", "sRequestCodeAdd", "getSRequestCodeAdd", "setSRequestCodeAdd", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSRequestCodeAdd() {
            return CardManagerActivity.sRequestCodeAdd;
        }

        public final int getSRequestCodeDetail() {
            return CardManagerActivity.sRequestCodeDetail;
        }

        public final void setSRequestCodeAdd(int i) {
            CardManagerActivity.sRequestCodeAdd = i;
        }

        public final void setSRequestCodeDetail(int i) {
            CardManagerActivity.sRequestCodeDetail = i;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardCategory.values().length];
            try {
                iArr[CardCategory.TRANSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardCategory.DOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2(final CardManagerActivity this$0, final String shareUrl, final String did) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareUrl, "shareUrl");
        Intrinsics.checkNotNullParameter(did, "did");
        int i = o0j.O0;
        int i2 = o0j.N0;
        int i3 = o0j.e;
        FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        UtilsKt.showMsgDialog(i, i2, i3, supportFragmentManager, o0j.d, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: co3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardManagerActivity.bindView$lambda$2$lambda$0(this.f5590a, shareUrl, did, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: do3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardManagerActivity.bindView$lambda$2$lambda$1((DialogInterface) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2$lambda$0(CardManagerActivity this$0, String shareUrl, String did, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareUrl, "$shareUrl");
        Intrinsics.checkNotNullParameter(did, "$did");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setPackage(this$0.getApplication().getPackageName());
        intent.setData(Uri.parse("miwear://card?action=issue&type=car_keys&source_channel=mi_wallet&need_confirm=0&relay_server=" + shareUrl + "&did=" + did));
        this$0.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2$lambda$1(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void deleteCarCard(CardWrapper cardWrapper) {
        showLoading(o0j.Z2, false);
        ((CardManagerViewModel) getMViewModel()).removeCard(cardWrapper, new Function0() { // from class: ao3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardManagerActivity.deleteCarCard$lambda$9(this.f3295a);
            }
        }, new Function1() { // from class: bo3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardManagerActivity.deleteCarCard$lambda$10(this.f4414a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteCarCard$lambda$10(CardManagerActivity this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtil.showLongToast(msg);
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteCarCard$lambda$9(CardManagerActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastUtil.showShortToast(o0j.i3);
        this$0.dismissDialogForce();
        this$0.loadCardList();
        return Unit.INSTANCE;
    }

    private final CardWrapper findDeleteCarCard(List<? extends CardWrapper> carList) {
        for (CardWrapper cardWrapper : carList) {
            vqg.d("CardManagerActivity isPrivateCarKey:" + cardWrapper.isPrivateCarKey());
            if (cardWrapper.isCar()) {
                vqg.d("CardManagerActivity carStatus:" + cardWrapper.getCarStatus());
                if (cardWrapper.getCarStatus() == SeCardStatus.DELETING) {
                    return cardWrapper;
                }
            }
        }
        return null;
    }

    private final void findMierCardAndDelete(List<? extends CardWrapper> list) {
        CardWrapper cardWrapperFindMierCard = findMierCard(list);
        if (cardWrapperFindMierCard != null) {
            zl3.g().l(cardWrapperFindMierCard);
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_DELETE", true);
            PageUtilsKt.gotoPage(this, DoorCardDetailFragment.class, bundle);
            finish();
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels().size() > 1) {
            int i = o0j.p2;
            int i2 = o0j.z7;
            int i3 = o0j.x2;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            UtilsKt.showMsgDialog$default(i, i2, i3, supportFragmentManager, 0, new Function1() { // from class: xn3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CardManagerActivity.findMierCardAndDelete$lambda$11((DialogInterface) obj);
                }
            }, (Function1) null, 80, (Object) null);
        } else {
            int i4 = o0j.p2;
            int i5 = o0j.A7;
            int i6 = o0j.x2;
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
            UtilsKt.showMsgDialog$default(i4, i5, i6, supportFragmentManager2, 0, new Function1() { // from class: yn3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CardManagerActivity.findMierCardAndDelete$lambda$12((DialogInterface) obj);
                }
            }, (Function1) null, 80, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findMierCardAndDelete$lambda$11(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findMierCardAndDelete$lambda$12(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void loadCardList() {
        if (this.isLoading) {
            return;
        }
        this.isLoading = true;
        showLoading();
        ((CardManagerViewModel) getMViewModel()).loadCardList(new Function3() { // from class: wn3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CardManagerActivity.loadCardList$lambda$8(this.f38156a, (List) obj, (List) obj2, (List) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadCardList$lambda$8(CardManagerActivity this$0, List list, List list2, List list3) {
        CircleProgressDialog circleProgressDialog;
        CardManagerBean cardManagerBean;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isLoading = false;
        if (this$0.type == 1 && list2 != null) {
            this$0.findMierCardAndDelete(list2);
        }
        for (CardManagerBean cardManagerBean2 : this$0.dataList) {
            cardManagerBean2.getList().clear();
            if (list != null && cardManagerBean2.getCardCategory() == 0) {
                cardManagerBean2.getList().addAll(list);
            }
            if (list2 != null && cardManagerBean2.getCardCategory() == 1) {
                cardManagerBean2.getList().addAll(list2);
            }
        }
        List list4 = list3;
        if (list4 != null && !list4.isEmpty()) {
            if (this$0.dataList.size() == 2) {
                this$0.dataList.add(0, new CardManagerBean(2));
                cardManagerBean = this$0.dataList.get(0);
            } else {
                cardManagerBean = this$0.dataList.get(0);
            }
            cardManagerBean.getList().addAll(list4);
            CardWrapper cardWrapperFindDeleteCarCard = this$0.findDeleteCarCard(list3);
            if (cardWrapperFindDeleteCarCard != null) {
                this$0.showDeleteCarDialog(cardWrapperFindDeleteCarCard);
            }
        } else if (this$0.dataList.size() != 2) {
            this$0.dataList.remove(0);
        }
        CardManaerListAdapter cardManaerListAdapter = this$0.adapter;
        if (cardManaerListAdapter != null) {
            cardManaerListAdapter.notifyDataSetChanged();
        }
        NfcEventModule.INSTANCE.updateCardNumber((list != null ? list.size() : 0) + (list2 != null ? list2.size() : 0) + (list3 != null ? list3.size() : 0));
        WeakReference<CircleProgressDialog> mLoadingDialog = this$0.getMLoadingDialog();
        if (mLoadingDialog != null && (circleProgressDialog = mLoadingDialog.get()) != null) {
            circleProgressDialog.finish();
        }
        this$0.showLoadErrorDilog(list, list2, list3);
        this$0.setSettingListener();
        return Unit.INSTANCE;
    }

    private final void setSettingListener() {
        ImageView imageView = this.syncIconView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncIconView");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: eo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardManagerActivity.setSettingListener$lambda$5(this.f16867a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSettingListener$lambda$5(CardManagerActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<T> it = this$0.dataList.iterator();
        while (it.hasNext()) {
            for (CardWrapper cardWrapper : ((CardManagerBean) it.next()).getList()) {
                CardCategory category = cardWrapper.mSeCard.getCategory();
                int i = category == null ? -1 : WhenMappings.$EnumSwitchMapping$0[category.ordinal()];
                if (i == 1) {
                    String aid = cardWrapper.getAid();
                    Intrinsics.checkNotNullExpressionValue(aid, "getAid(...)");
                    String name = cardWrapper.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    String cardFace = cardWrapper.getCardFace();
                    Intrinsics.checkNotNullExpressionValue(cardFace, "getCardFace(...)");
                    arrayList.add(new AutoSwitchCardBean(0, aid, name, cardFace));
                } else if (i == 2) {
                    String id = cardWrapper.getId();
                    if (id != null) {
                        int iHashCode = id.hashCode();
                        if (iHashCode != -1957260907) {
                            if (iHashCode != -1749024261) {
                                if (iHashCode == -1069757225 && id.equals("59013-40002")) {
                                    String aid2 = cardWrapper.getAid();
                                    Intrinsics.checkNotNullExpressionValue(aid2, "getAid(...)");
                                    String name2 = cardWrapper.getName();
                                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                                    String cardFace2 = cardWrapper.getCardFace();
                                    Intrinsics.checkNotNullExpressionValue(cardFace2, "getCardFace(...)");
                                    arrayList.add(new AutoSwitchCardBean(3, aid2, name2, cardFace2));
                                }
                            } else if (id.equals("66666-00211")) {
                                String aid3 = cardWrapper.getAid();
                                Intrinsics.checkNotNullExpressionValue(aid3, "getAid(...)");
                                String name3 = cardWrapper.getName();
                                Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                                String cardFace3 = cardWrapper.getCardFace();
                                Intrinsics.checkNotNullExpressionValue(cardFace3, "getCardFace(...)");
                                arrayList.add(new AutoSwitchCardBean(2, aid3, name3, cardFace3));
                            }
                        } else if (id.equals("59012-40001")) {
                            String aid4 = cardWrapper.getAid();
                            Intrinsics.checkNotNullExpressionValue(aid4, "getAid(...)");
                            String name4 = cardWrapper.getName();
                            Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
                            String cardFace4 = cardWrapper.getCardFace();
                            Intrinsics.checkNotNullExpressionValue(cardFace4, "getCardFace(...)");
                            arrayList.add(new AutoSwitchCardBean(3, aid4, name4, cardFace4));
                        }
                    }
                    String aid5 = cardWrapper.getAid();
                    Intrinsics.checkNotNullExpressionValue(aid5, "getAid(...)");
                    String name5 = cardWrapper.getName();
                    Intrinsics.checkNotNullExpressionValue(name5, "getName(...)");
                    String cardFace5 = cardWrapper.getCardFace();
                    Intrinsics.checkNotNullExpressionValue(cardFace5, "getCardFace(...)");
                    arrayList.add(new AutoSwitchCardBean(1, aid5, name5, cardFace5));
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(AutoSwitchCardFragment.sCardList, arrayList);
        PageUtilsKt.gotoPage(this$0, NfcSettingFragment.class, bundle);
    }

    private final void showDeleteCarDialog(final CardWrapper cardWrapper) {
        String string = getString(o0j.L0, cardWrapper.getName());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CommonDialog commonDialogCreate = new CommonDialog.c("showDeleteCarDialog").setDialogTitle(o0j.M0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(string)).setPositiveText(o0j.m2).setCancelable(false).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.CardManagerActivity.showDeleteCarDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    CardManagerActivity.this.deleteCarCard(cardWrapper);
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void showLoadErrorDilog(List<? extends CardWrapper> trasitList, List<? extends CardWrapper> doorList, List<? extends CardWrapper> carList) {
        String string;
        String string2;
        vqg.d("load card list trasitList:" + trasitList + " doorList:" + doorList + " carList:" + carList);
        if (trasitList != null && doorList != null && carList != null) {
            ltg.c().n();
            return;
        }
        if (trasitList == null && doorList == null && carList == null) {
            string2 = getString(o0j.F1);
        } else {
            if (trasitList == null && doorList == null) {
                string = getString(o0j.G1, getString(o0j.Y6), getString(o0j.d3));
            } else if (trasitList == null && carList == null) {
                string = getString(o0j.G1, getString(o0j.Y6), getString(o0j.D0));
            } else if (doorList == null && carList == null) {
                string = getString(o0j.G1, getString(o0j.d3), getString(o0j.D0));
            } else if (trasitList == null) {
                string = getString(o0j.Y6);
            } else {
                string = doorList == null ? getString(o0j.d3) : getString(o0j.D0);
            }
            Intrinsics.checkNotNull(string);
            string2 = getString(o0j.E1, string);
        }
        Intrinsics.checkNotNull(string2);
        CommonDialog commonDialogCreate = new CommonDialog.c("showLoadErrorList").setDialogTitle(o0j.common_load_fail).setDialogDescriptionString(new DialogParams.DialogDescriptionString(string2)).setNegativeText(o0j.j2).setPositiveText(o0j.z2).setDialogDescription(o0j.n6).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.CardManagerActivity.showLoadErrorDilog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    CardManagerActivity.this.loadCardList();
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull rlg rlgVar) {
        Intrinsics.checkNotNullParameter(rlgVar, "<this>");
        setTitle(o0j.b4);
        vqg.b("CardManagerFragment  NfcFragmentCardManagerBinding.bindView hashCode:" + rlgVar.hashCode());
        this.adapter = new CardManaerListAdapter(this, this.dataList, new CardListView.CardListViewListener() { // from class: com.xiaomi.fitness.nfc.ui.CardManagerActivity.bindView.1
            @Override // com.xiaomi.fitness.nfc.widget.CardListView.CardListViewListener
            public void onAddViewClicked(int cardCategory) {
                if (cardCategory == 0) {
                    PageUtilsKt.gotoPageForResult(CardManagerActivity.this, CardListFragment.class, null, CardManagerActivity.INSTANCE.getSRequestCodeAdd());
                } else {
                    if (cardCategory != 1) {
                        return;
                    }
                    PageUtilsKt.gotoPageForResult(CardManagerActivity.this, AddDoorCardFragment.class, null, CardManagerActivity.INSTANCE.getSRequestCodeAdd());
                }
            }

            @Override // com.xiaomi.fitness.nfc.widget.CardListView.CardListViewListener
            public void onCardClicked(CardWrapper cardInfo) {
                Intrinsics.checkNotNullParameter(cardInfo, "cardInfo");
                zl3.g().l(cardInfo);
                if (cardInfo.isMifare()) {
                    PageUtilsKt.gotoPageForResult(CardManagerActivity.this, DoorCardDetailFragment.class, null, CardManagerActivity.INSTANCE.getSRequestCodeDetail());
                    return;
                }
                if (cardInfo.isTransit()) {
                    PageUtilsKt.gotoPageForResult(CardManagerActivity.this, TransitCardDetailFragment.class, null, CardManagerActivity.INSTANCE.getSRequestCodeDetail());
                } else if (cardInfo.isCar()) {
                    PageUtilsKt.gotoPageForResult(CardManagerActivity.this, CarDetailFragment.class, null, CardManagerActivity.INSTANCE.getSRequestCodeDetail());
                } else if (cardInfo.isPrivateCarKey()) {
                    PageUtilsKt.gotoPageForResult(CardManagerActivity.this, CarOutDetailFragment.class, null, CardManagerActivity.INSTANCE.getSRequestCodeDetail());
                }
            }
        });
        this.dataList.clear();
        this.dataList.add(new CardManagerBean(0));
        this.dataList.add(new CardManagerBean(1));
        this.mSpanSize = SettingsPropertiesUtil.INSTANCE.isFolded(this) ? 2 : 1;
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this, 2, 1, false);
        rlgVar.A.setLayoutManager(gridLayoutManager);
        gridLayoutManager.D(this.loop);
        rlgVar.A.addItemDecoration(new RecyclerViewSpacesItemDecoration(0, 0, 0, 0, 15, null));
        rlgVar.A.setAdapter(this.adapter);
        View viewInflate = LayoutInflater.from(this).inflate(sui.P0, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewInflate;
        this.syncIconView = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncIconView");
            imageView = null;
        }
        imageView.setImageResource(wni.u);
        ImageView imageView2 = this.syncIconView;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncIconView");
            imageView2 = null;
        }
        imageView2.setContentDescription(getString(o0j.v2));
        ImageView imageView3 = this.syncIconView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncIconView");
            imageView3 = null;
        }
        setEndView(imageView3);
        loadCardList();
        UtilsKt.showMiPayPrivacy$default(this, null, 2, null);
        ((CardManagerViewModel) getMViewModel()).checkCarOk(new Function2() { // from class: zn3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CardManagerActivity.bindView$lambda$2(this.f41474a, (String) obj, (String) obj2);
            }
        });
    }

    @Nullable
    public final CardWrapper findMierCard(@NotNull List<? extends CardWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        for (CardWrapper cardWrapper : list) {
            if (lxf.f(cardWrapper)) {
                return cardWrapper;
            }
        }
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sui.f33999a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == sRequestCodeDetail) {
            if (resultCode == -1) {
                loadCardList();
            }
        } else if (requestCode == sRequestCodeAdd && resultCode == -1) {
            loadCardList();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        vqg.d("CardManagerFragment  onConfigurationChanged");
        getMBinding().A.removeItemDecorationAt(0);
        getMBinding().A.addItemDecoration(new RecyclerViewSpacesItemDecoration(0, 0, 0, 0, 15, null));
        CardManaerListAdapter cardManaerListAdapter = this.adapter;
        if (cardManaerListAdapter != null) {
            cardManaerListAdapter.notifyDataSetChanged();
        }
        this.mSpanSize = SettingsPropertiesUtil.INSTANCE.isFolded(this) ? 2 : 1;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.type = getIntent().getIntExtra("sType", -1);
        super.onCreate(savedInstanceState);
        o63.c(this);
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onDataEvent(@NotNull nrf messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if ((messageEvent instanceof wm3) || (messageEvent instanceof jtk) || (messageEvent instanceof yl3)) {
            loadCardList();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o63.d(this);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (intent.getBooleanExtra(sIsFromDevicePage, false)) {
            loadCardList();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mCardListFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "pack_detail_page", "title", NfcUtils.INSTANCE.payName(), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mCardListFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mCardListFragmentVisibleTime = System.currentTimeMillis();
    }
}
