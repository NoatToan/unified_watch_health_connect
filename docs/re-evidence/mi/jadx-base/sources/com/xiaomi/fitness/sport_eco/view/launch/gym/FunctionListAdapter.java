package com.xiaomi.fitness.sport_eco.view.launch.gym;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingActivityKt;
import com.xiaomi.fitness.sport_eco_manager_export.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.e1j;
import defpackage.ez5;
import defpackage.foi;
import defpackage.nuf;
import defpackage.vyl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0014\u0010\u0017\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016R\u0018\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListAdapter$Holder;", "context", "Landroid/content/Context;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportActivity;", "<init>", "(Landroid/content/Context;Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportActivity;)V", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "weakActivity", "Ljava/lang/ref/WeakReference;", "list", "", "", "onBindViewHolder", "", "holder", "position", "", "setData", "data", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "Holder", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FunctionListAdapter extends RecyclerView.Adapter<Holder> {
    private final LayoutInflater inflater;

    @NotNull
    private final List<Object> list;

    @NotNull
    private final WeakReference<GymLaunchEcoSportActivity> weakActivity;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData;", "post", "", "bind", "(Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Lvyl;", "view", "Lvyl;", "getView", "()Lvyl;", "<init>", "(Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListAdapter;Lvyl;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class Holder extends RecyclerView.d0 implements View.OnClickListener {
        final /* synthetic */ FunctionListAdapter this$0;

        @NotNull
        private final vyl view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull FunctionListAdapter functionListAdapter, vyl view) {
            super(view.getRoot());
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = functionListAdapter;
            this.view = view;
            view.getRoot().setOnClickListener(this);
            nuf.f(view.getRoot());
        }

        public final void bind(@NotNull FunctionListData post) {
            Intrinsics.checkNotNullParameter(post, "post");
            this.view.getRoot().setTag(post);
            this.view.C.setImageResource(post.getIcon());
            this.view.E.setText(post.getTitle());
            if (!SportDeviceModel.INSTANCE.isJump()) {
                if (post.getDesV2().length() > 0) {
                    this.view.B.setText(post.getDesV2());
                    return;
                } else {
                    this.view.B.setText(post.getDes());
                    return;
                }
            }
            GymLaunchEcoSportActivity gymLaunchEcoSportActivity = (GymLaunchEcoSportActivity) this.this$0.weakActivity.get();
            if (gymLaunchEcoSportActivity != null) {
                this.view.D.setBackground(gymLaunchEcoSportActivity.getDrawable(foi.D));
            }
            ViewGroup.LayoutParams layoutParams = this.view.C.getLayoutParams();
            layoutParams.width = ez5.a(30);
            layoutParams.height = ez5.a(30);
            this.view.D.setPadding(ez5.a(17), ez5.a(20), ez5.a(17), ez5.a(20));
            this.view.E.setTextSize(2, 14.0f);
            this.view.B.setVisibility(8);
        }

        @NotNull
        public final vyl getView() {
            return this.view;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            Object tag = v.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData");
            FunctionListData functionListData = (FunctionListData) tag;
            String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
            EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(key_gym_local_sport_type);
            boolean z = false;
            if (localDeviceModel != null && localDeviceModel.getIsDeviceConnected()) {
                z = true;
            }
            if (Intrinsics.areEqual(functionListData.getScene(), FunctionListDataKt.TAG_SPORT_HISTORY)) {
                GymLaunchEcoSportActivity gymLaunchEcoSportActivity = (GymLaunchEcoSportActivity) this.this$0.weakActivity.get();
                if (gymLaunchEcoSportActivity != null) {
                    gymLaunchEcoSportActivity.gotoRopeSportHistory();
                    return;
                }
                return;
            }
            if (!z) {
                GymLaunchEcoSportActivity gymLaunchEcoSportActivity2 = (GymLaunchEcoSportActivity) this.this$0.weakActivity.get();
                if (gymLaunchEcoSportActivity2 != null) {
                    gymLaunchEcoSportActivity2.showSportBikeConnectionExceptionDialog();
                    return;
                }
                return;
            }
            String scene = functionListData.getScene();
            switch (scene.hashCode()) {
                case -1897162321:
                    if (scene.equals(FunctionListDataKt.TAG_INTERVAL_TRAINING)) {
                        IntervalTrainingActivityKt.startIntervalTraining(key_gym_local_sport_type);
                        return;
                    }
                    break;
                case -986693223:
                    if (scene.equals(FunctionListDataKt.TAG_ENVIRONMENTAL)) {
                        GymLaunchEcoSportActivity gymLaunchEcoSportActivity3 = (GymLaunchEcoSportActivity) this.this$0.weakActivity.get();
                        if (gymLaunchEcoSportActivity3 != null) {
                            gymLaunchEcoSportActivity3.gotoEnvironmental();
                            return;
                        }
                        return;
                    }
                    break;
                case 310163087:
                    if (scene.equals(FunctionListDataKt.TAG_SPORT_DYNAMIC)) {
                        GymLaunchEcoSportActivity gymLaunchEcoSportActivity4 = (GymLaunchEcoSportActivity) this.this$0.weakActivity.get();
                        if (gymLaunchEcoSportActivity4 != null) {
                            gymLaunchEcoSportActivity4.switchBikeMode();
                            return;
                        }
                        return;
                    }
                    break;
                case 1454562388:
                    if (scene.equals(FunctionListDataKt.TAG_FTP_TEST)) {
                        GymLaunchEcoSportActivity gymLaunchEcoSportActivity5 = (GymLaunchEcoSportActivity) this.this$0.weakActivity.get();
                        if (gymLaunchEcoSportActivity5 != null) {
                            gymLaunchEcoSportActivity5.setOpenFtpTest();
                            return;
                        }
                        return;
                    }
                    break;
            }
            FitnessLogUtils.i("FunctionListAdapter", "没有匹配的功能标签,无法响应点击");
            ToastUtil.INSTANCE.showToast(e1j.v2);
        }
    }

    public FunctionListAdapter(@NotNull Context context, @NotNull GymLaunchEcoSportActivity activity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.inflater = LayoutInflater.from(context);
        this.list = new ArrayList();
        this.weakActivity = new WeakReference<>(activity);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    public final void setData(@NotNull List<? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.list.clear();
        this.list.addAll(data);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.list.get(position);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData");
        holder.bind((FunctionListData) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        vyl vylVarA0 = vyl.A0(this.inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(vylVarA0, "inflate(...)");
        return new Holder(this, vylVarA0);
    }
}
