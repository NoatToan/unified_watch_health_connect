package com.garmin.android.apps.connectmobile;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/b0;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "", "headerLayoutId", "contentLayoutId", "", "isFullScreen", "shouldScrollToBottom", "isResizable", "<init>", "(IIZZZ)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b0 extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f30314e;

    public /* synthetic */ b0(int i14, int i15, boolean z14, boolean z15, boolean z16, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, (i16 & 4) != 0 ? false : z14, (i16 & 8) != 0 ? false : z15, (i16 & 16) != 0 ? false : z16);
    }

    @Override // androidx.fragment.app.i
    public final int getTheme() {
        return R.style.GCM_BottomSheetDialog;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, i.m, androidx.fragment.app.i
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        if (!this.f30314e) {
            dialogOnCreateDialog.setOnShowListener(new a0(dialogOnCreateDialog, 0));
        }
        dialogOnCreateDialog.setTitle(StringUtils.SPACE);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(this.f30312c ? R.layout.base_bottom_sheet_full_screen : R.layout.base_bottom_sheet, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.bottom_sheet_header);
        viewFindViewById.getClass();
        ViewStub viewStub = (ViewStub) viewFindViewById;
        viewStub.setLayoutResource(this.f30310a);
        viewStub.inflate();
        View viewFindViewById2 = viewInflate.findViewById(R.id.scroll_view_content);
        viewFindViewById2.getClass();
        ViewStub viewStub2 = (ViewStub) viewFindViewById2;
        viewStub2.setLayoutResource(this.f30311b);
        viewStub2.inflate();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().setRequestedOrientation(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.bottom_sheet_header);
        viewFindViewById.getClass();
        v6(viewFindViewById);
        k32.o oVar = new k32.o(view2);
        k32.m mVar = new k32.m(oVar, 0);
        NestedScrollView nestedScrollView = oVar.f102716b;
        nestedScrollView.setOnScrollChangeListener(mVar);
        if (this.f30313d) {
            nestedScrollView.postDelayed(new k32.n(nestedScrollView, 0), 500L);
        }
        View viewFindViewById2 = view2.findViewById(R.id.scroll_view_content);
        viewFindViewById2.getClass();
        u6(viewFindViewById2);
    }

    public abstract void u6(View view2);

    public abstract void v6(View view2);

    public b0(int i14, int i15, boolean z14, boolean z15, boolean z16) {
        this.f30310a = i14;
        this.f30311b = i15;
        this.f30312c = z14;
        this.f30313d = z15;
        this.f30314e = z16;
    }
}
