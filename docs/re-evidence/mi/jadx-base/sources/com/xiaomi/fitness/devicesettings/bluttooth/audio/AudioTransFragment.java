package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.MeetingBean;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.util.RecyclerViewExtKt;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.dih;
import defpackage.eui;
import defpackage.jni;
import defpackage.of6;
import defpackage.wi6;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012B\u0007¢\u0006\u0004\b1\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0006R&\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransVM;", "Lof6;", "", "initTitleListener", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_STOP, "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/MeetingBean;", "messageBean", "refreshUI", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/MeetingBean;)V", "setListener", LifecycleConstantKt.ON_DESTROY, "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkBean;", "Lkotlin/collections/ArrayList;", "dataList", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/BaseTalkAdapter;", "talkAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/BaseTalkAdapter;", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "intentLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lwi6;", "mTitleBinding", "Lwi6;", "", "isToucheRecycleView", "Z", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AudioTransFragment extends BaseBindingFragment<AudioTransVM, of6> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String START_TIME = "start_time";
    private ArrayList<TalkBean> dataList;

    @NotNull
    private Handler handler;
    private ActivityResultLauncher<Intent> intentLauncher;
    private boolean isToucheRecycleView;
    private wi6 mTitleBinding;

    @NotNull
    private final Runnable runnable;

    @Nullable
    private BaseTalkAdapter talkAdapter;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransFragment$Companion;", "", "<init>", "()V", "START_TIME", "", StatConstants.PARAM_START, "", "context", "Landroid/content/Context;", "time", "", "createArgs", "Landroid/os/Bundle;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle createArgs(long time) {
            Bundle bundle = new Bundle();
            bundle.putLong("start_time", time);
            return bundle;
        }

        public final void start(@NotNull Context context, long time) {
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle bundle = new Bundle();
            bundle.putLong("start_time", time);
            dih.a().e(context, new FragmentParams.b().e(AudioTransFragment.class).c(bundle).b());
        }
    }

    public AudioTransFragment() {
        super(eui.O);
        this.runnable = new Runnable() { // from class: kp1
            @Override // java.lang.Runnable
            public final void run() {
                AudioTransFragment.runnable$lambda$0(this.f24122a);
            }
        };
        this.handler = new Handler(Looper.getMainLooper());
    }

    public static final /* synthetic */ of6 access$getMBinding(AudioTransFragment audioTransFragment) {
        return audioTransFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AudioTransVM access$getMViewModel(AudioTransFragment audioTransFragment) {
        return (AudioTransVM) audioTransFragment.getMViewModel();
    }

    private final void initTitleListener() {
        wi6 wi6Var = this.mTitleBinding;
        if (wi6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
            wi6Var = null;
        }
        wi6Var.A.setOnClickListener(new View.OnClickListener() { // from class: jp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioTransFragment.initTitleListener$lambda$8(this.f22989a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initTitleListener$lambda$8(AudioTransFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((AudioTransVM) this$0.getMViewModel()).getIsEmpty()) {
            ToastUtil.INSTANCE.showToast(wzi.j0);
            return;
        }
        MeettingDataManager.INSTANCE.set(((AudioTransVM) this$0.getMViewModel()).getMeetingBean());
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) AudioRecordEditActivity.class);
        ActivityResultLauncher<Intent> activityResultLauncher = this$0.intentLauncher;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intentLauncher");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$2$lambda$1(AudioTransFragment this$0, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            BaseTalkAdapter baseTalkAdapter = this$0.talkAdapter;
            if (baseTalkAdapter != null) {
                baseTalkAdapter.setCurrentPositionIndex(i, i2);
            }
            AudioTransVM audioTransVM = (AudioTransVM) this$0.getMViewModel();
            ArrayList<TalkBean> arrayList = this$0.dataList;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dataList");
                arrayList = null;
            }
            audioTransVM.seekTo(arrayList.get(i).getMsgList().get(i2).getStart_time());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$3(AudioTransFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((AudioTransVM) this$0.getMViewModel()).getRecordData();
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$4(AudioTransFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handler.removeCallbacks(this$0.runnable);
        boolean z = motionEvent.getActionMasked() == 2;
        if (z) {
            this$0.isToucheRecycleView = z;
        } else {
            this$0.handler.postDelayed(this$0.runnable, 1500L);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$5(AudioTransFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activityResult == null || activityResult.c() != -1) {
            MeettingDataManager.INSTANCE.reset();
            return;
        }
        AudioTransVM audioTransVM = (AudioTransVM) this$0.getMViewModel();
        MeettingDataManager meettingDataManager = MeettingDataManager.INSTANCE;
        audioTransVM.refreshMeetingBean(meettingDataManager.get());
        meettingDataManager.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runnable$lambda$0(AudioTransFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isToucheRecycleView = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$10(AudioTransFragment this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMBinding().H.setProgress((int) l.longValue());
        TextView textView = this$0.getMBinding().A;
        AudioTransVM audioTransVM = (AudioTransVM) this$0.getMViewModel();
        Intrinsics.checkNotNull(l);
        textView.setText(audioTransVM.longTime2timestr(l.longValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$11(AudioTransFragment this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMBinding().H.setMax(l != null ? (int) l.longValue() : 0);
        TextView textView = this$0.getMBinding().B;
        AudioTransVM audioTransVM = (AudioTransVM) this$0.getMViewModel();
        Intrinsics.checkNotNull(l);
        textView.setText(audioTransVM.longTime2timestr(l.longValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$12(AudioTransFragment this$0, Pair pair) {
        Pair<Integer, Integer> pair2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseTalkAdapter baseTalkAdapter = this$0.talkAdapter;
        if (baseTalkAdapter != null) {
            baseTalkAdapter.setCurrentPositionIndex(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
        }
        if (!this$0.isToucheRecycleView) {
            BaseTalkAdapter baseTalkAdapter2 = this$0.talkAdapter;
            int targetPosition = baseTalkAdapter2 != null ? baseTalkAdapter2.getTargetPosition() : 0;
            BaseTalkAdapter baseTalkAdapter3 = this$0.talkAdapter;
            if (baseTalkAdapter3 == null || (pair2 = baseTalkAdapter3.getHighlightOffset()) == null) {
                pair2 = new Pair<>(0, 0);
            }
            RecyclerView listView = this$0.getMBinding().E;
            Intrinsics.checkNotNullExpressionValue(listView, "listView");
            Pair<Integer, Integer> spanOffset = RecyclerViewExtKt.getSpanOffset(listView, targetPosition, pair2);
            if (spanOffset.getFirst().intValue() < 0) {
                return Unit.INSTANCE;
            }
            RecyclerView listView2 = this$0.getMBinding().E;
            Intrinsics.checkNotNullExpressionValue(listView2, "listView");
            RecyclerViewExtKt.scrollToPositionWithOffset(listView2, targetPosition, spanOffset.getSecond().intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$13(AudioTransFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMBinding().H.setProgress(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$14(AudioTransFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.getMBinding().G.setImageResource(jni.H);
        } else {
            this$0.getMBinding().G.setImageResource(jni.I);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$15(AudioTransFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((AudioTransVM) this$0.getMViewModel()).playOrPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$9(AudioTransFragment this$0, MeetingBean meetingBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshUI(meetingBean);
        return Unit.INSTANCE;
    }

    @NotNull
    public final Runnable getRunnable() {
        return this.runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        AudioTransVM audioTransVM = (AudioTransVM) getMViewModel();
        Bundle arguments = getArguments();
        audioTransVM.loadData(arguments != null ? Long.valueOf(arguments.getLong("start_time")) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((AudioTransVM) getMViewModel()).release();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ((AudioTransVM) getMViewModel()).pause();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle("");
        this.dataList = new ArrayList<>();
        getMBinding().E.setLayoutManager(new LinearLayoutManager(getMActivity(), 1, false));
        FragmentActivity mActivity = getMActivity();
        wi6 wi6Var = null;
        if (mActivity != null) {
            ArrayList<TalkBean> arrayList = this.dataList;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dataList");
                arrayList = null;
            }
            this.talkAdapter = new TalkAdapter(mActivity, arrayList, new Function3() { // from class: cp1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AudioTransFragment.onViewCreated$lambda$2$lambda$1(this.f14578a, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                }
            });
        }
        getMBinding().E.setAdapter(this.talkAdapter);
        wi6 wi6VarA0 = wi6.A0(getLayoutInflater(), null, false);
        this.mTitleBinding = wi6VarA0;
        if (wi6VarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
        } else {
            wi6Var = wi6VarA0;
        }
        View root = wi6Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        setEndView(root);
        initTitleListener();
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, jni.A, null, new View.OnClickListener() { // from class: gp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AudioTransFragment.onViewCreated$lambda$3(this.f19199a, view2);
            }
        }, 5, null);
        getMBinding().E.setOnTouchListener(new View.OnTouchListener() { // from class: hp1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return AudioTransFragment.onViewCreated$lambda$4(this.f20304a, view2, motionEvent);
            }
        });
        this.intentLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: ip1
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                AudioTransFragment.onViewCreated$lambda$5(this.f21962a, (ActivityResult) obj);
            }
        });
    }

    public final void refreshUI(@Nullable MeetingBean messageBean) {
        if (messageBean != null) {
            getMBinding().J.setText(UtilsKt.simpleRecordFileName(messageBean.getNewTitle()));
            if (RecordTimeUtilKt.isInValidTime(messageBean.getTime())) {
                TextView timeView = getMBinding().I;
                Intrinsics.checkNotNullExpressionValue(timeView, "timeView");
                ViewExtKt.gone(timeView);
            } else {
                getMBinding().I.setText(TimeUtils.INSTANCE.getNewDateString(messageBean.getTime()));
            }
            List<TalkBean> talkList = messageBean.getTalkList();
            ArrayList<TalkBean> arrayList = this.dataList;
            ArrayList<TalkBean> arrayList2 = null;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dataList");
                arrayList = null;
            }
            arrayList.clear();
            if (talkList.isEmpty()) {
                getMBinding().E.setVisibility(8);
                getMBinding().D.setVisibility(0);
                return;
            }
            getMBinding().E.setVisibility(0);
            getMBinding().D.setVisibility(8);
            ArrayList<TalkBean> arrayList3 = this.dataList;
            if (arrayList3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dataList");
            } else {
                arrayList2 = arrayList3;
            }
            arrayList2.addAll(talkList);
            BaseTalkAdapter baseTalkAdapter = this.talkAdapter;
            if (baseTalkAdapter != null) {
                baseTalkAdapter.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((AudioTransVM) getMViewModel()).getDataChanged().observe(this, new AudioTransFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioTransFragment.setListener$lambda$9(this.f25287a, (MeetingBean) obj);
            }
        }));
        ((AudioTransVM) getMViewModel()).getCurrentPositionTime().observe(this, new AudioTransFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioTransFragment.setListener$lambda$10(this.f27058a, (Long) obj);
            }
        }));
        ((AudioTransVM) getMViewModel()).getDurationTime().observe(this, new AudioTransFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: np1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioTransFragment.setListener$lambda$11(this.f28213a, (Long) obj);
            }
        }));
        ((AudioTransVM) getMViewModel()).getPositionIndexChange().observe(this, new AudioTransFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: op1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioTransFragment.setListener$lambda$12(this.f29353a, (Pair) obj);
            }
        }));
        ((AudioTransVM) getMViewModel()).getProgressChanged().observe(this, new AudioTransFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioTransFragment.setListener$lambda$13(this.f15772a, (Integer) obj);
            }
        }));
        getMBinding().H.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransFragment.setListener.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar p0, int progress, boolean fromUser) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar p0) {
                AudioTransFragment.access$getMViewModel(AudioTransFragment.this).setIsToucheSeekBar(true);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar p0) {
                AudioTransFragment.access$getMViewModel(AudioTransFragment.this).setIsToucheSeekBar(false);
                AudioTransFragment.access$getMBinding(AudioTransFragment.this).H.getProgress();
                AudioTransFragment.access$getMViewModel(AudioTransFragment.this).duration();
                AudioTransFragment.access$getMViewModel(AudioTransFragment.this).seekTo(AudioTransFragment.access$getMBinding(AudioTransFragment.this).H.getProgress());
            }
        });
        ((AudioTransVM) getMViewModel()).getStatusChanged().observe(this, new AudioTransFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ep1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioTransFragment.setListener$lambda$14(this.f16911a, (Boolean) obj);
            }
        }));
        getMBinding().G.setOnClickListener(new View.OnClickListener() { // from class: fp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioTransFragment.setListener$lambda$15(this.f18041a, view);
            }
        });
    }
}
