package com.xiaomi.fitness.sport.view.route;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GestureDetectorCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.view.route.CreateRouteAbnormalFragment;
import com.xiaomi.fitness.sport.view.route.ext.RunningRouteExtKt;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.oln;
import defpackage.p9n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b!\u0010\fJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteAbnormalFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V", "initNoneGesture", "()V", "fragment", "handleBackPressed", "(Landroidx/fragment/app/Fragment;)V", "initBehavior", "showExceptionIcon", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Loln;", "mBinding", "Loln;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "Lp9n;", "createRouteActivityBinding", "Lp9n;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "<init>", "Companion", "MyGestureListener", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CreateRouteAbnormalFragment extends Fragment {

    @NotNull
    public static final String TAG = "CreateRouteAbnormalFragment";
    private CreateRouteActivity createRouteActivity;
    private p9n createRouteActivityBinding;
    private CreateRouteViewModel createRouteViewModel;
    private oln mBinding;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J*\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteAbnormalFragment$MyGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lcom/xiaomi/fitness/sport/view/route/CreateRouteAbnormalFragment;)V", "onSingleTapConfirmed", "", PluginDeviceInfo.FICONOFFLINE, "Landroid/view/MotionEvent;", "onScroll", "e1", "e2", "distanceX", "", "distanceY", "onLongPress", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
        public MyGestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(@NotNull MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@Nullable MotionEvent e1, @NotNull MotionEvent e2, float distanceX, float distanceY) {
            Intrinsics.checkNotNullParameter(e2, "e2");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@NotNull MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return true;
        }
    }

    public CreateRouteAbnormalFragment() {
        super(dvi.Y);
    }

    private final void handleBackPressed(final Fragment fragment) {
        CreateRouteActivity createRouteActivity = null;
        if (fragment == null) {
            CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            } else {
                createRouteActivity = createRouteActivity2;
            }
            createRouteActivity.setBackPressedFragment(this, new Function0() { // from class: y05
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateRouteAbnormalFragment.handleBackPressed$lambda$2(this.f39638a);
                }
            });
            return;
        }
        CreateRouteActivity createRouteActivity3 = this.createRouteActivity;
        if (createRouteActivity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
        } else {
            createRouteActivity = createRouteActivity3;
        }
        createRouteActivity.setBackPressedFragment(this, new Function0() { // from class: z05
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteAbnormalFragment.handleBackPressed$lambda$3(this.f40740a, fragment);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBackPressed$lambda$2(CreateRouteAbnormalFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBackPressed$lambda$3(CreateRouteAbnormalFragment this$0, Fragment fragment) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.replaceBottomSheetFragment(fragment);
        return Unit.INSTANCE;
    }

    private final void initBehavior() {
        CreateRouteActivity createRouteActivity;
        CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
        oln olnVar = null;
        if (createRouteActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        } else {
            createRouteActivity = createRouteActivity2;
        }
        oln olnVar2 = this.mBinding;
        if (olnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            olnVar = olnVar2;
        }
        View root = olnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        CreateRouteActivity.setDefaultBehavior$default(createRouteActivity, root, ExtUtilsKt.getDp(222), false, false, 8, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.core.view.GestureDetectorCompat] */
    private final void initNoneGesture() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new GestureDetectorCompat(requireContext(), new MyGestureListener());
        oln olnVar = this.mBinding;
        if (olnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            olnVar = null;
        }
        olnVar.getRoot().setOnTouchListener(new View.OnTouchListener() { // from class: a15
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return CreateRouteAbnormalFragment.initNoneGesture$lambda$1(objectRef, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean initNoneGesture$lambda$1(Ref.ObjectRef gestureDetector, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(gestureDetector, "$gestureDetector");
        ((GestureDetectorCompat) gestureDetector.element).a(motionEvent);
        return true;
    }

    private final void initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mBinding = oln.A0(inflater, container, false);
        oln olnVar = null;
        if (getActivity() instanceof CreateRouteActivity) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.xiaomi.fitness.sport.view.route.CreateRouteActivity");
            CreateRouteActivity createRouteActivity = (CreateRouteActivity) activity;
            this.createRouteActivity = createRouteActivity;
            if (createRouteActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity = null;
            }
            this.createRouteActivityBinding = createRouteActivity.getCreateRouteActivityBinding();
            CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity2 = null;
            }
            this.createRouteViewModel = createRouteActivity2.getCreateRouteViewModel();
        }
        oln olnVar2 = this.mBinding;
        if (olnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            olnVar = olnVar2;
        }
        olnVar.A.setOnClickListener(new View.OnClickListener() { // from class: x05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteAbnormalFragment.initView$lambda$0(this.f38537a, view);
            }
        });
        initNoneGesture();
        showExceptionIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(CreateRouteAbnormalFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        if (!PermissionExtKt.isPermissionGranted(createRouteActivity, "android.permission.ACCESS_FINE_LOCATION")) {
            CreateRouteActivity createRouteActivity2 = this$0.createRouteActivity;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity2 = null;
            }
            androidx.core.app.a.v(createRouteActivity2, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, Math.abs(-2));
        }
        CreateRouteActivity createRouteActivity3 = this$0.createRouteActivity;
        if (createRouteActivity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity3 = null;
        }
        if (LocationExtKt.supportsOutdoorSportPositionService(createRouteActivity3)) {
            return;
        }
        RunningRouteExtKt.routeCheckPermission$default(null, 1, null);
    }

    private final void showExceptionIcon() {
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        oln olnVar = null;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        Logger.d(TAG, "showExceptionIcon exceptionType=" + createRouteActivity.getCurExceptionState());
        p9n p9nVar = this.createRouteActivityBinding;
        if (p9nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
            p9nVar = null;
        }
        LinearLayout titleLayout = p9nVar.T;
        Intrinsics.checkNotNullExpressionValue(titleLayout, "titleLayout");
        ViewExtKt.gone(titleLayout);
        p9n p9nVar2 = this.createRouteActivityBinding;
        if (p9nVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
            p9nVar2 = null;
        }
        View root = p9nVar2.R.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtKt.visible(root);
        p9n p9nVar3 = this.createRouteActivityBinding;
        if (p9nVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
            p9nVar3 = null;
        }
        ImageView routeImage = p9nVar3.O;
        Intrinsics.checkNotNullExpressionValue(routeImage, "routeImage");
        ViewExtKt.gone(routeImage);
        oln olnVar2 = this.mBinding;
        if (olnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            olnVar2 = null;
        }
        ConstraintLayout notActivatedGroup = olnVar2.B;
        Intrinsics.checkNotNullExpressionValue(notActivatedGroup, "notActivatedGroup");
        ViewExtKt.visible(notActivatedGroup);
        handleBackPressed(null);
        oln olnVar3 = this.mBinding;
        if (olnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            olnVar3 = null;
        }
        Button goOpenPermissions = olnVar3.A;
        Intrinsics.checkNotNullExpressionValue(goOpenPermissions, "goOpenPermissions");
        ViewExtKt.gone(goOpenPermissions);
        CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
        if (createRouteActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity2 = null;
        }
        int curExceptionState = createRouteActivity2.getCurExceptionState();
        if (curExceptionState != -2) {
            if (curExceptionState != -1) {
                return;
            }
            oln olnVar4 = this.mBinding;
            if (olnVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                olnVar4 = null;
            }
            ConstraintLayout notActivatedGroup2 = olnVar4.B;
            Intrinsics.checkNotNullExpressionValue(notActivatedGroup2, "notActivatedGroup");
            ViewExtKt.visible(notActivatedGroup2);
            oln olnVar5 = this.mBinding;
            if (olnVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                olnVar5 = null;
            }
            olnVar5.C.setText(c1j.H);
            oln olnVar6 = this.mBinding;
            if (olnVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                olnVar = olnVar6;
            }
            olnVar.C.setCompoundDrawablesWithIntrinsicBounds(0, eoi.K, 0, 0);
            return;
        }
        oln olnVar7 = this.mBinding;
        if (olnVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            olnVar7 = null;
        }
        ConstraintLayout notActivatedGroup3 = olnVar7.B;
        Intrinsics.checkNotNullExpressionValue(notActivatedGroup3, "notActivatedGroup");
        ViewExtKt.visible(notActivatedGroup3);
        oln olnVar8 = this.mBinding;
        if (olnVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            olnVar8 = null;
        }
        Button goOpenPermissions2 = olnVar8.A;
        Intrinsics.checkNotNullExpressionValue(goOpenPermissions2, "goOpenPermissions");
        ViewExtKt.visible(goOpenPermissions2);
        oln olnVar9 = this.mBinding;
        if (olnVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            olnVar9 = null;
        }
        olnVar9.C.setText(c1j.a3);
        oln olnVar10 = this.mBinding;
        if (olnVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            olnVar10 = null;
        }
        olnVar10.C.setCompoundDrawablesWithIntrinsicBounds(0, eoi.f0, 0, 0);
        CreateRouteActivity createRouteActivity3 = this.createRouteActivity;
        if (createRouteActivity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity3 = null;
        }
        if (!PermissionExtKt.isPermissionGranted(createRouteActivity3, "android.permission.ACCESS_FINE_LOCATION")) {
            androidx.core.app.a.v(requireActivity(), new String[]{"android.permission.ACCESS_FINE_LOCATION"}, Math.abs(-2));
        }
        CreateRouteActivity createRouteActivity4 = this.createRouteActivity;
        if (createRouteActivity4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity4 = null;
        }
        if (LocationExtKt.supportsOutdoorSportPositionService(createRouteActivity4)) {
            return;
        }
        RunningRouteExtKt.routeCheckPermission$default(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        initView(inflater, container, savedInstanceState);
        oln olnVar = this.mBinding;
        if (olnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            olnVar = null;
        }
        View root = olnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
