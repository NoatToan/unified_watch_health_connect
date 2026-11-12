package dp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
public class b extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f60633a;

    public interface a {
        void I2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f60633a = (a) context;
        } catch (ClassCastException unused) {
            l2.k(context, " must implement ShareDialogFragmentListener");
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2132149233);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i14 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.share_activity_image_bottom_sheet, viewGroup, false);
        ((TextView) viewInflate.findViewById(R.id.share_image_with_stats)).setOnClickListener(new View.OnClickListener(this) { // from class: dp.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f60632b;

            {
                this.f60632b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        b bVar = this.f60632b;
                        bVar.f60633a.I2();
                        bVar.dismiss();
                        break;
                    default:
                        this.f60632b.dismiss();
                        break;
                }
            }
        });
        final int i15 = 1;
        ((TextView) viewInflate.findViewById(R.id.cancel_share)).setOnClickListener(new View.OnClickListener(this) { // from class: dp.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f60632b;

            {
                this.f60632b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        b bVar = this.f60632b;
                        bVar.f60633a.I2();
                        bVar.dismiss();
                        break;
                    default:
                        this.f60632b.dismiss();
                        break;
                }
            }
        });
        return viewInflate;
    }
}
