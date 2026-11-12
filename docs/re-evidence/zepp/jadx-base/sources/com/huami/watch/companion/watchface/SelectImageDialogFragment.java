package com.huami.watch.companion.watchface;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.lib.v2.SelectImagePermissionManager;
import com.huami.utils.permissionx.PermissionResult;
import com.huami.utils.permissionx.dsl.RequestPermissionDsl;
import com.huami.watch.companion.R;
import com.huami.watch.companion.watchface.SelectImageDialogFragment;
import com.loc.z;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/huami/watch/companion/watchface/SelectImageDialogFragment;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "", z.j, "i", "Landroid/view/View;", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "", "hasPadding", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "tvCancel", "f", "tvTakeCamera", "g", "tvOpenGallery", "<init>", "()V", "Companion", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class SelectImageDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int REQ_CROP = 3;
    public static final int REQ_SELECT_IMAGE = 2;
    public static final int REQ_TAKE_PHOTO = 1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private TextView tvCancel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private TextView tvTakeCamera;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private TextView tvOpenGallery;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/huami/watch/companion/watchface/SelectImageDialogFragment$Companion;", "", "Lcom/huami/watch/companion/watchface/SelectImageDialogFragment;", "newInstance", "", "REQ_CROP", LogUtil.I, "REQ_SELECT_IMAGE", "REQ_TAKE_PHOTO", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelectImageDialogFragment newInstance() {
            return new SelectImageDialogFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestPermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<RequestPermissionDsl, Unit> {

        /* JADX INFO: renamed from: com.huami.watch.companion.watchface.SelectImageDialogFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0663a extends Lambda implements Function1<PermissionResult, Unit> {
            public final /* synthetic */ SelectImageDialogFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0663a(SelectImageDialogFragment selectImageDialogFragment) {
                super(1);
                this.a = selectImageDialogFragment;
            }

            public final void a(@NotNull PermissionResult permissionResult) {
                if (permissionResult instanceof PermissionResult.Granted) {
                    this.a.j();
                }
                this.a.dismiss();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PermissionResult permissionResult) {
                a(permissionResult);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull RequestPermissionDsl requestPermissionDsl) {
            requestPermissionDsl.onPermissionResult(new C0663a(SelectImageDialogFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestPermissionDsl requestPermissionDsl) {
            a(requestPermissionDsl);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestPermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<RequestPermissionDsl, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<PermissionResult, Unit> {
            public final /* synthetic */ SelectImageDialogFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SelectImageDialogFragment selectImageDialogFragment) {
                super(1);
                this.a = selectImageDialogFragment;
            }

            public final void a(@NotNull PermissionResult permissionResult) {
                if (permissionResult instanceof PermissionResult.Granted) {
                    this.a.i();
                }
                this.a.dismiss();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PermissionResult permissionResult) {
                a(permissionResult);
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull RequestPermissionDsl requestPermissionDsl) {
            requestPermissionDsl.onPermissionResult(new a(SelectImageDialogFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestPermissionDsl requestPermissionDsl) {
            a(requestPermissionDsl);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SelectImageDialogFragment selectImageDialogFragment, View view) {
        selectImageDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SelectImageDialogFragment selectImageDialogFragment, View view) {
        SelectImagePermissionManager._checkCameraPermission$default(SelectImagePermissionManager.INSTANCE, selectImageDialogFragment.requireActivity(), null, selectImageDialogFragment.new a(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SelectImageDialogFragment selectImageDialogFragment, View view) {
        SelectImagePermissionManager._checkStoragePermission$default(SelectImagePermissionManager.INSTANCE, selectImageDialogFragment.requireActivity(), null, selectImageDialogFragment.new b(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        if (getActivity() instanceof CostumeWatchFaceActivity) {
            FragmentActivity activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.watch.companion.watchface.CostumeWatchFaceActivity");
            ((CostumeWatchFaceActivity) activity).openGallery();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        if (getActivity() instanceof CostumeWatchFaceActivity) {
            FragmentActivity activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.watch.companion.watchface.CostumeWatchFaceActivity");
            ((CostumeWatchFaceActivity) activity).takePhoto();
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_select_image_dialog, (ViewGroup) null);
        this.tvCancel = (TextView) viewInflate.findViewById(R.id.tv_select_image_cancel);
        this.tvTakeCamera = (TextView) viewInflate.findViewById(R.id.tv_select_image_camera_area);
        this.tvOpenGallery = (TextView) viewInflate.findViewById(R.id.tv_select_image_local_area);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView textView = this.tvCancel;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: xl6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectImageDialogFragment.f(this.a, view);
                }
            });
        }
        TextView textView2 = this.tvTakeCamera;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: zl6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectImageDialogFragment.g(this.a, view);
                }
            });
        }
        TextView textView3 = this.tvOpenGallery;
        if (textView3 == null) {
            return;
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: yl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectImageDialogFragment.h(this.a, view);
            }
        });
    }
}
