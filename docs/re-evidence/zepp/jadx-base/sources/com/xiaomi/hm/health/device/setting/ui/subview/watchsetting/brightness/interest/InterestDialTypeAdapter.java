package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bloodoxygen.ui.utils.ExtensionsKt;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.vo.InterestDialVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.vo.InterestWatchFaceVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestDialTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestDialTypeHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/IInterestDialTypeListener;", "a", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/IInterestDialTypeListener;", "getListener", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/IInterestDialTypeListener;", "setListener", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/IInterestDialTypeListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/vo/InterestDialVo;", "b", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/vo/InterestDialVo;", "getInterestDialVo", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/vo/InterestDialVo;", "setInterestDialVo", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/vo/InterestDialVo;)V", "interestDialVo", "<init>", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/IInterestDialTypeListener;Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/vo/InterestDialVo;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class InterestDialTypeAdapter extends RecyclerView.Adapter<InterestDialTypeHolder> {

    @NotNull
    private static final String c = "InterestDialTypeAdapter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private IInterestDialTypeListener listener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private InterestDialVo interestDialVo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "bean null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ InterestWatchFaceVo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterestWatchFaceVo interestWatchFaceVo) {
            super(1);
            this.b = interestWatchFaceVo;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            IInterestDialTypeListener listener = InterestDialTypeAdapter.this.getListener();
            if (listener == null) {
                return;
            }
            listener.onSelect(this.b.getId());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InterestDialTypeAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ InterestDialTypeAdapter(IInterestDialTypeListener iInterestDialTypeListener, InterestDialVo interestDialVo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iInterestDialTypeListener, (i & 2) != 0 ? null : interestDialVo);
    }

    @Nullable
    public final InterestDialVo getInterestDialVo() {
        return this.interestDialVo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        List<InterestWatchFaceVo> watchFaceVos;
        InterestDialVo interestDialVo = this.interestDialVo;
        if (interestDialVo == null || (watchFaceVos = interestDialVo.getWatchFaceVos()) == null) {
            return 0;
        }
        return watchFaceVos.size();
    }

    @Nullable
    public final IInterestDialTypeListener getListener() {
        return this.listener;
    }

    public final void setInterestDialVo(@Nullable InterestDialVo interestDialVo) {
        this.interestDialVo = interestDialVo;
    }

    public final void setListener(@Nullable IInterestDialTypeListener iInterestDialTypeListener) {
        this.listener = iInterestDialTypeListener;
    }

    public InterestDialTypeAdapter(@Nullable IInterestDialTypeListener iInterestDialTypeListener, @Nullable InterestDialVo interestDialVo) {
        this.listener = iInterestDialTypeListener;
        this.interestDialVo = interestDialVo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull InterestDialTypeHolder holder, int position) {
        List<InterestWatchFaceVo> watchFaceVos;
        InterestDialVo interestDialVo = this.interestDialVo;
        if (interestDialVo == null) {
            return;
        }
        InterestWatchFaceVo interestWatchFaceVo = (interestDialVo == null || (watchFaceVos = interestDialVo.getWatchFaceVos()) == null) ? null : watchFaceVos.get(position);
        if (interestWatchFaceVo == null) {
            HMLog.error$default(c, null, null, a.a, 6, null);
            return;
        }
        holder.getStyleTv().setText(interestWatchFaceVo.getName());
        AppCompatImageView checkedIv = holder.getCheckedIv();
        String id = interestWatchFaceVo.getId();
        InterestDialVo interestDialVo2 = this.interestDialVo;
        ExtensionsKt.setVisible(checkedIv, Intrinsics.areEqual(id, interestDialVo2 != null ? interestDialVo2.getSelectedId() : null));
        holder.getStyleIv().setImageResource(R.drawable.icon_gt_dial_default_bg);
        if (!m.isBlank(interestWatchFaceVo.getIconUrl())) {
            com.huami.watchfacesstore.ext.ExtensionsKt.loadUrl(holder.getStyleIv(), interestWatchFaceVo.getIconUrl());
        }
        ExtKt.smartClick$default(holder.getRootView(), 0L, new b(interestWatchFaceVo), 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public InterestDialTypeHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new InterestDialTypeHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_screen_off_dial, parent, false));
    }
}
