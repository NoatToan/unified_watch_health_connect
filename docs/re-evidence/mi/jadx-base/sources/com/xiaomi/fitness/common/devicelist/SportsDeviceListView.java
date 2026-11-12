package com.xiaomi.fitness.common.devicelist;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.wearable.data.sportbasic.devicelist.DeviceListPopAdapter;
import defpackage.cl5;
import defpackage.eri;
import defpackage.jui;
import defpackage.m4i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001cB'\b\u0007\u0012\u0006\u0010]\u001a\u00020\\\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010^\u0012\b\b\u0002\u0010`\u001a\u00020\b¢\u0006\u0004\ba\u0010bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00022\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u00106\u001a\b\u0012\u0004\u0012\u000205048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010<\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010B\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u0014R\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010V\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006d"}, d2 = {"Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "Landroid/widget/FrameLayout;", "", "refreshCurDevice", "()V", "", "isDeviceNameLong", "()Z", "", "getDeviceListSize", "()I", "initListener", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "initRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "initView", "", "sid", "refreshCurrentSid", "(Ljava/lang/String;)V", "resId", "refreshIcon", "(I)V", "", "sidSet", "updateDeviceSet", "(Ljava/util/Set;)V", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView$DeviceSelectedListener;", "deviceSelectedListener", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView$DeviceSelectedListener;", "getDeviceSelectedListener", "()Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView$DeviceSelectedListener;", "setDeviceSelectedListener", "(Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView$DeviceSelectedListener;)V", "Landroid/widget/TextView;", "curDevice", "Landroid/widget/TextView;", "getCurDevice", "()Landroid/widget/TextView;", "setCurDevice", "(Landroid/widget/TextView;)V", "changeDevice", "getChangeDevice", "setChangeDevice", "Landroid/widget/ImageView;", "dataSourceIcon", "Landroid/widget/ImageView;", "getDataSourceIcon", "()Landroid/widget/ImageView;", "setDataSourceIcon", "(Landroid/widget/ImageView;)V", "", "Lcl5;", "deviceList", "Ljava/util/List;", "getDeviceList", "()Ljava/util/List;", "setDeviceList", "(Ljava/util/List;)V", "selectedDeviceModel", "Lcl5;", "getSelectedDeviceModel", "()Lcl5;", "setSelectedDeviceModel", "(Lcl5;)V", "currentSid", "Ljava/lang/String;", "getCurrentSid", "()Ljava/lang/String;", "setCurrentSid", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "wearableDeviceManager", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "getWearableDeviceManager", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "setWearableDeviceManager", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;)V", "Landroid/widget/PopupWindow;", "popUpWindow", "Landroid/widget/PopupWindow;", "getPopUpWindow", "()Landroid/widget/PopupWindow;", "setPopUpWindow", "(Landroid/widget/PopupWindow;)V", "Lcom/xiaomi/wearable/data/sportbasic/devicelist/DeviceListPopAdapter;", "mAdapter", "Lcom/xiaomi/wearable/data/sportbasic/devicelist/DeviceListPopAdapter;", "getMAdapter", "()Lcom/xiaomi/wearable/data/sportbasic/devicelist/DeviceListPopAdapter;", "setMAdapter", "(Lcom/xiaomi/wearable/data/sportbasic/devicelist/DeviceListPopAdapter;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DeviceSelectedListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportsDeviceListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsDeviceListView.kt\ncom/xiaomi/fitness/common/devicelist/SportsDeviceListView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n1863#2,2:211\n1863#2,2:213\n*S KotlinDebug\n*F\n+ 1 SportsDeviceListView.kt\ncom/xiaomi/fitness/common/devicelist/SportsDeviceListView\n*L\n69#1:211,2\n94#1:213,2\n*E\n"})
public final class SportsDeviceListView extends FrameLayout {

    @Nullable
    private TextView changeDevice;

    @Nullable
    private TextView curDevice;

    @Nullable
    private String currentSid;

    @Nullable
    private ImageView dataSourceIcon;

    @NotNull
    private List<cl5> deviceList;

    @Nullable
    private DeviceSelectedListener deviceSelectedListener;

    @Nullable
    private DeviceListPopAdapter mAdapter;

    @Nullable
    private PopupWindow popUpWindow;

    @Nullable
    private cl5 selectedDeviceModel;

    @NotNull
    private WearableDeviceManager wearableDeviceManager;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView$DeviceSelectedListener;", "", "deviceSelected", "", "did", "", "isClick", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface DeviceSelectedListener {
        void deviceSelected(@NotNull String did, boolean isClick);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportsDeviceListView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getDeviceListSize() {
        return this.deviceList.size();
    }

    private final void initListener() {
        TextView textView = this.changeDevice;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: u6o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportsDeviceListView.initListener$lambda$6(this.f35474a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$6(final SportsDeviceListView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int iDip2px = DisplayUtil.dip2px(this$0.isDeviceNameLong() ? 350.0f : 230.0f);
        int iDip2px2 = (DisplayUtil.dip2px(53.0f) * Math.min(this$0.getDeviceListSize(), this$0.getResources().getDisplayMetrics().widthPixels > 1080 ? 10 : 8)) + DisplayUtil.dip2px(20.0f);
        if (this$0.popUpWindow == null) {
            View viewInflate = LayoutInflater.from(this$0.getContext()).inflate(jui.H8, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(eri.rd);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this$0.initRecyclerView((RecyclerView) viewFindViewById);
            DeviceListPopAdapter deviceListPopAdapter = this$0.mAdapter;
            if (deviceListPopAdapter != null) {
                deviceListPopAdapter.setCurrentSid(this$0.currentSid);
            }
            PopupWindow popupWindow = new PopupWindow(viewInflate, iDip2px, iDip2px2);
            this$0.popUpWindow = popupWindow;
            popupWindow.setOutsideTouchable(true);
            PopupWindow popupWindow2 = this$0.popUpWindow;
            if (popupWindow2 != null) {
                popupWindow2.setFocusable(true);
            }
            PopupWindow popupWindow3 = this$0.popUpWindow;
            if (popupWindow3 != null) {
                popupWindow3.setBackgroundDrawable(null);
                popupWindow3.setOutsideTouchable(true);
                m4i.a(popupWindow3, true);
                popupWindow3.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: s6o
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        SportsDeviceListView.initListener$lambda$6$lambda$3$lambda$2(this.f33353a);
                    }
                });
            }
            viewInflate.setFocusableInTouchMode(true);
            viewInflate.setOnKeyListener(new View.OnKeyListener() { // from class: t6o
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                    return SportsDeviceListView.initListener$lambda$6$lambda$4(this.f34379a, view2, i, keyEvent);
                }
            });
        }
        PopupWindow popupWindow4 = this$0.popUpWindow;
        if (popupWindow4 != null) {
            popupWindow4.setWidth(iDip2px);
        }
        PopupWindow popupWindow5 = this$0.popUpWindow;
        if (popupWindow5 != null) {
            popupWindow5.setHeight(iDip2px2);
        }
        PopupWindow popupWindow6 = this$0.popUpWindow;
        if (popupWindow6 == null || popupWindow6.isShowing()) {
            return;
        }
        int[] iArr = new int[2];
        this$0.getLocationOnScreen(iArr);
        int i = iArr[1];
        int iDip2px3 = (DisplayUtil.dip2px(45.0f) - iDip2px2) / 2;
        int i2 = this$0.getResources().getDisplayMetrics().heightPixels;
        if (i - iDip2px3 > ((double) i2) * 0.9d) {
            iDip2px3 = i2 - i;
        }
        popupWindow6.showAsDropDown(this$0, DisplayUtil.dip2px(AppUtil.isRTLDirection() ? 10.0f : -10.0f), iDip2px3, 8388613);
        if (this$0.getContext() instanceof FragmentActivity) {
            Context context = this$0.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            WindowManager.LayoutParams attributes = ((FragmentActivity) context).getWindow().getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
            attributes.alpha = 0.7f;
            Context context2 = this$0.getContext();
            Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ((FragmentActivity) context2).getWindow().setAttributes(attributes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$6$lambda$3$lambda$2(SportsDeviceListView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getContext() instanceof FragmentActivity) {
            Context context = this$0.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            WindowManager.LayoutParams attributes = ((FragmentActivity) context).getWindow().getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
            attributes.alpha = 1.0f;
            Context context2 = this$0.getContext();
            Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ((FragmentActivity) context2).getWindow().setAttributes(attributes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initListener$lambda$6$lambda$4(SportsDeviceListView this$0, View view, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 4) {
            return false;
        }
        PopupWindow popupWindow = this$0.popUpWindow;
        if (popupWindow == null) {
            return true;
        }
        popupWindow.dismiss();
        return true;
    }

    private final void initRecyclerView(RecyclerView recyclerView) {
        this.mAdapter = new DeviceListPopAdapter(this.deviceList, new DeviceSelectedListener() { // from class: com.xiaomi.fitness.common.devicelist.SportsDeviceListView.initRecyclerView.1
            @Override // com.xiaomi.fitness.common.devicelist.SportsDeviceListView.DeviceSelectedListener
            public void deviceSelected(String did, boolean isClick) {
                Intrinsics.checkNotNullParameter(did, "did");
                DeviceSelectedListener deviceSelectedListener = SportsDeviceListView.this.getDeviceSelectedListener();
                if (deviceSelectedListener != null) {
                    deviceSelectedListener.deviceSelected(did, isClick);
                }
                PopupWindow popUpWindow = SportsDeviceListView.this.getPopUpWindow();
                if (popUpWindow != null) {
                    popUpWindow.dismiss();
                }
                SportsDeviceListView.this.refreshCurrentSid(did);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(this.mAdapter);
    }

    private final void initView() {
        this.dataSourceIcon = (ImageView) findViewById(eri.K3);
        this.curDevice = (TextView) findViewById(eri.J3);
        this.changeDevice = (TextView) findViewById(eri.I3);
    }

    private final boolean isDeviceNameLong() {
        Iterator<T> it = this.deviceList.iterator();
        while (it.hasNext()) {
            String str = ((cl5) it.next()).f5448a;
            if (str != null && str.length() > 16) {
                return true;
            }
        }
        return false;
    }

    private final void refreshCurDevice() {
        String name;
        TextView textView = this.curDevice;
        if (textView != null) {
            if (TextUtils.isEmpty(this.currentSid)) {
                name = "";
            } else {
                WearableDeviceManager wearableDeviceManager = this.wearableDeviceManager;
                String str = this.currentSid;
                Intrinsics.checkNotNull(str);
                DeviceInfo<? extends Device> deviceInfoInAll = wearableDeviceManager.getDeviceInfoInAll(str);
                name = deviceInfoInAll != null ? deviceInfoInAll.getName() : null;
                if (name == null) {
                    name = this.currentSid;
                }
            }
            textView.setText(name);
        }
    }

    @Nullable
    public final TextView getChangeDevice() {
        return this.changeDevice;
    }

    @Nullable
    public final TextView getCurDevice() {
        return this.curDevice;
    }

    @Nullable
    public final String getCurrentSid() {
        return this.currentSid;
    }

    @Nullable
    public final ImageView getDataSourceIcon() {
        return this.dataSourceIcon;
    }

    @NotNull
    public final List<cl5> getDeviceList() {
        return this.deviceList;
    }

    @Nullable
    public final DeviceSelectedListener getDeviceSelectedListener() {
        return this.deviceSelectedListener;
    }

    @Nullable
    public final DeviceListPopAdapter getMAdapter() {
        return this.mAdapter;
    }

    @Nullable
    public final PopupWindow getPopUpWindow() {
        return this.popUpWindow;
    }

    @Nullable
    public final cl5 getSelectedDeviceModel() {
        return this.selectedDeviceModel;
    }

    @NotNull
    public final WearableDeviceManager getWearableDeviceManager() {
        return this.wearableDeviceManager;
    }

    public final void refreshCurrentSid(@Nullable String sid) {
        this.currentSid = sid;
        DeviceListPopAdapter deviceListPopAdapter = this.mAdapter;
        if (deviceListPopAdapter != null) {
            deviceListPopAdapter.setCurrentSid(sid);
        }
        refreshCurDevice();
    }

    public final void refreshIcon(int resId) {
        ImageView imageView = this.dataSourceIcon;
        if (imageView != null) {
            imageView.setBackgroundResource(resId);
        }
    }

    public final void setChangeDevice(@Nullable TextView textView) {
        this.changeDevice = textView;
    }

    public final void setCurDevice(@Nullable TextView textView) {
        this.curDevice = textView;
    }

    public final void setCurrentSid(@Nullable String str) {
        this.currentSid = str;
    }

    public final void setDataSourceIcon(@Nullable ImageView imageView) {
        this.dataSourceIcon = imageView;
    }

    public final void setDeviceList(@NotNull List<cl5> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.deviceList = list;
    }

    public final void setDeviceSelectedListener(@Nullable DeviceSelectedListener deviceSelectedListener) {
        this.deviceSelectedListener = deviceSelectedListener;
    }

    public final void setMAdapter(@Nullable DeviceListPopAdapter deviceListPopAdapter) {
        this.mAdapter = deviceListPopAdapter;
    }

    public final void setPopUpWindow(@Nullable PopupWindow popupWindow) {
        this.popUpWindow = popupWindow;
    }

    public final void setSelectedDeviceModel(@Nullable cl5 cl5Var) {
        this.selectedDeviceModel = cl5Var;
    }

    public final void setWearableDeviceManager(@NotNull WearableDeviceManager wearableDeviceManager) {
        Intrinsics.checkNotNullParameter(wearableDeviceManager, "<set-?>");
        this.wearableDeviceManager = wearableDeviceManager;
    }

    public final void updateDeviceSet(@Nullable Set<String> sidSet) {
        ArrayList arrayList = new ArrayList();
        if (sidSet != null) {
            for (String str : sidSet) {
                cl5 cl5Var = new cl5();
                cl5Var.c = str;
                DeviceInfo<? extends Device> deviceInfoInAll = this.wearableDeviceManager.getDeviceInfoInAll(str);
                String name = deviceInfoInAll != null ? deviceInfoInAll.getName() : null;
                cl5Var.f5448a = name;
                Logger.i("MiHealth", "updateDeviceSet item :" + str + "-fetch device name:" + name);
                ListExtKt.add(arrayList, cl5Var);
            }
        }
        this.deviceList.clear();
        this.deviceList.addAll(arrayList);
        List<cl5> list = this.deviceList;
        Logger.i("MiHealth", "updateDeviceSet:" + (list != null ? Integer.valueOf(list.size()) : null));
        DeviceListPopAdapter deviceListPopAdapter = this.mAdapter;
        if (deviceListPopAdapter != null) {
            deviceListPopAdapter.notifyDataSetChanged();
        }
        setVisibility(arrayList.isEmpty() ? 8 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportsDeviceListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportsDeviceListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportsDeviceListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.deviceList = new ArrayList();
        this.wearableDeviceManager = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        LayoutInflater.from(context).inflate(jui.G8, this);
        initView();
        initListener();
        setFocusable(true);
    }
}
