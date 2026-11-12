package com.xiaomi.fitness.habit.ui;

import android.app.Application;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.example.habit.export.HabitBean;
import com.example.habit.export.Today;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.habit.bean.HabitTodayResult;
import com.xiaomi.fitness.habit.bean.Share;
import com.xiaomi.fitness.habit.ui.HabitTodayActivity;
import com.xiaomi.fitness.rn.share.ui.DeviceShareActivity;
import com.xiaomi.fitness.service.ServiceConnector;
import defpackage.b0j;
import defpackage.dri;
import defpackage.eeb;
import defpackage.gak;
import defpackage.hji;
import defpackage.iui;
import defpackage.mrf;
import defpackage.nni;
import defpackage.ns0;
import defpackage.p63;
import defpackage.pxi;
import defpackage.sdg;
import defpackage.uno;
import defpackage.wc0;
import defpackage.wy5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import miuix.appcompat.app.c;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b*\u00016\b\u0007\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002BCB\u0007¢\u0006\u0004\bA\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0019\u0010\u0006J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0011\u0010@\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b?\u0010;¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitTodayActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/habit/ui/HabitTodayViewModel;", "Leeb;", "", "showShareDialog", "()V", "listenToConnectionStatus", "setLayoutManager", "bindView", "(Leeb;)V", "list", "Lcom/xiaomi/fitness/habit/bean/HabitTodayResult;", "habitTodayResult", "showTodayList", "(Lcom/xiaomi/fitness/habit/bean/HabitTodayResult;)V", "", "Lcom/xiaomi/fitness/habit/bean/Share;", DeviceShareActivity.sPageShareList, "doShare", "(Ljava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Lmrf;", "messageEvent", "onDataEvent", "(Lmrf;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter;", "mAdapter", "Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter;", "getMAdapter", "()Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter;", "setMAdapter", "(Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter;)V", "", "shareMutableList", "Ljava/util/List;", "", "origin", "Ljava/lang/String;", "Landroid/app/Dialog;", "curDialog", "Landroid/app/Dialog;", "getCurDialog", "()Landroid/app/Dialog;", "setCurDialog", "(Landroid/app/Dialog;)V", "com/xiaomi/fitness/habit/ui/HabitTodayActivity$serviceConnectionListener$1", "serviceConnectionListener", "Lcom/xiaomi/fitness/habit/ui/HabitTodayActivity$serviceConnectionListener$1;", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "getColCountPerRow", "colCountPerRow", "<init>", "Companion", "HabitTodayItemDecoration", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHabitTodayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitTodayActivity.kt\ncom/xiaomi/fitness/habit/ui/HabitTodayActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,378:1\n54#2,3:379\n24#2:382\n59#2,6:383\n*S KotlinDebug\n*F\n+ 1 HabitTodayActivity.kt\ncom/xiaomi/fitness/habit/ui/HabitTodayActivity\n*L\n208#1:379,3\n208#1:382\n208#1:383,6\n*E\n"})
public final class HabitTodayActivity extends Hilt_HabitTodayActivity<HabitTodayViewModel, eeb> {

    @NotNull
    public static final String KEY_ORIGIN = "origin";

    @NotNull
    public static final String TAG = "HabitTodayActivity";

    @NotNull
    public static final String VALUE_DEEP_LINK = "deep_link";
    public static final int sRequestCodeShare = 10;

    @Nullable
    private Dialog curDialog;
    public HabitTodayAdapter mAdapter;

    @NotNull
    private List<Share> shareMutableList = new ArrayList();

    @NotNull
    private String origin = "";

    @NotNull
    private final HabitTodayActivity$serviceConnectionListener$1 serviceConnectionListener = new ServiceConnection() { // from class: com.xiaomi.fitness.habit.ui.HabitTodayActivity$serviceConnectionListener$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Logger.i(HabitTodayActivity.TAG, "onServiceConnected() called with: name = " + name + ", service = " + service);
            HabitTodayActivity.access$getMViewModel(this.this$0).getConnectionStatusLiveData().postValue(Boolean.TRUE);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            this.this$0.hideLoading();
            Application application = this.this$0.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            ToastExtKt.toastShort(application, b0j.S);
        }
    };

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitTodayActivity$HabitTodayItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "spanCount", "I", "spacing", "", "includeEdge", "Z", "<init>", "(Lcom/xiaomi/fitness/habit/ui/HabitTodayActivity;IIZ)V", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HabitTodayItemDecoration extends RecyclerView.n {
        private final boolean includeEdge;
        private final int spacing;
        private final int spanCount;

        public HabitTodayItemDecoration(int i, int i2, boolean z) {
            this.spanCount = i;
            this.spacing = i2;
            this.includeEdge = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (this.spanCount == 1) {
                outRect.bottom = this.spacing;
                return;
            }
            int itemViewType = HabitTodayActivity.this.getMAdapter().getItemViewType(childAdapterPosition);
            HabitTodayAdapter.Companion companion = HabitTodayAdapter.INSTANCE;
            if (itemViewType != companion.getTypeRecommend() && itemViewType != companion.getTypeEmptyForToday() && itemViewType != companion.getTypeEmpty() && itemViewType != companion.getTypeToday()) {
                companion.getTypeTitle();
                return;
            }
            int i = childAdapterPosition % this.spanCount;
            if (childAdapterPosition == 0 || HabitTodayActivity.this.getMAdapter().getItemViewType(childAdapterPosition - 1) != companion.getTypeTitle()) {
                int i2 = this.spacing;
                outRect.left = (i * i2) / this.spanCount;
                outRect.right = i2;
            } else {
                outRect.right = this.spacing;
            }
            outRect.bottom = this.spacing;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.ui.HabitTodayActivity$bindView$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/xiaomi/fitness/habit/ui/HabitTodayActivity$bindView$3", "Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitTodayClickListener;", "punchClick", "", "today", "Lcom/example/habit/export/Today;", "recommendClick", "recommend", "Lcom/example/habit/export/HabitBean;", "goAddHabit", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass3 implements HabitTodayAdapter.HabitTodayClickListener {
        public AnonymousClass3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit punchClick$lambda$0(HabitTodayActivity this$0, List it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            this$0.list();
            this$0.doShare(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit punchClick$lambda$1(HabitTodayActivity this$0, String it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            this$0.hideLoading();
            ToastUtil.showShortToast(it);
            return Unit.INSTANCE;
        }

        @Override // com.xiaomi.fitness.habit.ui.HabitTodayAdapter.HabitTodayClickListener
        public void goAddHabit() {
            HabitTodayActivity.this.startActivity(new Intent(HabitTodayActivity.this, (Class<?>) HabitListActivity.class));
        }

        @Override // com.xiaomi.fitness.habit.ui.HabitTodayAdapter.HabitTodayClickListener
        public void punchClick(Today today) {
            Intrinsics.checkNotNullParameter(today, "today");
            HabitTodayActivity.this.showLoading();
            HabitTodayViewModel habitTodayViewModelAccess$getMViewModel = HabitTodayActivity.access$getMViewModel(HabitTodayActivity.this);
            long typeId = today.getTypeId();
            int hour = today.getPunchTime().getHour();
            int minute = today.getPunchTime().getMinute();
            final HabitTodayActivity habitTodayActivity = HabitTodayActivity.this;
            Function1<? super List<Share>, Unit> function1 = new Function1() { // from class: hjb
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HabitTodayActivity.AnonymousClass3.punchClick$lambda$0(habitTodayActivity, (List) obj);
                }
            };
            final HabitTodayActivity habitTodayActivity2 = HabitTodayActivity.this;
            habitTodayViewModelAccess$getMViewModel.doPunch(typeId, hour, minute, function1, new Function1() { // from class: ijb
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HabitTodayActivity.AnonymousClass3.punchClick$lambda$1(habitTodayActivity2, (String) obj);
                }
            });
        }

        @Override // com.xiaomi.fitness.habit.ui.HabitTodayAdapter.HabitTodayClickListener
        public void recommendClick(HabitBean recommend) {
            Intrinsics.checkNotNullParameter(recommend, "recommend");
            Intent intent = new Intent(HabitTodayActivity.this, (Class<?>) AddHabitActivity.class);
            intent.putExtra("sData", recommend);
            HabitTodayActivity.this.startActivityForResult(intent, HabitListActivity.INSTANCE.getSRequestAdd());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ HabitTodayViewModel access$getMViewModel(HabitTodayActivity habitTodayActivity) {
        return (HabitTodayViewModel) habitTodayActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(HabitTodayActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) MyHabitListActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(HabitTodayActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) HabitListActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$4(final HabitTodayActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading();
        ((HabitTodayViewModel) this$0.getMViewModel()).doPunch(Long.MIN_VALUE, 0, 0, new Function1() { // from class: bjb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitTodayActivity.bindView$lambda$4$lambda$2(this.f4281a, (List) obj);
            }
        }, new Function1() { // from class: cjb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitTodayActivity.bindView$lambda$4$lambda$3(this.f5398a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$2(HabitTodayActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.list();
        this$0.doShare(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$3(HabitTodayActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        ToastUtil.showShortToast(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5(HabitTodayActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.list();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit list$lambda$6(HabitTodayActivity this$0, HabitTodayResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new HabitTodayActivity$list$1$1(this$0, it, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit list$lambda$7(HabitTodayActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        ToastUtil.showShortToast(it);
        return Unit.INSTANCE;
    }

    private final void listenToConnectionStatus() {
        ServiceConnector.addServiceConnectListener$default(ServiceConnector.INSTANCE.getInstance(), this.serviceConnectionListener, 0, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, getColCountPerRow());
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.habit.ui.HabitTodayActivity.setLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                int itemViewType = HabitTodayActivity.this.getMAdapter().getItemViewType(position);
                HabitTodayAdapter.Companion companion = HabitTodayAdapter.INSTANCE;
                if (itemViewType == companion.getTypeRecommend() || itemViewType == companion.getTypeEmptyForToday() || itemViewType == companion.getTypeEmpty() || itemViewType == companion.getTypeToday() || itemViewType != companion.getTypeTitle()) {
                    return 1;
                }
                return HabitTodayActivity.this.getColCountPerRow();
            }
        });
        ((eeb) getMBinding()).B.addItemDecoration(new HabitTodayItemDecoration(getColCountPerRow(), ExtUtilsKt.getDp(Float.valueOf(16.0f)), false));
        ((eeb) getMBinding()).B.setLayoutManager(gridLayoutManager);
    }

    private final void showShareDialog() {
        View decorView;
        View decorView2;
        if (this.shareMutableList.size() > 0) {
            final Share shareRemove = this.shareMutableList.remove(0);
            View viewInflate = LayoutInflater.from(this).inflate(iui.o, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(dri.m);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            View viewFindViewById2 = viewInflate.findViewById(dri.l);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            View viewFindViewById3 = viewInflate.findViewById(dri.t);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            ImageView imageView = (ImageView) viewFindViewById3;
            View viewFindViewById4 = viewInflate.findViewById(dri.P);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            View viewFindViewById5 = viewInflate.findViewById(dri.O);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            ((TextView) viewFindViewById5).setText(getResources().getQuantityText(pxi.c, shareRemove.getContinuousPunch()));
            ((Button) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: zib
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HabitTodayActivity.showShareDialog$lambda$9(this.f41310a, shareRemove, view);
                }
            });
            String shareIcon = shareRemove.getShareIcon();
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(shareIcon).target(imageView);
            builderTarget.placeholder(nni.f28090a);
            imageLoader.enqueue(builderTarget.build());
            ((TextView) viewFindViewById).setText(String.valueOf(shareRemove.getContinuousPunch()));
            ((TextView) viewFindViewById2).setText(getResources().getString(b0j.s, shareRemove.getName()));
            c cVarB = new c.a(this).A(viewInflate).b();
            Intrinsics.checkNotNullExpressionValue(cVarB, "create(...)");
            Window window = cVarB.getWindow();
            if (window != null && (decorView2 = window.getDecorView()) != null) {
                decorView2.setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
            if (attributes != null) {
                attributes.width = -1;
            }
            if (attributes != null) {
                attributes.height = -2;
            }
            if (attributes != null) {
                attributes.gravity = 17;
            }
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.setBackgroundResource(hji.e);
            }
            if (window != null) {
                window.setAttributes(attributes);
            }
            this.curDialog = cVarB;
            cVarB.show();
            cVarB.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ajb
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    HabitTodayActivity.showShareDialog$lambda$11(this.f1087a, dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showShareDialog$lambda$11(HabitTodayActivity this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showShareDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showShareDialog$lambda$9(final HabitTodayActivity this$0, Share share, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(share, "$share");
        Dialog dialog = this$0.curDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        Intent intent = new Intent(this$0, (Class<?>) HabitShareActivity.class);
        intent.putExtra(HabitShareActivity.KEY_HABIT_NAME, share.getName());
        intent.putExtra(HabitShareActivity.KEY_BIG_ICON, share.getShareIcon());
        intent.putExtra(HabitShareActivity.KEY_CONTINUESPUNCH, share.getContinuousPunch());
        this$0.startForActivityResult(intent, new Function2() { // from class: xib
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HabitTodayActivity.showShareDialog$lambda$9$lambda$8(this.f39153a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showShareDialog$lambda$9$lambda$8(HabitTodayActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.curDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this$0.curDialog = null;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull eeb eebVar) {
        String string;
        Intrinsics.checkNotNullParameter(eebVar, "<this>");
        setTitle(b0j.P);
        setTitleBackground(hji.c);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("origin")) == null) {
            string = "";
        }
        this.origin = string;
        Logger.i(TAG, "origin=" + string);
        View viewInflate = LayoutInflater.from(this).inflate(iui.common_layout_title_bar_right_icon, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(dri.Z);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(dri.a0);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) viewFindViewById2;
        imageView.setImageResource(nni.f);
        imageView2.setImageResource(nni.i);
        imageView.setVisibility(0);
        imageView2.setVisibility(0);
        imageView.setContentDescription(getString(b0j.D));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: djb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitTodayActivity.bindView$lambda$0(this.f15586a, view);
            }
        });
        imageView2.setContentDescription(getString(b0j.G));
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: ejb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitTodayActivity.bindView$lambda$1(this.f16700a, view);
            }
        });
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setEndView(viewInflate);
        }
        setMAdapter(new HabitTodayAdapter(new AnonymousClass3()));
        ((eeb) getMBinding()).B.setAdapter(getMAdapter());
        setLayoutManager();
        new gak(DisplayUtil.dip2px(13.0f), DisplayUtil.dip2px(13.0f), false);
        ((eeb) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: fjb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitTodayActivity.bindView$lambda$4(this.f17842a, view);
            }
        });
        if (Intrinsics.areEqual(this.origin, "deep_link")) {
            ((HabitTodayViewModel) getMViewModel()).getConnectionStatusLiveData().observe(this, new HabitTodayActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gjb
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HabitTodayActivity.bindView$lambda$5(this.f19051a, (Boolean) obj);
                }
            }));
        } else {
            list();
        }
        if (Intrinsics.areEqual(this.origin, "deep_link")) {
            listenToConnectionStatus();
        }
    }

    public final void doShare(@NotNull List<Share> shareList) {
        Intrinsics.checkNotNullParameter(shareList, "shareList");
        this.shareMutableList.clear();
        Iterator<Share> it = shareList.iterator();
        while (it.hasNext()) {
            this.shareMutableList.add(it.next());
        }
        showShareDialog();
    }

    public final int getColCountPerRow() {
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            return 3;
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        if (!uIUtils.isTablet()) {
            return 1;
        }
        Application application = getApplication();
        return (application == null || !uIUtils.isLandscape(application)) ? 2 : 3;
    }

    @Nullable
    public final Dialog getCurDialog() {
        return this.curDialog;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return iui.d;
    }

    @NotNull
    public final HabitTodayAdapter getMAdapter() {
        HabitTodayAdapter habitTodayAdapter = this.mAdapter;
        if (habitTodayAdapter != null) {
            return habitTodayAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void list() {
        ((HabitTodayViewModel) getMViewModel()).list(new Function1() { // from class: wib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitTodayActivity.list$lambda$6(this.f38001a, (HabitTodayResult) obj);
            }
        }, new Function1() { // from class: yib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitTodayActivity.list$lambda$7(this.f40207a, (String) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }

    @Override // com.xiaomi.fitness.habit.ui.Hilt_HabitTodayActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!p63.a(this)) {
            p63.c(this);
        }
        showLoading();
        list();
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onDataEvent(@NotNull mrf messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if ((messageEvent instanceof ns0) || (messageEvent instanceof wy5)) {
            list();
        } else if (messageEvent instanceof sdg) {
            finish();
        }
    }

    @Override // com.xiaomi.fitness.habit.ui.Hilt_HabitTodayActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (Intrinsics.areEqual(this.origin, "deep_link")) {
            ServiceConnector.removeServiceConnectListener$default(ServiceConnector.INSTANCE.getInstance(), this.serviceConnectionListener, 0, 2, null);
        }
        super.onDestroy();
        if (p63.a(this)) {
            p63.d(this);
        }
    }

    public final void setCurDialog(@Nullable Dialog dialog) {
        this.curDialog = dialog;
    }

    public final void setMAdapter(@NotNull HabitTodayAdapter habitTodayAdapter) {
        Intrinsics.checkNotNullParameter(habitTodayAdapter, "<set-?>");
        this.mAdapter = habitTodayAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showTodayList(@NotNull HabitTodayResult habitTodayResult) {
        Intrinsics.checkNotNullParameter(habitTodayResult, "habitTodayResult");
        getMAdapter().loadData(habitTodayResult);
        Iterator<Today> it = habitTodayResult.getToday().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().getStatus() == 0) {
                z = true;
            }
        }
        Iterator<HabitBean> it2 = habitTodayResult.getRecommend().iterator();
        while (it2.hasNext()) {
            it2.next().initLoadFromNet();
        }
        ((eeb) getMBinding()).A.setEnabled(z);
    }
}
