package mm0;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.details.GroupNotJoinedFragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import ew1.h1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmm0/y;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f119596a;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_remove_group_member_reqeust_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        final int i14 = 0;
        ((TextView) view2.findViewById(R.id.remove_request_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: mm0.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f119595b;

            {
                this.f119595b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        y yVar = this.f119595b;
                        v vVar = yVar.f119596a;
                        if (vVar != null) {
                            GroupNotJoinedFragment groupNotJoinedFragment = vVar.f119586a;
                            Context contextRequireContext = groupNotJoinedFragment.requireContext();
                            contextRequireContext.getClass();
                            new androidx.appcompat.app.e.a(contextRequireContext).setTitle(R.string.social_group_remove_your_request_question).setMessage(R.string.social_group_remove_request_message).setPositiveButton(R.string.lbl_remove, new h1(new t(groupNotJoinedFragment, 1), 21)).setNegativeButton(R.string.lbl_close, new jm0.c(2)).show();
                        }
                        yVar.dismiss();
                        break;
                    default:
                        this.f119595b.dismiss();
                        break;
                }
            }
        });
        final int i15 = 1;
        ((TextView) view2.findViewById(R.id.cancel_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: mm0.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f119595b;

            {
                this.f119595b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        y yVar = this.f119595b;
                        v vVar = yVar.f119596a;
                        if (vVar != null) {
                            GroupNotJoinedFragment groupNotJoinedFragment = vVar.f119586a;
                            Context contextRequireContext = groupNotJoinedFragment.requireContext();
                            contextRequireContext.getClass();
                            new androidx.appcompat.app.e.a(contextRequireContext).setTitle(R.string.social_group_remove_your_request_question).setMessage(R.string.social_group_remove_request_message).setPositiveButton(R.string.lbl_remove, new h1(new t(groupNotJoinedFragment, 1), 21)).setNegativeButton(R.string.lbl_close, new jm0.c(2)).show();
                        }
                        yVar.dismiss();
                        break;
                    default:
                        this.f119595b.dismiss();
                        break;
                }
            }
        });
    }
}
