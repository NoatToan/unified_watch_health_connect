package com.xiaomi.hm.health.device.beep;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicex.R;
import com.huami.lib.view.widget.ItemView2;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017RN\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0\u001a0\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/device/beep/AdapterBeep;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/beep/AdapterBeep$ViewHolderBeep;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Lcom/xiaomi/hm/health/device/beep/BeepType;", "beepType", "getBeepTypeStringRes", "getBeepTypeDrawableRes", "Lcom/huami/lib/view/widget/ItemView2$OnCheckedChangeListener;", "a", "Lcom/huami/lib/view/widget/ItemView2$OnCheckedChangeListener;", "getListener", "()Lcom/huami/lib/view/widget/ItemView2$OnCheckedChangeListener;", "setListener", "(Lcom/huami/lib/view/widget/ItemView2$OnCheckedChangeListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lkotlin/Pair;", "", "value", "b", "Ljava/util/List;", "getBeeps", "()Ljava/util/List;", "setBeeps", "(Ljava/util/List;)V", "beeps", "<init>", "()V", "ViewHolderBeep", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AdapterBeep extends RecyclerView.Adapter<ViewHolderBeep> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ItemView2.OnCheckedChangeListener listener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<Pair<BeepType, Boolean>> beeps = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/beep/AdapterBeep$ViewHolderBeep;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlin/Pair;", "Lcom/xiaomi/hm/health/device/beep/BeepType;", "", "pair", "", "bindData", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/hm/health/device/beep/AdapterBeep;Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class ViewHolderBeep extends RecyclerView.ViewHolder {
        public ViewHolderBeep(View view) {
            super(view);
        }

        public final void bindData(@NotNull Pair<? extends BeepType, Boolean> pair) {
            ItemView2 itemView2 = (ItemView2) this.itemView;
            AdapterBeep adapterBeep = AdapterBeep.this;
            itemView2.setChecked(pair.getSecond().booleanValue());
            itemView2.setTitle(adapterBeep.getBeepTypeStringRes(pair.getFirst()));
            itemView2.setIcon(adapterBeep.getBeepTypeDrawableRes(pair.getFirst()));
            itemView2.setTag(pair.getFirst());
            itemView2.setOnCheckedChangeListener(adapterBeep.getListener());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BeepType.values().length];
            iArr[BeepType.APP_NOTIFICATION_REMINDER.ordinal()] = 1;
            iArr[BeepType.COMPLIANCE_REMINDER.ordinal()] = 2;
            iArr[BeepType.INCOMING_CALL.ordinal()] = 3;
            iArr[BeepType.SEDENTARY_REMINDER.ordinal()] = 4;
            iArr[BeepType.SMS_NOTIFICATION.ordinal()] = 5;
            iArr[BeepType.TOUCH_TONE.ordinal()] = 6;
            iArr[BeepType.WATCH_ALARM_CLOCK.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final int getBeepTypeDrawableRes(@NotNull BeepType beepType) {
        switch (WhenMappings.$EnumSwitchMapping$0[beepType.ordinal()]) {
            case 1:
                return R.drawable.app_notification_alert_icon;
            case 2:
                return R.drawable.reach_goal_alert_icon;
            case 3:
                return R.drawable.incoming_call_alert_icon;
            case 4:
                return R.drawable.long_sit_alert_icon;
            case 5:
                return R.drawable.sm_alert_icon;
            case 6:
                return R.drawable.icon_beep_setting_touch_tone;
            case 7:
                return R.drawable.mi_band_alarm_icon;
            default:
                return -1;
        }
    }

    public final int getBeepTypeStringRes(@NotNull BeepType beepType) {
        switch (WhenMappings.$EnumSwitchMapping$0[beepType.ordinal()]) {
            case 1:
                return R.string.app_notification_alert;
            case 2:
                return R.string.reach_goal;
            case 3:
                return R.string.notify_status_motor_call;
            case 4:
                return R.string.long_set_alert;
            case 5:
                return R.string.sms_alert;
            case 6:
                return R.string.beep_setting_touch_tone;
            case 7:
                return HMDeviceConfig.hasBoundWatch() ? R.string.chaohu_alarm : R.string.mi_band_alarm;
            default:
                return -1;
        }
    }

    @NotNull
    public final List<Pair<BeepType, Boolean>> getBeeps() {
        return this.beeps;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.beeps.size();
    }

    @Nullable
    public final ItemView2.OnCheckedChangeListener getListener() {
        return this.listener;
    }

    public final void setBeeps(@NotNull List<Pair<BeepType, Boolean>> list) {
        this.beeps.clear();
        Iterator<Pair<BeepType, Boolean>> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else {
                if (it2.next().getFirst() == BeepType.EMAIL_ALERT) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (i > 0) {
            list.remove(i);
        }
        this.beeps.addAll(list);
        notifyDataSetChanged();
    }

    public final void setListener(@Nullable ItemView2.OnCheckedChangeListener onCheckedChangeListener) {
        this.listener = onCheckedChangeListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolderBeep holder, int position) {
        holder.bindData(this.beeps.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolderBeep onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ViewHolderBeep(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_beep, parent, false));
    }
}
