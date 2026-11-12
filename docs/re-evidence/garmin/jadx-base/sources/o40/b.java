package o40;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.i;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import x40.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo40/b;", "Landroidx/fragment/app/i;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f129051d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f129052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.a<Unit> f129053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f129054c;

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.Theme_Transparent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.create_course_onboarding, viewGroup, false);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        boolean z14 = arguments != null ? arguments.getBoolean("extra_is_custom_course", false) : false;
        View viewFindViewById = view2.findViewById(R.id.onboarding_container);
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(viewFindViewById.getPaddingStart(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingEnd(), this.f129054c);
        }
        final int i14 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: o40.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f129050b;

            {
                this.f129050b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                b bVar = this.f129050b;
                switch (i15) {
                    case 0:
                        b.a aVar = b.f129051d;
                        bVar.dismiss();
                        e23.a<Unit> aVar2 = bVar.f129053b;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        break;
                    default:
                        b.a aVar3 = b.f129051d;
                        bVar.dismiss();
                        e23.a<Unit> aVar4 = bVar.f129053b;
                        if (aVar4 != null) {
                            aVar4.invoke();
                        }
                        c cVar = bVar.f129052a;
                        if (cVar != null) {
                            cVar.invoke();
                        }
                        break;
                }
            }
        });
        TextView textView = (TextView) view2.findViewById(R.id.add_point_title);
        TextView textView2 = (TextView) view2.findViewById(R.id.add_point_msg);
        View viewFindViewById2 = view2.findViewById(R.id.new_point_tooltip);
        View viewFindViewById3 = view2.findViewById(R.id.onboarding_new_point);
        if (!z14) {
            textView.setText(R.string.set_your_start_tooltip_title);
            textView2.setText(R.string.set_your_start_tooltip_description);
            viewFindViewById2.getClass();
            viewFindViewById2.setVisibility(8);
            viewFindViewById3.getClass();
            viewFindViewById3.setVisibility(8);
            return;
        }
        textView.setText(R.string.tap_and_hold_tooltip_title);
        textView2.setText(R.string.tap_and_hold_tooltip_description);
        viewFindViewById2.getClass();
        viewFindViewById2.setVisibility(0);
        viewFindViewById3.getClass();
        viewFindViewById3.setVisibility(0);
        final int i15 = 1;
        viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: o40.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f129050b;

            {
                this.f129050b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                b bVar = this.f129050b;
                switch (i16) {
                    case 0:
                        b.a aVar = b.f129051d;
                        bVar.dismiss();
                        e23.a<Unit> aVar2 = bVar.f129053b;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        break;
                    default:
                        b.a aVar3 = b.f129051d;
                        bVar.dismiss();
                        e23.a<Unit> aVar4 = bVar.f129053b;
                        if (aVar4 != null) {
                            aVar4.invoke();
                        }
                        c cVar = bVar.f129052a;
                        if (cVar != null) {
                            cVar.invoke();
                        }
                        break;
                }
            }
        });
    }

    public final void u6(int i14) {
        this.f129054c = i14;
        View view2 = getView();
        View viewFindViewById = view2 != null ? view2.findViewById(R.id.onboarding_container) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(viewFindViewById.getPaddingStart(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingEnd(), i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lo40/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_IS_CUSTOM_COURSE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(boolean z14) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putBoolean("extra_is_custom_course", z14);
            bVar.setArguments(bundle);
            return bVar;
        }

        private a() {
        }
    }
}
