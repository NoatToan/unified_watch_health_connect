package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupEditFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.view.WidgetGroupView;
import com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil;
import defpackage.av6;
import defpackage.cji;
import defpackage.dir;
import defpackage.eu6;
import defpackage.eui;
import defpackage.ikr;
import defpackage.jni;
import defpackage.jyo;
import defpackage.kyo;
import defpackage.p8h;
import defpackage.qj6;
import defpackage.wjr;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 m2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001mB\u0007¢\u0006\u0004\bl\u0010\u000fJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u000fJ\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010\u000fJ\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010\u000fJ\u0017\u0010.\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b1\u0010/J!\u00102\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0007H\u0014¢\u0006\u0004\b4\u0010\u000fJ'\u00106\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u00107J#\u0010:\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0007H\u0016¢\u0006\u0004\b<\u0010\u000fJ\u000f\u0010=\u001a\u00020#H\u0016¢\u0006\u0004\b=\u0010%J)\u0010B\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u00102\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010L\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bL\u0010K\u0012\u0004\bM\u0010\u000fR\u0016\u0010N\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010KR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001c0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010RR&\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0O0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010KR\"\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010WR\u0016\u0010Z\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R*\u0010b\u001a\u0016\u0012\u0004\u0012\u00020`\u0018\u00010_j\n\u0012\u0004\u0012\u00020`\u0018\u0001`a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010g\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010k\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupEditFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/BaseWidgetBindingFragment;", "Lqj6;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/view/WidgetGroupView$b;", "Lp8h;", "Landroid/view/View;", "view", "", "initContentView", "(Landroid/view/View;)V", "Lkyo$a;", "list", "onWidgetListAvailable", "(Lkyo$a;)V", "resetListAdded", "()V", "", "style", "index", DailyRecordKey.sportType, "subTpe", "", "sportName", "listPosition", "updateWidgetGroupWhenSportEntitySelected", "(IIIILjava/lang/String;I)V", "refreshFunctionListOnStyle", "(I)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupEditEntity;", "entity", "updateWidgetGroupPreview", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupEditEntity;)V", "selectEntity", "needClearSelectSportItem", "onImgEndClick", "", "checkAllItemSelected", "()Z", "checkNeedToUpdate", "needUpdateToDevice", "Ljyo$b;", "getUpdateWidgetGroupList", "()Ljyo$b;", "prepareWidgetGroupItemList", "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "savedInstanceState", "onCreate", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onVisible", "function", "onWidgetItemSelected", "(III)V", "", "obj", "onItemClick", "(Landroid/view/View;Ljava/lang/Object;)V", LifecycleConstantKt.ON_DESTROY, "onBackPressed", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/view/WidgetGroupView;", "mWidgetGroupView", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/view/WidgetGroupView;", "Ldir;", "mAdapter", "Ldir;", "mSelectItemStyle", "I", "mWidgetGroupStyle", "getMWidgetGroupStyle$annotations", "mWidgetGroupSequence", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/view/WidgetGroupView$a;", "mWidgetItemInfoList", "Ljava/util/List;", "mWidgetItemInfoListCopy", "mEditEntityList", "", "mSupportListMap", "Ljava/util/Map;", "mSelectWidgetItemIndex", "mSelectEntryMap", "mClickConfirm", "Z", "mIsRightClick", "mSelectWidgetItem", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/view/WidgetGroupView$a;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetBean;", "Lkotlin/collections/ArrayList;", "widgetList", "Ljava/util/ArrayList;", "mOriginPage", "Ljava/lang/String;", "", "mSelectSportTime", "J", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWidgetGroupEditFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetGroupEditFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupEditFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,706:1\n1863#2,2:707\n*S KotlinDebug\n*F\n+ 1 WidgetGroupEditFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupEditFragment\n*L\n178#1:707,2\n*E\n"})
public final class WidgetGroupEditFragment extends Hilt_WidgetGroupEditFragment<qj6> implements WidgetGroupView.b, p8h {

    @NotNull
    public static final String KEY_ORIGIN = "origin";

    @NotNull
    public static final String KEY_WIDGET_GROUP_SEQUENCE = "widget_group_sequence";

    @NotNull
    public static final String KEY_WIDGET_GROUP_STYLE = "widget_group_style";

    @NotNull
    public static final String ORIGIN_PAGE_MANAGE = "widget_manage";

    @NotNull
    public static final String ORIGIN_PAGE_TEMPLATE = "widget_template";

    @NotNull
    public static final String sKeyWidgetBeanList = "sKeyWidgetBeanList";
    public static final int sRequestCodeSportList = 100;

    @NotNull
    public static final String sSavekeyDataList = "sSavekeyDataList";

    @NotNull
    public static final String sTAG = "WidgetGroupEditFragment";
    private dir mAdapter;
    private boolean mClickConfirm;
    private boolean mIsRightClick;

    @Nullable
    private String mOriginPage;
    private long mSelectSportTime;

    @Nullable
    private WidgetGroupView.a mSelectWidgetItem;
    private int mSelectWidgetItemIndex;
    private int mWidgetGroupSequence;
    private int mWidgetGroupStyle;

    @Nullable
    private WidgetGroupView mWidgetGroupView;

    @Nullable
    private ArrayList<WidgetBean> widgetList;
    private int mSelectItemStyle = -1;

    @NotNull
    private final List<WidgetGroupView.a> mWidgetItemInfoList = new LinkedList();

    @NotNull
    private final List<WidgetGroupView.a> mWidgetItemInfoListCopy = new LinkedList();

    @NotNull
    private final List<WidgetGroupEditEntity> mEditEntityList = new LinkedList();

    @NotNull
    private final Map<Integer, List<WidgetGroupEditEntity>> mSupportListMap = new LinkedHashMap();

    @NotNull
    private final Map<Integer, WidgetGroupEditEntity> mSelectEntryMap = new LinkedHashMap();

    private final boolean checkAllItemSelected() {
        int iA = ikr.a(this.mWidgetGroupStyle);
        Iterator<WidgetGroupView.a> it = this.mWidgetItemInfoList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().c > 0) {
                i++;
            }
        }
        return i == iA;
    }

    private final boolean checkNeedToUpdate() {
        if (!ikr.c()) {
            ToastUtil.showShortToast(wzi.q);
            return false;
        }
        Logger.i(sTAG, "checkNeedToUpdate: mWidgetItemInfoList= " + this.mWidgetItemInfoList + ", mWidgetItemInfoListCopy = " + this.mWidgetItemInfoListCopy);
        if (ikr.d(this.mWidgetItemInfoList, this.mWidgetItemInfoListCopy)) {
            return false;
        }
        this.mClickConfirm = false;
        this.mIsRightClick = false;
        CommonDialog commonDialogCreate = new CommonDialog.c("dialog").setDialogDescription(wzi.d4).setNegativeText(wzi.e).setPositiveText(wzi.g).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupEditFragment.checkNeedToUpdate.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -2) {
                    WidgetGroupEditFragment.this.mClickConfirm = false;
                    return;
                }
                if (which != -1) {
                    return;
                }
                WidgetGroupEditFragment.this.mClickConfirm = true;
                FragmentActivity mActivity = WidgetGroupEditFragment.this.getMActivity();
                if (mActivity != null) {
                    mActivity.setResult(-1);
                    mActivity.finish();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
        return true;
    }

    private static /* synthetic */ void getMWidgetGroupStyle$annotations() {
    }

    private final jyo.b getUpdateWidgetGroupList() {
        int size = this.mWidgetItemInfoList.size();
        int iA = ikr.a(this.mWidgetGroupStyle);
        if (size != iA) {
            throw new IllegalStateException(("the number of Widget to update must match the styleyour widgetNum = " + size + ",target widgetNum = " + iA + ",style = " + this.mWidgetGroupStyle + ",target sequence = " + this.mWidgetGroupSequence).toString());
        }
        kyo[] kyoVarArr = new kyo[size];
        for (int i = 0; i < size; i++) {
            WidgetGroupView.a aVar = this.mWidgetItemInfoList.get(i);
            kyo kyoVar = new kyo();
            if (aVar != null) {
                kyoVar.c = aVar.f11994b;
                kyoVar.d = aVar.c;
                kyoVar.e = aVar.f;
                kyoVar.g = aVar.g;
            }
            kyoVarArr[i] = kyoVar;
        }
        jyo jyoVar = new jyo();
        jyoVar.d = this.mWidgetGroupStyle;
        jyoVar.c = this.mWidgetGroupSequence;
        jyoVar.e = kyoVarArr;
        jyo.b bVar = new jyo.b();
        bVar.d = false;
        bVar.c = new jyo[]{jyoVar};
        return bVar;
    }

    private final void initContentView(View view) {
        Product product;
        Product.Size size;
        WidgetGroupView widgetGroupView;
        setTitleBackground(cji.x);
        IActionBar.DefaultImpls.setEndView$default(this, 0, jni.f1, null, new View.OnClickListener() { // from class: eir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WidgetGroupEditFragment.initContentView$lambda$2(this.f16696a, view2);
            }
        }, 5, null);
        setTitle(wzi.da);
        View viewFindViewById = view.findViewById(zqi.F7);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(getMActivity()));
        dir dirVar = new dir();
        this.mAdapter = dirVar;
        dirVar.l(this.mEditEntityList);
        dir dirVar2 = this.mAdapter;
        dir dirVar3 = null;
        if (dirVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dirVar2 = null;
        }
        dirVar2.m(this);
        dir dirVar4 = this.mAdapter;
        if (dirVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            dirVar3 = dirVar4;
        }
        recyclerView.setAdapter(dirVar3);
        this.mWidgetGroupView = (WidgetGroupView) view.findViewById(zqi.bb);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && (product = wearableDeviceModel.getProduct()) != null && (size = product.getSize()) != null && (widgetGroupView = this.mWidgetGroupView) != null) {
            widgetGroupView.g(size.getWidth(), size.getHeight(), size.getRadius());
        }
        WidgetGroupView widgetGroupView2 = this.mWidgetGroupView;
        if (widgetGroupView2 != null) {
            widgetGroupView2.setWidgetGroupStyle(this.mWidgetGroupStyle);
        }
        WidgetGroupView widgetGroupView3 = this.mWidgetGroupView;
        if (widgetGroupView3 != null) {
            widgetGroupView3.setOnItemSelectedListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initContentView$lambda$2(WidgetGroupEditFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onImgEndClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void needClearSelectSportItem(WidgetGroupEditEntity selectEntity) {
        wjr selectSportEntity = ((WidgetMangerViewModel) getMViewModel()).getSelectSportEntity(this.mSelectWidgetItemIndex);
        if (selectSportEntity == null || selectSportEntity.e != this.mSelectWidgetItemIndex || selectSportEntity.d != this.mSelectItemStyle || selectSportEntity.f >= 0) {
            return;
        }
        selectEntity.setSportType(0);
        this.mWidgetItemInfoList.get(this.mSelectWidgetItemIndex).a();
        WidgetGroupView widgetGroupView = this.mWidgetGroupView;
        Intrinsics.checkNotNull(widgetGroupView);
        widgetGroupView.postInvalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void needUpdateToDevice() {
        if (ikr.d(this.mWidgetItemInfoList, this.mWidgetItemInfoListCopy)) {
            finish();
            return;
        }
        jyo.b updateWidgetGroupList = getUpdateWidgetGroupList();
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        ikr.g(updateWidgetGroupList, this.mWidgetGroupSequence, this.mWidgetGroupStyle, this.mOriginPage);
        ((WidgetMangerViewModel) getMViewModel()).setWidgetGroupListToDevice(updateWidgetGroupList, new eu6<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupEditFragment.needUpdateToDevice.1
            @Override // defpackage.eu6
            public void onError(int errorCode) {
                AnyExtKt.main$default(null, new WidgetGroupEditFragment$needUpdateToDevice$1$onError$1(WidgetGroupEditFragment.this, errorCode, null), 1, null);
            }

            @Override // defpackage.eu6
            public void onResult(Boolean result) {
                AnyExtKt.main$default(null, new WidgetGroupEditFragment$needUpdateToDevice$1$onResult$1(WidgetGroupEditFragment.this, null), 1, null);
            }
        });
    }

    private final void onImgEndClick() {
        if (!ikr.c()) {
            ToastUtil.showShortToast(wzi.q);
            return;
        }
        this.mIsRightClick = true;
        if (checkAllItemSelected()) {
            needUpdateToDevice();
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("confirm").setDialogDescription(wzi.aa).setNegativeText(wzi.e).setPositiveText(wzi.g).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupEditFragment.onImgEndClick.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -2) {
                    WidgetGroupEditFragment.this.mIsRightClick = false;
                } else {
                    if (which != -1) {
                        return;
                    }
                    WidgetGroupEditFragment.this.finish();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(WidgetGroupEditFragment this$0, kyo.a aVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        this$0.onWidgetListAvailable(aVar);
        return Unit.INSTANCE;
    }

    private final void onWidgetListAvailable(kyo.a list) {
        this.mSupportListMap.clear();
        dir dirVar = null;
        if ((list != null ? list.c : null) != null) {
            kyo[] supportWidgets = list.c;
            Intrinsics.checkNotNullExpressionValue(supportWidgets, "supportWidgets");
            if (supportWidgets.length != 0) {
                Iterator it = ArrayIteratorKt.iterator(list.c);
                while (it.hasNext()) {
                    kyo kyoVar = (kyo) it.next();
                    int i = kyoVar.c;
                    List<WidgetGroupEditEntity> linkedList = this.mSupportListMap.get(Integer.valueOf(i));
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                        this.mSupportListMap.put(Integer.valueOf(i), linkedList);
                    }
                    Intrinsics.checkNotNull(kyoVar);
                    linkedList.add(new WidgetGroupEditEntity(kyoVar));
                }
                refreshFunctionListOnStyle(this.mSelectItemStyle);
                return;
            }
        }
        ToastUtil.showShortToast(wzi.h2);
        dir dirVar2 = this.mAdapter;
        if (dirVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            dirVar = dirVar2;
        }
        dirVar.notifyDataSetChanged();
    }

    private final void prepareWidgetGroupItemList() {
        this.mWidgetItemInfoList.clear();
        int i = this.mWidgetGroupStyle;
        if (i == 1) {
            for (int i2 = 0; i2 < 4; i2++) {
                this.mWidgetItemInfoList.add(new WidgetGroupView.a(i2, 1));
            }
        } else if (i != 2) {
            switch (i) {
                case 4:
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 1));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(1, 1));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(2, 2));
                    break;
                case 8:
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 3));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(1, 1));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(2, 1));
                    break;
                case 16:
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 1));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(1, 3));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(2, 1));
                    break;
                case 32:
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 2));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(1, 2));
                    break;
                case 64:
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 3));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(1, 3));
                    break;
                case 128:
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 4));
                    break;
                case 256:
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 1));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(1, 1));
                    break;
                case 512:
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 3));
                    break;
                case 1024:
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 1));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(1, 1));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(2, 4));
                    break;
                case 2048:
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 4));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(1, 1));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(2, 1));
                    break;
                case 4096:
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 2));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(1, 4));
                    break;
                case 8192:
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 4));
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(1, 2));
                    break;
                case 16384:
                    this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 5));
                    break;
            }
        } else {
            this.mWidgetItemInfoList.add(new WidgetGroupView.a(0, 2));
            this.mWidgetItemInfoList.add(new WidgetGroupView.a(1, 1));
            this.mWidgetItemInfoList.add(new WidgetGroupView.a(2, 1));
        }
        ArrayList<WidgetBean> arrayList = this.widgetList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                WidgetBean widgetBean = arrayList.get(i3);
                Intrinsics.checkNotNullExpressionValue(widgetBean, "get(...)");
                WidgetBean widgetBean2 = widgetBean;
                final WidgetGroupView.a aVar = this.mWidgetItemInfoList.get(i3);
                aVar.e(widgetBean2);
                ikr.e(requireContext(), widgetBean2.getSubType(), new ImageLoadUtil.Callback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupEditFragment$prepareWidgetGroupItemList$1$1
                    @Override // com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil.Callback
                    public void onFailure(Drawable drawable) {
                        ImageLoadUtil.Callback.DefaultImpls.onFailure(this, drawable);
                    }

                    @Override // com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil.Callback
                    public void onReady(Bitmap resource) {
                        Intrinsics.checkNotNullParameter(resource, "resource");
                        aVar.d(this.requireContext(), resource);
                        WidgetGroupView widgetGroupView = this.mWidgetGroupView;
                        if (widgetGroupView != null) {
                            widgetGroupView.m(this.mWidgetItemInfoList);
                        }
                    }
                });
            }
        }
        for (WidgetGroupView.a aVar2 : this.mWidgetItemInfoList) {
            List<WidgetGroupView.a> list = this.mWidgetItemInfoListCopy;
            WidgetGroupView.a aVarB = aVar2.b();
            Intrinsics.checkNotNullExpressionValue(aVarB, "copy(...)");
            list.add(aVarB);
        }
        Logger.i(sTAG, "init list: mWidgetItemInfoList= " + this.mWidgetItemInfoList + ", mWidgetItemInfoListCopy = " + this.mWidgetItemInfoListCopy);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0076  */
    /* JADX WARN: Code duplicated, block: B:15:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0083 A[SYNTHETIC] */
    private final void refreshFunctionListOnStyle(int style) {
        if (style <= 0) {
            return;
        }
        this.mEditEntityList.clear();
        List<WidgetGroupEditEntity> listEmptyList = this.mSupportListMap.get(Integer.valueOf(style));
        Logger.d(sTAG, "refreshFunctionListOnStyle: style = " + style + "，list = " + listEmptyList);
        for (int i = 0; listEmptyList != null && i < listEmptyList.size(); i++) {
            WidgetGroupEditEntity widgetGroupEditEntity = listEmptyList.get(i);
            int function = widgetGroupEditEntity.getFunction();
            WidgetGroupView.a aVar = this.mSelectWidgetItem;
            Intrinsics.checkNotNull(aVar);
            if (function == aVar.c) {
                int subType = widgetGroupEditEntity.getSubType();
                WidgetGroupView.a aVar2 = this.mSelectWidgetItem;
                Intrinsics.checkNotNull(aVar2);
                if (subType == aVar2.f) {
                    widgetGroupEditEntity.setAdded(true);
                    WidgetGroupView.a aVar3 = this.mSelectWidgetItem;
                    Intrinsics.checkNotNull(aVar3);
                    widgetGroupEditEntity.setSportType(aVar3.g);
                    this.mSelectEntryMap.put(Integer.valueOf(this.mSelectWidgetItemIndex), widgetGroupEditEntity);
                } else {
                    widgetGroupEditEntity.setAdded(false);
                    if (widgetGroupEditEntity.isSportFunction()) {
                        widgetGroupEditEntity.setSportType(-1);
                    }
                }
            } else {
                widgetGroupEditEntity.setAdded(false);
                if (widgetGroupEditEntity.isSportFunction()) {
                    widgetGroupEditEntity.setSportType(-1);
                }
            }
        }
        List<WidgetGroupEditEntity> list = this.mEditEntityList;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        list.addAll(listEmptyList);
        dir dirVar = this.mAdapter;
        if (dirVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dirVar = null;
        }
        dirVar.notifyDataSetChanged();
    }

    private final void resetListAdded() {
        dir dirVar = this.mAdapter;
        if (dirVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dirVar = null;
        }
        List<WidgetGroupEditEntity> list = dirVar.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        for (WidgetGroupEditEntity widgetGroupEditEntity : list) {
            widgetGroupEditEntity.setAdded(false);
            if (widgetGroupEditEntity.isSportFunction()) {
                widgetGroupEditEntity.setSportType(-1);
                widgetGroupEditEntity.setSportName("");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateWidgetGroupPreview(WidgetGroupEditEntity entity) {
        dir dirVar = this.mAdapter;
        dir dirVar2 = null;
        if (dirVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dirVar = null;
        }
        List<WidgetGroupEditEntity> list = dirVar.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        int i = this.mSelectWidgetItemIndex;
        final WidgetGroupView.a aVar = this.mWidgetItemInfoList.get(i);
        WidgetGroupEditEntity widgetGroupEditEntity = this.mSelectEntryMap.get(Integer.valueOf(i));
        Logger.i(sTAG, "updateWidgetGroupPreview: itemInfo = " + aVar + ",entityInItem = " + widgetGroupEditEntity + ",selectIndex = " + i);
        if (entity.isSportFunction()) {
            WidgetGroupView.a aVar2 = this.mSelectWidgetItem;
            Intrinsics.checkNotNull(aVar2);
            int i2 = aVar2.f;
            WidgetGroupView.a aVar3 = this.mSelectWidgetItem;
            Intrinsics.checkNotNull(aVar3);
            wjr wjrVar = new wjr(i2, aVar3.g);
            wjrVar.e = i;
            wjrVar.d = this.mSelectItemStyle;
            ((WidgetMangerViewModel) getMViewModel()).setSelectSportEntity(i, wjrVar);
            this.mSelectEntryMap.put(Integer.valueOf(i), null);
        } else if (Intrinsics.areEqual(widgetGroupEditEntity, entity)) {
            this.mSelectEntryMap.put(Integer.valueOf(i), null);
            entity.setAdded(false);
            aVar.e(null);
        } else {
            this.mSelectEntryMap.put(Integer.valueOf(i), entity);
            for (int i3 = 0; i3 < list.size(); i3++) {
                WidgetGroupEditEntity widgetGroupEditEntity2 = list.get(i3);
                if (Intrinsics.areEqual(widgetGroupEditEntity2, entity)) {
                    entity.setAdded(true);
                } else {
                    widgetGroupEditEntity2.setAdded(false);
                }
            }
            kyo widgetItem = entity.getWidgetItem();
            if (widgetItem != null) {
                aVar.e(WidgetBeanKt.convert2WidgetBean(widgetItem));
            }
            wjr selectSportEntity = ((WidgetMangerViewModel) getMViewModel()).getSelectSportEntity(i);
            if (selectSportEntity != null && selectSportEntity.f38041a > 0) {
                selectSportEntity.b();
                selectSportEntity.d = -1;
                selectSportEntity.e = -1;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    WidgetGroupEditEntity widgetGroupEditEntity3 = list.get(i4);
                    if (widgetGroupEditEntity3.getFunction() == 16) {
                        widgetGroupEditEntity3.setSportType(0);
                        widgetGroupEditEntity3.setAdded(false);
                    }
                }
            }
            ikr.e(requireContext(), aVar.f, new ImageLoadUtil.Callback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupEditFragment.updateWidgetGroupPreview.2
                @Override // com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil.Callback
                public void onFailure(Drawable drawable) {
                    ImageLoadUtil.Callback.DefaultImpls.onFailure(this, drawable);
                }

                @Override // com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil.Callback
                public void onReady(Bitmap resource) {
                    Intrinsics.checkNotNullParameter(resource, "resource");
                    aVar.d(this.requireContext(), resource);
                    WidgetGroupView widgetGroupView = this.mWidgetGroupView;
                    Intrinsics.checkNotNull(widgetGroupView);
                    widgetGroupView.m(this.mWidgetItemInfoList);
                }
            });
        }
        dir dirVar3 = this.mAdapter;
        if (dirVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            dirVar2 = dirVar3;
        }
        dirVar2.notifyDataSetChanged();
        needClearSelectSportItem(entity);
    }

    private final void updateWidgetGroupWhenSportEntitySelected(int style, int index, int sportType, int subTpe, String sportName, int listPosition) {
        resetListAdded();
        dir dirVar = this.mAdapter;
        dir dirVar2 = null;
        if (dirVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dirVar = null;
        }
        WidgetGroupEditEntity widgetGroupEditEntity = dirVar.getList().get(listPosition);
        widgetGroupEditEntity.setSubType(subTpe);
        widgetGroupEditEntity.setSportType(sportType);
        widgetGroupEditEntity.setSportName(sportName);
        widgetGroupEditEntity.setAdded(true);
        dir dirVar3 = this.mAdapter;
        if (dirVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            dirVar2 = dirVar3;
        }
        dirVar2.notifyDataSetChanged();
        final WidgetGroupView.a aVar = this.mWidgetItemInfoList.get(index);
        aVar.c = 16;
        aVar.f11994b = style;
        aVar.g = sportType;
        aVar.f = subTpe;
        WidgetGroupView widgetGroupView = this.mWidgetGroupView;
        Intrinsics.checkNotNull(widgetGroupView);
        widgetGroupView.m(this.mWidgetItemInfoList);
        ikr.e(requireContext(), aVar.f, new ImageLoadUtil.Callback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupEditFragment.updateWidgetGroupWhenSportEntitySelected.1
            @Override // com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil.Callback
            public void onFailure(Drawable drawable) {
                ImageLoadUtil.Callback.DefaultImpls.onFailure(this, drawable);
            }

            @Override // com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil.Callback
            public void onReady(Bitmap resource) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                aVar.d(this.requireContext(), resource);
                WidgetGroupView widgetGroupView2 = this.mWidgetGroupView;
                Intrinsics.checkNotNull(widgetGroupView2);
                widgetGroupView2.m(this.mWidgetItemInfoList);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.O0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == -1 && data != null) {
            updateWidgetGroupWhenSportEntitySelected(data.getIntExtra(WidgetSportListFragment.KEY_WIDGET_ITEM_STYLE, 0), data.getIntExtra(WidgetSportListFragment.KEY_WIDGET_ITEM_INDEX, 0), data.getIntExtra(WidgetSportListFragment.KEY_WIDGET_SPORT_TYPE, 0), data.getIntExtra(WidgetSportListFragment.KEY_WIDGET_ITEM_SUBTYPE, 0), data.getStringExtra(WidgetSportListFragment.KEY_WIDGET_SPORT_NAME), data.getIntExtra(WidgetSportListFragment.sKeyListPosition, 0));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        return (this.mIsRightClick || this.mClickConfirm || !checkNeedToUpdate()) ? false : true;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("origin");
            this.mOriginPage = string;
            if (TextUtils.equals(string, ORIGIN_PAGE_MANAGE)) {
                this.widgetList = arguments.getParcelableArrayList(sKeyWidgetBeanList);
            } else {
                TextUtils.equals(this.mOriginPage, ORIGIN_PAGE_TEMPLATE);
            }
            this.mWidgetGroupStyle = arguments.getInt(KEY_WIDGET_GROUP_STYLE);
            this.mWidgetGroupSequence = arguments.getInt("widget_group_sequence");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((WidgetMangerViewModel) getMViewModel()).selectSportEntityMapClear();
    }

    @Override // defpackage.p8h
    public void onItemClick(@Nullable View view, @Nullable Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        dir dirVar = this.mAdapter;
        if (dirVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dirVar = null;
        }
        WidgetGroupEditEntity widgetGroupEditEntity = dirVar.getList().get(iIntValue);
        if (!widgetGroupEditEntity.isSportFunction() || System.currentTimeMillis() - this.mSelectSportTime >= 500) {
            if (widgetGroupEditEntity.isSportFunction() || !widgetGroupEditEntity.getIsAdded()) {
                if (!widgetGroupEditEntity.isSportFunction()) {
                    Intrinsics.checkNotNull(widgetGroupEditEntity);
                    updateWidgetGroupPreview(widgetGroupEditEntity);
                    return;
                }
                this.mSelectSportTime = System.currentTimeMillis();
                Bundle bundle = new Bundle();
                bundle.putInt(WidgetSportListFragment.KEY_WIDGET_ITEM_INDEX, this.mSelectWidgetItemIndex);
                bundle.putInt(WidgetSportListFragment.KEY_WIDGET_ITEM_STYLE, this.mSelectItemStyle);
                bundle.putInt(WidgetSportListFragment.KEY_WIDGET_ITEM_SUBTYPE, widgetGroupEditEntity.getSubType());
                bundle.putInt(WidgetSportListFragment.sKeyListPosition, iIntValue);
                WidgetGroupView.a aVar = this.mSelectWidgetItem;
                Intrinsics.checkNotNull(aVar);
                int i = aVar.g;
                WidgetGroupView.a aVar2 = this.mSelectWidgetItem;
                Intrinsics.checkNotNull(aVar2);
                if (aVar2.f != widgetGroupEditEntity.getSubType()) {
                    i = 0;
                }
                bundle.putInt(WidgetSportListFragment.KEY_WIDGET_SPORT_TYPE, i);
                BaseFragmentExKt.gotoPageForResult(this, (Class<?>) WidgetSportListFragment.class, bundle, 100);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        dir dirVar = this.mAdapter;
        if (dirVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dirVar = null;
        }
        outState.putParcelableArrayList(sSavekeyDataList, ListExtKt.toArrayList(dirVar.getList()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initContentView(view);
        prepareWidgetGroupItemList();
        dir dirVar = null;
        ArrayList parcelableArrayList = savedInstanceState != null ? savedInstanceState.getParcelableArrayList(sSavekeyDataList) : null;
        if (parcelableArrayList != null) {
            this.mEditEntityList.addAll(parcelableArrayList);
            dir dirVar2 = this.mAdapter;
            if (dirVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                dirVar = dirVar2;
            }
            dirVar.notifyDataSetChanged();
        }
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        LiveData<kyo.a> liveDataLoadWidgetSupportedList = ((WidgetMangerViewModel) getMViewModel()).loadWidgetSupportedList();
        if (liveDataLoadWidgetSupportedList != null) {
            liveDataLoadWidgetSupportedList.observe(getViewLifecycleOwner(), new WidgetGroupEditFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fir
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WidgetGroupEditFragment.onViewCreated$lambda$1(this.f17825a, (kyo.a) obj);
                }
            }));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mSelectSportTime = System.currentTimeMillis();
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.widget.view.WidgetGroupView.b
    public void onWidgetItemSelected(int index, int style, int function) {
        this.mSelectWidgetItem = this.mWidgetItemInfoList.get(index);
        this.mSelectItemStyle = style;
        this.mSelectWidgetItemIndex = index;
        refreshFunctionListOnStyle(style);
    }
}
