package com.huami.third.wechat.ui.bind.bind;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.core.content.res.ResourcesCompat;
import com.huami.lib.rainbow.ListTile;
import com.huami.third.wechat.ui.R;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J$\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/third/wechat/ui/bind/bind/DeviceListAdapter;", "Landroid/widget/BaseAdapter;", "Lcom/huami/third/wechat/ui/bind/bind/DeviceShape;", "shape", "", "c", "Lcom/huami/third/wechat/ui/bind/bind/DeviceBindInfo;", "deviceData", "Landroid/graphics/drawable/Drawable;", "a", "Lcom/huami/third/wechat/ui/bind/bind/DeviceBindState;", "bindState", "b", "getCount", "position", "getItem", "", "getItemId", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Ljava/util/List;", "devices", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<DeviceBindInfo> devices;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DeviceShape.values().length];
            iArr[DeviceShape.BAND.ordinal()] = 1;
            iArr[DeviceShape.SQUARE.ordinal()] = 2;
            iArr[DeviceShape.CIRCULAR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DeviceBindState.values().length];
            iArr2[DeviceBindState.OTHER_BOUND.ordinal()] = 1;
            iArr2[DeviceBindState.UNBIND.ordinal()] = 2;
            iArr2[DeviceBindState.BOUND.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DeviceListAdapter(@NotNull Context context, @NotNull List<DeviceBindInfo> list) {
        this.context = context;
        this.devices = list;
    }

    private final Drawable a(DeviceShape shape, DeviceBindInfo deviceData) {
        Drawable drawable = ResourcesCompat.getDrawable(this.context.getResources(), c(shape), null);
        return !deviceData.isActive() ? drawable : new LayerDrawable(new Drawable[]{drawable, ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.ic_green_mark, null)});
    }

    private final int b(DeviceBindState bindState) {
        int i = WhenMappings.$EnumSwitchMapping$1[bindState.ordinal()];
        if (i == 1) {
            return R.string.device_bind_success_tips;
        }
        if (i == 2) {
            return R.string.device_no_bind_tips;
        }
        if (i == 3) {
            return R.string.device_bind_success_tips;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int c(DeviceShape shape) {
        int i = WhenMappings.$EnumSwitchMapping$0[shape.ordinal()];
        if (i == 1) {
            return R.drawable.ic_band;
        }
        if (i == 2) {
            return R.drawable.ic_watch_square;
        }
        if (i != 3) {
            return 0;
        }
        return R.drawable.ic_watch_circular;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.devices.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    @NotNull
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        DeviceBindInfo deviceBindInfo = this.devices.get(position);
        ListTile listTile = new ListTile(this.context);
        listTile.setRadiusPosition(3);
        listTile.setTitle(deviceBindInfo.getDeviceName());
        listTile.setSubtitle(deviceBindInfo.getBleAddress());
        listTile.setTips(b(deviceBindInfo.getBindState()));
        listTile.setLeading(a(deviceBindInfo.getDeviceShape(), deviceBindInfo));
        return listTile;
    }

    @Override // android.widget.Adapter
    @NotNull
    public DeviceBindInfo getItem(int position) {
        return this.devices.get(position);
    }
}
